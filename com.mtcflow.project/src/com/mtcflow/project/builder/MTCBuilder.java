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
package com.mtcflow.project.builder;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.statushandlers.StatusManager;

import com.mtcflow.engine.EmptyConsole;
import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.MTCFlow;
import com.mtcflow.engine.eclipse.MTCEclipseUtils;

public class MTCBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "com.mtcflow.project.eclipse.mtcbuilder";
	Properties dslProperties;

	class MTCDeltaVisitor implements IResourceDeltaVisitor {

		private String buildID;

		Properties dslProperties = new Properties();

		public MTCDeltaVisitor(String buildID) {
			this.buildID = buildID;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.ecli
		 * pse .core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkEcore(resource, buildID);
				try {
					checkResource(resource, buildID);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					IStatus status = new Status(IStatus.ERROR, "com.mtcflow.project", "Error compiling the file:" + resource.getProjectRelativePath().toPortableString(), e);
					StatusManager.getManager().handle(status);
				}
				break;
			case IResourceDelta.REMOVED:
				String extension = resource.getFileExtension();
				ITechnologyManager manager = MTCFlow.TechnologyManagerRegistry.INSTANCE.get(extension);
				if (manager != null) {
					String sourceExtension = manager.getSourceExtension(extension);
					if (sourceExtension != null) {
						File f = resource.getRawLocation().makeAbsolute().removeFileExtension().addFileExtension(sourceExtension).toFile();
						if (f.exists()) {
							try {
								manager.compile(f, buildID, new EmptyConsole());
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								IStatus status = new Status(IStatus.ERROR, "com.mtcflow.project", "Error compiling the file:" + resource.getProjectRelativePath().toOSString(), e);
								StatusManager.getManager().handle(status);
							}
							resource.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
						}
					}
				}
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				checkEcore(resource, buildID);
				try {
					checkResource(resource, buildID);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					IStatus status = new Status(IStatus.ERROR, "com.mtcflow.project", "Error compiling the file:" + resource.getProjectRelativePath().toOSString(), e);
					StatusManager.getManager().handle(status);
				}
				break;
			}
			// return true to continue visiting children.
			return true;
		}
	}

	class MTCResourceVisitor implements IResourceVisitor {
		private String buildID;
		private ArrayList<IResource> resources = new ArrayList<IResource>();

		public MTCResourceVisitor(String buildID) {
			this.buildID = buildID;
		}

		public boolean visit(IResource resource) {
			try {
				if (!checkEcore(resource, buildID)) {
					resources.add(resource);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// return true to continue visiting children.
			return true;
		}

		public void processResources() {
			for (IResource resource : resources) {
				try {
					checkResource(resource, buildID);
				} catch (Exception e) {
					/*
					 * CoreException ce = new CoreException(IStatus.ERROR);
					 * ce.initCause(e); StatusManager.getManager().ad
					 */
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		if (kind == FULL_BUILD) {
			MTCResourceVisitor visitor = fullBuild(monitor);
			visitor.processResources();
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	/*
	 * public void checkUMLProfile(IResource resource) { if
	 * (resource.getName().endsWith(".profile.uml")) { MTCFlow.RESOURCE_SET //
	 * enable extended metadata Resource r =
	 * rs.getResource(URI.createURI(resource.getFullPath().toOSString()), true);
	 * EObject eObject = r.getContents().get(0); if (eObject instanceof Profile)
	 * { Profile p = (Profile) eObject; EPackage pck = p.define(); String uri =
	 * resource.getLocation().toString(); uri += ".ecore"; Resource rsProfile =
	 * rs.createResource(URI.createFileURI(uri)); try {
	 * rsProfile.getContents().add(pck); rsProfile.save(Collections.EMPTY_MAP);
	 * } catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } } }
	 */

	public static boolean checkEcore(IResource resource, String buildID) throws CoreException {
		if (resource.getName().endsWith(".ecore")) {
			// enable extended metadata
			try {
				ResourceSet rs = new ResourceSetImpl();
				Resource r = rs.getResource(URI.createFileURI(resource.getLocation().toOSString()), true);
				EList<EObject> list = r.getContents();
				for (EObject eObject : list) {
					if (eObject instanceof EPackage) {
						EPackage p = (EPackage) eObject;
						Resource rr = p.eResource();
						if (p.getNsURI() != null && !p.getNsURI().isEmpty()) {
							rr.setURI(URI.createURI(p.getNsURI()));
							if (p.getNsURI() != null && p.getNsURI().equals("http://www.eclipse.org/emf/2002/Ecore"))
								return false;
							if (EPackage.Registry.INSTANCE.get(p.getNsURI()) == null || EPackage.Registry.INSTANCE.get(p.getNsURI()) instanceof EPackageImpl) {
								EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
								System.out.println("MTCFlow Registering Metamodel :" + p.getNsURI() + " - " + resource.getLocation().toString());
								for (EPackage sPkg : p.getESubpackages()) {
									if (EPackage.Registry.INSTANCE.get(sPkg.getNsURI()) == null || EPackage.Registry.INSTANCE.get(sPkg.getNsURI()) instanceof EPackageImpl) {
										EPackage.Registry.INSTANCE.put(sPkg.getNsURI(), sPkg);
										sPkg.eResource().setURI(URI.createURI(sPkg.getNsURI()));
										System.out.println("MTCFlow Registering Metamodel :" + sPkg.getNsURI() + " - " + resource.getLocation().toString());
									}
								}
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				// throw new CoreException(null);
			}
			return true;
		}
		return false;
	}

	public static void checkResource(IResource resource, String buildID) throws Exception {
		String extension = resource.getFileExtension();
		if (extension != null) {
			extension = extension.toLowerCase();
			ITechnologyManager tManager = MTCFlow.TechnologyManagerRegistry.INSTANCE.get(extension);
			if (tManager != null && !tManager.getCompiledExtensions().contains(extension)) {
				tManager.compile(resource.getRawLocation().makeAbsolute().toFile(), buildID, new EmptyConsole());
				resource.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
			}
		}
	}

	void deleteFile(IResource resource) {
		try {
			resource.delete(true, new org.eclipse.core.runtime.NullProgressMonitor());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected MTCResourceVisitor fullBuild(final IProgressMonitor monitor) throws CoreException {
		try {
			MTCEclipseUtils.initializeRegistry();
			String buildID = Math.random() + "";
			MTCResourceVisitor visitor = new MTCResourceVisitor(buildID);
			getProject().accept(visitor);
			return visitor;
		} catch (CoreException e) {
		}
		return null;
	}

	protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		MTCEclipseUtils.initializeRegistry();
		String buildID = Math.random() + "";
		delta.accept(new MTCDeltaVisitor(buildID));
	}

}
