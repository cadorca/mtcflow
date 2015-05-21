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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.mtcflow.model.mtc.Choise;
import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ChoisePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for decision EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings decisionSettings;
	
	/**
	 * Settings for transformation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings transformationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ChoisePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject choise, String editing_mode) {
		super(editingContext, choise, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.Choise.class;
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
			
			final Choise choise = (Choise)elt;
			final ChoisePropertiesEditionPart basePart = (ChoisePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.Choise.Basic.choiseValue))
				basePart.setChoiseValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, choise.getChoiseValue()));
			
			if (isAccessible(MtcViewsRepository.Choise.Basic.decision)) {
				// init part
				decisionSettings = new EObjectFlatComboSettings(choise, MtcPackage.eINSTANCE.getChoise_Decision());
				basePart.initDecision(decisionSettings);
				// set the button mode
				basePart.setDecisionButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.Choise.Basic.transformation)) {
				// init part
				transformationSettings = new EObjectFlatComboSettings(choise, MtcPackage.eINSTANCE.getChoise_Transformation());
				basePart.initTransformation(transformationSettings);
				// set the button mode
				basePart.setTransformationButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(MtcViewsRepository.Choise.Basic.decision)) {
				basePart.addFilterToDecision(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Decision);
					}
					
				});
				// Start of user code for additional businessfilters for decision
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.Choise.Basic.transformation)) {
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
		if (editorKey == MtcViewsRepository.Choise.Basic.choiseValue) {
			return MtcPackage.eINSTANCE.getChoise_ChoiseValue();
		}
		if (editorKey == MtcViewsRepository.Choise.Basic.decision) {
			return MtcPackage.eINSTANCE.getChoise_Decision();
		}
		if (editorKey == MtcViewsRepository.Choise.Basic.transformation) {
			return MtcPackage.eINSTANCE.getChoise_Transformation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Choise choise = (Choise)semanticObject;
		if (MtcViewsRepository.Choise.Basic.choiseValue == event.getAffectedEditor()) {
			choise.setChoiseValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Choise.Basic.decision == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decisionSettings.setToReference((Decision)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Decision eObject = MtcFactory.eINSTANCE.createDecision();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decisionSettings.setToReference(eObject);
			}
		}
		if (MtcViewsRepository.Choise.Basic.transformation == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ChoisePropertiesEditionPart basePart = (ChoisePropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getChoise_ChoiseValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Choise.Basic.choiseValue)) {
				if (msg.getNewValue() != null) {
					basePart.setChoiseValue(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setChoiseValue("");
				}
			}
			if (MtcPackage.eINSTANCE.getChoise_Decision().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.Choise.Basic.decision))
				basePart.setDecision((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getChoise_Transformation().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.Choise.Basic.transformation))
				basePart.setTransformation((EObject)msg.getNewValue());
			
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
			MtcPackage.eINSTANCE.getChoise_ChoiseValue(),
			MtcPackage.eINSTANCE.getChoise_Decision(),
			MtcPackage.eINSTANCE.getChoise_Transformation()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.Choise.Basic.choiseValue || key == MtcViewsRepository.Choise.Basic.decision || key == MtcViewsRepository.Choise.Basic.transformation;
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
				if (MtcViewsRepository.Choise.Basic.choiseValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getChoise_ChoiseValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getChoise_ChoiseValue().getEAttributeType(), newValue);
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
