package com.mtcflow.diagram;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.ui.PlatformUI;

import com.mtcflow.engine.eclipse.MTCEclipseUtils;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Transformation;

public class ExecutionUtils implements IExternalJavaAction {

	public ExecutionUtils() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().doSave(new NullProgressMonitor());

		// TODO Auto-generated method stub
		EObject selectedResource = selections.iterator().next(); 
		if(DiagramPackage.eINSTANCE.getDSemanticDiagram().isSuperTypeOf(selectedResource.eClass())){
			DSemanticDiagram diagram = (DSemanticDiagram) selectedResource;
			selectedResource = diagram.getTarget();
		} else if(DiagramPackage.eINSTANCE.getDNode().isSuperTypeOf(selectedResource.eClass())){
			DNode node = (DNode) selectedResource;
			selectedResource = node.getTarget();
		}
		final String fileURI = selectedResource.eResource().getURI().toPlatformString(true).toString();
		final IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(fileURI);
		if(MtcPackage.eINSTANCE.getModel().isSuperTypeOf(selectedResource.eClass())){ 
			MTCEclipseUtils.startMTC(resource, null, Collections.singletonList(((Model)selectedResource).getName()), null);
		} else if(MtcPackage.eINSTANCE.getTransformation().isSuperTypeOf(selectedResource.eClass())){
			MTCEclipseUtils.startMTC(resource, ((Transformation)selectedResource).getName(), null, null);
		} else if(MtcPackage.eINSTANCE.getMTC().isSuperTypeOf(selectedResource.eClass())){
			MTCEclipseUtils.startMTC(resource, null, null, null);
		} 
		
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		
		//MtcPackage.eINSTANCE.getTransformation()
		return true;
	}

}
