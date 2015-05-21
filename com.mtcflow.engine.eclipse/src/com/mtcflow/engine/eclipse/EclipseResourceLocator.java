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
package com.mtcflow.engine.eclipse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.engine.core.ExecutionData;
import com.mtcflow.engine.core.utils.FilenameUtils;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.MTCTransformation;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.Validation;

public class EclipseResourceLocator implements IResourceLocator {

	public final static String WORKSPACE_FOLDER = "workspace";
	private IProject project;
	private MTC mtc;

	public EclipseResourceLocator(IProject project, MTC mtc) {
		this.project = project;
		this.mtc = mtc;
		if (project != null) {
			IFolder folder = project.getFolder(WORKSPACE_FOLDER);
			if (!folder.exists()) {
				try {
					folder.create(false, true, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public URI getEMFURI(MTCResource resource) {
		if (resource.getURI() != null) {
			// Load using the resource file name
			return URI.createFileURI(getAbsolutFilePath(resource));
		} else if (resource.getURI() != null) {
			// Load using URI
			return URI.createURI(getPath(resource));
		} else {
			// Load using name
			return URI.createPlatformResourceURI(getPath(resource), true);
		}
	}

	@Override
	public String getPath(MTCResource resource) {
		boolean workspace = false;
		if (resource == null) {
			System.out.println("NULL REsource");
			return "";
		}
		try {
			if (resource.getExecutionInformation() != null && (Boolean) resource.getExecutionInformation().get(ExecutionData.GENERATED_IN_WORKSPACE)) {
				workspace = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		String path = null;
		String baseFolder;
		if (workspace) {
			baseFolder = "/" + project.getName() + "/" + WORKSPACE_FOLDER + "/";
		} else {
			baseFolder = "/" + project.getName() + getFolder(resource) + "/";
		}
		if (resource.getURI() != null && !resource.getURI().trim().isEmpty()) {
			if (resource instanceof Model) {
				try {
					String extension = FilenameUtils.getExtension(resource.getName());
					// If the model doesn't have a default Factory put the
					// XMIResourceFactoryImpl as default
					if (Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(extension) == null) {
						Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(extension, new XMIResourceFactoryImpl());
					}
				} catch (Exception ex) {

				}
			}
			path = baseFolder + resource.getURI();
		} else if (resource.getURI() != null && !resource.getURI().trim().isEmpty()) {
			// Load using URI
			return resource.getURI();
		} else {
			// Load using name
			path = baseFolder + resource.getName() + getDefaultResourceExtension(resource);
		}
		while (path.contains("//")) {
			path = path.replaceAll("//", "/");
		}
		return resolveCompiledPath(resource, path);
	}

	@Override
	public String getAbsolutFilePath(MTCResource resource) {
		IPath location = new Path(getPath(resource).replaceAll("/" + project.getName() + "/", ""));
		IFile file = project.getFile(location);
		return file.getRawLocation().toOSString();
	}

	@Override
	public File getFile(MTCResource resource) {
		return new File(getAbsolutFilePath(resource));
	}

	@Override
	public InputStream getInputStream(MTCResource resource) {
		try {
			return new FileInputStream(getFile(resource));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getFolder(MTCResource resource) {
		String path = null;
		if (resource instanceof Metamodel) {
			path = mtc.getMetamodelsFolder();
		} else if (resource instanceof HOTransformation) {
			path = mtc.getHOTransformationsFolder();
		} else if (resource instanceof MTCTransformation) {
			path = "/mtcs/";
		} else if (resource instanceof Model) {
			path = mtc.getModelsFolder();
		} else if (resource instanceof M2MTransformation) {
			path = mtc.getM2MTransformationsFolder();
		} else if (resource instanceof HOTransformation) {
			path = mtc.getHOTransformationsFolder();
		} else if (resource instanceof M2TTransformation) {
			path = mtc.getM2TTransformationsFolder();
		} else if (resource instanceof Validation) {
			path = mtc.getValidationsFolder();
		} else if (resource instanceof Library) {
			path = mtc.getLibrariesFolder();
		} else {
			path = "";
		}
		return (path.endsWith("/") ? path : path + "/");
	}

	private String resolveCompiledPath(MTCResource resource, String path) {
		if (resource instanceof M2MTransformation || resource instanceof Library || resource instanceof HOTransformation) {
			return path.replaceAll("[.]atl", ".asm");
		}
		return path;
		/*
		 * String extension = FilenameUtils.getExtension(path).toLowerCase();
		 * ITechnologyManager manager =
		 * MTCFlow.TechnologyManagerRegistry.INSTANCE.get(extension); if(manager
		 * != null){ String newExtension =
		 * manager.getCompiledExtension(extension); path =
		 * FilenameUtils.removeExtension(path)+newExtension; } return path;
		 */
	}

	public String getResourceExtension(MTCResource resource) {
		File f = getFile(resource);
		String[] nameParts = f.getName().split("[.]");
		return nameParts[nameParts.length - 1];
	}

	// @Override
	// public boolean isURIBased(MTCResource resource) {
	// return resource.getURI() != null && !resource.getURI().trim().isEmpty();
	// }

	@Override
	public File getTarget(M2TTransformation resource) {
		IPath location;
		if (resource instanceof HOTransformation) {
			location = new Path(WORKSPACE_FOLDER + "/" + resource.getTarget());
		} else {
			location = new Path(resource.getTarget());
		}
		IFile file = project.getFile(location);
		IFolder folder = project.getFolder(location);
		IFolder fileParent = null;
		try {
			fileParent = (IFolder) file.getParent();
		} catch (Exception ex) {

		}
		if ((file != null && file.exists()) || (folder != null && folder.exists()) || (fileParent != null && fileParent.exists()))
			return new File(file.getRawLocation().toOSString());
		else
			return new File(resource.getTarget());
	}

	@Override
	public <T> T getResourceAs(Class<T> clazz, MTCResource resource) {
		if (clazz.equals(IFile.class)) {
			return (T) project.getFile(getPath(resource).replaceAll("/" + project.getName() + "/", ""));
		}
		return null;
	}

	@Override
	public <T> T getResourceSourceAs(Class<T> clazz, MTCResource resource) {
		if (clazz.equals(IFile.class)) {
			String path = getPath(resource);
			if (path.endsWith(".asm")) {
				path = path.replaceAll(".asm", ".atl");
			}
			if (path.endsWith(".emtl")) {
				path = path.replaceAll(".emtl", ".mtl");
			}
			return (T) project.getFile(path.replaceAll("/" + project.getName() + "/", ""));
		}
		return null;
	}

	@Override
	public String getDefaultResourceExtension(MTCResource resource) {
		if (resource instanceof Metamodel) {
			return ".ecore";
		} else if (resource instanceof Model) {
			return ".xmi";
		} else if (resource instanceof M2MTransformation) {
			return ".asm";
		} else if (resource instanceof M2TTransformation) {
			return ".mtl";
		} else if (resource instanceof MTCTransformation) {
			return ".mtc";
		}
		return null;
	}

	@Override
	public String getWorkingFolder() {
		return WORKSPACE_FOLDER;
	}

	@Override
	public File findFile(String path) {
		IPath location = new Path(path);
		IFile file = project.getFile(location);
		if (file.exists()) {
			return project.getFile(location).getLocation().toFile();
		} else {
			return null;
		}
	}

}
