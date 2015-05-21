/**
 */
package com.mtcflow.model.mtc.util;

import com.mtcflow.model.mtc.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.mtcflow.model.mtc.MtcPackage
 * @generated
 */
public class MtcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MtcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtcSwitch() {
		if (modelPackage == null) {
			modelPackage = MtcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MtcPackage.MTC: {
				MTC mtc = (MTC)theEObject;
				T result = caseMTC(mtc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.METAMODEL: {
				Metamodel metamodel = (Metamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = caseMTCResource(metamodel);
				if (result == null) result = caseConfigurable(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.REFERENCED_RESOURCE: {
				ReferencedResource referencedResource = (ReferencedResource)theEObject;
				T result = caseReferencedResource(referencedResource);
				if (result == null) result = caseMTCResource(referencedResource);
				if (result == null) result = caseConfigurable(referencedResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseMTCResource(file);
				if (result == null) result = caseConfigurable(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseMTCResource(model);
				if (result == null) result = caseConfigurable(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.VALIDATION: {
				Validation validation = (Validation)theEObject;
				T result = caseValidation(validation);
				if (result == null) result = caseMTCResource(validation);
				if (result == null) result = caseConfigurable(validation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.HO_TRANSFORMATION: {
				HOTransformation hoTransformation = (HOTransformation)theEObject;
				T result = caseHOTransformation(hoTransformation);
				if (result == null) result = caseM2TTransformation(hoTransformation);
				if (result == null) result = caseT2MTransformation(hoTransformation);
				if (result == null) result = caseM2MTransformation(hoTransformation);
				if (result == null) result = caseModelProducerTransformation(hoTransformation);
				if (result == null) result = caseTransformation(hoTransformation);
				if (result == null) result = caseMTCResource(hoTransformation);
				if (result == null) result = caseConfigurable(hoTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.M2M_TRANSFORMATION: {
				M2MTransformation m2MTransformation = (M2MTransformation)theEObject;
				T result = caseM2MTransformation(m2MTransformation);
				if (result == null) result = caseModelProducerTransformation(m2MTransformation);
				if (result == null) result = caseTransformation(m2MTransformation);
				if (result == null) result = caseMTCResource(m2MTransformation);
				if (result == null) result = caseConfigurable(m2MTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.M2T_TRANSFORMATION: {
				M2TTransformation m2TTransformation = (M2TTransformation)theEObject;
				T result = caseM2TTransformation(m2TTransformation);
				if (result == null) result = caseTransformation(m2TTransformation);
				if (result == null) result = caseMTCResource(m2TTransformation);
				if (result == null) result = caseConfigurable(m2TTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.MTC_TRANSFORMATION: {
				MTCTransformation mtcTransformation = (MTCTransformation)theEObject;
				T result = caseMTCTransformation(mtcTransformation);
				if (result == null) result = caseM2TTransformation(mtcTransformation);
				if (result == null) result = caseT2MTransformation(mtcTransformation);
				if (result == null) result = caseM2MTransformation(mtcTransformation);
				if (result == null) result = caseModelProducerTransformation(mtcTransformation);
				if (result == null) result = caseTransformation(mtcTransformation);
				if (result == null) result = caseMTCResource(mtcTransformation);
				if (result == null) result = caseConfigurable(mtcTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.T2M_TRANSFORMATION: {
				T2MTransformation t2MTransformation = (T2MTransformation)theEObject;
				T result = caseT2MTransformation(t2MTransformation);
				if (result == null) result = caseModelProducerTransformation(t2MTransformation);
				if (result == null) result = caseTransformation(t2MTransformation);
				if (result == null) result = caseMTCResource(t2MTransformation);
				if (result == null) result = caseConfigurable(t2MTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.INPUT_MODEL: {
				InputModel inputModel = (InputModel)theEObject;
				T result = caseInputModel(inputModel);
				if (result == null) result = caseConfigurable(inputModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.OUTPUT_MODEL: {
				OutputModel outputModel = (OutputModel)theEObject;
				T result = caseOutputModel(outputModel);
				if (result == null) result = caseConfigurable(outputModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseMTCResource(transformation);
				if (result == null) result = caseConfigurable(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.MTC_RESOURCE: {
				MTCResource mtcResource = (MTCResource)theEObject;
				T result = caseMTCResource(mtcResource);
				if (result == null) result = caseConfigurable(mtcResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.MODEL_PRODUCER_TRANSFORMATION: {
				ModelProducerTransformation modelProducerTransformation = (ModelProducerTransformation)theEObject;
				T result = caseModelProducerTransformation(modelProducerTransformation);
				if (result == null) result = caseTransformation(modelProducerTransformation);
				if (result == null) result = caseMTCResource(modelProducerTransformation);
				if (result == null) result = caseConfigurable(modelProducerTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseMTCResource(library);
				if (result == null) result = caseConfigurable(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = caseMTCResource(script);
				if (result == null) result = caseConfigurable(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.MODEL_ENVIRONMENT: {
				ModelEnvironment modelEnvironment = (ModelEnvironment)theEObject;
				T result = caseModelEnvironment(modelEnvironment);
				if (result == null) result = caseConfigurable(modelEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.CONFIGURABLE: {
				Configurable configurable = (Configurable)theEObject;
				T result = caseConfigurable(configurable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.MODEL_VALIDATION: {
				ModelValidation modelValidation = (ModelValidation)theEObject;
				T result = caseModelValidation(modelValidation);
				if (result == null) result = caseConfigurable(modelValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.OUTPUT_FILE: {
				OutputFile outputFile = (OutputFile)theEObject;
				T result = caseOutputFile(outputFile);
				if (result == null) result = caseConfigurable(outputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.INPUT_FILE: {
				InputFile inputFile = (InputFile)theEObject;
				T result = caseInputFile(inputFile);
				if (result == null) result = caseConfigurable(inputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.CHOISE: {
				Choise choise = (Choise)theEObject;
				T result = caseChoise(choise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtcPackage.DECISION_INPUT_MODEL: {
				DecisionInputModel decisionInputModel = (DecisionInputModel)theEObject;
				T result = caseDecisionInputModel(decisionInputModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTC(MTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodel(Metamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedResource(ReferencedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidation(Validation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HO Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HO Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHOTransformation(HOTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M2M Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M2M Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM2MTransformation(M2MTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M2T Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M2T Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM2TTransformation(M2TTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTC Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTC Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTCTransformation(MTCTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2M Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2M Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2MTransformation(T2MTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputModel(InputModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputModel(OutputModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTC Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTC Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTCResource(MTCResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Producer Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Producer Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelProducerTransformation(ModelProducerTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelEnvironment(ModelEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurable(Configurable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelValidation(ModelValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputFile(OutputFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputFile(InputFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoise(Choise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Input Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Input Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionInputModel(DecisionInputModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MtcSwitch
