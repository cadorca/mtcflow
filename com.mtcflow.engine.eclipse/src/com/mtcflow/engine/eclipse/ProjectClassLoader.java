package com.mtcflow.engine.eclipse;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

import com.mtcflow.engine.IMTCConsole;

/**
 * Provides class loading for a project, with a fall back to the main
 * class-loader for all other classes. Overriding a specific class loader seems
 * to be the only model that works.
 * 
 * @author milesparker - Initial API and implementation
 * @author Camilo Alvarez - Add support for jar libraries loading
 * 
 */
public class ProjectClassLoader extends URLClassLoader {

	IProject project;

	public ClassLoader mainLoader;
	private IMTCConsole console;
	private ArrayList<Bundle> bundles;

	public ProjectClassLoader(final IProject project, final IMTCConsole console) throws LoaderCreationException {
		super(new URL[0]);
		IFile manifestResource = project.getFile("META-INF/MANIFEST.MF");
		bundles = new ArrayList<Bundle>();
		if (manifestResource.exists()) {
			Manifest manifest = null;
			try {
				manifest = new Manifest(manifestResource.getContents());
			} catch (Exception e) {
				e.printStackTrace();
			}
			String rPlugins = manifest.getMainAttributes().getValue("Require-Bundle");
			if (rPlugins != null) {
				String[] requiredPlugins = rPlugins.split(",");
				for (String pInfo : requiredPlugins) {
					String[] rPluginDescripton = pInfo.split(";");
					String version = null;
					for (String pDefinition : rPluginDescripton) {
						// ;bundle-version="1.0.0";resolution:=optional;visibility:=reexport,
						if (pDefinition.startsWith("bundle-version")) {
							String[] kvPair = pDefinition.split("=");
							version = kvPair[1].replaceAll("\"", "");
						}
					}
					bundles.add(Platform.getBundle(rPluginDescripton[0]));
				}
			}
		}
		this.project = project;
		this.console = console;
		try {
			project.open(null);
			IJavaProject javaProject = JavaCore.create(project);
			URL[] outputURL = { new File(project.getLocation() + "/" + javaProject.getOutputLocation().removeFirstSegments(1) + "/").toURI().toURL() };
			addURL(outputURL[0]);
			for (IClasspathEntry cEntry : javaProject.getRawClasspath()) {
				if (cEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
					URL url = getUrl(cEntry);
					if (url.toString().contains("com.mtcflow")) {
						continue;
					} else {
						addURL(url);
					}
				} else if (cEntry.getEntryKind() == IClasspathEntry.CPE_CONTAINER && cEntry.getPath().toOSString().startsWith("org.eclipse.pde.core.requiredPlugins")) {
					for (IClasspathEntry pluginEntry : JavaCore.getClasspathContainer(cEntry.getPath(), JavaCore.create(project)).getClasspathEntries()) {
						URL url = getPluginJarUrl(pluginEntry);
						if (url.toString().contains("com.mtcflow")) {
							continue;
						} else {
							addURL(url);
						}
					}
				}
			}
			activate();
		} catch (Exception e1) {
			throw new LoaderCreationException("Couldn't load class", e1);
		}
	}

	private URL getUrl(IClasspathEntry cEntry) throws MalformedURLException {
		IPath realLocation = cEntry.getPath();
		IPath location = new Path(realLocation.toPortableString().replaceAll("/" + project.getName() + "/", ""));
		IFile file = project.getFile(location);
		return new URL("jar", "", "file:" + file.getLocation() + "!/");
	}

	private URL getPluginJarUrl(IClasspathEntry cEntry) throws MalformedURLException {
		return new URL("jar", "", "file:" + cEntry.getPath().toOSString() + "!/");
	}

	public void activate() throws LoaderCreationException {
		mainLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(this);
	}

	public void restore() {
		Thread.currentThread().setContextClassLoader(mainLoader);
	}

	@Override
	public Class loadClass(String name) throws ClassNotFoundException {
		try {
			return super.loadClass(name);
		} catch (NoClassDefFoundError classNotFoundException) {
			return mainLoader.loadClass(name);
		} catch (ClassNotFoundException classNotFoundException) {
			try {
				return mainLoader.loadClass(name);
			} catch (Exception ex) {
				return searchClassInBundles(name);
			}
		} catch (UnsupportedClassVersionError classNotFoundException) {
			throw new RuntimeException("Bad class: " + name, classNotFoundException);
		}
	}

	private Class searchClassInBundles(String className) throws ClassNotFoundException {
		for (Bundle bundle : bundles) {
			try {
				return bundle.loadClass(className);
			} catch (Throwable tr) {

			}
		}
		throw new ClassNotFoundException();
	}

	public class LoaderCreationException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public LoaderCreationException(String mesg, Throwable t) {
			super(mesg, t);
		}
	}

}