/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

import com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class DecisionInputModelPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DecisionInputModelPropertiesEditionPart {

	protected Button loadForDecisionEvaluation;
	protected Text modelAlias;
	protected Text metamodelAlias;
	protected EObjectFlatComboViewer model;
	protected EObjectFlatComboViewer decision;
	protected ReferencesTable choisesToApply;
	protected List<ViewerFilter> choisesToApplyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> choisesToApplyFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public DecisionInputModelPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DecisionInputModelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence decisionInputModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = decisionInputModelStep.addStep(MtcViewsRepository.DecisionInputModel.Basic.class);
		basicStep.addStep(MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation);
		basicStep.addStep(MtcViewsRepository.DecisionInputModel.Basic.modelAlias);
		basicStep.addStep(MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias);
		basicStep.addStep(MtcViewsRepository.DecisionInputModel.Basic.model);
		basicStep.addStep(MtcViewsRepository.DecisionInputModel.Basic.decision);
		basicStep.addStep(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply);
		
		
		composer = new PartComposer(decisionInputModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.DecisionInputModel.Basic.class) {
					return createBasicGroup(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation) {
					return createLoadForDecisionEvaluationCheckbox(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.DecisionInputModel.Basic.modelAlias) {
					return createModelAliasText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias) {
					return createMetamodelAliasText(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.DecisionInputModel.Basic.model) {
					return createModelFlatComboViewer(parent, widgetFactory);
				}
				if (key == MtcViewsRepository.DecisionInputModel.Basic.decision) {
					return createDecisionFlatComboViewer(parent, widgetFactory);
				}
				if (key == MtcViewsRepository.DecisionInputModel.Basic.choisesToApply) {
					return createChoisesToApplyReferencesTable(widgetFactory, parent);
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
		basicSection.setText(MtcMessages.DecisionInputModelPropertiesEditionPart_BasicGroupLabel);
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

	
	protected Composite createLoadForDecisionEvaluationCheckbox(FormToolkit widgetFactory, Composite parent) {
		loadForDecisionEvaluation = widgetFactory.createButton(parent, getDescription(MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation, MtcMessages.DecisionInputModelPropertiesEditionPart_LoadForDecisionEvaluationLabel), SWT.CHECK);
		loadForDecisionEvaluation.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(loadForDecisionEvaluation.getSelection())));
			}

		});
		GridData loadForDecisionEvaluationData = new GridData(GridData.FILL_HORIZONTAL);
		loadForDecisionEvaluationData.horizontalSpan = 2;
		loadForDecisionEvaluation.setLayoutData(loadForDecisionEvaluationData);
		EditingUtils.setID(loadForDecisionEvaluation, MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation);
		EditingUtils.setEEFtype(loadForDecisionEvaluation, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLoadForDecisionEvaluationCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createModelAliasText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.DecisionInputModel.Basic.modelAlias, MtcMessages.DecisionInputModelPropertiesEditionPart_ModelAliasLabel);
		modelAlias = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		modelAlias.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData modelAliasData = new GridData(GridData.FILL_HORIZONTAL);
		modelAlias.setLayoutData(modelAliasData);
		modelAlias.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DecisionInputModelPropertiesEditionPartForm.this,
							MtcViewsRepository.DecisionInputModel.Basic.modelAlias,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, modelAlias.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DecisionInputModelPropertiesEditionPartForm.this,
									MtcViewsRepository.DecisionInputModel.Basic.modelAlias,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, modelAlias.getText()));
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
									DecisionInputModelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		modelAlias.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.modelAlias, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, modelAlias.getText()));
				}
			}
		});
		EditingUtils.setID(modelAlias, MtcViewsRepository.DecisionInputModel.Basic.modelAlias);
		EditingUtils.setEEFtype(modelAlias, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.DecisionInputModel.Basic.modelAlias, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createModelAliasText

		// End of user code
		return parent;
	}

	
	protected Composite createMetamodelAliasText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias, MtcMessages.DecisionInputModelPropertiesEditionPart_MetamodelAliasLabel);
		metamodelAlias = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		metamodelAlias.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData metamodelAliasData = new GridData(GridData.FILL_HORIZONTAL);
		metamodelAlias.setLayoutData(metamodelAliasData);
		metamodelAlias.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DecisionInputModelPropertiesEditionPartForm.this,
							MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, metamodelAlias.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DecisionInputModelPropertiesEditionPartForm.this,
									MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, metamodelAlias.getText()));
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
									DecisionInputModelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		metamodelAlias.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, metamodelAlias.getText()));
				}
			}
		});
		EditingUtils.setID(metamodelAlias, MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias);
		EditingUtils.setEEFtype(metamodelAlias, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMetamodelAliasText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createModelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, MtcViewsRepository.DecisionInputModel.Basic.model, MtcMessages.DecisionInputModelPropertiesEditionPart_ModelLabel);
		model = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.DecisionInputModel.Basic.model, MtcViewsRepository.FORM_KIND));
		widgetFactory.adapt(model);
		model.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getModel()));
			}

		});
		model.setID(MtcViewsRepository.DecisionInputModel.Basic.model);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.DecisionInputModel.Basic.model, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createModelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDecisionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, MtcViewsRepository.DecisionInputModel.Basic.decision, MtcMessages.DecisionInputModelPropertiesEditionPart_DecisionLabel);
		decision = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.DecisionInputModel.Basic.decision, MtcViewsRepository.FORM_KIND));
		widgetFactory.adapt(decision);
		decision.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData decisionData = new GridData(GridData.FILL_HORIZONTAL);
		decision.setLayoutData(decisionData);
		decision.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.decision, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDecision()));
			}

		});
		decision.setID(MtcViewsRepository.DecisionInputModel.Basic.decision);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.DecisionInputModel.Basic.decision, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDecisionFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createChoisesToApplyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.choisesToApply = new ReferencesTable(getDescription(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply, MtcMessages.DecisionInputModelPropertiesEditionPart_ChoisesToApplyLabel), new ReferencesTableListener	() {
			public void handleAdd() { addChoisesToApply(); }
			public void handleEdit(EObject element) { editChoisesToApply(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveChoisesToApply(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromChoisesToApply(element); }
			public void navigateTo(EObject element) { }
		});
		this.choisesToApply.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply, MtcViewsRepository.FORM_KIND));
		this.choisesToApply.createControls(parent, widgetFactory);
		this.choisesToApply.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.choisesToApply, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData choisesToApplyData = new GridData(GridData.FILL_HORIZONTAL);
		choisesToApplyData.horizontalSpan = 3;
		this.choisesToApply.setLayoutData(choisesToApplyData);
		this.choisesToApply.disableMove();
		choisesToApply.setID(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply);
		choisesToApply.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createChoisesToApplyReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addChoisesToApply() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(choisesToApply.getInput(), choisesToApplyFilters, choisesToApplyBusinessFilters,
		"choisesToApply", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.choisesToApply,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				choisesToApply.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveChoisesToApply(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.choisesToApply, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		choisesToApply.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromChoisesToApply(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionInputModelPropertiesEditionPartForm.this, MtcViewsRepository.DecisionInputModel.Basic.choisesToApply, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		choisesToApply.refresh();
	}

	/**
	 * 
	 */
	protected void editChoisesToApply(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				choisesToApply.refresh();
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
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#getLoadForDecisionEvaluation()
	 * 
	 */
	public Boolean getLoadForDecisionEvaluation() {
		return Boolean.valueOf(loadForDecisionEvaluation.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#setLoadForDecisionEvaluation(Boolean newValue)
	 * 
	 */
	public void setLoadForDecisionEvaluation(Boolean newValue) {
		if (newValue != null) {
			loadForDecisionEvaluation.setSelection(newValue.booleanValue());
		} else {
			loadForDecisionEvaluation.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.loadForDecisionEvaluation);
		if (eefElementEditorReadOnlyState && loadForDecisionEvaluation.isEnabled()) {
			loadForDecisionEvaluation.setEnabled(false);
			loadForDecisionEvaluation.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !loadForDecisionEvaluation.isEnabled()) {
			loadForDecisionEvaluation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#getModelAlias()
	 * 
	 */
	public String getModelAlias() {
		return modelAlias.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#setModelAlias(String newValue)
	 * 
	 */
	public void setModelAlias(String newValue) {
		if (newValue != null) {
			modelAlias.setText(newValue);
		} else {
			modelAlias.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.modelAlias);
		if (eefElementEditorReadOnlyState && modelAlias.isEnabled()) {
			modelAlias.setEnabled(false);
			modelAlias.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modelAlias.isEnabled()) {
			modelAlias.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#getMetamodelAlias()
	 * 
	 */
	public String getMetamodelAlias() {
		return metamodelAlias.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#setMetamodelAlias(String newValue)
	 * 
	 */
	public void setMetamodelAlias(String newValue) {
		if (newValue != null) {
			metamodelAlias.setText(newValue);
		} else {
			metamodelAlias.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.metamodelAlias);
		if (eefElementEditorReadOnlyState && metamodelAlias.isEnabled()) {
			metamodelAlias.setEnabled(false);
			metamodelAlias.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metamodelAlias.isEnabled()) {
			metamodelAlias.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#getModel()
	 * 
	 */
	public EObject getModel() {
		if (model.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) model.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#initModel(EObjectFlatComboSettings)
	 */
	public void initModel(EObjectFlatComboSettings settings) {
		model.setInput(settings);
		if (current != null) {
			model.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.model);
		if (eefElementEditorReadOnlyState && model.isEnabled()) {
			model.setEnabled(false);
			model.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !model.isEnabled()) {
			model.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#setModel(EObject newValue)
	 * 
	 */
	public void setModel(EObject newValue) {
		if (newValue != null) {
			model.setSelection(new StructuredSelection(newValue));
		} else {
			model.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.model);
		if (eefElementEditorReadOnlyState && model.isEnabled()) {
			model.setEnabled(false);
			model.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !model.isEnabled()) {
			model.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#setModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setModelButtonMode(ButtonsModeEnum newValue) {
		model.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#addFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter) {
		model.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#addBusinessFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter) {
		model.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#getDecision()
	 * 
	 */
	public EObject getDecision() {
		if (decision.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decision.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#initDecision(EObjectFlatComboSettings)
	 */
	public void initDecision(EObjectFlatComboSettings settings) {
		decision.setInput(settings);
		if (current != null) {
			decision.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.decision);
		if (eefElementEditorReadOnlyState && decision.isEnabled()) {
			decision.setEnabled(false);
			decision.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !decision.isEnabled()) {
			decision.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#setDecision(EObject newValue)
	 * 
	 */
	public void setDecision(EObject newValue) {
		if (newValue != null) {
			decision.setSelection(new StructuredSelection(newValue));
		} else {
			decision.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.decision);
		if (eefElementEditorReadOnlyState && decision.isEnabled()) {
			decision.setEnabled(false);
			decision.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !decision.isEnabled()) {
			decision.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#setDecisionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecisionButtonMode(ButtonsModeEnum newValue) {
		decision.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#addFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecision(ViewerFilter filter) {
		decision.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#addBusinessFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecision(ViewerFilter filter) {
		decision.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#initChoisesToApply(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initChoisesToApply(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		choisesToApply.setContentProvider(contentProvider);
		choisesToApply.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.DecisionInputModel.Basic.choisesToApply);
		if (eefElementEditorReadOnlyState && choisesToApply.getTable().isEnabled()) {
			choisesToApply.setEnabled(false);
			choisesToApply.setToolTipText(MtcMessages.DecisionInputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !choisesToApply.getTable().isEnabled()) {
			choisesToApply.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#updateChoisesToApply()
	 * 
	 */
	public void updateChoisesToApply() {
	choisesToApply.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#addFilterChoisesToApply(ViewerFilter filter)
	 * 
	 */
	public void addFilterToChoisesToApply(ViewerFilter filter) {
		choisesToApplyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#addBusinessFilterChoisesToApply(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToChoisesToApply(ViewerFilter filter) {
		choisesToApplyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.DecisionInputModelPropertiesEditionPart#isContainedInChoisesToApplyTable(EObject element)
	 * 
	 */
	public boolean isContainedInChoisesToApplyTable(EObject element) {
		return ((ReferencesTableSettings)choisesToApply.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.DecisionInputModel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
