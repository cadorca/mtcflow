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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Validation;
import com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ModelValidationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for validation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings validationSettings;
	
	/**
	 * Settings for models ReferencesTable
	 */
	private ReferencesTableSettings modelsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ModelValidationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject modelValidation, String editing_mode) {
		super(editingContext, modelValidation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.ModelValidation.class;
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
			
			final ModelValidation modelValidation = (ModelValidation)elt;
			final ModelValidationPropertiesEditionPart basePart = (ModelValidationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.ModelValidation.Basic.validation)) {
				// init part
				validationSettings = new EObjectFlatComboSettings(modelValidation, MtcPackage.eINSTANCE.getModelValidation_Validation());
				basePart.initValidation(validationSettings);
				// set the button mode
				basePart.setValidationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.ModelValidation.Basic.models)) {
				modelsSettings = new ReferencesTableSettings(modelValidation, MtcPackage.eINSTANCE.getModelValidation_Models());
				basePart.initModels(modelsSettings);
			}
			if (isAccessible(MtcViewsRepository.ModelValidation.Basic.stopOnError)) {
				basePart.setStopOnError(modelValidation.isStopOnError());
			}
			// init filters
			if (isAccessible(MtcViewsRepository.ModelValidation.Basic.validation)) {
				basePart.addFilterToValidation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Validation);
					}
					
				});
				// Start of user code for additional businessfilters for validation
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.ModelValidation.Basic.models)) {
				basePart.addFilterToModels(new EObjectFilter(MtcPackage.Literals.MODEL));
				// Start of user code for additional businessfilters for models
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
		if (editorKey == MtcViewsRepository.ModelValidation.Basic.validation) {
			return MtcPackage.eINSTANCE.getModelValidation_Validation();
		}
		if (editorKey == MtcViewsRepository.ModelValidation.Basic.models) {
			return MtcPackage.eINSTANCE.getModelValidation_Models();
		}
		if (editorKey == MtcViewsRepository.ModelValidation.Basic.stopOnError) {
			return MtcPackage.eINSTANCE.getModelValidation_StopOnError();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ModelValidation modelValidation = (ModelValidation)semanticObject;
		if (MtcViewsRepository.ModelValidation.Basic.validation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				validationSettings.setToReference((Validation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Validation eObject = MtcFactory.eINSTANCE.createValidation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				validationSettings.setToReference(eObject);
			}
		}
		if (MtcViewsRepository.ModelValidation.Basic.models == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Model) {
					modelsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				modelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				modelsSettings.move(event.getNewIndex(), (Model) event.getNewValue());
			}
		}
		if (MtcViewsRepository.ModelValidation.Basic.stopOnError == event.getAffectedEditor()) {
			modelValidation.setStopOnError((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ModelValidationPropertiesEditionPart basePart = (ModelValidationPropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getModelValidation_Validation().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.ModelValidation.Basic.validation))
				basePart.setValidation((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getModelValidation_Models().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.ModelValidation.Basic.models))
				basePart.updateModels();
			if (MtcPackage.eINSTANCE.getModelValidation_StopOnError().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.ModelValidation.Basic.stopOnError))
				basePart.setStopOnError((Boolean)msg.getNewValue());
			
			
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
			MtcPackage.eINSTANCE.getModelValidation_Validation(),
			MtcPackage.eINSTANCE.getModelValidation_Models(),
			MtcPackage.eINSTANCE.getModelValidation_StopOnError()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.ModelValidation.Basic.validation;
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
				if (MtcViewsRepository.ModelValidation.Basic.stopOnError == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getModelValidation_StopOnError().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getModelValidation_StopOnError().getEAttributeType(), newValue);
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
