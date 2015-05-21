package com.mtcflow.model.mtc.utils;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.RegisteredPackageDialog;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.dialogs.SelectionDialog;

import com.mtcflow.engine.eclipse.MTCEclipseUtils;
import com.mtcflow.model.mtc.MTCResource;

public class DialogUtils {

	public enum DialogTypes {
		Class, EMFURI, Target, URI, Technology
	}

	public static String openDialogFor(EObject object, DialogTypes type, String currentValue) {
		String newValue = null;
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			if (type == DialogTypes.URI) {
				IFile modelFile = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(object.eResource().getURI().toPlatformString(true));
				IProject project = modelFile.getProject();
				MTCResource mtcResource = (MTCResource) object;
				String folder = MTCEclipseUtils.getResourceFolder(mtcResource);
				IContainer resourceFolder = null;
				if (!folder.equals("/")) {
					resourceFolder = project.getFolder(folder);
				} else {
					resourceFolder = project;
				}
				FilteredResourcesSelectionDialog dialog = null;
				if (folder.equals("/mtcs/")) {
					dialog = new FilteredResourcesSelectionDialog(shell, false, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
				} else {
					dialog = new FilteredResourcesSelectionDialog(shell, false, resourceFolder, IResource.FILE);
				}
				dialog.setTitle("Select the resource File");
				// User pressed cancel 
				dialog.setInitialPattern("**");
				if (dialog.open() == Window.OK) {
					IFile file = (IFile) dialog.getResult()[0];
					if (file.getProject().equals(project)) {
						newValue = file.getProjectRelativePath().toString();
						folder = folder.replaceFirst("/", "");
						newValue = newValue.replaceAll(folder, "");
					} else {
						newValue = file.getFullPath().toString();
					}
				}
			} else if (type == DialogTypes.EMFURI) {
				RegisteredPackageDialog dialog = new RegisteredPackageDialog(shell);
				if (dialog.open() == Window.OK) {
					newValue = dialog.getFirstResult().toString();
				}
			} else if (type == DialogTypes.Target) {	
				DirectoryDialog dialog = new DirectoryDialog(shell, SWT.OPEN);
				newValue = dialog.open();
			} else if (type == DialogTypes.Class) {
				SelectionDialog dialog = null;
				try {
					IFile modelFile = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(object.eResource().getURI().toPlatformString(true));
					IJavaProject project = JavaCore.create(modelFile.getProject()); 
					IType transformationExecutoType = project.findType("com.mtcflow.engine.transformation.ITransformationExecutor");
					if (transformationExecutoType != null) {
						dialog = JavaUI.createTypeDialog(shell, new ProgressMonitorDialog(shell), SearchEngine.createHierarchyScope(transformationExecutoType), IJavaElementSearchConstants.CONSIDER_CLASSES, false);
					dialog.setTitle("Transformation class selection");
					dialog.setMessage("Select the class that implements the transformation");
					if (dialog.open() == IDialogConstants.CANCEL_ID)
						return null;

					Object[] types = dialog.getResult();
					if (types == null || types.length == 0)
						return null;
					IType sType = (IType) dialog.getResult()[0];
					newValue = sType.getFullyQualifiedName();
					} else{
						MessageDialog.openError(shell, "Error - Selecting Transformation Impl. Class", "Make sure that you include a dependencie to the com.mtcflow.engine.core plugin, to use custom transformations in your project.");
					}
				} catch (JavaModelException e) {
					e.printStackTrace();
				}
			}
		}
		if (newValue == null || newValue.equals(currentValue)) {
			return null;
		} else {
			return newValue;
		}
	}

}
