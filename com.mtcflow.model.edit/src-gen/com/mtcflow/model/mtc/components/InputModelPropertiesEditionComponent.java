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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Property;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.parts.InputModelPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class InputModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for properties ReferencesTable
	 */
	protected ReferencesTableSettings propertiesSettings;
	
	/**
	 * Settings for model EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings modelSettings;
	
	/**
	 * Settings for transformation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings transformationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InputModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject inputModel, String editing_mode) {
		super(editingContext, inputModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.InputModel.class;
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
			
			final InputModel inputModel = (InputModel)elt;
			final InputModelPropertiesEditionPart basePart = (InputModelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.InputModel.Basic.properties)) {
				propertiesSettings = new ReferencesTableSettings(inputModel, MtcPackage.eINSTANCE.getConfigurable_Properties());
				basePart.initProperties(propertiesSettings);
			}
			if (isAccessible(MtcViewsRepository.InputModel.Basic.model)) {
				// init part
				modelSettings = new EObjectFlatComboSettings(inputModel, MtcPackage.eINSTANCE.getInputModel_Model());
				basePart.initModel(modelSettings);
				// set the button mode
				basePart.setModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.InputModel.Basic.modelAlias))
				basePart.setModelAlias(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, inputModel.getModelAlias()));
			
			if (isAccessible(MtcViewsRepository.InputModel.Basic.transformation)) {
				// init part
				transformationSettings = new EObjectFlatComboSettings(inputModel, MtcPackage.eINSTANCE.getInputModel_Transformation());
				basePart.initTransformation(transformationSettings);
				// set the button mode
				basePart.setTransformationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.InputModel.Basic.metamodelAlias))
				basePart.setMetamodelAlias(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, inputModel.getMetamodelAlias()));
			
			if (isAccessible(MtcViewsRepository.InputModel.Basic.index))
				basePart.setIndex(EEFConverterUtil.convertToString(EcorePackage.Literals.EINTEGER_OBJECT, inputModel.getIndex()));
			
			// init filters
			if (isAccessible(MtcViewsRepository.InputModel.Basic.properties)) {
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
			if (isAccessible(MtcViewsRepository.InputModel.Basic.model)) {
				basePart.addFilterToModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Model);
					}
					
				});
				// Start of user code for additional businessfilters for model
				// End of user code
			}
			
			if (isAccessible(MtcViewsRepository.InputModel.Basic.transformation)) {
				basePart.addFilterToTransformation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Transformation);
					}
					
				});
				// Start of user code for additional businessfilters for transformation
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
		if (editorKey == MtcViewsRepository.InputModel.Basic.properties) {
			return MtcPackage.eINSTANCE.getConfigurable_Properties();
		}
		if (editorKey == MtcViewsRepository.InputModel.Basic.model) {
			return MtcPackage.eINSTANCE.getInputModel_Model();
		}
		if (editorKey == MtcViewsRepository.InputModel.Basic.modelAlias) {
			return MtcPackage.eINSTANCE.getInputModel_ModelAlias();
		}
		if (editorKey == MtcViewsRepository.InputModel.Basic.transformation) {
			return MtcPackage.eINSTANCE.getInputModel_Transformation();
		}
		if (editorKey == MtcViewsRepository.InputModel.Basic.metamodelAlias) {
			return MtcPackage.eINSTANCE.getInputModel_MetamodelAlias();
		}
		if (editorKey == MtcViewsRepository.InputModel.Basic.index) {
			return MtcPackage.eINSTANCE.getInputModel_Index();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InputModel inputModel = (InputModel)semanticObject;
		if (MtcViewsRepository.InputModel.Basic.properties == event.getAffectedEditor()) {
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
		if (MtcViewsRepository.InputModel.Basic.model == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				modelSettings.setToReference((Model)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Model eObject = MtcFactory.eINSTANCE.createModel();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				modelSettings.setToReference(eObject);
			}
		}
		if (MtcViewsRepository.InputModel.Basic.modelAlias == event.getAffectedEditor()) {
			inputModel.setModelAlias((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.InputModel.Basic.transformation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				transformationSettings.setToReference((Transformation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, transformationSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (MtcViewsRepository.InputModel.Basic.metamodelAlias == event.getAffectedEditor()) {
			inputModel.setMetamodelAlias((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.InputModel.Basic.index == event.getAffectedEditor()) {
			inputModel.setIndex((java.lang.Integer)EEFConverterUtil.createFromString(EcorePackage.Literals.EINTEGER_OBJECT, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			InputModelPropertiesEditionPart basePart = (InputModelPropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getConfigurable_Properties().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.InputModel.Basic.properties))
				basePart.updateProperties();
			if (MtcPackage.eINSTANCE.getInputModel_Model().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.InputModel.Basic.model))
				basePart.setModel((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getInputModel_ModelAlias().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.InputModel.Basic.modelAlias)) {
				if (msg.getNewValue() != null) {
					basePart.setModelAlias(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setModelAlias("");
				}
			}
			if (MtcPackage.eINSTANCE.getInputModel_Transformation().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.InputModel.Basic.transformation))
				basePart.setTransformation((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getInputModel_MetamodelAlias().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.InputModel.Basic.metamodelAlias)) {
				if (msg.getNewValue() != null) {
					basePart.setMetamodelAlias(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMetamodelAlias("");
				}
			}
			if (MtcPackage.eINSTANCE.getInputModel_Index().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.InputModel.Basic.index)) {
				if (msg.getNewValue() != null) {
					basePart.setIndex(EcoreUtil.convertToString(EcorePackage.Literals.EINTEGER_OBJECT, msg.getNewValue()));
				} else {
					basePart.setIndex("");
				}
			}
			
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
			MtcPackage.eINSTANCE.getInputModel_Model(),
			MtcPackage.eINSTANCE.getInputModel_ModelAlias(),
			MtcPackage.eINSTANCE.getInputModel_Transformation(),
			MtcPackage.eINSTANCE.getInputModel_MetamodelAlias(),
			MtcPackage.eINSTANCE.getInputModel_Index()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.InputModel.Basic.model || key == MtcViewsRepository.InputModel.Basic.modelAlias || key == MtcViewsRepository.InputModel.Basic.transformation;
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
				if (MtcViewsRepository.InputModel.Basic.modelAlias == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getInputModel_ModelAlias().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getInputModel_ModelAlias().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.InputModel.Basic.metamodelAlias == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getInputModel_MetamodelAlias().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getInputModel_MetamodelAlias().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.InputModel.Basic.index == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getInputModel_Index().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getInputModel_Index().getEAttributeType(), newValue);
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
