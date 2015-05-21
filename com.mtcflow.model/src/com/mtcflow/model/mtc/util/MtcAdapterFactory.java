/**
 */
package com.mtcflow.model.mtc.util;

import com.mtcflow.model.mtc.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.mtcflow.model.mtc.Configurable;
import com.mtcflow.model.mtc.Configuration;
import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.DecisionInputModel;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.MTCTransformation;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.ModelProducerTransformation;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.Property;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;
import com.mtcflow.model.mtc.Variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mtcflow.model.mtc.MtcPackage
 * @generated
 */
public class MtcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MtcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MtcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MtcSwitch<Adapter> modelSwitch =
		new MtcSwitch<Adapter>() {
			@Override
			public Adapter caseMTC(MTC object) {
				return createMTCAdapter();
			}
			@Override
			public Adapter caseMetamodel(Metamodel object) {
				return createMetamodelAdapter();
			}
			@Override
			public Adapter caseReferencedResource(ReferencedResource object) {
				return createReferencedResourceAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseValidation(Validation object) {
				return createValidationAdapter();
			}
			@Override
			public Adapter caseHOTransformation(HOTransformation object) {
				return createHOTransformationAdapter();
			}
			@Override
			public Adapter caseM2MTransformation(M2MTransformation object) {
				return createM2MTransformationAdapter();
			}
			@Override
			public Adapter caseM2TTransformation(M2TTransformation object) {
				return createM2TTransformationAdapter();
			}
			@Override
			public Adapter caseMTCTransformation(MTCTransformation object) {
				return createMTCTransformationAdapter();
			}
			@Override
			public Adapter caseT2MTransformation(T2MTransformation object) {
				return createT2MTransformationAdapter();
			}
			@Override
			public Adapter caseInputModel(InputModel object) {
				return createInputModelAdapter();
			}
			@Override
			public Adapter caseOutputModel(OutputModel object) {
				return createOutputModelAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseMTCResource(MTCResource object) {
				return createMTCResourceAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseModelProducerTransformation(ModelProducerTransformation object) {
				return createModelProducerTransformationAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseModelEnvironment(ModelEnvironment object) {
				return createModelEnvironmentAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseConfigurable(Configurable object) {
				return createConfigurableAdapter();
			}
			@Override
			public Adapter caseModelValidation(ModelValidation object) {
				return createModelValidationAdapter();
			}
			@Override
			public Adapter caseOutputFile(OutputFile object) {
				return createOutputFileAdapter();
			}
			@Override
			public Adapter caseInputFile(InputFile object) {
				return createInputFileAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseChoise(Choise object) {
				return createChoiseAdapter();
			}
			@Override
			public Adapter caseDecisionInputModel(DecisionInputModel object) {
				return createDecisionInputModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.MTC <em>MTC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.MTC
	 * @generated
	 */
	public Adapter createMTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Metamodel
	 * @generated
	 */
	public Adapter createMetamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.ReferencedResource <em>Referenced Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.ReferencedResource
	 * @generated
	 */
	public Adapter createReferencedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Validation
	 * @generated
	 */
	public Adapter createValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.HOTransformation <em>HO Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.HOTransformation
	 * @generated
	 */
	public Adapter createHOTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.M2MTransformation <em>M2M Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.M2MTransformation
	 * @generated
	 */
	public Adapter createM2MTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.M2TTransformation <em>M2T Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.M2TTransformation
	 * @generated
	 */
	public Adapter createM2TTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.MTCTransformation <em>MTC Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.MTCTransformation
	 * @generated
	 */
	public Adapter createMTCTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.T2MTransformation <em>T2M Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.T2MTransformation
	 * @generated
	 */
	public Adapter createT2MTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.InputModel <em>Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.InputModel
	 * @generated
	 */
	public Adapter createInputModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.OutputModel <em>Output Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.OutputModel
	 * @generated
	 */
	public Adapter createOutputModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.MTCResource <em>MTC Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.MTCResource
	 * @generated
	 */
	public Adapter createMTCResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.ModelProducerTransformation <em>Model Producer Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.ModelProducerTransformation
	 * @generated
	 */
	public Adapter createModelProducerTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.ModelEnvironment <em>Model Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.ModelEnvironment
	 * @generated
	 */
	public Adapter createModelEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Configurable <em>Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Configurable
	 * @generated
	 */
	public Adapter createConfigurableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.ModelValidation <em>Model Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.ModelValidation
	 * @generated
	 */
	public Adapter createModelValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.OutputFile
	 * @generated
	 */
	public Adapter createOutputFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.InputFile
	 * @generated
	 */
	public Adapter createInputFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.Choise <em>Choise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.Choise
	 * @generated
	 */
	public Adapter createChoiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mtcflow.model.mtc.DecisionInputModel <em>Decision Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mtcflow.model.mtc.DecisionInputModel
	 * @generated
	 */
	public Adapter createDecisionInputModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MtcAdapterFactory
