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
package com.mtcflow.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.mtcflow.project.builder.MTCBuilder; 
import com.mtcflow.project.nature.MTCNature;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements IStartup {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.mtcflow.project"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin; 

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	@Override
	public void earlyStartup() {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject iProject : projects) {
			try {
				if (iProject.isOpen()) {
					IProjectNature pNature = iProject.getNature(MTCNature.NATURE_ID);
					if (pNature != null) {
						IResource metamodelsFolder = iProject.findMember("/metamodels");
						if (metamodelsFolder != null) {
							metamodelsFolder.accept(new IResourceVisitor() {

								@Override
								public boolean visit(IResource resource) throws CoreException {
									MTCBuilder.checkEcore(resource, "");
									return true;
								}
							});
						}
					}
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// IWorkspace workspace = ResourcesPlugin.getWorkspace();
		// IResourceChangeListener listener = new IResourceChangeListener() {
		// public void resourceChanged(IResourceChangeEvent event) {
		// System.out.println("Something changed!" + event);
		// //if (event.getDelta() instanceof IProject) {
		// try {
		// event.getDelta().accept(new IResourceDeltaVisitor() {
		// public boolean visit(IResourceDelta delta) throws CoreException {
		// if (delta.getKind() == IResourceDelta.OPEN) {
		// final IResource resource = delta.getResource();
		// }
		// System.out.println(delta.getResource());
		// return false;
		// // do your stuff and check the project is opened
		// // or closed
		// }
		// });
		// } catch (CoreException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }
		// // }
		// };
		// workspace.addResourceChangeListener(listener);

		// ... some time later one ...
		// workspace.removeResourceChangeListener(listener);
	}
}
