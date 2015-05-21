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

import com.mtcflow.model.mtc.Configuration;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.Variable;
import com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ConfigurationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for variables ReferencesTable
	 */
	protected ReferencesTableSettings variablesSettings;
	
	/**
	 * Settings for tags ReferencesTable
	 */
	protected ReferencesTableSettings tagsSettings;
	
	/**
	 * Settings for libraries ReferencesTable
	 */
	protected ReferencesTableSettings librariesSettings;
	
	/**
	 * Settings for scripts ReferencesTable
	 */
	protected ReferencesTableSettings scriptsSettings;
	
	/**
	 * Settings for environments ReferencesTable
	 */
	protected ReferencesTableSettings environmentsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConfigurationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject configuration, String editing_mode) {
		super(editingContext, configuration, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.Configuration.class;
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
			
			final Configuration configuration = (Configuration)elt;
			final ConfigurationPropertiesEditionPart basePart = (ConfigurationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.Configuration.Basic.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, configuration.getName()));
			
			if (isAccessible(MtcViewsRepository.Configuration.Basic.variables)) {
				variablesSettings = new ReferencesTableSettings(configuration, MtcPackage.eINSTANCE.getConfiguration_Variables());
				basePart.initVariables(variablesSettings);
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.tags)) {
				tagsSettings = new ReferencesTableSettings(configuration, MtcPackage.eINSTANCE.getConfiguration_Tags());
				basePart.initTags(tagsSettings);
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.libraries)) {
				librariesSettings = new ReferencesTableSettings(configuration, MtcPackage.eINSTANCE.getConfiguration_Libraries());
				basePart.initLibraries(librariesSettings);
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.scripts)) {
				scriptsSettings = new ReferencesTableSettings(configuration, MtcPackage.eINSTANCE.getConfiguration_Scripts());
				basePart.initScripts(scriptsSettings);
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.environments)) {
				environmentsSettings = new ReferencesTableSettings(configuration, MtcPackage.eINSTANCE.getConfiguration_Environments());
				basePart.initEnvironments(environmentsSettings);
			}
			// init filters
			
			if (isAccessible(MtcViewsRepository.Configuration.Basic.variables)) {
				basePart.addFilterToVariables(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Variable); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for variables
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.tags)) {
				basePart.addFilterToTags(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Tag); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for tags
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.libraries)) {
				basePart.addFilterToLibraries(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Library); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for libraries
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.scripts)) {
				basePart.addFilterToScripts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Script); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for scripts
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.Configuration.Basic.environments)) {
				basePart.addFilterToEnvironments(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ModelEnvironment); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for environments
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
		if (editorKey == MtcViewsRepository.Configuration.Basic.name) {
			return MtcPackage.eINSTANCE.getConfiguration_Name();
		}
		if (editorKey == MtcViewsRepository.Configuration.Basic.variables) {
			return MtcPackage.eINSTANCE.getConfiguration_Variables();
		}
		if (editorKey == MtcViewsRepository.Configuration.Basic.tags) {
			return MtcPackage.eINSTANCE.getConfiguration_Tags();
		}
		if (editorKey == MtcViewsRepository.Configuration.Basic.libraries) {
			return MtcPackage.eINSTANCE.getConfiguration_Libraries();
		}
		if (editorKey == MtcViewsRepository.Configuration.Basic.scripts) {
			return MtcPackage.eINSTANCE.getConfiguration_Scripts();
		}
		if (editorKey == MtcViewsRepository.Configuration.Basic.environments) {
			return MtcPackage.eINSTANCE.getConfiguration_Environments();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Configuration configuration = (Configuration)semanticObject;
		if (MtcViewsRepository.Configuration.Basic.name == event.getAffectedEditor()) {
			configuration.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MtcViewsRepository.Configuration.Basic.variables == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, variablesSettings, editingContext.getAdapterFactory());
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
				variablesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				variablesSettings.move(event.getNewIndex(), (Variable) event.getNewValue());
			}
		}
		if (MtcViewsRepository.Configuration.Basic.tags == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, tagsSettings, editingContext.getAdapterFactory());
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
				tagsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				tagsSettings.move(event.getNewIndex(), (Tag) event.getNewValue());
			}
		}
		if (MtcViewsRepository.Configuration.Basic.libraries == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, librariesSettings, editingContext.getAdapterFactory());
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
				librariesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				librariesSettings.move(event.getNewIndex(), (Library) event.getNewValue());
			}
		}
		if (MtcViewsRepository.Configuration.Basic.scripts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, scriptsSettings, editingContext.getAdapterFactory());
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
				scriptsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				scriptsSettings.move(event.getNewIndex(), (Script) event.getNewValue());
			}
		}
		if (MtcViewsRepository.Configuration.Basic.environments == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, environmentsSettings, editingContext.getAdapterFactory());
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
				environmentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				environmentsSettings.move(event.getNewIndex(), (ModelEnvironment) event.getNewValue());
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
			ConfigurationPropertiesEditionPart basePart = (ConfigurationPropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getConfiguration_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MtcViewsRepository.Configuration.Basic.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MtcPackage.eINSTANCE.getConfiguration_Variables().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.Configuration.Basic.variables))
				basePart.updateVariables();
			if (MtcPackage.eINSTANCE.getConfiguration_Tags().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.Configuration.Basic.tags))
				basePart.updateTags();
			if (MtcPackage.eINSTANCE.getConfiguration_Libraries().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.Configuration.Basic.libraries))
				basePart.updateLibraries();
			if (MtcPackage.eINSTANCE.getConfiguration_Scripts().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.Configuration.Basic.scripts))
				basePart.updateScripts();
			if (MtcPackage.eINSTANCE.getConfiguration_Environments().equals(msg.getFeature()) && isAccessible(MtcViewsRepository.Configuration.Basic.environments))
				basePart.updateEnvironments();
			
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
			MtcPackage.eINSTANCE.getConfiguration_Name(),
			MtcPackage.eINSTANCE.getConfiguration_Variables(),
			MtcPackage.eINSTANCE.getConfiguration_Tags(),
			MtcPackage.eINSTANCE.getConfiguration_Libraries(),
			MtcPackage.eINSTANCE.getConfiguration_Scripts(),
			MtcPackage.eINSTANCE.getConfiguration_Environments()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.Configuration.Basic.name;
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
				if (MtcViewsRepository.Configuration.Basic.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MtcPackage.eINSTANCE.getConfiguration_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MtcPackage.eINSTANCE.getConfiguration_Name().getEAttributeType(), newValue);
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
