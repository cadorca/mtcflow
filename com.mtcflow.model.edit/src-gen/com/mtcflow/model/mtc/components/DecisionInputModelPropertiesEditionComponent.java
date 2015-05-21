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

import com.mtcflow.model.mtc.Choise;
import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.DecisionInputModel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DecisionInputModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for decision EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings decisionSettings;
	
	/**
	 * Settings for model EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings modelSettings;
	
	/**
	 * Settings for choises ReferencesTable
	 */
	private ReferencesTableSettings choisesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DecisionInputModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject decisionInputModel, String editing_mode) {
		super(editingContext, decisionInputModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.DecisionInputModel.class;
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
			
			final DecisionInputModel decisionInputModel = (DecisionInputModel)elt;
			final DecisionInputModelPropertiesEditionPart basePart = (DecisionInputModelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.decision)) {
				// init part
				decisionSettings = new EObjectFlatComboSettings(decisionInputModel, MtcPackage.eINSTANCE.getDecisionInputModel_Decision());
				basePart.initDecision(decisionSettings);
				// set the button mode
				basePart.setDecisionButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.model)) {
				// init part
				modelSettings = new EObjectFlatComboSettings(decisionInputModel, MtcPackage.eINSTANCE.getDecisionInputModel_Model());
				basePart.initModel(modelSettings);
				// set the button mode
				basePart.setModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.modelAlias))
				basePart.setModelAlias(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, decisionInputModel.getModelAlias()));
			
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias))
				basePart.setMetamodelAlias(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, decisionInputModel.getMetamodelAlias()));
			
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation)) {
				basePart.setLoadForDecisionEvaluation(decisionInputModel.isLoadForDecisionEvaluation());
			}
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply)) {
				choisesSettings = new ReferencesTableSettings(decisionInputModel, MtcPackage.eINSTANCE.getDecisionInputModel_Choises());
				basePart.initChoisesToApply(choisesSettings);
			}
			// init filters
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.decision)) {
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
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.model)) {
				basePart.addFilterToModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Model); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for model
				// End of user code
			}
			
			
			
			if (isAccessible(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply)) {
				basePart.addFilterToChoisesToApply(new EObjectFilter(MtcPackage.Literals.CHOISE));
				// Start of user code for additional businessfilters for choises
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
		if (editorKey == MtcViewsRepository.DecisionInputModel.Basic.decision) {
			return MtcPackage.eINSTANCE.getDecisionInputModel_Decision();
		}
		if (editorKey == MtcViewsRepository.DecisionInputModel.Basic.model) {
			return MtcPackage.eINSTANCE.getDecisionInputModel_Model();
		}
		if (editorKey == MtcViewsRepository.DecisionInputModel.Basic.modelAlias) {
			return MtcPackage.eINSTANCE.getDecisionInputModel_ModelAlias();
		}
		if (editorKey == MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias) {
			return MtcPackage.eINSTANCE.getDecisionInputModel_MetamodelAlias();
		}
		if (editorKey == MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation) {
			return MtcPackage.eINSTANCE.getDecisionInputModel_LoadForDecisionEvaluation();
		}
		if (editorKey == MtcViewsRepository.DecisionInputModel.Basic.choisesToApply) {
			return MtcPackage.eINSTANCE.getDecisionInputModel_Choises();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DecisionInputModel decisionInputModel = (DecisionInputModel)semanticObject;
		if (MtcViewsRepository.DecisionInputModel.Basic.decision == event.getAffectedEditor()) {
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
		if (MtcViewsRepository.DecisionInputModel.Basic.model == event.getAffectedEditor()) {
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
		if (MtcViewsRepository.DecisionInputModel.Basic.modelAlias == event.getAffectedEditor()) {
			decisionInputModel.setModelAlias((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias == event.getAffectedEditor()) {
			decisionInputModel.setMetamodelAlias((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation == event.getAffectedEditor()) {
			decisionInputModel.setLoadForDecisionEvaluation((Boolean)event.getNewValue());
		}
		if (MtcViewsRepository.DecisionInputModel.Basic.choisesToApply == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Choise) {
					choisesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				choisesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				choisesSettings.move(event.getNewIndex(), (Choise) event.getNewValue());
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
			DecisionInputModelPropertiesEditionPart basePart = (DecisionInputModelPropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getDecisionInputModel_Decision().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.DecisionInputModel.Basic.decision))
				basePart.setDecision((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getDecisionInputModel_Model().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.DecisionInputModel.Basic.model))
				basePart.setModel((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getDecisionInputModel_ModelAlias().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.DecisionInputModel.Basic.modelAlias)) {
				if (msg.getNewValue() != null) {
					basePart.setModelAlias(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setModelAlias("");
				}
			}
			if (MtcPackage.eINSTANCE.getDecisionInputModel_MetamodelAlias().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias)) {
				if (msg.getNewValue() != null) {
					basePart.setMetamodelAlias(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMetamodelAlias("");
				}
			}
			if (MtcPackage.eINSTANCE.getDecisionInputModel_LoadForDecisionEvaluation().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation))
				basePart.setLoadForDecisionEvaluation((Boolean)msg.getNewValue());
			
			if (MtcPackage.eINSTANCE.getDecisionInputModel_Choises().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply))
				basePart.updateChoisesToApply();
			
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
			MtcPackage.eINSTANCE.getDecisionInputModel_Decision(),
			MtcPackage.eINSTANCE.getDecisionInputModel_Model(),
			MtcPackage.eINSTANCE.getDecisionInputModel_ModelAlias(),
			MtcPackage.eINSTANCE.getDecisionInputModel_MetamodelAlias(),
			MtcPackage.eINSTANCE.getDecisionInputModel_LoadForDecisionEvaluation(),
			MtcPackage.eINSTANCE.getDecisionInputModel_Choises()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.DecisionInputModel.Basic.decision;
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
				if (MtcViewsRepository.DecisionInputModel.Basic.modelAlias == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getDecisionInputModel_ModelAlias().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getDecisionInputModel_ModelAlias().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getDecisionInputModel_MetamodelAlias().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getDecisionInputModel_MetamodelAlias().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getDecisionInputModel_LoadForDecisionEvaluation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getDecisionInputModel_LoadForDecisionEvaluation().getEAttributeType(), newValue);
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
