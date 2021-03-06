/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class OutputModelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OutputModelPropertiesEditionPart {

	protected Text modelAlias;
	protected Text metamodelAlias;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer model;
	protected EObjectFlatComboViewer transformation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OutputModelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence outputModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = outputModelStep.addStep(MtcViewsRepository.OutputModel.Basic.class);
		basicStep.addStep(MtcViewsRepository.OutputModel.Basic.modelAlias);
		basicStep.addStep(MtcViewsRepository.OutputModel.Basic.metamodelAlias);
		basicStep.addStep(MtcViewsRepository.OutputModel.Basic.properties);
		basicStep.addStep(MtcViewsRepository.OutputModel.Basic.model);
		basicStep.addStep(MtcViewsRepository.OutputModel.Basic.transformation);
		
		
		composer = new PartComposer(outputModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.OutputModel.Basic.class) {
					return createBasicGroup(parent);
				}
				if (key == MtcViewsRepository.OutputModel.Basic.modelAlias) {
					return createModelAliasText(parent);
				}
				if (key == MtcViewsRepository.OutputModel.Basic.metamodelAlias) {
					return createMetamodelAliasText(parent);
				}
				if (key == MtcViewsRepository.OutputModel.Basic.properties) {
					return createPropertiesAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.OutputModel.Basic.model) {
					return createModelFlatComboViewer(parent);
				}
				if (key == MtcViewsRepository.OutputModel.Basic.transformation) {
					return createTransformationFlatComboViewer(parent);
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
		basicGroup.setText(MtcMessages.OutputModelPropertiesEditionPart_BasicGroupLabel);
		GridData basicGroupData = new GridData(GridData.FILL_HORIZONTAL);
		basicGroupData.horizontalSpan = 3;
		basicGroup.setLayoutData(basicGroupData);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		return basicGroup;
	}

	
	protected Composite createModelAliasText(Composite parent) {
		createDescription(parent, MtcViewsRepository.OutputModel.Basic.modelAlias, MtcMessages.OutputModelPropertiesEditionPart_ModelAliasLabel);
		modelAlias = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData modelAliasData = new GridData(GridData.FILL_HORIZONTAL);
		modelAlias.setLayoutData(modelAliasData);
		modelAlias.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.modelAlias, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, modelAlias.getText()));
			}

		});
		modelAlias.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.modelAlias, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, modelAlias.getText()));
				}
			}

		});
		EditingUtils.setID(modelAlias, MtcViewsRepository.OutputModel.Basic.modelAlias);
		EditingUtils.setEEFtype(modelAlias, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.OutputModel.Basic.modelAlias, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createModelAliasText

		// End of user code
		return parent;
	}

	
	protected Composite createMetamodelAliasText(Composite parent) {
		createDescription(parent, MtcViewsRepository.OutputModel.Basic.metamodelAlias, MtcMessages.OutputModelPropertiesEditionPart_MetamodelAliasLabel);
		metamodelAlias = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData metamodelAliasData = new GridData(GridData.FILL_HORIZONTAL);
		metamodelAlias.setLayoutData(metamodelAliasData);
		metamodelAlias.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.metamodelAlias, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, metamodelAlias.getText()));
			}

		});
		metamodelAlias.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.metamodelAlias, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, metamodelAlias.getText()));
				}
			}

		});
		EditingUtils.setID(metamodelAlias, MtcViewsRepository.OutputModel.Basic.metamodelAlias);
		EditingUtils.setEEFtype(metamodelAlias, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.OutputModel.Basic.metamodelAlias, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMetamodelAliasText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesAdvancedTableComposition(Composite parent) {
		this.properties = new ReferencesTable(getDescription(MtcViewsRepository.OutputModel.Basic.properties, MtcMessages.OutputModelPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.OutputModel.Basic.properties, MtcViewsRepository.SWT_KIND));
		this.properties.createControls(parent);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.properties, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(MtcViewsRepository.OutputModel.Basic.properties);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPropertiesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createModelFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.OutputModel.Basic.model, MtcMessages.OutputModelPropertiesEditionPart_ModelLabel);
		model = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.OutputModel.Basic.model, MtcViewsRepository.SWT_KIND));
		model.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		model.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.model, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getModel()));
			}

		});
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.setID(MtcViewsRepository.OutputModel.Basic.model);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.OutputModel.Basic.model, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createModelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTransformationFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.OutputModel.Basic.transformation, MtcMessages.OutputModelPropertiesEditionPart_TransformationLabel);
		transformation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.OutputModel.Basic.transformation, MtcViewsRepository.SWT_KIND));
		transformation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		transformation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OutputModelPropertiesEditionPartImpl.this, MtcViewsRepository.OutputModel.Basic.transformation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTransformation()));
			}

		});
		GridData transformationData = new GridData(GridData.FILL_HORIZONTAL);
		transformation.setLayoutData(transformationData);
		transformation.setID(MtcViewsRepository.OutputModel.Basic.transformation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.OutputModel.Basic.transformation, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransformationFlatComboViewer

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
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#getModelAlias()
	 * 
	 */
	public String getModelAlias() {
		return modelAlias.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#setModelAlias(String newValue)
	 * 
	 */
	public void setModelAlias(String newValue) {
		if (newValue != null) {
			modelAlias.setText(newValue);
		} else {
			modelAlias.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.OutputModel.Basic.modelAlias);
		if (eefElementEditorReadOnlyState && modelAlias.isEnabled()) {
			modelAlias.setEnabled(false);
			modelAlias.setToolTipText(MtcMessages.OutputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modelAlias.isEnabled()) {
			modelAlias.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#getMetamodelAlias()
	 * 
	 */
	public String getMetamodelAlias() {
		return metamodelAlias.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#setMetamodelAlias(String newValue)
	 * 
	 */
	public void setMetamodelAlias(String newValue) {
		if (newValue != null) {
			metamodelAlias.setText(newValue);
		} else {
			metamodelAlias.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.OutputModel.Basic.metamodelAlias);
		if (eefElementEditorReadOnlyState && metamodelAlias.isEnabled()) {
			metamodelAlias.setEnabled(false);
			metamodelAlias.setToolTipText(MtcMessages.OutputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metamodelAlias.isEnabled()) {
			metamodelAlias.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.OutputModel.Basic.properties);
		if (eefElementEditorReadOnlyState && properties.isEnabled()) {
			properties.setEnabled(false);
			properties.setToolTipText(MtcMessages.OutputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !properties.isEnabled()) {
			properties.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
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
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#getModel()
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
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#initModel(EObjectFlatComboSettings)
	 */
	public void initModel(EObjectFlatComboSettings settings) {
		model.setInput(settings);
		if (current != null) {
			model.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.OutputModel.Basic.model);
		if (eefElementEditorReadOnlyState && model.isEnabled()) {
			model.setEnabled(false);
			model.setToolTipText(MtcMessages.OutputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !model.isEnabled()) {
			model.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#setModel(EObject newValue)
	 * 
	 */
	public void setModel(EObject newValue) {
		if (newValue != null) {
			model.setSelection(new StructuredSelection(newValue));
		} else {
			model.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.OutputModel.Basic.model);
		if (eefElementEditorReadOnlyState && model.isEnabled()) {
			model.setEnabled(false);
			model.setToolTipText(MtcMessages.OutputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !model.isEnabled()) {
			model.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#setModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setModelButtonMode(ButtonsModeEnum newValue) {
		model.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#addFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter) {
		model.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#addBusinessFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter) {
		model.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#getTransformation()
	 * 
	 */
	public EObject getTransformation() {
		if (transformation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) transformation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#initTransformation(EObjectFlatComboSettings)
	 */
	public void initTransformation(EObjectFlatComboSettings settings) {
		transformation.setInput(settings);
		if (current != null) {
			transformation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.OutputModel.Basic.transformation);
		if (eefElementEditorReadOnlyState && transformation.isEnabled()) {
			transformation.setEnabled(false);
			transformation.setToolTipText(MtcMessages.OutputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transformation.isEnabled()) {
			transformation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#setTransformation(EObject newValue)
	 * 
	 */
	public void setTransformation(EObject newValue) {
		if (newValue != null) {
			transformation.setSelection(new StructuredSelection(newValue));
		} else {
			transformation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.OutputModel.Basic.transformation);
		if (eefElementEditorReadOnlyState && transformation.isEnabled()) {
			transformation.setEnabled(false);
			transformation.setToolTipText(MtcMessages.OutputModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transformation.isEnabled()) {
			transformation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#setTransformationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTransformationButtonMode(ButtonsModeEnum newValue) {
		transformation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#addFilterTransformation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTransformation(ViewerFilter filter) {
		transformation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.OutputModelPropertiesEditionPart#addBusinessFilterTransformation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTransformation(ViewerFilter filter) {
		transformation.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.OutputModel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
