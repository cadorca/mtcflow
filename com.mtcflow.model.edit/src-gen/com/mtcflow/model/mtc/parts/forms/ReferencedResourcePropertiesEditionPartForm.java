/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart;
import com.mtcflow.model.mtc.providers.MtcMessages;
import com.mtcflow.model.mtc.utils.DialogUtils;
import com.mtcflow.model.mtc.utils.DialogUtils.DialogTypes;

// End of user code

/**
 * 
 * 
 */
public class ReferencedResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ReferencedResourcePropertiesEditionPart {

	protected Text name;
	protected SelectionDialog uRI;
	protected Text type;
	protected Text description;
	protected SelectionDialog technology;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable referencedResources;
	protected List<ViewerFilter> referencedResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencedResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable tags;
	protected List<ViewerFilter> tagsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tagsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ReferencedResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReferencedResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence referencedResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = referencedResourceStep.addStep(MtcViewsRepository.ReferencedResource.Basic.class);
		basicStep.addStep(MtcViewsRepository.ReferencedResource.Basic.name);
		basicStep.addStep(MtcViewsRepository.ReferencedResource.Basic.uRI);
		basicStep.addStep(MtcViewsRepository.ReferencedResource.Basic.type);
		basicStep.addStep(MtcViewsRepository.ReferencedResource.Basic.description);
		basicStep.addStep(MtcViewsRepository.ReferencedResource.Basic.technology);
		
		CompositionStep advancedStep = referencedResourceStep.addStep(MtcViewsRepository.ReferencedResource.Advanced.class);
		advancedStep.addStep(MtcViewsRepository.ReferencedResource.Advanced.properties);
		advancedStep.addStep(MtcViewsRepository.ReferencedResource.Advanced.referencedResources);
		advancedStep.addStep(MtcViewsRepository.ReferencedResource.Advanced.tags);
		
		
		composer = new PartComposer(referencedResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.ReferencedResource.Basic.class) {
					return createBasicGroup(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Basic.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Basic.uRI) {
					return createURISelectionDialog(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Basic.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Basic.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Basic.technology) {
					return createTechnologySelectionDialog(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Advanced.class) {
					return createAdvancedGroup(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Advanced.properties) {
					return createPropertiesTableComposition(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Advanced.referencedResources) {
					return createReferencedResourcesReferencesTable(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ReferencedResource.Advanced.tags) {
					return createTagsReferencesTable(widgetFactory, parent);
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
		basicSection.setText(MtcMessages.ReferencedResourcePropertiesEditionPart_BasicGroupLabel);
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
		createDescription(parent, MtcViewsRepository.ReferencedResource.Basic.name, MtcMessages.ReferencedResourcePropertiesEditionPart_NameLabel);
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
							ReferencedResourcePropertiesEditionPartForm.this,
							MtcViewsRepository.ReferencedResource.Basic.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReferencedResourcePropertiesEditionPartForm.this,
									MtcViewsRepository.ReferencedResource.Basic.name,
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
									ReferencedResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MtcViewsRepository.ReferencedResource.Basic.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Basic.name, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createURISelectionDialog(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.ReferencedResource.Basic.uRI, MtcMessages.ReferencedResourcePropertiesEditionPart_URILabel);
		uRI = new SelectionDialog(parent, SWT.NONE, widgetFactory);
		GridData generatorData = new GridData(GridData.FILL_HORIZONTAL);
		uRI.setLayoutData(generatorData);

		uRI.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					uRISelectionDialog();
			}
		});

		uRI.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
			}
		});
		uRI.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Basic.uRI, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createURISelectionDialog

		// End of user code
		return parent;
	}

	protected void uRISelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedUri = DialogUtils.openDialogFor(current, DialogTypes.URI, uRI.getText());
		if (selectedUri != null) {
			uRI.setText(selectedUri);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
		}
		
	//End of user code
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.ReferencedResource.Basic.type, MtcMessages.ReferencedResourcePropertiesEditionPart_TypeLabel);
		type = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		type.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReferencedResourcePropertiesEditionPartForm.this,
							MtcViewsRepository.ReferencedResource.Basic.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReferencedResourcePropertiesEditionPartForm.this,
									MtcViewsRepository.ReferencedResource.Basic.type,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, type.getText()));
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
									ReferencedResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		type.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, MtcViewsRepository.ReferencedResource.Basic.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Basic.type, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.ReferencedResource.Basic.description, MtcMessages.ReferencedResourcePropertiesEditionPart_DescriptionLabel);
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReferencedResourcePropertiesEditionPartForm.this,
							MtcViewsRepository.ReferencedResource.Basic.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReferencedResourcePropertiesEditionPartForm.this,
									MtcViewsRepository.ReferencedResource.Basic.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
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
									ReferencedResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, MtcViewsRepository.ReferencedResource.Basic.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Basic.description, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createTechnologySelectionDialog(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.ReferencedResource.Basic.technology, MtcMessages.ReferencedResourcePropertiesEditionPart_TechnologyLabel);
		technology = new SelectionDialog(parent, SWT.NONE, widgetFactory);
		GridData generatorData = new GridData(GridData.FILL_HORIZONTAL);
		technology.setLayoutData(generatorData);

		technology.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					technologySelectionDialog();
			}
		});

		technology.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
			}
		});
		technology.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Basic.technology, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTechnologySelectionDialog

		// End of user code
		return parent;
	}

	protected void technologySelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedTechnology = DialogUtils.openDialogFor(current, DialogTypes.Technology, technology.getText());
		if (selectedTechnology != null) {
			technology.setText(selectedTechnology);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
		}
	//End of user code
	}

	/**
	 * 
	 */
	protected Composite createAdvancedGroup(FormToolkit widgetFactory, final Composite parent) {
		Section advancedSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		advancedSection.setText(MtcMessages.ReferencedResourcePropertiesEditionPart_AdvancedGroupLabel);
		GridData advancedSectionData = new GridData(GridData.FILL_HORIZONTAL);
		advancedSectionData.horizontalSpan = 3;
		advancedSection.setLayoutData(advancedSectionData);
		Composite advancedGroup = widgetFactory.createComposite(advancedSection);
		GridLayout advancedGroupLayout = new GridLayout();
		advancedGroupLayout.numColumns = 3;
		advancedGroup.setLayout(advancedGroupLayout);
		advancedSection.setClient(advancedGroup);
		return advancedGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.properties = new ReferencesTable(getDescription(MtcViewsRepository.ReferencedResource.Advanced.properties, MtcMessages.ReferencedResourcePropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Advanced.properties, MtcViewsRepository.FORM_KIND));
		this.properties.createControls(parent, widgetFactory);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.properties, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(MtcViewsRepository.ReferencedResource.Advanced.properties);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPropertiesTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReferencedResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.referencedResources = new ReferencesTable(getDescription(MtcViewsRepository.ReferencedResource.Advanced.referencedResources, MtcMessages.ReferencedResourcePropertiesEditionPart_ReferencedResourcesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addReferencedResources(); }
			public void handleEdit(EObject element) { editReferencedResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencedResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencedResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencedResources.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Advanced.referencedResources, MtcViewsRepository.FORM_KIND));
		this.referencedResources.createControls(parent, widgetFactory);
		this.referencedResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.referencedResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencedResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		referencedResourcesData.horizontalSpan = 3;
		this.referencedResources.setLayoutData(referencedResourcesData);
		this.referencedResources.disableMove();
		referencedResources.setID(MtcViewsRepository.ReferencedResource.Advanced.referencedResources);
		referencedResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createReferencedResourcesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addReferencedResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(referencedResources.getInput(), referencedResourcesFilters, referencedResourcesBusinessFilters,
		"referencedResources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.referencedResources,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				referencedResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReferencedResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencedResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencedResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		referencedResources.refresh();
	}

	/**
	 * 
	 */
	protected void editReferencedResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				referencedResources.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createTagsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.tags = new ReferencesTable(getDescription(MtcViewsRepository.ReferencedResource.Advanced.tags, MtcMessages.ReferencedResourcePropertiesEditionPart_TagsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addTags(); }
			public void handleEdit(EObject element) { editTags(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTags(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTags(element); }
			public void navigateTo(EObject element) { }
		});
		this.tags.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.ReferencedResource.Advanced.tags, MtcViewsRepository.FORM_KIND));
		this.tags.createControls(parent, widgetFactory);
		this.tags.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.tags, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tagsData = new GridData(GridData.FILL_HORIZONTAL);
		tagsData.horizontalSpan = 3;
		this.tags.setLayoutData(tagsData);
		this.tags.disableMove();
		tags.setID(MtcViewsRepository.ReferencedResource.Advanced.tags);
		tags.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createTagsReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addTags() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(tags.getInput(), tagsFilters, tagsBusinessFilters,
		"tags", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.tags,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				tags.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTags(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		tags.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTags(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencedResourcePropertiesEditionPartForm.this, MtcViewsRepository.ReferencedResource.Advanced.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		tags.refresh();
	}

	/**
	 * 
	 */
	protected void editTags(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				tags.refresh();
			}
		}
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
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Basic.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#getURI()
	 * 
	 */
	public String getURI() {
		return uRI.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#setURI(String newValue)
	 * 
	 */
	public void setURI(String newValue) {
		if (newValue != null) {
			uRI.setText(newValue);
		} else {
			uRI.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Basic.uRI);
		if (eefElementEditorReadOnlyState && uRI.isEnabled()) {
			uRI.setEnabled(false);
			uRI.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !uRI.isEnabled()) {
			uRI.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Basic.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Basic.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#getTechnology()
	 * 
	 */
	public String getTechnology() {
		return technology.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#setTechnology(String newValue)
	 * 
	 */
	public void setTechnology(String newValue) {
		if (newValue != null) {
			technology.setText(newValue);
		} else {
			technology.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Basic.technology);
		if (eefElementEditorReadOnlyState && technology.isEnabled()) {
			technology.setEnabled(false);
			technology.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !technology.isEnabled()) {
			technology.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Advanced.properties);
		if (eefElementEditorReadOnlyState && properties.isEnabled()) {
			properties.setEnabled(false);
			properties.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !properties.isEnabled()) {
			properties.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#addFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProperties(ViewerFilter filter) {
		propertiesFilters.add(filter);
		if (this.properties != null) {
			this.properties.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#initReferencedResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReferencedResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencedResources.setContentProvider(contentProvider);
		referencedResources.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Advanced.referencedResources);
		if (eefElementEditorReadOnlyState && referencedResources.getTable().isEnabled()) {
			referencedResources.setEnabled(false);
			referencedResources.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedResources.getTable().isEnabled()) {
			referencedResources.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#updateReferencedResources()
	 * 
	 */
	public void updateReferencedResources() {
	referencedResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#addFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#addBusinessFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#isContainedInReferencedResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencedResourcesTable(EObject element) {
		return ((ReferencesTableSettings)referencedResources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#initTags(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTags(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tags.setContentProvider(contentProvider);
		tags.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ReferencedResource.Advanced.tags);
		if (eefElementEditorReadOnlyState && tags.getTable().isEnabled()) {
			tags.setEnabled(false);
			tags.setToolTipText(MtcMessages.ReferencedResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !tags.getTable().isEnabled()) {
			tags.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#updateTags()
	 * 
	 */
	public void updateTags() {
	tags.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#addFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTags(ViewerFilter filter) {
		tagsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#addBusinessFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTags(ViewerFilter filter) {
		tagsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ReferencedResourcePropertiesEditionPart#isContainedInTagsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTagsTable(EObject element) {
		return ((ReferencesTableSettings)tags.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.ReferencedResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
