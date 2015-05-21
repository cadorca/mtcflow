/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.DecisionInputModel;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;
import com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MTCPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for files ReferencesTable
	 */
	protected ReferencesTableSettings filesSettings;
	
	/**
	 * Settings for metamodels ReferencesTable
	 */
	protected ReferencesTableSettings metamodelsSettings;
	
	/**
	 * Settings for models ReferencesTable
	 */
	protected ReferencesTableSettings modelsSettings;
	
	/**
	 * Settings for inputModels ReferencesTable
	 */
	protected ReferencesTableSettings inputModelsSettings;
	
	/**
	 * Settings for transformations ReferencesTable
	 */
	protected ReferencesTableSettings transformationsSettings;
	
	/**
	 * Settings for outputModels ReferencesTable
	 */
	protected ReferencesTableSettings outputModelsSettings;
	
	/**
	 * Settings for validations ReferencesTable
	 */
	protected ReferencesTableSettings validationsSettings;
	
	/**
	 * Settings for referencedResources ReferencesTable
	 */
	protected ReferencesTableSettings referencedResourcesSettings;
	
	/**
	 * Settings for modelValidations ReferencesTable
	 */
	protected ReferencesTableSettings modelValidationsSettings;
	
	/**
	 * Settings for inputFiles ReferencesTable
	 */
	protected ReferencesTableSettings inputFilesSettings;
	
	/**
	 * Settings for outputFiles ReferencesTable
	 */
	protected ReferencesTableSettings outputFilesSettings;
	
	/**
	 * Settings for decisions ReferencesTable
	 */
	protected ReferencesTableSettings decisionsSettings;
	
	/**
	 * Settings for decisionInputModels ReferencesTable
	 */
	protected ReferencesTableSettings decisionInputModelsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MTCPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject mTC, String editing_mode) {
		super(editingContext, mTC, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.MTC_.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final MTC mTC = (MTC)elt;
			final MTCPropertiesEditionPart basePart = (MTCPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.MTC_.Basic.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getName()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.files)) {
				filesSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_Files());
				basePart.initFiles(filesSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.metamodels)) {
				metamodelsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_Metamodels());
				basePart.initMetamodels(metamodelsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.models)) {
				modelsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_Models());
				basePart.initModels(modelsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.inputModels)) {
				inputModelsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_InputModels());
				basePart.initInputModels(inputModelsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.transformations)) {
				transformationsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_Transformations());
				basePart.initTransformations(transformationsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.outputModels)) {
				outputModelsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_OutputModels());
				basePart.initOutputModels(outputModelsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Basic.m2MTechnology))
				basePart.setM2MTechnology(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getM2MTechnology()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Basic.m2TTechnology))
				basePart.setM2TTechnology(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getM2TTechnology()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Basic.hOTechnology))
				basePart.setHOTechnology(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getHOTechnology()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder))
				basePart.setM2MTransformationsFolder(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getM2MTransformationsFolder()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder))
				basePart.setM2TTransformationsFolder(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getM2TTransformationsFolder()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Locations.hOTransformationsFolder))
				basePart.setHOTransformationsFolder(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getHOTransformationsFolder()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Locations.metamodelsFolder))
				basePart.setMetamodelsFolder(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getMetamodelsFolder()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Locations.modelsFolder))
				basePart.setModelsFolder(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getModelsFolder()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.validations)) {
				validationsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_Validations());
				basePart.initValidations(validationsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Locations.validationsFolder))
				basePart.setValidationsFolder(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getValidationsFolder()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Basic.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getVersion()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Locations.librariesFolder))
				basePart.setLibrariesFolder(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getLibrariesFolder()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Basic.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getDescription()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.referencedResources)) {
				referencedResourcesSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_ReferencedResources());
				basePart.initReferencedResources(referencedResourcesSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Basic.validateConformance)) {
				basePart.setValidateConformance(mTC.isValidateConformance());
			}
			if (isAccessible(MtcViewsRepository.MTC_.Locations.workspace))
				basePart.setWorkspace(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mTC.getWorkspace()));
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.modelValidations)) {
				modelValidationsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_ModelValidations());
				basePart.initModelValidations(modelValidationsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.inputFiles)) {
				inputFilesSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_InputFiles());
				basePart.initInputFiles(inputFilesSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.outputFiles)) {
				outputFilesSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_OutputFiles());
				basePart.initOutputFiles(outputFilesSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.decisions)) {
				decisionsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_Decisions());
				basePart.initDecisions(decisionsSettings);
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.decisionInputModels)) {
				decisionInputModelsSettings = new ReferencesTableSettings(mTC, MtcPackage.eINSTANCE.getMTC_DecisionInputModels());
				basePart.initDecisionInputModels(decisionInputModelsSettings);
			}
			// init filters
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.files)) {
				basePart.addFilterToFiles(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof File); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for files
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.metamodels)) {
				basePart.addFilterToMetamodels(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Metamodel); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for metamodels
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.models)) {
				basePart.addFilterToModels(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Model); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for models
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.inputModels)) {
				basePart.addFilterToInputModels(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof InputModel); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for inputModels
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.transformations)) {
				basePart.addFilterToTransformations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Transformation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for transformations
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.outputModels)) {
				basePart.addFilterToOutputModels(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof OutputModel); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for outputModels
				// End of user code
			}
			
			
			
			
			
			
			
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.validations)) {
				basePart.addFilterToValidations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Validation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for validations
				// End of user code
			}
			
			
			
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.referencedResources)) {
				basePart.addFilterToReferencedResources(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ReferencedResource); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for referencedResources
				// End of user code
			}
			
			
			if (isAccessible(MtcViewsRepository.MTC_.Elements.modelValidations)) {
				basePart.addFilterToModelValidations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ModelValidation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for modelValidations
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.inputFiles)) {
				basePart.addFilterToInputFiles(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof InputFile); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for inputFiles
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.outputFiles)) {
				basePart.addFilterToOutputFiles(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof OutputFile); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for outputFiles
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.decisions)) {
				basePart.addFilterToDecisions(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Decision); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for decisions
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.MTC_.Elements.decisionInputModels)) {
				basePart.addFilterToDecisionInputModels(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DecisionInputModel); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for decisionInputModels
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}































	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == MtcViewsRepository.MTC_.Basic.name) {
			return MtcPackage.eINSTANCE.getMTC_Name();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.files) {
			return MtcPackage.eINSTANCE.getMTC_Files();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.metamodels) {
			return MtcPackage.eINSTANCE.getMTC_Metamodels();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.models) {
			return MtcPackage.eINSTANCE.getMTC_Models();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.inputModels) {
			return MtcPackage.eINSTANCE.getMTC_InputModels();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.transformations) {
			return MtcPackage.eINSTANCE.getMTC_Transformations();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.outputModels) {
			return MtcPackage.eINSTANCE.getMTC_OutputModels();
		}
		if (editorKey == MtcViewsRepository.MTC_.Basic.m2MTechnology) {
			return MtcPackage.eINSTANCE.getMTC_M2MTechnology();
		}
		if (editorKey == MtcViewsRepository.MTC_.Basic.m2TTechnology) {
			return MtcPackage.eINSTANCE.getMTC_M2TTechnology();
		}
		if (editorKey == MtcViewsRepository.MTC_.Basic.hOTechnology) {
			return MtcPackage.eINSTANCE.getMTC_HOTechnology();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder) {
			return MtcPackage.eINSTANCE.getMTC_M2MTransformationsFolder();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder) {
			return MtcPackage.eINSTANCE.getMTC_M2TTransformationsFolder();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.hOTransformationsFolder) {
			return MtcPackage.eINSTANCE.getMTC_HOTransformationsFolder();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.metamodelsFolder) {
			return MtcPackage.eINSTANCE.getMTC_MetamodelsFolder();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.modelsFolder) {
			return MtcPackage.eINSTANCE.getMTC_ModelsFolder();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.validations) {
			return MtcPackage.eINSTANCE.getMTC_Validations();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.validationsFolder) {
			return MtcPackage.eINSTANCE.getMTC_ValidationsFolder();
		}
		if (editorKey == MtcViewsRepository.MTC_.Basic.version) {
			return MtcPackage.eINSTANCE.getMTC_Version();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.librariesFolder) {
			return MtcPackage.eINSTANCE.getMTC_LibrariesFolder();
		}
		if (editorKey == MtcViewsRepository.MTC_.Basic.description) {
			return MtcPackage.eINSTANCE.getMTC_Description();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.referencedResources) {
			return MtcPackage.eINSTANCE.getMTC_ReferencedResources();
		}
		if (editorKey == MtcViewsRepository.MTC_.Basic.validateConformance) {
			return MtcPackage.eINSTANCE.getMTC_ValidateConformance();
		}
		if (editorKey == MtcViewsRepository.MTC_.Locations.workspace) {
			return MtcPackage.eINSTANCE.getMTC_Workspace();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.modelValidations) {
			return MtcPackage.eINSTANCE.getMTC_ModelValidations();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.inputFiles) {
			return MtcPackage.eINSTANCE.getMTC_InputFiles();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.outputFiles) {
			return MtcPackage.eINSTANCE.getMTC_OutputFiles();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.decisions) {
			return MtcPackage.eINSTANCE.getMTC_Decisions();
		}
		if (editorKey == MtcViewsRepository.MTC_.Elements.decisionInputModels) {
			return MtcPackage.eINSTANCE.getMTC_DecisionInputModels();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MTC mTC = (MTC)semanticObject;
		if (MtcViewsRepository.MTC_.Basic.name == event.getAffectedEditor()) {
			mTC.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Elements.files == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, filesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				filesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				filesSettings.move(event.getNewIndex(), (File) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.metamodels == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, metamodelsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				metamodelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				metamodelsSettings.move(event.getNewIndex(), (Metamodel) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.models == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, modelsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				modelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				modelsSettings.move(event.getNewIndex(), (Model) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.inputModels == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, inputModelsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inputModelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inputModelsSettings.move(event.getNewIndex(), (InputModel) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.transformations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, transformationsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				transformationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				transformationsSettings.move(event.getNewIndex(), (Transformation) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.outputModels == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, outputModelsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outputModelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outputModelsSettings.move(event.getNewIndex(), (OutputModel) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Basic.m2MTechnology == event.getAffectedEditor()) {
			mTC.setM2MTechnology((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Basic.m2TTechnology == event.getAffectedEditor()) {
			mTC.setM2TTechnology((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Basic.hOTechnology == event.getAffectedEditor()) {
			mTC.setHOTechnology((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder == event.getAffectedEditor()) {
			mTC.setM2MTransformationsFolder((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder == event.getAffectedEditor()) {
			mTC.setM2TTransformationsFolder((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Locations.hOTransformationsFolder == event.getAffectedEditor()) {
			mTC.setHOTransformationsFolder((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Locations.metamodelsFolder == event.getAffectedEditor()) {
			mTC.setMetamodelsFolder((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Locations.modelsFolder == event.getAffectedEditor()) {
			mTC.setModelsFolder((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Elements.validations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, validationsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				validationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				validationsSettings.move(event.getNewIndex(), (Validation) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Locations.validationsFolder == event.getAffectedEditor()) {
			mTC.setValidationsFolder((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Basic.version == event.getAffectedEditor()) {
			mTC.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Locations.librariesFolder == event.getAffectedEditor()) {
			mTC.setLibrariesFolder((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Basic.description == event.getAffectedEditor()) {
			mTC.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Elements.referencedResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, referencedResourcesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				referencedResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				referencedResourcesSettings.move(event.getNewIndex(), (ReferencedResource) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Basic.validateConformance == event.getAffectedEditor()) {
			mTC.setValidateConformance((Boolean)event.getNewValue());
		}
		if (MtcViewsRepository.MTC_.Locations.workspace == event.getAffectedEditor()) {
			mTC.setWorkspace((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.MTC_.Elements.modelValidations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, modelValidationsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				modelValidationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				modelValidationsSettings.move(event.getNewIndex(), (ModelValidation) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.inputFiles == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, inputFilesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inputFilesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inputFilesSettings.move(event.getNewIndex(), (InputFile) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.outputFiles == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, outputFilesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outputFilesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outputFilesSettings.move(event.getNewIndex(), (OutputFile) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.decisions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, decisionsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				decisionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				decisionsSettings.move(event.getNewIndex(), (Decision) event.getNewValue());
			}
		}
		if (MtcViewsRepository.MTC_.Elements.decisionInputModels == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, decisionInputModelsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				decisionInputModelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				decisionInputModelsSettings.move(event.getNewIndex(), (DecisionInputModel) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			MTCPropertiesEditionPart basePart = (MTCPropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getMTC_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Basic.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_Files().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.files))
				basePart.updateFiles();
			if (MtcPackage.eINSTANCE.getMTC_Metamodels().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.metamodels))
				basePart.updateMetamodels();
			if (MtcPackage.eINSTANCE.getMTC_Models().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.models))
				basePart.updateModels();
			if (MtcPackage.eINSTANCE.getMTC_InputModels().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.inputModels))
				basePart.updateInputModels();
			if (MtcPackage.eINSTANCE.getMTC_Transformations().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.transformations))
				basePart.updateTransformations();
			if (MtcPackage.eINSTANCE.getMTC_OutputModels().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.outputModels))
				basePart.updateOutputModels();
			if (MtcPackage.eINSTANCE.getMTC_M2MTechnology().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Basic.m2MTechnology)) {
				if (msg.getNewValue() != null) {
					basePart.setM2MTechnology(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setM2MTechnology("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_M2TTechnology().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Basic.m2TTechnology)) {
				if (msg.getNewValue() != null) {
					basePart.setM2TTechnology(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setM2TTechnology("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_HOTechnology().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Basic.hOTechnology)) {
				if (msg.getNewValue() != null) {
					basePart.setHOTechnology(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setHOTechnology("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_M2MTransformationsFolder().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder)) {
				if (msg.getNewValue() != null) {
					basePart.setM2MTransformationsFolder(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setM2MTransformationsFolder("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_M2TTransformationsFolder().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder)) {
				if (msg.getNewValue() != null) {
					basePart.setM2TTransformationsFolder(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setM2TTransformationsFolder("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_HOTransformationsFolder().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.hOTransformationsFolder)) {
				if (msg.getNewValue() != null) {
					basePart.setHOTransformationsFolder(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setHOTransformationsFolder("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_MetamodelsFolder().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.metamodelsFolder)) {
				if (msg.getNewValue() != null) {
					basePart.setMetamodelsFolder(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMetamodelsFolder("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_ModelsFolder().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.modelsFolder)) {
				if (msg.getNewValue() != null) {
					basePart.setModelsFolder(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setModelsFolder("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_Validations().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.validations))
				basePart.updateValidations();
			if (MtcPackage.eINSTANCE.getMTC_ValidationsFolder().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.validationsFolder)) {
				if (msg.getNewValue() != null) {
					basePart.setValidationsFolder(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setValidationsFolder("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Basic.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_LibrariesFolder().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.librariesFolder)) {
				if (msg.getNewValue() != null) {
					basePart.setLibrariesFolder(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setLibrariesFolder("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Basic.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_ReferencedResources().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.referencedResources))
				basePart.updateReferencedResources();
			if (MtcPackage.eINSTANCE.getMTC_ValidateConformance().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Basic.validateConformance))
				basePart.setValidateConformance((Boolean)msg.getNewValue());
			
			if (MtcPackage.eINSTANCE.getMTC_Workspace().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.MTC_.Locations.workspace)) {
				if (msg.getNewValue() != null) {
					basePart.setWorkspace(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setWorkspace("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTC_ModelValidations().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.modelValidations))
				basePart.updateModelValidations();
			if (MtcPackage.eINSTANCE.getMTC_InputFiles().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.inputFiles))
				basePart.updateInputFiles();
			if (MtcPackage.eINSTANCE.getMTC_OutputFiles().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.outputFiles))
				basePart.updateOutputFiles();
			if (MtcPackage.eINSTANCE.getMTC_Decisions().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.decisions))
				basePart.updateDecisions();
			if (MtcPackage.eINSTANCE.getMTC_DecisionInputModels().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.MTC_.Elements.decisionInputModels))
				basePart.updateDecisionInputModels();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			MtcPackage.eINSTANCE.getMTC_Name(),
			MtcPackage.eINSTANCE.getMTC_Files(),
			MtcPackage.eINSTANCE.getMTC_Metamodels(),
			MtcPackage.eINSTANCE.getMTC_Models(),
			MtcPackage.eINSTANCE.getMTC_InputModels(),
			MtcPackage.eINSTANCE.getMTC_Transformations(),
			MtcPackage.eINSTANCE.getMTC_OutputModels(),
			MtcPackage.eINSTANCE.getMTC_M2MTechnology(),
			MtcPackage.eINSTANCE.getMTC_M2TTechnology(),
			MtcPackage.eINSTANCE.getMTC_HOTechnology(),
			MtcPackage.eINSTANCE.getMTC_M2MTransformationsFolder(),
			MtcPackage.eINSTANCE.getMTC_M2TTransformationsFolder(),
			MtcPackage.eINSTANCE.getMTC_HOTransformationsFolder(),
			MtcPackage.eINSTANCE.getMTC_MetamodelsFolder(),
			MtcPackage.eINSTANCE.getMTC_ModelsFolder(),
			MtcPackage.eINSTANCE.getMTC_Validations(),
			MtcPackage.eINSTANCE.getMTC_ValidationsFolder(),
			MtcPackage.eINSTANCE.getMTC_Version(),
			MtcPackage.eINSTANCE.getMTC_LibrariesFolder(),
			MtcPackage.eINSTANCE.getMTC_Description(),
			MtcPackage.eINSTANCE.getMTC_ReferencedResources(),
			MtcPackage.eINSTANCE.getMTC_ValidateConformance(),
			MtcPackage.eINSTANCE.getMTC_Workspace(),
			MtcPackage.eINSTANCE.getMTC_ModelValidations(),
			MtcPackage.eINSTANCE.getMTC_InputFiles(),
			MtcPackage.eINSTANCE.getMTC_OutputFiles(),
			MtcPackage.eINSTANCE.getMTC_Decisions(),
			MtcPackage.eINSTANCE.getMTC_DecisionInputModels()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.MTC_.Basic.name || key == MtcViewsRepository.MTC_.Basic.m2MTechnology || key == MtcViewsRepository.MTC_.Basic.m2TTechnology || key == MtcViewsRepository.MTC_.Basic.hOTechnology || key == MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder || key == MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder || key == MtcViewsRepository.MTC_.Locations.hOTransformationsFolder || key == MtcViewsRepository.MTC_.Locations.metamodelsFolder || key == MtcViewsRepository.MTC_.Locations.modelsFolder || key == MtcViewsRepository.MTC_.Locations.validationsFolder || key == MtcViewsRepository.MTC_.Basic.version || key == MtcViewsRepository.MTC_.Locations.librariesFolder || key == MtcViewsRepository.MTC_.Basic.validateConformance || key == MtcViewsRepository.MTC_.Locations.workspace;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (MtcViewsRepository.MTC_.Basic.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_Name().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Basic.m2MTechnology == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_M2MTechnology().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_M2MTechnology().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Basic.m2TTechnology == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_M2TTechnology().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_M2TTechnology().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Basic.hOTechnology == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_HOTechnology().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_HOTechnology().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_M2MTransformationsFolder().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_M2MTransformationsFolder().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_M2TTransformationsFolder().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_M2TTransformationsFolder().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.hOTransformationsFolder == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_HOTransformationsFolder().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_HOTransformationsFolder().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.metamodelsFolder == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_MetamodelsFolder().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_MetamodelsFolder().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.modelsFolder == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_ModelsFolder().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_ModelsFolder().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.validationsFolder == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_ValidationsFolder().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_ValidationsFolder().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Basic.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_Version().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.librariesFolder == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_LibrariesFolder().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_LibrariesFolder().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Basic.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_Description().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Basic.validateConformance == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_ValidateConformance().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_ValidateConformance().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.MTC_.Locations.workspace == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTC_Workspace().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTC_Workspace().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
