/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

import com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class ConfigurationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ConfigurationPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable variables;
	protected List<ViewerFilter> variablesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> variablesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable tags;
	protected List<ViewerFilter> tagsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tagsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable libraries;
	protected List<ViewerFilter> librariesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> librariesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable scripts;
	protected List<ViewerFilter> scriptsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> scriptsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable environments;
	protected List<ViewerFilter> environmentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> environmentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ConfigurationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConfigurationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence configurationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = configurationStep.addStep(MtcViewsRepository.Configuration.Basic.class);
		basicStep.addStep(MtcViewsRepository.Configuration.Basic.name);
		basicStep.addStep(MtcViewsRepository.Configuration.Basic.variables);
		basicStep.addStep(MtcViewsRepository.Configuration.Basic.tags);
		basicStep.addStep(MtcViewsRepository.Configuration.Basic.libraries);
		basicStep.addStep(MtcViewsRepository.Configuration.Basic.scripts);
		basicStep.addStep(MtcViewsRepository.Configuration.Basic.environments);
		
		
		composer = new PartComposer(configurationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.Configuration.Basic.class) {
					return createBasicGroup(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Configuration.Basic.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Configuration.Basic.variables) {
					return createVariablesTableComposition(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Configuration.Basic.tags) {
					return createTagsTableComposition(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Configuration.Basic.libraries) {
					return createLibrariesTableComposition(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Configuration.Basic.scripts) {
					return createScriptsTableComposition(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Configuration.Basic.environments) {
					return createEnvironmentsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createBasicGroup(FormToolkit widgetFactory, final Composite parent) {
		Section basicSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		basicSection.setText(MtcMessages.ConfigurationPropertiesEditionPart_BasicGroupLabel);
		GridData basicSectionData = new GridData(GridData.FILL_HORIZONTAL);
		basicSectionData.horizontalSpan = 3;
		basicSection.setLayoutData(basicSectionData);
		Composite basicGroup = widgetFactory.createComposite(basicSection);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		basicSection.setClient(basicGroup);
		return basicGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.Configuration.Basic.name, MtcMessages.ConfigurationPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ConfigurationPropertiesEditionPartForm.this,
							MtcViewsRepository.Configuration.Basic.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ConfigurationPropertiesEditionPartForm.this,
									MtcViewsRepository.Configuration.Basic.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ConfigurationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MtcViewsRepository.Configuration.Basic.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.Configuration.Basic.name, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createVariablesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.variables = new ReferencesTable(getDescription(MtcViewsRepository.Configuration.Basic.variables, MtcMessages.ConfigurationPropertiesEditionPart_VariablesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.variables, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				variables.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.variables, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				variables.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.variables, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				variables.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.variables, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				variables.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.variablesFilters) {
			this.variables.addFilter(filter);
		}
		this.variables.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.Configuration.Basic.variables, MtcViewsRepository.FORM_KIND));
		this.variables.createControls(parent, widgetFactory);
		this.variables.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.variables, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData variablesData = new GridData(GridData.FILL_HORIZONTAL);
		variablesData.horizontalSpan = 3;
		this.variables.setLayoutData(variablesData);
		this.variables.setLowerBound(0);
		this.variables.setUpperBound(-1);
		variables.setID(MtcViewsRepository.Configuration.Basic.variables);
		variables.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createVariablesTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTagsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.tags = new ReferencesTable(getDescription(MtcViewsRepository.Configuration.Basic.tags, MtcMessages.ConfigurationPropertiesEditionPart_TagsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				tags.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				tags.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				tags.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				tags.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.tagsFilters) {
			this.tags.addFilter(filter);
		}
		this.tags.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.Configuration.Basic.tags, MtcViewsRepository.FORM_KIND));
		this.tags.createControls(parent, widgetFactory);
		this.tags.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.tags, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tagsData = new GridData(GridData.FILL_HORIZONTAL);
		tagsData.horizontalSpan = 3;
		this.tags.setLayoutData(tagsData);
		this.tags.setLowerBound(0);
		this.tags.setUpperBound(-1);
		tags.setID(MtcViewsRepository.Configuration.Basic.tags);
		tags.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTagsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLibrariesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.libraries = new ReferencesTable(getDescription(MtcViewsRepository.Configuration.Basic.libraries, MtcMessages.ConfigurationPropertiesEditionPart_LibrariesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.libraries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				libraries.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.libraries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				libraries.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.libraries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				libraries.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.libraries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				libraries.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.librariesFilters) {
			this.libraries.addFilter(filter);
		}
		this.libraries.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.Configuration.Basic.libraries, MtcViewsRepository.FORM_KIND));
		this.libraries.createControls(parent, widgetFactory);
		this.libraries.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.libraries, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData librariesData = new GridData(GridData.FILL_HORIZONTAL);
		librariesData.horizontalSpan = 3;
		this.libraries.setLayoutData(librariesData);
		this.libraries.setLowerBound(0);
		this.libraries.setUpperBound(-1);
		libraries.setID(MtcViewsRepository.Configuration.Basic.libraries);
		libraries.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createLibrariesTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createScriptsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.scripts = new ReferencesTable(getDescription(MtcViewsRepository.Configuration.Basic.scripts, MtcMessages.ConfigurationPropertiesEditionPart_ScriptsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.scripts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				scripts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.scripts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				scripts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.scripts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				scripts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.scripts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				scripts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.scriptsFilters) {
			this.scripts.addFilter(filter);
		}
		this.scripts.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.Configuration.Basic.scripts, MtcViewsRepository.FORM_KIND));
		this.scripts.createControls(parent, widgetFactory);
		this.scripts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.scripts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData scriptsData = new GridData(GridData.FILL_HORIZONTAL);
		scriptsData.horizontalSpan = 3;
		this.scripts.setLayoutData(scriptsData);
		this.scripts.setLowerBound(0);
		this.scripts.setUpperBound(-1);
		scripts.setID(MtcViewsRepository.Configuration.Basic.scripts);
		scripts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createScriptsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEnvironmentsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.environments = new ReferencesTable(getDescription(MtcViewsRepository.Configuration.Basic.environments, MtcMessages.ConfigurationPropertiesEditionPart_EnvironmentsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.environments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				environments.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.environments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				environments.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.environments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				environments.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.environments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				environments.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.environmentsFilters) {
			this.environments.addFilter(filter);
		}
		this.environments.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.Configuration.Basic.environments, MtcViewsRepository.FORM_KIND));
		this.environments.createControls(parent, widgetFactory);
		this.environments.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, MtcViewsRepository.Configuration.Basic.environments, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData environmentsData = new GridData(GridData.FILL_HORIZONTAL);
		environmentsData.horizontalSpan = 3;
		this.environments.setLayoutData(environmentsData);
		this.environments.setLowerBound(0);
		this.environments.setUpperBound(-1);
		environments.setID(MtcViewsRepository.Configuration.Basic.environments);
		environments.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEnvironmentsTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Configuration.Basic.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MtcMessages.Configuration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#initVariables(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initVariables(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		variables.setContentProvider(contentProvider);
		variables.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Configuration.Basic.variables);
		if (eefElementEditorReadOnlyState && variables.isEnabled()) {
			variables.setEnabled(false);
			variables.setToolTipText(MtcMessages.Configuration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variables.isEnabled()) {
			variables.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#updateVariables()
	 * 
	 */
	public void updateVariables() {
	variables.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addFilterVariables(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariables(ViewerFilter filter) {
		variablesFilters.add(filter);
		if (this.variables != null) {
			this.variables.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addBusinessFilterVariables(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariables(ViewerFilter filter) {
		variablesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#isContainedInVariablesTable(EObject element)
	 * 
	 */
	public boolean isContainedInVariablesTable(EObject element) {
		return ((ReferencesTableSettings)variables.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#initTags(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTags(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tags.setContentProvider(contentProvider);
		tags.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Configuration.Basic.tags);
		if (eefElementEditorReadOnlyState && tags.isEnabled()) {
			tags.setEnabled(false);
			tags.setToolTipText(MtcMessages.Configuration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !tags.isEnabled()) {
			tags.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#updateTags()
	 * 
	 */
	public void updateTags() {
	tags.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTags(ViewerFilter filter) {
		tagsFilters.add(filter);
		if (this.tags != null) {
			this.tags.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addBusinessFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTags(ViewerFilter filter) {
		tagsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#isContainedInTagsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTagsTable(EObject element) {
		return ((ReferencesTableSettings)tags.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#initLibraries(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLibraries(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		libraries.setContentProvider(contentProvider);
		libraries.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Configuration.Basic.libraries);
		if (eefElementEditorReadOnlyState && libraries.isEnabled()) {
			libraries.setEnabled(false);
			libraries.setToolTipText(MtcMessages.Configuration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !libraries.isEnabled()) {
			libraries.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#updateLibraries()
	 * 
	 */
	public void updateLibraries() {
	libraries.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addFilterLibraries(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLibraries(ViewerFilter filter) {
		librariesFilters.add(filter);
		if (this.libraries != null) {
			this.libraries.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addBusinessFilterLibraries(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLibraries(ViewerFilter filter) {
		librariesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#isContainedInLibrariesTable(EObject element)
	 * 
	 */
	public boolean isContainedInLibrariesTable(EObject element) {
		return ((ReferencesTableSettings)libraries.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#initScripts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initScripts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		scripts.setContentProvider(contentProvider);
		scripts.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Configuration.Basic.scripts);
		if (eefElementEditorReadOnlyState && scripts.isEnabled()) {
			scripts.setEnabled(false);
			scripts.setToolTipText(MtcMessages.Configuration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scripts.isEnabled()) {
			scripts.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#updateScripts()
	 * 
	 */
	public void updateScripts() {
	scripts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addFilterScripts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToScripts(ViewerFilter filter) {
		scriptsFilters.add(filter);
		if (this.scripts != null) {
			this.scripts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addBusinessFilterScripts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToScripts(ViewerFilter filter) {
		scriptsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#isContainedInScriptsTable(EObject element)
	 * 
	 */
	public boolean isContainedInScriptsTable(EObject element) {
		return ((ReferencesTableSettings)scripts.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#initEnvironments(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEnvironments(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		environments.setContentProvider(contentProvider);
		environments.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Configuration.Basic.environments);
		if (eefElementEditorReadOnlyState && environments.isEnabled()) {
			environments.setEnabled(false);
			environments.setToolTipText(MtcMessages.Configuration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !environments.isEnabled()) {
			environments.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#updateEnvironments()
	 * 
	 */
	public void updateEnvironments() {
	environments.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addFilterEnvironments(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEnvironments(ViewerFilter filter) {
		environmentsFilters.add(filter);
		if (this.environments != null) {
			this.environments.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#addBusinessFilterEnvironments(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEnvironments(ViewerFilter filter) {
		environmentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ConfigurationPropertiesEditionPart#isContainedInEnvironmentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEnvironmentsTable(EObject element) {
		return ((ReferencesTableSettings)environments.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.Configuration_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
