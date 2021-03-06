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

import com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class DecisionPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DecisionPropertiesEditionPart {

	protected Text name;
	protected Text decisionExpression;
	protected Text implemenetaionClass;
	protected ReferencesTable choises;
	protected List<ViewerFilter> choisesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> choisesFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public DecisionPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DecisionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence decisionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = decisionStep.addStep(MtcViewsRepository.Decision.Basic.class);
		basicStep.addStep(MtcViewsRepository.Decision.Basic.name);
		basicStep.addStep(MtcViewsRepository.Decision.Basic.decisionExpression);
		basicStep.addStep(MtcViewsRepository.Decision.Basic.implemenetaionClass);
		basicStep.addStep(MtcViewsRepository.Decision.Basic.choises);
		
		
		composer = new PartComposer(decisionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.Decision.Basic.class) {
					return createBasicGroup(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Decision.Basic.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Decision.Basic.decisionExpression) {
					return createDecisionExpressionText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Decision.Basic.implemenetaionClass) {
					return createImplemenetaionClassText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.Decision.Basic.choises) {
					return createChoisesTableComposition(widgetFactory, parent);
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
		basicSection.setText(MtcMessages.DecisionPropertiesEditionPart_BasicGroupLabel);
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
		createDescription(parent, MtcViewsRepository.Decision.Basic.name, MtcMessages.DecisionPropertiesEditionPart_NameLabel);
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
							DecisionPropertiesEditionPartForm.this,
							MtcViewsRepository.Decision.Basic.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DecisionPropertiesEditionPartForm.this,
									MtcViewsRepository.Decision.Basic.name,
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
									DecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MtcViewsRepository.Decision.Basic.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.Decision.Basic.name, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createDecisionExpressionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.Decision.Basic.decisionExpression, MtcMessages.DecisionPropertiesEditionPart_DecisionExpressionLabel);
		decisionExpression = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		decisionExpression.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData decisionExpressionData = new GridData(GridData.FILL_HORIZONTAL);
		decisionExpression.setLayoutData(decisionExpressionData);
		decisionExpression.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DecisionPropertiesEditionPartForm.this,
							MtcViewsRepository.Decision.Basic.decisionExpression,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decisionExpression.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DecisionPropertiesEditionPartForm.this,
									MtcViewsRepository.Decision.Basic.decisionExpression,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, decisionExpression.getText()));
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
									DecisionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		decisionExpression.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.decisionExpression, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decisionExpression.getText()));
				}
			}
		});
		EditingUtils.setID(decisionExpression, MtcViewsRepository.Decision.Basic.decisionExpression);
		EditingUtils.setEEFtype(decisionExpression, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.Decision.Basic.decisionExpression, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDecisionExpressionText

		// End of user code
		return parent;
	}

	
	protected Composite createImplemenetaionClassText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.Decision.Basic.implemenetaionClass, MtcMessages.DecisionPropertiesEditionPart_ImplemenetaionClassLabel);
		implemenetaionClass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		implemenetaionClass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData implemenetaionClassData = new GridData(GridData.FILL_HORIZONTAL);
		implemenetaionClass.setLayoutData(implemenetaionClassData);
		implemenetaionClass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DecisionPropertiesEditionPartForm.this,
							MtcViewsRepository.Decision.Basic.implemenetaionClass,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implemenetaionClass.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DecisionPropertiesEditionPartForm.this,
									MtcViewsRepository.Decision.Basic.implemenetaionClass,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, implemenetaionClass.getText()));
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
									DecisionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		implemenetaionClass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.implemenetaionClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implemenetaionClass.getText()));
				}
			}
		});
		EditingUtils.setID(implemenetaionClass, MtcViewsRepository.Decision.Basic.implemenetaionClass);
		EditingUtils.setEEFtype(implemenetaionClass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.Decision.Basic.implemenetaionClass, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createImplemenetaionClassText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createChoisesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.choises = new ReferencesTable(getDescription(MtcViewsRepository.Decision.Basic.choises, MtcMessages.DecisionPropertiesEditionPart_ChoisesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.choises, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				choises.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.choises, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				choises.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.choises, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				choises.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.choises, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				choises.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.choisesFilters) {
			this.choises.addFilter(filter);
		}
		this.choises.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.Decision.Basic.choises, MtcViewsRepository.FORM_KIND));
		this.choises.createControls(parent, widgetFactory);
		this.choises.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionPropertiesEditionPartForm.this, MtcViewsRepository.Decision.Basic.choises, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData choisesData = new GridData(GridData.FILL_HORIZONTAL);
		choisesData.horizontalSpan = 3;
		this.choises.setLayoutData(choisesData);
		this.choises.setLowerBound(0);
		this.choises.setUpperBound(-1);
		choises.setID(MtcViewsRepository.Decision.Basic.choises);
		choises.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createChoisesTableComposition

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
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Decision.Basic.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MtcMessages.Decision_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#getDecisionExpression()
	 * 
	 */
	public String getDecisionExpression() {
		return decisionExpression.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#setDecisionExpression(String newValue)
	 * 
	 */
	public void setDecisionExpression(String newValue) {
		if (newValue != null) {
			decisionExpression.setText(newValue);
		} else {
			decisionExpression.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Decision.Basic.decisionExpression);
		if (eefElementEditorReadOnlyState && decisionExpression.isEnabled()) {
			decisionExpression.setEnabled(false);
			decisionExpression.setToolTipText(MtcMessages.Decision_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !decisionExpression.isEnabled()) {
			decisionExpression.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#getImplemenetaionClass()
	 * 
	 */
	public String getImplemenetaionClass() {
		return implemenetaionClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#setImplemenetaionClass(String newValue)
	 * 
	 */
	public void setImplemenetaionClass(String newValue) {
		if (newValue != null) {
			implemenetaionClass.setText(newValue);
		} else {
			implemenetaionClass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Decision.Basic.implemenetaionClass);
		if (eefElementEditorReadOnlyState && implemenetaionClass.isEnabled()) {
			implemenetaionClass.setEnabled(false);
			implemenetaionClass.setToolTipText(MtcMessages.Decision_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !implemenetaionClass.isEnabled()) {
			implemenetaionClass.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#initChoises(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initChoises(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		choises.setContentProvider(contentProvider);
		choises.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Decision.Basic.choises);
		if (eefElementEditorReadOnlyState && choises.isEnabled()) {
			choises.setEnabled(false);
			choises.setToolTipText(MtcMessages.Decision_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !choises.isEnabled()) {
			choises.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#updateChoises()
	 * 
	 */
	public void updateChoises() {
	choises.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#addFilterChoises(ViewerFilter filter)
	 * 
	 */
	public void addFilterToChoises(ViewerFilter filter) {
		choisesFilters.add(filter);
		if (this.choises != null) {
			this.choises.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#addBusinessFilterChoises(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToChoises(ViewerFilter filter) {
		choisesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionPropertiesEditionPart#isContainedInChoisesTable(EObject element)
	 * 
	 */
	public boolean isContainedInChoisesTable(EObject element) {
		return ((ReferencesTableSettings)choises.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.Decision_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
