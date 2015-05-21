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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Variable;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.parts.VariablePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class VariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public VariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject variable, String editing_mode) {
		super(editingContext, variable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.Variable.class;
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
			
			final Variable variable = (Variable)elt;
			final VariablePropertiesEditionPart basePart = (VariablePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.Variable.Basic.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, variable.getName()));
			
			if (isAccessible(MtcViewsRepository.Variable.Basic.defaultValue))
				basePart.setDefaultValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, variable.getDefaultValue()));
			
			if (isAccessible(MtcViewsRepository.Variable.Basic.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, variable.getDescription()));
			
			if (isAccessible(MtcViewsRepository.Variable.Basic.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, variable.getType()));
			
			// init filters
			
			
			
			
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
		if (editorKey == MtcViewsRepository.Variable.Basic.name) {
			return MtcPackage.eINSTANCE.getVariable_Name();
		}
		if (editorKey == MtcViewsRepository.Variable.Basic.defaultValue) {
			return MtcPackage.eINSTANCE.getVariable_DefaultValue();
		}
		if (editorKey == MtcViewsRepository.Variable.Basic.description) {
			return MtcPackage.eINSTANCE.getVariable_Description();
		}
		if (editorKey == MtcViewsRepository.Variable.Basic.type) {
			return MtcPackage.eINSTANCE.getVariable_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Variable variable = (Variable)semanticObject;
		if (MtcViewsRepository.Variable.Basic.name == event.getAffectedEditor()) {
			variable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Variable.Basic.defaultValue == event.getAffectedEditor()) {
			variable.setDefaultValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Variable.Basic.description == event.getAffectedEditor()) {
			variable.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Variable.Basic.type == event.getAffectedEditor()) {
			variable.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			VariablePropertiesEditionPart basePart = (VariablePropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getVariable_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Variable.Basic.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MtcPackage.eINSTANCE.getVariable_DefaultValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Variable.Basic.defaultValue)) {
				if (msg.getNewValue() != null) {
					basePart.setDefaultValue(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDefaultValue("");
				}
			}
			if (MtcPackage.eINSTANCE.getVariable_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Variable.Basic.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MtcPackage.eINSTANCE.getVariable_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Variable.Basic.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
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
			MtcPackage.eINSTANCE.getVariable_Name(),
			MtcPackage.eINSTANCE.getVariable_DefaultValue(),
			MtcPackage.eINSTANCE.getVariable_Description(),
			MtcPackage.eINSTANCE.getVariable_Type()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.Variable.Basic.name;
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
				if (MtcViewsRepository.Variable.Basic.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getVariable_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getVariable_Name().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Variable.Basic.defaultValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getVariable_DefaultValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getVariable_DefaultValue().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Variable.Basic.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getVariable_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getVariable_Description().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Variable.Basic.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getVariable_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getVariable_Type().getEAttributeType(), newValue);
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
