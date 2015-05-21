/*******************************************************************************
 * Copyright (c) 2013 Camilo Alvarez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Camilo Alvarez (cadorca@gmail.com)  - initial API and implementation
 ******************************************************************************/
package com.mtcflow.project.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.osgi.framework.Bundle;

import com.mtcflow.project.nature.MTCNature;

public class MTCProjectSupport {
	/**
	 * For this marvelous project we need to: - create the default Eclipse
	 * project - add the custom project nature - create the folder structure
	 * 
	 * @param projectName
	 * @param location
	 * @param natureId
	 * @return
	 */
	public static IProject createProject(String projectName, URI location) {
		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);

		try {
			// create eclipse project
			IProject project = createBaseProject(projectName, location);
			project.setDefaultCharset("UTF-8", null);
			addNature(project);
			// create java project
			IJavaProject javaProject = JavaCore.create(project);
			javaProject.setOption(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_5);
			javaProject.setOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_1_5);
			javaProject.setOption(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_5);

			// add bin/ouput folder
			IFolder binFolder = project.getFolder("bin");
			// binFolder.create(false, true, null);
			javaProject.setOutputLocation(binFolder.getFullPath(), null);

			// add libs to project class path
			List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
			IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();

			// create source folder
			IFolder sourceFolder = project.getFolder("src");
			sourceFolder.create(false, true, null);
			IPackageFragmentRoot srcRoot = javaProject.getPackageFragmentRoot(sourceFolder);
			IClasspathEntry[] cEntries = new IClasspathEntry[3];
			cEntries[0] = JavaRuntime.getDefaultJREContainerEntry();
			// cEntries[2] = JavaCore.new
			cEntries[1] = JavaCore.newSourceEntry(srcRoot.getPath());
			cEntries[2] = JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"));
			javaProject.setRawClasspath(cEntries, null);
			/*
			 * Manifest-Version: 1.0 Bundle-ManifestVersion: 2 Bundle-Name:
			 * LePlugine Bundle-SymbolicName: LePlugine Bundle-Version:
			 * 1.0.0.qualifier Bundle-RequiredExecutionEnvironment: JavaSE-1.7
			 */
			String[] paths = { "transformations/T2M", //$NON-NLS-1$
					"transformations/M2M", //$NON-NLS-1$
					"transformations/M2T", //$NON-NLS-1$
					"transformations/HOT", //$NON-NLS-1$
					"mtcs", //$NON-NLS-1$ 
					"metamodels", //$NON-NLS-1$
					"libraries", //$NON-NLS-1$
					"scripts", //$NON-NLS-1$
					"validations", //$NON-NLS-1$
					"tests", //$NON-NLS-1$
					"models", "META-INF" }; //$NON-NLS-1$
			addToProjectStructure(javaProject.getProject(), paths);
			createTemplateFileInProjectAt(javaProject.getProject(), "build.properties", "build.properties");
			createTemplateFileInProjectAt(javaProject.getProject(), "default.mtc", "/mtcs/default.mtc");
			createTemplateFileInProjectAt(javaProject.getProject(), "default_diagram.mtcd", "/mtcs/default.mtcd");
			Manifest manifest = new Manifest();
			manifest.getMainAttributes().putValue("Manifest-Version", "1.0");
			manifest.getMainAttributes().putValue("Bundle-ManifestVersion", "2");
			manifest.getMainAttributes().putValue("Bundle-Name", projectName);
			manifest.getMainAttributes().putValue("Bundle-SymbolicName", projectName);
			manifest.getMainAttributes().putValue("Bundle-Version", "1.0.0");
			manifest.getMainAttributes().putValue("Require-Bundle", "com.mtcflow.model,com.mtcflow.engine,com.mtcflow.engine.core");
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			manifest.write(out);
			javaProject.getProject().getFile("/META-INF/MANIFEST.MF").create(new ByteArrayInputStream(out.toByteArray()), true, null);
			return javaProject.getProject();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("Error creating the project", ex);
		}
	}

	/**
	 * Just do the basics: create a basic project.
	 * 
	 * @param location
	 * @param projectName
	 */
	private static IProject createBaseProject(String projectName, URI location) {
		// it is acceptable to use the ResourcesPlugin class
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

		if (!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
			if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}

			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
				if (!newProject.isOpen()) {
					newProject.open(null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return newProject;
	}

	private static void createFolder(IFolder folder) throws CoreException {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			createFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
	}

	/**
	 * Create a folder structure with a parent root, overlay, and a few child
	 * folders.
	 * 
	 * @param newProject
	 * @param paths
	 * @throws CoreException
	 */
	private static void addToProjectStructure(IProject newProject, String[] paths) throws CoreException {
		for (String path : paths) {
			IFolder etcFolders = newProject.getFolder(path);
			createFolder(etcFolders);
		}
	}

	public static void addNature(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		if (!project.hasNature(MTCNature.NATURE_ID)) {
			String[] newNatures = new String[] { MTCNature.NATURE_ID, "org.eclipse.jdt.core.javanature" };/*
																										 * ,
																										 * "org.eclipse.acceleo.ide.ui.acceleoNature"
																										 * ,
																										 * "org.eclipse.m2m.atl.adt.builder.atlNature"
																										 * ,
																										 * "org.eclipse.m2m.qvt.oml.project.QVTONature"
																										 * ,
																										 * "org.eclipse.pde.PluginNature"
																										 * }
																										 * ;
																										 */
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		}
	}

	private IJavaProject createProject(String projName) throws Exception {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		if (projName == null || projName.trim().length() == 0)
			return null;

		// create eclipse project
		IProject project = root.getProject(projName);
		if (project.exists())
			project.delete(true, null);

		project.create(null);
		project.open(null);

		addNature(project);

		// create java project
		IJavaProject javaProject = JavaCore.create(project);

		// add bin/ouput folder
		IFolder binFolder = project.getFolder("bin");
		binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);

		// add libs to project class path
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}

		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);

		// create source folder
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);

		IPackageFragmentRoot srcRoot = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(srcRoot.getPath());
		javaProject.setRawClasspath(newEntries, null);

		return javaProject;
	}

	public static void createTemplateFileInProjectAt(IProject project, String templateName, String filename) throws IOException {
		try {
			Bundle bundle = Platform.getBundle("com.mtcflow.project");
			URL fileURL = bundle.getEntry("templates/" + templateName);
			project.getFile(filename).create(fileURL.openStream(), true, null);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error creating the project", e);
		}

	}
}
