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
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Property;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.parts.HOTransformationPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class HOTransformationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for properties ReferencesTable
	 */
	protected ReferencesTableSettings propertiesSettings;
	
	/**
	 * Settings for tags ReferencesTable
	 */
	private ReferencesTableSettings tagsSettings;
	
	/**
	 * Settings for referencedResources ReferencesTable
	 */
	private ReferencesTableSettings referencedResourcesSettings;
	
	/**
	 * Settings for libraries ReferencesTable
	 */
	private ReferencesTableSettings librariesSettings;
	
	/**
	 * Settings for preExecutionScript EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings preExecutionScriptSettings;
	
	/**
	 * Settings for postExecutionScript EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings postExecutionScriptSettings;
	
	/**
	 * Settings for modelDependencies ReferencesTable
	 */
	private ReferencesTableSettings modelDependenciesSettings;
	
	/**
	 * Settings for fileDependencies ReferencesTable
	 */
	private ReferencesTableSettings fileDependenciesSettings;
	
	/**
	 * Settings for outputTransformations ReferencesTable
	 */
	private ReferencesTableSettings outputTransformationsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HOTransformationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hOTransformation, String editing_mode) {
		super(editingContext, hOTransformation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.HOTransformation.class;
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
			
			final HOTransformation hOTransformation = (HOTransformation)elt;
			final HOTransformationPropertiesEditionPart basePart = (HOTransformationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.properties)) {
				propertiesSettings = new ReferencesTableSettings(hOTransformation, MtcPackage.eINSTANCE.getConfigurable_Properties());
				basePart.initProperties(propertiesSettings);
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Basic.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hOTransformation.getName()));
			
				if (isAccessible(MtcViewsRepository.HOTransformation.Basic.uRI)) {
					basePart.setURI(EEFConverterUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), hOTransformation.getURI()));
				}
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.tags)) {
				tagsSettings = new ReferencesTableSettings(hOTransformation, MtcPackage.eINSTANCE.getMTCResource_Tags());
				basePart.initTags(tagsSettings);
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Basic.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hOTransformation.getDescription()));
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.referencedResources)) {
				referencedResourcesSettings = new ReferencesTableSettings(hOTransformation, MtcPackage.eINSTANCE.getMTCResource_ReferencedResources());
				basePart.initReferencedResources(referencedResourcesSettings);
			}
				if (isAccessible(MtcViewsRepository.HOTransformation.Basic.technology)) {
					basePart.setTechnology(EEFConverterUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), hOTransformation.getTechnology()));
				}
			
				if (isAccessible(MtcViewsRepository.HOTransformation.Basic.implementationClass)) {
					basePart.setImplementationClass(EEFConverterUtil.convertToString(MtcPackage.eINSTANCE.getTransformation_ImplementationClass().getEAttributeType(), hOTransformation.getImplementationClass()));
				}
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Libraries.libraries_)) {
				librariesSettings = new ReferencesTableSettings(hOTransformation, MtcPackage.eINSTANCE.getTransformation_Libraries());
				basePart.initLibraries(librariesSettings);
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Basic.preExecutionScript)) {
				// init part
				preExecutionScriptSettings = new EObjectFlatComboSettings(hOTransformation, MtcPackage.eINSTANCE.getTransformation_PreExecutionScript());
				basePart.initPreExecutionScript(preExecutionScriptSettings);
				// set the button mode
				basePart.setPreExecutionScriptButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Basic.postExecutionScript)) {
				// init part
				postExecutionScriptSettings = new EObjectFlatComboSettings(hOTransformation, MtcPackage.eINSTANCE.getTransformation_PostExecutionScript());
				basePart.initPostExecutionScript(postExecutionScriptSettings);
				// set the button mode
				basePart.setPostExecutionScriptButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Dependencies.modelDependencies)) {
				modelDependenciesSettings = new ReferencesTableSettings(hOTransformation, MtcPackage.eINSTANCE.getTransformation_ModelDependencies());
				basePart.initModelDependencies(modelDependenciesSettings);
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Dependencies.fileDependencies)) {
				fileDependenciesSettings = new ReferencesTableSettings(hOTransformation, MtcPackage.eINSTANCE.getTransformation_FileDependencies());
				basePart.initFileDependencies(fileDependenciesSettings);
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Basic.target))
				basePart.setTarget(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hOTransformation.getTarget()));
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.outputTransformations)) {
				outputTransformationsSettings = new ReferencesTableSettings(hOTransformation, MtcPackage.eINSTANCE.getHOTransformation_OutputTransformations());
				basePart.initOutputTransformations(outputTransformationsSettings);
			}
			// init filters
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.properties)) {
				basePart.addFilterToProperties(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Property); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for properties
				// End of user code
			}
			
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.tags)) {
				basePart.addFilterToTags(new EObjectFilter(MtcPackage.Literals.TAG));
				// Start of user code for additional businessfilters for tags
				// End of user code
			}
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.referencedResources)) {
				basePart.addFilterToReferencedResources(new EObjectFilter(MtcPackage.Literals.REFERENCED_RESOURCE));
				// Start of user code for additional businessfilters for referencedResources
				// End of user code
			}
			
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Libraries.libraries_)) {
				basePart.addFilterToLibraries(new EObjectFilter(MtcPackage.Literals.LIBRARY));
				// Start of user code for additional businessfilters for libraries
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Basic.preExecutionScript)) {
				basePart.addFilterToPreExecutionScript(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Script); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for preExecutionScript
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Basic.postExecutionScript)) {
				basePart.addFilterToPostExecutionScript(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Script); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for postExecutionScript
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Dependencies.modelDependencies)) {
				basePart.addFilterToModelDependencies(new EObjectFilter(MtcPackage.Literals.MODEL));
				// Start of user code for additional businessfilters for modelDependencies
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.HOTransformation.Dependencies.fileDependencies)) {
				basePart.addFilterToFileDependencies(new EObjectFilter(MtcPackage.Literals.FILE));
				// Start of user code for additional businessfilters for fileDependencies
				// End of user code
			}
			
			if (isAccessible(MtcViewsRepository.HOTransformation.Advanced.outputTransformations)) {
				basePart.addFilterToOutputTransformations(new EObjectFilter(MtcPackage.Literals.TRANSFORMATION));
				// Start of user code for additional businessfilters for outputTransformations
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
		if (editorKey == MtcViewsRepository.HOTransformation.Advanced.properties) {
			return MtcPackage.eINSTANCE.getConfigurable_Properties();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.name) {
			return MtcPackage.eINSTANCE.getMTCResource_Name();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.uRI) {
			return MtcPackage.eINSTANCE.getMTCResource_URI();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Advanced.tags) {
			return MtcPackage.eINSTANCE.getMTCResource_Tags();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.description) {
			return MtcPackage.eINSTANCE.getMTCResource_Description();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Advanced.referencedResources) {
			return MtcPackage.eINSTANCE.getMTCResource_ReferencedResources();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.technology) {
			return MtcPackage.eINSTANCE.getMTCResource_Technology();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.implementationClass) {
			return MtcPackage.eINSTANCE.getTransformation_ImplementationClass();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Libraries.libraries_) {
			return MtcPackage.eINSTANCE.getTransformation_Libraries();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.preExecutionScript) {
			return MtcPackage.eINSTANCE.getTransformation_PreExecutionScript();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.postExecutionScript) {
			return MtcPackage.eINSTANCE.getTransformation_PostExecutionScript();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Dependencies.modelDependencies) {
			return MtcPackage.eINSTANCE.getTransformation_ModelDependencies();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Dependencies.fileDependencies) {
			return MtcPackage.eINSTANCE.getTransformation_FileDependencies();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Basic.target) {
			return MtcPackage.eINSTANCE.getM2TTransformation_Target();
		}
		if (editorKey == MtcViewsRepository.HOTransformation.Advanced.outputTransformations) {
			return MtcPackage.eINSTANCE.getHOTransformation_OutputTransformations();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HOTransformation hOTransformation = (HOTransformation)semanticObject;
		if (MtcViewsRepository.HOTransformation.Advanced.properties == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, propertiesSettings, editingContext.getAdapterFactory());
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
				propertiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				propertiesSettings.move(event.getNewIndex(), (Property) event.getNewValue());
			}
		}
		if (MtcViewsRepository.HOTransformation.Basic.name == event.getAffectedEditor()) {
			hOTransformation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.HOTransformation.Basic.uRI == event.getAffectedEditor()) {
			hOTransformation.setURI((String)event.getNewValue());
		}
		if (MtcViewsRepository.HOTransformation.Advanced.tags == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Tag) {
					tagsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				tagsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				tagsSettings.move(event.getNewIndex(), (Tag) event.getNewValue());
			}
		}
		if (MtcViewsRepository.HOTransformation.Basic.description == event.getAffectedEditor()) {
			hOTransformation.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.HOTransformation.Advanced.referencedResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ReferencedResource) {
					referencedResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				referencedResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				referencedResourcesSettings.move(event.getNewIndex(), (ReferencedResource) event.getNewValue());
			}
		}
		if (MtcViewsRepository.HOTransformation.Basic.technology == event.getAffectedEditor()) {
			hOTransformation.setTechnology((String)event.getNewValue());
		}
		if (MtcViewsRepository.HOTransformation.Basic.implementationClass == event.getAffectedEditor()) {
			hOTransformation.setImplementationClass((String)event.getNewValue());
		}
		if (MtcViewsRepository.HOTransformation.Libraries.libraries_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Library) {
					librariesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				librariesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				librariesSettings.move(event.getNewIndex(), (Library) event.getNewValue());
			}
		}
		if (MtcViewsRepository.HOTransformation.Basic.preExecutionScript == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				preExecutionScriptSettings.setToReference((Script)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Script eObject = MtcFactory.eINSTANCE.createScript();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				preExecutionScriptSettings.setToReference(eObject);
			}
		}
		if (MtcViewsRepository.HOTransformation.Basic.postExecutionScript == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				postExecutionScriptSettings.setToReference((Script)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Script eObject = MtcFactory.eINSTANCE.createScript();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				postExecutionScriptSettings.setToReference(eObject);
			}
		}
		if (MtcViewsRepository.HOTransformation.Dependencies.modelDependencies == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Model) {
					modelDependenciesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				modelDependenciesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				modelDependenciesSettings.move(event.getNewIndex(), (Model) event.getNewValue());
			}
		}
		if (MtcViewsRepository.HOTransformation.Dependencies.fileDependencies == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof File) {
					fileDependenciesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				fileDependenciesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				fileDependenciesSettings.move(event.getNewIndex(), (File) event.getNewValue());
			}
		}
		if (MtcViewsRepository.HOTransformation.Basic.target == event.getAffectedEditor()) {
			hOTransformation.setTarget((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.HOTransformation.Advanced.outputTransformations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transformation) {
					outputTransformationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outputTransformationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outputTransformationsSettings.move(event.getNewIndex(), (Transformation) event.getNewValue());
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
			HOTransformationPropertiesEditionPart basePart = (HOTransformationPropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getConfigurable_Properties().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.HOTransformation.Advanced.properties))
				basePart.updateProperties();
			if (MtcPackage.eINSTANCE.getMTCResource_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTCResource_URI().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.uRI)) {
				if (msg.getNewValue() != null) {
					basePart.setURI(EcoreUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setURI("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTCResource_Tags().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.HOTransformation.Advanced.tags))
				basePart.updateTags();
			if (MtcPackage.eINSTANCE.getMTCResource_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTCResource_ReferencedResources().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.HOTransformation.Advanced.referencedResources))
				basePart.updateReferencedResources();
			if (MtcPackage.eINSTANCE.getMTCResource_Technology().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.technology)) {
				if (msg.getNewValue() != null) {
					basePart.setTechnology(EcoreUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setTechnology("");
				}
			}
			if (MtcPackage.eINSTANCE.getTransformation_ImplementationClass().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.implementationClass)) {
				if (msg.getNewValue() != null) {
					basePart.setImplementationClass(EcoreUtil.convertToString(MtcPackage.eINSTANCE.getTransformation_ImplementationClass().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setImplementationClass("");
				}
			}
			if (MtcPackage.eINSTANCE.getTransformation_Libraries().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.HOTransformation.Libraries.libraries_))
				basePart.updateLibraries();
			if (MtcPackage.eINSTANCE.getTransformation_PreExecutionScript().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.preExecutionScript))
				basePart.setPreExecutionScript((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getTransformation_PostExecutionScript().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.postExecutionScript))
				basePart.setPostExecutionScript((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getTransformation_ModelDependencies().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.HOTransformation.Dependencies.modelDependencies))
				basePart.updateModelDependencies();
			if (MtcPackage.eINSTANCE.getTransformation_FileDependencies().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.HOTransformation.Dependencies.fileDependencies))
				basePart.updateFileDependencies();
			if (MtcPackage.eINSTANCE.getM2TTransformation_Target().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.HOTransformation.Basic.target)) {
				if (msg.getNewValue() != null) {
					basePart.setTarget(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTarget("");
				}
			}
			if (MtcPackage.eINSTANCE.getHOTransformation_OutputTransformations().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.HOTransformation.Advanced.outputTransformations))
				basePart.updateOutputTransformations();
			
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
			MtcPackage.eINSTANCE.getConfigurable_Properties(),
			MtcPackage.eINSTANCE.getMTCResource_Name(),
			MtcPackage.eINSTANCE.getMTCResource_URI(),
			MtcPackage.eINSTANCE.getMTCResource_Tags(),
			MtcPackage.eINSTANCE.getMTCResource_Description(),
			MtcPackage.eINSTANCE.getMTCResource_ReferencedResources(),
			MtcPackage.eINSTANCE.getMTCResource_Technology(),
			MtcPackage.eINSTANCE.getTransformation_ImplementationClass(),
			MtcPackage.eINSTANCE.getTransformation_Libraries(),
			MtcPackage.eINSTANCE.getTransformation_PreExecutionScript(),
			MtcPackage.eINSTANCE.getTransformation_PostExecutionScript(),
			MtcPackage.eINSTANCE.getTransformation_ModelDependencies(),
			MtcPackage.eINSTANCE.getTransformation_FileDependencies(),
			MtcPackage.eINSTANCE.getM2TTransformation_Target(),
			MtcPackage.eINSTANCE.getHOTransformation_OutputTransformations()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.HOTransformation.Basic.name;
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
				if (MtcViewsRepository.HOTransformation.Basic.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_Name().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.HOTransformation.Basic.uRI == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.HOTransformation.Basic.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_Description().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.HOTransformation.Basic.technology == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.HOTransformation.Basic.implementationClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getTransformation_ImplementationClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getTransformation_ImplementationClass().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.HOTransformation.Basic.target == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getM2TTransformation_Target().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getM2TTransformation_Target().getEAttributeType(), newValue);
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
