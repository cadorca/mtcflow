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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Property;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.parts.MetamodelPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MetamodelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public MetamodelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject metamodel, String editing_mode) {
		super(editingContext, metamodel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.Metamodel.class;
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
			
			final Metamodel metamodel = (Metamodel)elt;
			final MetamodelPropertiesEditionPart basePart = (MetamodelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.Metamodel.Advanced.properties)) {
				propertiesSettings = new ReferencesTableSettings(metamodel, MtcPackage.eINSTANCE.getConfigurable_Properties());
				basePart.initProperties(propertiesSettings);
			}
			if (isAccessible(MtcViewsRepository.Metamodel.Basic.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, metamodel.getName()));
			
				if (isAccessible(MtcViewsRepository.Metamodel.Basic.uRI)) {
					basePart.setURI(EEFConverterUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), metamodel.getURI()));
				}
			
			if (isAccessible(MtcViewsRepository.Metamodel.Advanced.tags)) {
				tagsSettings = new ReferencesTableSettings(metamodel, MtcPackage.eINSTANCE.getMTCResource_Tags());
				basePart.initTags(tagsSettings);
			}
			if (isAccessible(MtcViewsRepository.Metamodel.Basic.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, metamodel.getDescription()));
			
			if (isAccessible(MtcViewsRepository.Metamodel.Advanced.referencedResources)) {
				referencedResourcesSettings = new ReferencesTableSettings(metamodel, MtcPackage.eINSTANCE.getMTCResource_ReferencedResources());
				basePart.initReferencedResources(referencedResourcesSettings);
			}
				if (isAccessible(MtcViewsRepository.Metamodel.Basic.technology)) {
					basePart.setTechnology(EEFConverterUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), metamodel.getTechnology()));
				}
			
			if (isAccessible(MtcViewsRepository.Metamodel.Basic.alias))
				basePart.setAlias(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, metamodel.getAlias()));
			
			if (isAccessible(MtcViewsRepository.Metamodel.Basic.autoregister)) {
				basePart.setAutoregister(metamodel.isAutoregister());
			}
				if (isAccessible(MtcViewsRepository.Metamodel.Basic.metamodelURI)) {
					basePart.setMetamodelURI(EEFConverterUtil.convertToString(MtcPackage.eINSTANCE.getMetamodel_MetamodelURI().getEAttributeType(), metamodel.getMetamodelURI()));
				}
			
			// init filters
			if (isAccessible(MtcViewsRepository.Metamodel.Advanced.properties)) {
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
			
			
			if (isAccessible(MtcViewsRepository.Metamodel.Advanced.tags)) {
				basePart.addFilterToTags(new EObjectFilter(MtcPackage.Literals.TAG));
				// Start of user code for additional businessfilters for tags
				// End of user code
			}
			
			if (isAccessible(MtcViewsRepository.Metamodel.Advanced.referencedResources)) {
				basePart.addFilterToReferencedResources(new EObjectFilter(MtcPackage.Literals.REFERENCED_RESOURCE));
				// Start of user code for additional businessfilters for referencedResources
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
		if (editorKey == MtcViewsRepository.Metamodel.Advanced.properties) {
			return MtcPackage.eINSTANCE.getConfigurable_Properties();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Basic.name) {
			return MtcPackage.eINSTANCE.getMTCResource_Name();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Basic.uRI) {
			return MtcPackage.eINSTANCE.getMTCResource_URI();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Advanced.tags) {
			return MtcPackage.eINSTANCE.getMTCResource_Tags();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Basic.description) {
			return MtcPackage.eINSTANCE.getMTCResource_Description();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Advanced.referencedResources) {
			return MtcPackage.eINSTANCE.getMTCResource_ReferencedResources();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Basic.technology) {
			return MtcPackage.eINSTANCE.getMTCResource_Technology();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Basic.alias) {
			return MtcPackage.eINSTANCE.getMetamodel_Alias();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Basic.autoregister) {
			return MtcPackage.eINSTANCE.getMetamodel_Autoregister();
		}
		if (editorKey == MtcViewsRepository.Metamodel.Basic.metamodelURI) {
			return MtcPackage.eINSTANCE.getMetamodel_MetamodelURI();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Metamodel metamodel = (Metamodel)semanticObject;
		if (MtcViewsRepository.Metamodel.Advanced.properties == event.getAffectedEditor()) {
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
		if (MtcViewsRepository.Metamodel.Basic.name == event.getAffectedEditor()) {
			metamodel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Metamodel.Basic.uRI == event.getAffectedEditor()) {
			metamodel.setURI((String)event.getNewValue());
		}
		if (MtcViewsRepository.Metamodel.Advanced.tags == event.getAffectedEditor()) {
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
		if (MtcViewsRepository.Metamodel.Basic.description == event.getAffectedEditor()) {
			metamodel.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Metamodel.Advanced.referencedResources == event.getAffectedEditor()) {
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
		if (MtcViewsRepository.Metamodel.Basic.technology == event.getAffectedEditor()) {
			metamodel.setTechnology((String)event.getNewValue());
		}
		if (MtcViewsRepository.Metamodel.Basic.alias == event.getAffectedEditor()) {
			metamodel.setAlias((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Metamodel.Basic.autoregister == event.getAffectedEditor()) {
			metamodel.setAutoregister((Boolean)event.getNewValue());
		}
		if (MtcViewsRepository.Metamodel.Basic.metamodelURI == event.getAffectedEditor()) {
			metamodel.setMetamodelURI((String)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			MetamodelPropertiesEditionPart basePart = (MetamodelPropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getConfigurable_Properties().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.Metamodel.Advanced.properties))
				basePart.updateProperties();
			if (MtcPackage.eINSTANCE.getMTCResource_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Metamodel.Basic.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTCResource_URI().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Metamodel.Basic.uRI)) {
				if (msg.getNewValue() != null) {
					basePart.setURI(EcoreUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setURI("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTCResource_Tags().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.Metamodel.Advanced.tags))
				basePart.updateTags();
			if (MtcPackage.eINSTANCE.getMTCResource_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Metamodel.Basic.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MtcPackage.eINSTANCE.getMTCResource_ReferencedResources().equals(msg.getFeature())  && isAccessible(MtcViewsRepository.Metamodel.Advanced.referencedResources))
				basePart.updateReferencedResources();
			if (MtcPackage.eINSTANCE.getMTCResource_Technology().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Metamodel.Basic.technology)) {
				if (msg.getNewValue() != null) {
					basePart.setTechnology(EcoreUtil.convertToString(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setTechnology("");
				}
			}
			if (MtcPackage.eINSTANCE.getMetamodel_Alias().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Metamodel.Basic.alias)) {
				if (msg.getNewValue() != null) {
					basePart.setAlias(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAlias("");
				}
			}
			if (MtcPackage.eINSTANCE.getMetamodel_Autoregister().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Metamodel.Basic.autoregister))
				basePart.setAutoregister((Boolean)msg.getNewValue());
			
			if (MtcPackage.eINSTANCE.getMetamodel_MetamodelURI().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Metamodel.Basic.metamodelURI)) {
				if (msg.getNewValue() != null) {
					basePart.setMetamodelURI(EcoreUtil.convertToString(MtcPackage.eINSTANCE.getMetamodel_MetamodelURI().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setMetamodelURI("");
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
			MtcPackage.eINSTANCE.getMTCResource_Name(),
			MtcPackage.eINSTANCE.getMTCResource_URI(),
			MtcPackage.eINSTANCE.getMTCResource_Tags(),
			MtcPackage.eINSTANCE.getMTCResource_Description(),
			MtcPackage.eINSTANCE.getMTCResource_ReferencedResources(),
			MtcPackage.eINSTANCE.getMTCResource_Technology(),
			MtcPackage.eINSTANCE.getMetamodel_Alias(),
			MtcPackage.eINSTANCE.getMetamodel_Autoregister(),
			MtcPackage.eINSTANCE.getMetamodel_MetamodelURI()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.Metamodel.Basic.name || key == MtcViewsRepository.Metamodel.Basic.alias || key == MtcViewsRepository.Metamodel.Basic.autoregister;
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
				if (MtcViewsRepository.Metamodel.Basic.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_Name().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Metamodel.Basic.uRI == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_URI().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Metamodel.Basic.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_Description().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Metamodel.Basic.technology == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMTCResource_Technology().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Metamodel.Basic.alias == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMetamodel_Alias().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMetamodel_Alias().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Metamodel.Basic.autoregister == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMetamodel_Autoregister().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMetamodel_Autoregister().getEAttributeType(), newValue);
				}
				if (MtcViewsRepository.Metamodel.Basic.metamodelURI == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getMetamodel_MetamodelURI().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getMetamodel_MetamodelURI().getEAttributeType(), newValue);
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
