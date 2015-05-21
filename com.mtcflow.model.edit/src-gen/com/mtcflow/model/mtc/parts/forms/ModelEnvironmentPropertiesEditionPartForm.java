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
import org.eclipse.emf.eef.runtime.ui.widgets.SelectionDialog;
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

import com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;
import com.mtcflow.model.mtc.utils.DialogUtils;
import com.mtcflow.model.mtc.utils.DialogUtils.DialogTypes;

// End of user code

/**
 * 
 * 
 */
public class ModelEnvironmentPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ModelEnvironmentPropertiesEditionPart {

	protected Text name;
	protected SelectionDialog implementationClass;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();

	/**
	 * For {@link ISection} use only.
	 */
	public ModelEnvironmentPropertiesEditionPartForm() {
		super();
	}

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ModelEnvironmentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *      createFigure(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.forms.widgets.FormToolkit)
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
	 *      createControls(org.eclipse.ui.forms.widgets.FormToolkit,
	 *      org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence modelEnvironmentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = modelEnvironmentStep.addStep(MtcViewsRepository.ModelEnvironment.Basic.class);
		basicStep.addStep(MtcViewsRepository.ModelEnvironment.Basic.name);
		basicStep.addStep(MtcViewsRepository.ModelEnvironment.Basic.implementationClass);
		basicStep.addStep(MtcViewsRepository.ModelEnvironment.Basic.properties);

		composer = new PartComposer(modelEnvironmentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.ModelEnvironment.Basic.class) {
					return createBasicGroup(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ModelEnvironment.Basic.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ModelEnvironment.Basic.implementationClass) {
					return createImplementationClassSelectionDialog(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.ModelEnvironment.Basic.properties) {
					return createPropertiesTableComposition(widgetFactory, parent);
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
		basicSection.setText(MtcMessages.ModelEnvironmentPropertiesEditionPart_BasicGroupLabel);
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
		createDescription(parent, MtcViewsRepository.ModelEnvironment.Basic.name, MtcMessages.ModelEnvironmentPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.name, PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MtcViewsRepository.ModelEnvironment.Basic.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ModelEnvironment.Basic.name, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	protected Composite createImplementationClassSelectionDialog(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.ModelEnvironment.Basic.implementationClass, MtcMessages.ModelEnvironmentPropertiesEditionPart_ImplementationClassLabel);
		implementationClass = new SelectionDialog(parent, SWT.NONE, widgetFactory);
		GridData generatorData = new GridData(GridData.FILL_HORIZONTAL);
		implementationClass.setLayoutData(generatorData);

		implementationClass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				implementationClassSelectionDialog();
			}
		});

		implementationClass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.implementationClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implementationClass.getText()));
			}
		});
		implementationClass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.implementationClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implementationClass.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ModelEnvironment.Basic.implementationClass, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createImplementationClassSelectionDialog

		// End of user code
		return parent;
	}

	protected void implementationClassSelectionDialog() {
		// Start of user code browse button selection dialog
		String selectedClass = DialogUtils.openDialogFor(current, DialogTypes.Class, implementationClass.getText());
		if (selectedClass != null) {
			implementationClass.setText(selectedClass);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.implementationClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implementationClass.getText()));
		}

		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.properties = new ReferencesTable(getDescription(MtcViewsRepository.ModelEnvironment.Basic.properties, MtcMessages.ModelEnvironmentPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}

			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}

			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}

			public void navigateTo(EObject element) {
			}
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.ModelEnvironment.Basic.properties, MtcViewsRepository.FORM_KIND));
		this.properties.createControls(parent, widgetFactory);
		this.properties.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelEnvironmentPropertiesEditionPartForm.this, MtcViewsRepository.ModelEnvironment.Basic.properties, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(MtcViewsRepository.ModelEnvironment.Basic.properties);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPropertiesTableComposition

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
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#setName(String
	 *      newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ModelEnvironment.Basic.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MtcMessages.ModelEnvironment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#getImplementationClass()
	 * 
	 */
	public String getImplementationClass() {
		return implementationClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#setImplementationClass(String
	 *      newValue)
	 * 
	 */
	public void setImplementationClass(String newValue) {
		if (newValue != null) {
			implementationClass.setText(newValue);
		} else {
			implementationClass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ModelEnvironment.Basic.implementationClass);
		if (eefElementEditorReadOnlyState && implementationClass.isEnabled()) {
			implementationClass.setEnabled(false);
			implementationClass.setToolTipText(MtcMessages.ModelEnvironment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !implementationClass.isEnabled()) {
			implementationClass.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#initProperties(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ModelEnvironment.Basic.properties);
		if (eefElementEditorReadOnlyState && properties.isEnabled()) {
			properties.setEnabled(false);
			properties.setToolTipText(MtcMessages.ModelEnvironment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !properties.isEnabled()) {
			properties.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
		properties.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#addFilterProperties(ViewerFilter
	 *      filter)
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
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelEnvironmentPropertiesEditionPart#isContainedInPropertiesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings) properties.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.ModelEnvironment_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
