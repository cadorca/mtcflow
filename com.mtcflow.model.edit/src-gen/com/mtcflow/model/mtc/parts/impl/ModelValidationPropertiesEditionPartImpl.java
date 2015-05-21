/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class ModelValidationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ModelValidationPropertiesEditionPart {

	protected Button stopOnError;
	protected EObjectFlatComboViewer validation;
	protected ReferencesTable models;
	protected List<ViewerFilter> modelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> modelsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ModelValidationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence modelValidationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = modelValidationStep.addStep(MtcViewsRepository.ModelValidation.Basic.class);
		basicStep.addStep(MtcViewsRepository.ModelValidation.Basic.stopOnError);
		basicStep.addStep(MtcViewsRepository.ModelValidation.Basic.validation);
		basicStep.addStep(MtcViewsRepository.ModelValidation.Basic.models);
		
		
		composer = new PartComposer(modelValidationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.ModelValidation.Basic.class) {
					return createBasicGroup(parent);
				}
				if (key == MtcViewsRepository.ModelValidation.Basic.stopOnError) {
					return createStopOnErrorCheckbox(parent);
				}
				if (key == MtcViewsRepository.ModelValidation.Basic.validation) {
					return createValidationFlatComboViewer(parent);
				}
				if (key == MtcViewsRepository.ModelValidation.Basic.models) {
					return createModelsAdvancedReferencesTable(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createBasicGroup(Composite parent) {
		Group basicGroup = new Group(parent, SWT.NONE);
		basicGroup.setText(MtcMessages.ModelValidationPropertiesEditionPart_BasicGroupLabel);
		GridData basicGroupData = new GridData(GridData.FILL_HORIZONTAL);
		basicGroupData.horizontalSpan = 3;
		basicGroup.setLayoutData(basicGroupData);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		return basicGroup;
	}

	
	protected Composite createStopOnErrorCheckbox(Composite parent) {
		stopOnError = new Button(parent, SWT.CHECK);
		stopOnError.setText(getDescription(MtcViewsRepository.ModelValidation.Basic.stopOnError, MtcMessages.ModelValidationPropertiesEditionPart_StopOnErrorLabel));
		stopOnError.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelValidationPropertiesEditionPartImpl.this, MtcViewsRepository.ModelValidation.Basic.stopOnError, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(stopOnError.getSelection())));
			}

		});
		GridData stopOnErrorData = new GridData(GridData.FILL_HORIZONTAL);
		stopOnErrorData.horizontalSpan = 2;
		stopOnError.setLayoutData(stopOnErrorData);
		EditingUtils.setID(stopOnError, MtcViewsRepository.ModelValidation.Basic.stopOnError);
		EditingUtils.setEEFtype(stopOnError, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ModelValidation.Basic.stopOnError, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStopOnErrorCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createValidationFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.ModelValidation.Basic.validation, MtcMessages.ModelValidationPropertiesEditionPart_ValidationLabel);
		validation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.ModelValidation.Basic.validation, MtcViewsRepository.SWT_KIND));
		validation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		validation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelValidationPropertiesEditionPartImpl.this, MtcViewsRepository.ModelValidation.Basic.validation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getValidation()));
			}

		});
		GridData validationData = new GridData(GridData.FILL_HORIZONTAL);
		validation.setLayoutData(validationData);
		validation.setID(MtcViewsRepository.ModelValidation.Basic.validation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.ModelValidation.Basic.validation, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValidationFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createModelsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MtcViewsRepository.ModelValidation.Basic.models, MtcMessages.ModelValidationPropertiesEditionPart_ModelsLabel);		 
		this.models = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addModels(); }
			public void handleEdit(EObject element) { editModels(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveModels(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromModels(element); }
			public void navigateTo(EObject element) { }
		});
		this.models.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.ModelValidation.Basic.models, MtcViewsRepository.SWT_KIND));
		this.models.createControls(parent);
		this.models.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelValidationPropertiesEditionPartImpl.this, MtcViewsRepository.ModelValidation.Basic.models, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData modelsData = new GridData(GridData.FILL_HORIZONTAL);
		modelsData.horizontalSpan = 3;
		this.models.setLayoutData(modelsData);
		this.models.disableMove();
		models.setID(MtcViewsRepository.ModelValidation.Basic.models);
		models.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addModels() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(models.getInput(), modelsFilters, modelsBusinessFilters,
		"models", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelValidationPropertiesEditionPartImpl.this, MtcViewsRepository.ModelValidation.Basic.models,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				models.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveModels(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelValidationPropertiesEditionPartImpl.this, MtcViewsRepository.ModelValidation.Basic.models, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		models.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromModels(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelValidationPropertiesEditionPartImpl.this, MtcViewsRepository.ModelValidation.Basic.models, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		models.refresh();
	}

	/**
	 * 
	 */
	protected void editModels(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				models.refresh();
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
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#getStopOnError()
	 * 
	 */
	public Boolean getStopOnError() {
		return Boolean.valueOf(stopOnError.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#setStopOnError(Boolean newValue)
	 * 
	 */
	public void setStopOnError(Boolean newValue) {
		if (newValue != null) {
			stopOnError.setSelection(newValue.booleanValue());
		} else {
			stopOnError.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ModelValidation.Basic.stopOnError);
		if (eefElementEditorReadOnlyState && stopOnError.isEnabled()) {
			stopOnError.setEnabled(false);
			stopOnError.setToolTipText(MtcMessages.ModelValidation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stopOnError.isEnabled()) {
			stopOnError.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#getValidation()
	 * 
	 */
	public EObject getValidation() {
		if (validation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) validation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#initValidation(EObjectFlatComboSettings)
	 */
	public void initValidation(EObjectFlatComboSettings settings) {
		validation.setInput(settings);
		if (current != null) {
			validation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ModelValidation.Basic.validation);
		if (eefElementEditorReadOnlyState && validation.isEnabled()) {
			validation.setEnabled(false);
			validation.setToolTipText(MtcMessages.ModelValidation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !validation.isEnabled()) {
			validation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#setValidation(EObject newValue)
	 * 
	 */
	public void setValidation(EObject newValue) {
		if (newValue != null) {
			validation.setSelection(new StructuredSelection(newValue));
		} else {
			validation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ModelValidation.Basic.validation);
		if (eefElementEditorReadOnlyState && validation.isEnabled()) {
			validation.setEnabled(false);
			validation.setToolTipText(MtcMessages.ModelValidation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !validation.isEnabled()) {
			validation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#setValidationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setValidationButtonMode(ButtonsModeEnum newValue) {
		validation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#addFilterValidation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValidation(ViewerFilter filter) {
		validation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#addBusinessFilterValidation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValidation(ViewerFilter filter) {
		validation.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#initModels(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initModels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		models.setContentProvider(contentProvider);
		models.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.ModelValidation.Basic.models);
		if (eefElementEditorReadOnlyState && models.getTable().isEnabled()) {
			models.setEnabled(false);
			models.setToolTipText(MtcMessages.ModelValidation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !models.getTable().isEnabled()) {
			models.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#updateModels()
	 * 
	 */
	public void updateModels() {
	models.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#addFilterModels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModels(ViewerFilter filter) {
		modelsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#addBusinessFilterModels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModels(ViewerFilter filter) {
		modelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ModelValidationPropertiesEditionPart#isContainedInModelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInModelsTable(EObject element) {
		return ((ReferencesTableSettings)models.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.ModelValidation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
