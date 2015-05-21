/**
 */
package com.mtcflow.model.mtc.impl;

import com.mtcflow.model.mtc.Choise;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.MTCTransformation;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.ModelProducerTransformation;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtcPackageImpl extends EPackageImpl implements MtcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2MTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2TTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtcTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2MTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtcResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelProducerTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionInputModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.mtcflow.model.mtc.MtcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MtcPackageImpl() {
		super(eNS_URI, MtcFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MtcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MtcPackage init() {
		if (isInited) return (MtcPackage)EPackage.Registry.INSTANCE.getEPackage(MtcPackage.eNS_URI);

		// Obtain or create and register package
		MtcPackageImpl theMtcPackage = (MtcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MtcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MtcPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMtcPackage.createPackageContents();

		// Initialize created meta-data
		theMtcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMtcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MtcPackage.eNS_URI, theMtcPackage);
		return theMtcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTC() {
		return mtcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_Name() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_Files() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_Metamodels() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_Models() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_InputModels() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_Transformations() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_OutputModels() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_M2MTechnology() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_M2TTechnology() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_HOTechnology() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_M2MTransformationsFolder() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_M2TTransformationsFolder() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_HOTransformationsFolder() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_MetamodelsFolder() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_ModelsFolder() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_Validations() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_Configurations() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_ValidationsFolder() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_Version() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_LibrariesFolder() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_Description() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_ReferencedResources() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_ValidateConformance() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_Workspace() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTC_ExecutionInformation() {
		return (EAttribute)mtcEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_ModelValidations() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_InputFiles() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_OutputFiles() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_Decisions() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTC_DecisionInputModels() {
		return (EReference)mtcEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodel() {
		return metamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodel_Alias() {
		return (EAttribute)metamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodel_Autoregister() {
		return (EAttribute)metamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodel_MetamodelURI() {
		return (EAttribute)metamodelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedResource() {
		return referencedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencedResource_Type() {
		return (EAttribute)referencedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Type() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Metamodels() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Format() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidation() {
		return validationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHOTransformation() {
		return hoTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHOTransformation_OutputTransformations() {
		return (EReference)hoTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2MTransformation() {
		return m2MTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2TTransformation() {
		return m2TTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2TTransformation_Target() {
		return (EAttribute)m2TTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTCTransformation() {
		return mtcTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2MTransformation() {
		return t2MTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputModel() {
		return inputModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputModel_Model() {
		return (EReference)inputModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputModel_ModelAlias() {
		return (EAttribute)inputModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputModel_Transformation() {
		return (EReference)inputModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputModel_MetamodelAlias() {
		return (EAttribute)inputModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputModel_Index() {
		return (EAttribute)inputModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputModel() {
		return outputModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputModel_ModelAlias() {
		return (EAttribute)outputModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputModel_Model() {
		return (EReference)outputModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputModel_Transformation() {
		return (EReference)outputModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputModel_MetamodelAlias() {
		return (EAttribute)outputModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_ImplementationClass() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Libraries() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_PreExecutionScript() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_PostExecutionScript() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_ModelDependencies() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_FileDependencies() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTCResource() {
		return mtcResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCResource_Name() {
		return (EAttribute)mtcResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCResource_URI() {
		return (EAttribute)mtcResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTCResource_Tags() {
		return (EReference)mtcResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCResource_Description() {
		return (EAttribute)mtcResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTCResource_ReferencedResources() {
		return (EReference)mtcResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCResource_ExecutionInformation() {
		return (EAttribute)mtcResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTCResource_Technology() {
		return (EAttribute)mtcResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_DefaultValue() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Description() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Variables() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Tags() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Libraries() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Scripts() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Environments() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelProducerTransformation() {
		return modelProducerTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Description() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_ImplementationClass() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelEnvironment() {
		return modelEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelEnvironment_Name() {
		return (EAttribute)modelEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelEnvironment_ImplementationClass() {
		return (EAttribute)modelEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurable() {
		return configurableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurable_Properties() {
		return (EReference)configurableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelValidation() {
		return modelValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelValidation_Validation() {
		return (EReference)modelValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelValidation_Models() {
		return (EReference)modelValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelValidation_StopOnError() {
		return (EAttribute)modelValidationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputFile() {
		return outputFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputFile_Transformation() {
		return (EReference)outputFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputFile_File() {
		return (EReference)outputFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputFile() {
		return inputFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputFile_File() {
		return (EReference)inputFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputFile_Transformation() {
		return (EReference)inputFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Name() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Expresion() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Choises() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_ImplementationClass() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoise() {
		return choiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoise_Transformation() {
		return (EReference)choiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoise_Decision() {
		return (EReference)choiseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoise_ChoiseValue() {
		return (EAttribute)choiseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionInputModel() {
		return decisionInputModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionInputModel_Decision() {
		return (EReference)decisionInputModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionInputModel_Model() {
		return (EReference)decisionInputModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionInputModel_ModelAlias() {
		return (EAttribute)decisionInputModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionInputModel_MetamodelAlias() {
		return (EAttribute)decisionInputModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionInputModel_LoadForDecisionEvaluation() {
		return (EAttribute)decisionInputModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionInputModel_Choises() {
		return (EReference)decisionInputModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtcFactory getMtcFactory() {
		return (MtcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mtcEClass = createEClass(MTC);
		createEAttribute(mtcEClass, MTC__NAME);
		createEReference(mtcEClass, MTC__FILES);
		createEReference(mtcEClass, MTC__METAMODELS);
		createEReference(mtcEClass, MTC__MODELS);
		createEReference(mtcEClass, MTC__INPUT_MODELS);
		createEReference(mtcEClass, MTC__TRANSFORMATIONS);
		createEReference(mtcEClass, MTC__OUTPUT_MODELS);
		createEAttribute(mtcEClass, MTC__M2M_TECHNOLOGY);
		createEAttribute(mtcEClass, MTC__M2T_TECHNOLOGY);
		createEAttribute(mtcEClass, MTC__HO_TECHNOLOGY);
		createEAttribute(mtcEClass, MTC__M2M_TRANSFORMATIONS_FOLDER);
		createEAttribute(mtcEClass, MTC__M2T_TRANSFORMATIONS_FOLDER);
		createEAttribute(mtcEClass, MTC__HO_TRANSFORMATIONS_FOLDER);
		createEAttribute(mtcEClass, MTC__METAMODELS_FOLDER);
		createEAttribute(mtcEClass, MTC__MODELS_FOLDER);
		createEReference(mtcEClass, MTC__VALIDATIONS);
		createEReference(mtcEClass, MTC__CONFIGURATIONS);
		createEAttribute(mtcEClass, MTC__VALIDATIONS_FOLDER);
		createEAttribute(mtcEClass, MTC__VERSION);
		createEAttribute(mtcEClass, MTC__LIBRARIES_FOLDER);
		createEAttribute(mtcEClass, MTC__DESCRIPTION);
		createEReference(mtcEClass, MTC__REFERENCED_RESOURCES);
		createEAttribute(mtcEClass, MTC__VALIDATE_CONFORMANCE);
		createEAttribute(mtcEClass, MTC__WORKSPACE);
		createEAttribute(mtcEClass, MTC__EXECUTION_INFORMATION);
		createEReference(mtcEClass, MTC__MODEL_VALIDATIONS);
		createEReference(mtcEClass, MTC__INPUT_FILES);
		createEReference(mtcEClass, MTC__OUTPUT_FILES);
		createEReference(mtcEClass, MTC__DECISIONS);
		createEReference(mtcEClass, MTC__DECISION_INPUT_MODELS);

		metamodelEClass = createEClass(METAMODEL);
		createEAttribute(metamodelEClass, METAMODEL__ALIAS);
		createEAttribute(metamodelEClass, METAMODEL__AUTOREGISTER);
		createEAttribute(metamodelEClass, METAMODEL__METAMODEL_URI);

		referencedResourceEClass = createEClass(REFERENCED_RESOURCE);
		createEAttribute(referencedResourceEClass, REFERENCED_RESOURCE__TYPE);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__TYPE);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__METAMODELS);
		createEAttribute(modelEClass, MODEL__FORMAT);

		validationEClass = createEClass(VALIDATION);

		hoTransformationEClass = createEClass(HO_TRANSFORMATION);
		createEReference(hoTransformationEClass, HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS);

		m2MTransformationEClass = createEClass(M2M_TRANSFORMATION);

		m2TTransformationEClass = createEClass(M2T_TRANSFORMATION);
		createEAttribute(m2TTransformationEClass, M2T_TRANSFORMATION__TARGET);

		mtcTransformationEClass = createEClass(MTC_TRANSFORMATION);

		t2MTransformationEClass = createEClass(T2M_TRANSFORMATION);

		inputModelEClass = createEClass(INPUT_MODEL);
		createEReference(inputModelEClass, INPUT_MODEL__MODEL);
		createEAttribute(inputModelEClass, INPUT_MODEL__MODEL_ALIAS);
		createEReference(inputModelEClass, INPUT_MODEL__TRANSFORMATION);
		createEAttribute(inputModelEClass, INPUT_MODEL__METAMODEL_ALIAS);
		createEAttribute(inputModelEClass, INPUT_MODEL__INDEX);

		outputModelEClass = createEClass(OUTPUT_MODEL);
		createEAttribute(outputModelEClass, OUTPUT_MODEL__MODEL_ALIAS);
		createEReference(outputModelEClass, OUTPUT_MODEL__MODEL);
		createEReference(outputModelEClass, OUTPUT_MODEL__TRANSFORMATION);
		createEAttribute(outputModelEClass, OUTPUT_MODEL__METAMODEL_ALIAS);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__IMPLEMENTATION_CLASS);
		createEReference(transformationEClass, TRANSFORMATION__LIBRARIES);
		createEReference(transformationEClass, TRANSFORMATION__PRE_EXECUTION_SCRIPT);
		createEReference(transformationEClass, TRANSFORMATION__POST_EXECUTION_SCRIPT);
		createEReference(transformationEClass, TRANSFORMATION__MODEL_DEPENDENCIES);
		createEReference(transformationEClass, TRANSFORMATION__FILE_DEPENDENCIES);

		mtcResourceEClass = createEClass(MTC_RESOURCE);
		createEAttribute(mtcResourceEClass, MTC_RESOURCE__NAME);
		createEAttribute(mtcResourceEClass, MTC_RESOURCE__URI);
		createEReference(mtcResourceEClass, MTC_RESOURCE__TAGS);
		createEAttribute(mtcResourceEClass, MTC_RESOURCE__DESCRIPTION);
		createEReference(mtcResourceEClass, MTC_RESOURCE__REFERENCED_RESOURCES);
		createEAttribute(mtcResourceEClass, MTC_RESOURCE__EXECUTION_INFORMATION);
		createEAttribute(mtcResourceEClass, MTC_RESOURCE__TECHNOLOGY);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__DEFAULT_VALUE);
		createEAttribute(variableEClass, VARIABLE__DESCRIPTION);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__VARIABLES);
		createEReference(configurationEClass, CONFIGURATION__TAGS);
		createEReference(configurationEClass, CONFIGURATION__LIBRARIES);
		createEReference(configurationEClass, CONFIGURATION__SCRIPTS);
		createEReference(configurationEClass, CONFIGURATION__ENVIRONMENTS);

		modelProducerTransformationEClass = createEClass(MODEL_PRODUCER_TRANSFORMATION);

		libraryEClass = createEClass(LIBRARY);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__DESCRIPTION);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__IMPLEMENTATION_CLASS);

		modelEnvironmentEClass = createEClass(MODEL_ENVIRONMENT);
		createEAttribute(modelEnvironmentEClass, MODEL_ENVIRONMENT__NAME);
		createEAttribute(modelEnvironmentEClass, MODEL_ENVIRONMENT__IMPLEMENTATION_CLASS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		configurableEClass = createEClass(CONFIGURABLE);
		createEReference(configurableEClass, CONFIGURABLE__PROPERTIES);

		modelValidationEClass = createEClass(MODEL_VALIDATION);
		createEReference(modelValidationEClass, MODEL_VALIDATION__VALIDATION);
		createEReference(modelValidationEClass, MODEL_VALIDATION__MODELS);
		createEAttribute(modelValidationEClass, MODEL_VALIDATION__STOP_ON_ERROR);

		outputFileEClass = createEClass(OUTPUT_FILE);
		createEReference(outputFileEClass, OUTPUT_FILE__TRANSFORMATION);
		createEReference(outputFileEClass, OUTPUT_FILE__FILE);

		inputFileEClass = createEClass(INPUT_FILE);
		createEReference(inputFileEClass, INPUT_FILE__FILE);
		createEReference(inputFileEClass, INPUT_FILE__TRANSFORMATION);

		decisionEClass = createEClass(DECISION);
		createEAttribute(decisionEClass, DECISION__NAME);
		createEAttribute(decisionEClass, DECISION__EXPRESION);
		createEReference(decisionEClass, DECISION__CHOISES);
		createEAttribute(decisionEClass, DECISION__IMPLEMENTATION_CLASS);

		choiseEClass = createEClass(CHOISE);
		createEReference(choiseEClass, CHOISE__TRANSFORMATION);
		createEReference(choiseEClass, CHOISE__DECISION);
		createEAttribute(choiseEClass, CHOISE__CHOISE_VALUE);

		decisionInputModelEClass = createEClass(DECISION_INPUT_MODEL);
		createEReference(decisionInputModelEClass, DECISION_INPUT_MODEL__DECISION);
		createEReference(decisionInputModelEClass, DECISION_INPUT_MODEL__MODEL);
		createEAttribute(decisionInputModelEClass, DECISION_INPUT_MODEL__MODEL_ALIAS);
		createEAttribute(decisionInputModelEClass, DECISION_INPUT_MODEL__METAMODEL_ALIAS);
		createEAttribute(decisionInputModelEClass, DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION);
		createEReference(decisionInputModelEClass, DECISION_INPUT_MODEL__CHOISES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metamodelEClass.getESuperTypes().add(this.getMTCResource());
		referencedResourceEClass.getESuperTypes().add(this.getMTCResource());
		fileEClass.getESuperTypes().add(this.getMTCResource());
		modelEClass.getESuperTypes().add(this.getMTCResource());
		validationEClass.getESuperTypes().add(this.getMTCResource());
		hoTransformationEClass.getESuperTypes().add(this.getM2TTransformation());
		hoTransformationEClass.getESuperTypes().add(this.getT2MTransformation());
		hoTransformationEClass.getESuperTypes().add(this.getM2MTransformation());
		m2MTransformationEClass.getESuperTypes().add(this.getModelProducerTransformation());
		m2TTransformationEClass.getESuperTypes().add(this.getTransformation());
		mtcTransformationEClass.getESuperTypes().add(this.getM2TTransformation());
		mtcTransformationEClass.getESuperTypes().add(this.getT2MTransformation());
		mtcTransformationEClass.getESuperTypes().add(this.getM2MTransformation());
		t2MTransformationEClass.getESuperTypes().add(this.getModelProducerTransformation());
		inputModelEClass.getESuperTypes().add(this.getConfigurable());
		outputModelEClass.getESuperTypes().add(this.getConfigurable());
		transformationEClass.getESuperTypes().add(this.getMTCResource());
		mtcResourceEClass.getESuperTypes().add(this.getConfigurable());
		modelProducerTransformationEClass.getESuperTypes().add(this.getTransformation());
		libraryEClass.getESuperTypes().add(this.getMTCResource());
		scriptEClass.getESuperTypes().add(this.getMTCResource());
		modelEnvironmentEClass.getESuperTypes().add(this.getConfigurable());
		modelValidationEClass.getESuperTypes().add(this.getConfigurable());
		outputFileEClass.getESuperTypes().add(this.getConfigurable());
		inputFileEClass.getESuperTypes().add(this.getConfigurable());

		// Initialize classes and features; add operations and parameters
		initEClass(mtcEClass, com.mtcflow.model.mtc.MTC.class, "MTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTC_Name(), ecorePackage.getEString(), "name", "MTC", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_Files(), this.getFile(), null, "files", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_Metamodels(), this.getMetamodel(), null, "metamodels", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_Models(), this.getModel(), null, "models", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_InputModels(), this.getInputModel(), null, "inputModels", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_Transformations(), this.getTransformation(), null, "transformations", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_OutputModels(), this.getOutputModel(), null, "outputModels", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_M2MTechnology(), ecorePackage.getEString(), "M2MTechnology", "ATL", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_M2TTechnology(), ecorePackage.getEString(), "M2TTechnology", "ACCELEO", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_HOTechnology(), ecorePackage.getEString(), "HOTechnology", "ATL", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_M2MTransformationsFolder(), ecorePackage.getEString(), "M2MTransformationsFolder", "/transformations/M2M/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_M2TTransformationsFolder(), ecorePackage.getEString(), "M2TTransformationsFolder", "/transformations/M2T/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_HOTransformationsFolder(), ecorePackage.getEString(), "HOTransformationsFolder", "/transformations/HOT/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_MetamodelsFolder(), ecorePackage.getEString(), "metamodelsFolder", "/metamodels/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_ModelsFolder(), ecorePackage.getEString(), "modelsFolder", "/models/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_Validations(), this.getValidation(), null, "validations", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_Configurations(), this.getConfiguration(), null, "configurations", null, 0, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_ValidationsFolder(), ecorePackage.getEString(), "validationsFolder", "/validations/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_Version(), ecorePackage.getEString(), "version", "1.0", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_LibrariesFolder(), ecorePackage.getEString(), "librariesFolder", "/libraries/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_ReferencedResources(), this.getReferencedResource(), null, "referencedResources", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_ValidateConformance(), ecorePackage.getEBoolean(), "validateConformance", "true", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTC_Workspace(), ecorePackage.getEString(), "workspace", "/workspace/", 1, 1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getMTC_ExecutionInformation(), g1, "executionInformation", null, 0, 1, com.mtcflow.model.mtc.MTC.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_ModelValidations(), this.getModelValidation(), null, "modelValidations", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_InputFiles(), this.getInputFile(), null, "inputFiles", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_OutputFiles(), this.getOutputFile(), null, "outputFiles", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_Decisions(), this.getDecision(), null, "decisions", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTC_DecisionInputModels(), this.getDecisionInputModel(), null, "decisionInputModels", null, 0, -1, com.mtcflow.model.mtc.MTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(mtcEClass, this.getInputFile(), "getInputFiles", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransformation(), "transformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtcEClass, this.getOutputFile(), "getOutputFiles", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransformation(), "transformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtcEClass, this.getFile(), "getFiles", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getT2MTransformation(), "transformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtcEClass, this.getModelValidation(), "getValidations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtcEClass, this.getTransformation(), "getTransformationByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "transformationName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(metamodelEClass, Metamodel.class, "Metamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodel_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodel_Autoregister(), ecorePackage.getEBoolean(), "autoregister", "true", 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodel_MetamodelURI(), ecorePackage.getEString(), "metamodelURI", null, 0, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencedResourceEClass, ReferencedResource.class, "ReferencedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferencedResource_Type(), ecorePackage.getEString(), "type", null, 0, 1, ReferencedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Type(), ecorePackage.getEString(), "type", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Metamodels(), this.getMetamodel(), null, "metamodels", null, 1, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Format(), ecorePackage.getEString(), "format", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(modelEClass, this.getMetamodel(), "getMainMetamodel", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(validationEClass, Validation.class, "Validation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hoTransformationEClass, HOTransformation.class, "HOTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHOTransformation_OutputTransformations(), this.getTransformation(), null, "outputTransformations", null, 0, -1, HOTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m2MTransformationEClass, M2MTransformation.class, "M2MTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(m2TTransformationEClass, M2TTransformation.class, "M2TTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM2TTransformation_Target(), ecorePackage.getEString(), "target", null, 0, 1, M2TTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtcTransformationEClass, MTCTransformation.class, "MTCTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(t2MTransformationEClass, T2MTransformation.class, "T2MTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputModelEClass, InputModel.class, "InputModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputModel_Model(), this.getModel(), null, "model", null, 1, 1, InputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputModel_ModelAlias(), ecorePackage.getEString(), "modelAlias", "IN", 1, 1, InputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputModel_Transformation(), this.getTransformation(), null, "transformation", null, 1, 1, InputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputModel_MetamodelAlias(), ecorePackage.getEString(), "metamodelAlias", null, 0, 1, InputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputModel_Index(), ecorePackage.getEIntegerObject(), "index", null, 0, 1, InputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputModelEClass, OutputModel.class, "OutputModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputModel_ModelAlias(), ecorePackage.getEString(), "modelAlias", "OUT", 1, 1, OutputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputModel_Model(), this.getModel(), null, "model", null, 1, 1, OutputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputModel_Transformation(), this.getModelProducerTransformation(), null, "transformation", null, 1, 1, OutputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputModel_MetamodelAlias(), ecorePackage.getEString(), "metamodelAlias", null, 0, 1, OutputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_ImplementationClass(), ecorePackage.getEString(), "implementationClass", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Libraries(), this.getLibrary(), null, "libraries", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_PreExecutionScript(), this.getScript(), null, "preExecutionScript", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_PostExecutionScript(), this.getScript(), null, "postExecutionScript", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_ModelDependencies(), this.getModel(), null, "modelDependencies", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_FileDependencies(), this.getFile(), null, "fileDependencies", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtcResourceEClass, MTCResource.class, "MTCResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTCResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, MTCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTCResource_URI(), ecorePackage.getEString(), "URI", null, 0, 1, MTCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTCResource_Tags(), this.getTag(), null, "tags", null, 0, -1, MTCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTCResource_Description(), ecorePackage.getEString(), "description", null, 0, 1, MTCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTCResource_ReferencedResources(), this.getReferencedResource(), null, "referencedResources", null, 0, -1, MTCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getMTCResource_ExecutionInformation(), g1, "executionInformation", null, 0, 1, MTCResource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTCResource_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, MTCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mtcResourceEClass, ecorePackage.getEBoolean(), "inWorkspace", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", "Configuration", 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Variables(), this.getVariable(), null, "variables", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Tags(), this.getTag(), null, "tags", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Libraries(), this.getLibrary(), null, "libraries", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Scripts(), this.getScript(), null, "scripts", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Environments(), this.getModelEnvironment(), null, "environments", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelProducerTransformationEClass, ModelProducerTransformation.class, "ModelProducerTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Description(), ecorePackage.getEString(), "description", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_ImplementationClass(), ecorePackage.getEString(), "implementationClass", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEnvironmentEClass, ModelEnvironment.class, "ModelEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelEnvironment_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelEnvironment_ImplementationClass(), ecorePackage.getEString(), "implementationClass", null, 0, 1, ModelEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurableEClass, Configurable.class, "Configurable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurable_Properties(), this.getProperty(), null, "properties", null, 0, -1, Configurable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(configurableEClass, ecorePackage.getEString(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableEClass, this.getProperty(), "setProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelValidationEClass, ModelValidation.class, "ModelValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelValidation_Validation(), this.getValidation(), null, "validation", null, 1, 1, ModelValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelValidation_Models(), this.getModel(), null, "models", null, 0, -1, ModelValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelValidation_StopOnError(), ecorePackage.getEBoolean(), "stopOnError", null, 0, 1, ModelValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputFileEClass, OutputFile.class, "OutputFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputFile_Transformation(), this.getM2TTransformation(), null, "transformation", null, 1, 1, OutputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputFile_File(), this.getFile(), null, "file", null, 1, 1, OutputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputFileEClass, InputFile.class, "InputFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputFile_File(), this.getFile(), null, "file", null, 1, 1, InputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputFile_Transformation(), this.getT2MTransformation(), null, "transformation", null, 1, 1, InputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_Name(), ecorePackage.getEString(), "name", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Expresion(), ecorePackage.getEString(), "expresion", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Choises(), this.getChoise(), this.getChoise_Decision(), "choises", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_ImplementationClass(), ecorePackage.getEString(), "implementationClass", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiseEClass, Choise.class, "Choise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoise_Transformation(), this.getTransformation(), null, "transformation", null, 1, 1, Choise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoise_Decision(), this.getDecision(), this.getDecision_Choises(), "decision", null, 1, 1, Choise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoise_ChoiseValue(), ecorePackage.getEString(), "choiseValue", null, 1, 1, Choise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionInputModelEClass, DecisionInputModel.class, "DecisionInputModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionInputModel_Decision(), this.getDecision(), null, "decision", null, 1, 1, DecisionInputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionInputModel_Model(), this.getModel(), null, "model", null, 0, 1, DecisionInputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionInputModel_ModelAlias(), ecorePackage.getEString(), "modelAlias", "IN", 0, 1, DecisionInputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionInputModel_MetamodelAlias(), ecorePackage.getEString(), "metamodelAlias", null, 0, 1, DecisionInputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionInputModel_LoadForDecisionEvaluation(), ecorePackage.getEBoolean(), "loadForDecisionEvaluation", null, 0, 1, DecisionInputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionInputModel_Choises(), this.getChoise(), null, "choises", null, 0, -1, DecisionInputModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// org.eclipse.gmf.codegen.gmfgen.GenLink
		createOrgAnnotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";		
		addAnnotation
		  (mtcEClass, 
		   source, 
		   new String[] {
			 "model.extension", "mtc",
			 "diagram.extension", "mtcdiag"
		   });																													
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";			
		addAnnotation
		  (metamodelEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "figure", "polygon",
			 "polygon.x", "0 0 10 10 8 8 10 8 0",
			 "polygon.y", "0 10 10 2 2 0 2 0 0",
			 "border.color", "88,88,88",
			 "tool.small.path", "icons/metamodel.png",
			 "size", "83,105"
		   });		
		addAnnotation
		  (referencedResourceEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "figure", "polygon",
			 "polygon.x", "0 0 10 10 8 8 10 8 0",
			 "polygon.y", "0 10 10 2 2 0 2 0 0",
			 "border.color", "88,88,88",
			 "tool.small.path", "icons/refresource.png",
			 "tool.name", "Referenced Resource",
			 "tool.description", "Create a new Referenced Resource",
			 "size", "83,105"
		   });		
		addAnnotation
		  (fileEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "figure", "polygon",
			 "polygon.x", "0 0 10 10 8 8 10 8 0",
			 "polygon.y", "0 10 10 2 2 0 2 0 0",
			 "border.color", "88,88,88",
			 "tool.small.path", "icons/file.png",
			 "tool.name", "File",
			 "tool.description", "Create a new Output File",
			 "size", "83,105"
		   });		
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "figure", "polygon",
			 "polygon.x", "0 0 10 10 8 8 10 8 0",
			 "polygon.y", "0 10 10 2 2 0 2 0 0",
			 "border.color", "88,88,88",
			 "tool.small.path", "icons/model.png",
			 "tool.name", "Model",
			 "tool.description", "Create a new Model",
			 "size", "83,105"
		   });			
		addAnnotation
		  (validationEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "figure", "polygon",
			 "polygon.x", "0 0 10 10 8 8 10 8 0",
			 "polygon.y", "0 10 10 2 2 0 2 0 0",
			 "border.color", "88,88,88",
			 "tool.small.path", "icons/validation.png",
			 "label", "name",
			 "tool.name", "Validation",
			 "tool.description", "Create a new Validation",
			 "size", "83,105"
		   });		
		addAnnotation
		  (hoTransformationEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "tool.small.path", "icons/hot.png",
			 "tool.name", "HOT - High Order Tranformation",
			 "tool.description", "Create a new High Order Transformation",
			 "size", "200,49",
			 "border.color", "0,0,0"
		   });			
		addAnnotation
		  (m2MTransformationEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "tool.small.path", "icons/m2m.png",
			 "tool.name", "M2M - Model To Model",
			 "tool.description", "Create a new Model To Model Transformation (M2M)",
			 "size", "200,49",
			 "border.color", "0,0,0"
		   });		
		addAnnotation
		  (m2TTransformationEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "tool.small.path", "icons/m2t.png",
			 "tool.name", "M2T - Model To Text",
			 "tool.description", "Create a new Model To Text Transformation (M2T)",
			 "size", "200,49",
			 "border.color", "0,0,0"
		   });		
		addAnnotation
		  (mtcTransformationEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "tool.small.path", "icons/mtc.png",
			 "tool.name", "MTC - Model T. Chain",
			 "tool.description", "Create a new Model Transformation Chain",
			 "size", "200,49",
			 "border.color", "0,0,0"
		   });		
		addAnnotation
		  (t2MTransformationEClass, 
		   source, 
		   new String[] {
			 "label.icon", "false",
			 "label", "name",
			 "tool.small.path", "icons/t2m.png",
			 "tool.name", "T2M - Text To Model",
			 "tool.description", "Create a new Text To Model Transformation (T2M)",
			 "size", "200,49",
			 "border.color", "0,0,0"
		   });								
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.path", "icons/variable.png"
		   });		
		addAnnotation
		  (configurationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.path", "icons/configuration.png",
			 "tool.name", "MTC Configuration",
			 "tool.description", "Create a new Configuration"
		   });							
		addAnnotation
		  (libraryEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.path", "icons/library.png"
		   });		
		addAnnotation
		  (tagEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.path", "icons/tag.png"
		   });		
		addAnnotation
		  (scriptEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.path", "icons/script.png"
		   });		
		addAnnotation
		  (modelEnvironmentEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.path", "icons/modelenvironment.png"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";							
		addAnnotation
		  (getModel_Metamodels(), 
		   source, 
		   new String[] {
			 "target.decoration", "filledsquare",
			 "label", "conforms to",
			 "style", "dot",
			 "width", "1",
			 "color", "207,207,207",
			 "tool.small.path", "icons/link.png"
		   });				
		addAnnotation
		  (getHOTransformation_OutputTransformations(), 
		   source, 
		   new String[] {
			 "label", "GEN",
			 "target.decoration", "filledclosedarrow",
			 "tool.name", "Generated Transformations",
			 "width", "3",
			 "color", "77,77,77",
			 "style", "solid",
			 "incoming", "true",
			 "tool.small.path", "icons/link.png"
		   });						
		addAnnotation
		  (inputModelEClass, 
		   source, 
		   new String[] {
			 "source", "model",
			 "target", "transformation",
			 "label", "alias",
			 "width", "2",
			 "color", "77,77,77",
			 "target.decoration", "filledclosedarrow",
			 "incoming", "true",
			 "tool.small.path", "icons/link.png"
		   });		
		addAnnotation
		  (outputModelEClass, 
		   source, 
		   new String[] {
			 "source", "transformation",
			 "target", "model",
			 "label", "alias",
			 "width", "2",
			 "color", "77,77,77",
			 "target.decoration", "filledclosedarrow",
			 "incoming", "true",
			 "tool.small.path", "icons/link.png"
		   });			
		addAnnotation
		  (getTransformation_ModelDependencies(), 
		   source, 
		   new String[] {
			 "target.decoration", "filledsquare",
			 "tool.name", "Depends on model",
			 "style", "solid",
			 "width", "1",
			 "color", "74,118,110",
			 "label", "depends on",
			 "incoming", "true",
			 "tool.small.path", "icons/link.png"
		   });		
		addAnnotation
		  (getTransformation_FileDependencies(), 
		   source, 
		   new String[] {
			 "source.decoration", "filledsquare",
			 "tool.name", "Depends on file",
			 "style", "solid",
			 "width", "1",
			 "color", "74,118,110",
			 "label", "depends on",
			 "incoming", "true",
			 "tool.small.path", "icons/link.png"
		   });		
		addAnnotation
		  (getMTCResource_ReferencedResources(), 
		   source, 
		   new String[] {
			 "target.decoration", "filledclosedarrow",
			 "label", "ref",
			 "style", "dash",
			 "width", "1",
			 "color", "96,139,50",
			 "incoming", "true",
			 "tool.small.path", "icons/link.png"
		   });											
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.gmf.codegen.gmfgen.GenLink</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.gmf.codegen.gmfgen.GenLink";																	
		addAnnotation
		  (getTransformation_ModelDependencies(), 
		   source, 
		   new String[] {
		   });														
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";																							
		addAnnotation
		  (getConfiguration_Variables(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });		
		addAnnotation
		  (getConfiguration_Tags(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });		
		addAnnotation
		  (getConfiguration_Libraries(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });		
		addAnnotation
		  (getConfiguration_Scripts(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });		
		addAnnotation
		  (getConfiguration_Environments(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });				
	}

} //MtcPackageImpl
 