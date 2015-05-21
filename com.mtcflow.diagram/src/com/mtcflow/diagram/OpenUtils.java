package com.mtcflow.diagram;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.wizards.IWizardDescriptor;

import com.mtcflow.engine.eclipse.EclipseResourceLocator;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;

public class OpenUtils implements IExternalJavaAction {

	public OpenUtils() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		final EObject rSelected = selections.iterator().next();
		if(!DiagramPackage.eINSTANCE.getDNode().isSuperTypeOf(rSelected.eClass())){
			return;
		}
		final DNode node = (DNode) rSelected;
		final MTCResource selectedResource = (MTCResource) node.getTarget();
		final String fileURI = selectedResource.eResource().getURI().toPlatformString(true).toString();
		final IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(fileURI);
		final MTC mtc = (MTC) selectedResource.eContainer(); 
		// Get the MTC
		final IProject project = resource.getProject();
		final EclipseResourceLocator locator = new EclipseResourceLocator(resource.getProject(), mtc);
		// MTCChore
		final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IFile file = null;
		final String path = locator.getPath(selectedResource);
		if (path.endsWith(".ecore")) {
			IFile diagramFile = project.getFile(locator.getPath(selectedResource).replaceAll("[.]ecore", ".ecorediag").replaceAll("/" + project.getName() + "/", ""));
			if (diagramFile.exists()) {
				file = diagramFile;
			} else {
				diagramFile = project.getFile(locator.getPath(selectedResource).replaceAll("[.]ecore", ".ecore_diagram").replaceAll("/" + project.getName() + "/", ""));
				if (diagramFile.exists()) {
					file = diagramFile;
				} else {
					file = locator.getResourceSourceAs(IFile.class, selectedResource);
				}
			}
		}
		if (path.endsWith(".mtc")) {
			IFile diagramFile = project.getFile(locator.getPath(selectedResource).replaceAll("[.]mtc", ".mtcd").replaceAll("/" + project.getName() + "/", ""));
			if (diagramFile.exists()) {
				file = diagramFile;
			}
		} else {
			file = locator.getResourceSourceAs(IFile.class, selectedResource);
		}
		if (file!= null && file.exists()) {
			try {
				IEditorDescriptor desc = null;
				if (file.getContentDescription() != null) {
					desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName(), file.getContentDescription().getContentType());
				} else {
					desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
				} 
				if(desc == null){
					desc = PlatformUI.getWorkbench().getEditorRegistry().findEditor("org.eclipse.ui.DefaultTextEditor");
				}
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			boolean result = MessageDialog.openConfirm(null, "Confirm", "The " + selectedResource.eClass().getName() + " " + selectedResource.getName() + " at /" + file.getProjectRelativePath() + " doesnt exists.\n Would you like to create it?");
			final Object selected = locator.getResourceSourceAs(IFile.class, selectedResource).getParent();
			if (result) {
				// OK Button selected do something
				if (selectedResource instanceof M2MTransformation) {
					launchWizard("atlFileWizard", selected);
				} else if (selectedResource instanceof M2TTransformation) {
					launchWizard("org.eclipse.acceleo.ide.ui.wizards.newfile.AcceleoModuleWizard", selected);
				}

			} else {
				// Cancel Button selected do something
			}
		}

	}
	
	public void launchWizard(String wizardId, final Object selected){
		IStructuredSelection selection = new IStructuredSelection() {

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public List<Object> toList() {
				return Collections.singletonList(selected);
			}

			@Override
			public Object[] toArray() {
				return new Object[]{selected};
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 1;
			}

			@Override
			public Iterator<Object> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<Object>() {
					boolean next = true;

					@Override
					public boolean hasNext() {
						return next;
					}

					@Override
					public void remove() {

					}

					@Override
					public Object next() {
						next = false;
						return selected;
					}
				};
			}

			@Override
			public Object getFirstElement() {
				return selected;
			}
		};
		IWizardDescriptor category = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard(wizardId);
		try {
			IWorkbenchWizard wiz = category.createWizard();
			wiz.init(PlatformUI.getWorkbench(), selection);
			WizardDialog wd = new WizardDialog(null, wiz);
			wd.setTitle(wiz.getWindowTitle());
			wd.open();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
