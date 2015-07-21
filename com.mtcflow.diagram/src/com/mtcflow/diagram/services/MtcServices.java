package com.mtcflow.diagram.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;

import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

public class MtcServices {

	public List<EObject> getModelValidations(Validation validation) {
		ArrayList<EObject> resp = new ArrayList<EObject>();
		MTC mtc = (MTC) validation.eContainer();
		for (ModelValidation mValidation : mtc.getModelValidations()) {
			if (mValidation.getValidation().equals(validation)) {
				resp.add(mValidation);
			}
		}
		return resp;
	}

	public List<EObject> getM2MTransformations(MTC mtc) {
		return filterTransformations(mtc.getTransformations(), MtcPackage.eINSTANCE.getM2MTransformation());
	}

	public List<EObject> getM2TTransformations(MTC mtc) {
		return filterTransformations(mtc.getTransformations(), MtcPackage.eINSTANCE.getM2TTransformation());
	}

	public List<EObject> getT2MTransformations(MTC mtc) {
		return filterTransformations(mtc.getTransformations(), MtcPackage.eINSTANCE.getT2MTransformation());
	}

	public List<EObject> getHOTransformations(MTC mtc) {
		return filterTransformations(mtc.getTransformations(), MtcPackage.eINSTANCE.getHOTransformation());
	}

	public List<EObject> getMTCTransformations(MTC mtc) {
		return filterTransformations(mtc.getTransformations(), MtcPackage.eINSTANCE.getMTCTransformation());
	}

	// Methods to the connection tool
	public boolean isInputModel(EObject root, EObject source, EObject target) {
		return source.eClass().equals(MtcPackage.eINSTANCE.getModel()) && MtcPackage.eINSTANCE.getTransformation().isSuperTypeOf(target.eClass());
	}

	public boolean isOutputModel(EObject root, EObject source, EObject target) {
		return MtcPackage.eINSTANCE.getModelProducerTransformation().isSuperTypeOf(source.eClass()) && target.eClass().equals(MtcPackage.eINSTANCE.getModel());
	}

	public boolean isHotOutput(EObject root, EObject source, EObject target) {
		return MtcPackage.eINSTANCE.getHOTransformation().isSuperTypeOf(source.eClass()) && MtcPackage.eINSTANCE.getTransformation().isSuperTypeOf(target.eClass());
	}

	public boolean isOutputFile(EObject root, EObject source, EObject target) {
		return MtcPackage.eINSTANCE.getM2TTransformation().isSuperTypeOf(source.eClass()) && target.eClass().equals(MtcPackage.eINSTANCE.getFile());
	}

	public boolean isInputFile(EObject root, EObject source, EObject target) {
		return source.eClass().equals(MtcPackage.eINSTANCE.getFile()) && MtcPackage.eINSTANCE.getT2MTransformation().isSuperTypeOf(target.eClass());
	}

	public boolean isDecisionInputModel(EObject root, EObject source, EObject target) {
		return source.eClass().equals(MtcPackage.eINSTANCE.getModel()) && target.eClass().equals(MtcPackage.eINSTANCE.getDecision());
	}

	public boolean isChoise(EObject root, EObject source, EObject target) {
		return source.eClass().equals(MtcPackage.eINSTANCE.getDecision()) && MtcPackage.eINSTANCE.getTransformation().isSuperTypeOf(target.eClass());
	}

	public boolean isRefResource(EObject root, EObject source, EObject target) {
		return MtcPackage.eINSTANCE.getMTCResource().isSuperTypeOf(source.eClass()) && target.eClass().equals(MtcPackage.eINSTANCE.getReferencedResource());
	}

	public EObject deleteRefResource(EObject obj, DEdge view) {
		return ((DNode) view.getTargetNode()).getTarget();
	}

	public List<EObject> getInOutModels(Transformation transformation) {
		final EList<EObject> resp = new BasicEList<EObject>();
		MTC mtc = (MTC) transformation.eContainer();
		for (InputModel inModel : mtc.getInputModels()) {
			if (inModel.getTransformation().equals(transformation)) {
				resp.add(inModel);
			}
		}
		for (OutputModel outModel : mtc.getOutputModels()) {
			if (outModel.getTransformation().equals(transformation)) {
				resp.add(outModel);
			}
		}
		resp.add(transformation);
		resp.addAll(mtc.getInputFiles(transformation));
		resp.addAll(mtc.getOutputFiles(transformation));
		return resp;
	}
	
	
	public List<EObject> getInOutTransformations(Model model) {
		final EList<EObject> resp = new BasicEList<EObject>();
		MTC mtc = (MTC) model.eContainer();
		for (InputModel inModel : mtc.getInputModels()) {
			if (inModel.getModel().equals(model)) {
				resp.add(inModel);
			}
		}
		for (OutputModel outModel : mtc.getOutputModels()) {
			if (outModel.getModel().equals(model)) {
				resp.add(outModel);
			}
		}
		resp.add(model);
		return resp;
	}
	
	public EObject copy(EObject obj){
		return EcoreUtil.copy(obj);
	}
	
	
	// Utils
	public boolean enableConfiguration(MTC mtc) {
		return mtc.getConfigurations() == null;
	}

	// Ccommon
	public List<EObject> filterTransformations(List<Transformation> transformations, EClass clazz) {
		ArrayList<EObject> resp = new ArrayList<EObject>();
		for (Transformation transformation : transformations) {
			if (transformation.eClass().equals(clazz)) {
				resp.add(transformation);
			}
		}
		return resp;
	}

}
