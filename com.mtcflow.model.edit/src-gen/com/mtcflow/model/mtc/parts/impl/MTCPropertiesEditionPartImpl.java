/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class MTCPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MTCPropertiesEditionPart {

	protected Button validateConformance;
	protected Text name;
	protected Text version;
	protected Text m2MTechnology;
	protected Text m2TTechnology;
	protected Text hOTechnology;
	protected Text description;
	protected Text metamodelsFolder;
	protected Text modelsFolder;
	protected Text m2MTransformationsFolder;
	protected Text m2TTransformationsFolder;
	protected Text hOTransformationsFolder;
	protected Text librariesFolder;
	protected Text validationsFolder;
	protected Text workspace;
	protected ReferencesTable metamodels;
	protected List<ViewerFilter> metamodelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> metamodelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable models;
	protected List<ViewerFilter> modelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> modelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable referencedResources;
	protected List<ViewerFilter> referencedResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencedResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable transformations;
	protected List<ViewerFilter> transformationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> transformationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable files;
	protected List<ViewerFilter> filesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> filesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable inputModels;
	protected List<ViewerFilter> inputModelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inputModelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable validations;
	protected List<ViewerFilter> validationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> validationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outputModels;
	protected List<ViewerFilter> outputModelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputModelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable inputFiles;
	protected List<ViewerFilter> inputFilesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inputFilesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outputFiles;
	protected List<ViewerFilter> outputFilesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputFilesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable modelValidations;
	protected List<ViewerFilter> modelValidationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> modelValidationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable decisions;
	protected List<ViewerFilter> decisionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> decisionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable decisionInputModels;
	protected List<ViewerFilter> decisionInputModelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> decisionInputModelsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MTCPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence mTC_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = mTC_Step.addStep(MtcViewsRepository.MTC_.Basic.class);
		basicStep.addStep(MtcViewsRepository.MTC_.Basic.validateConformance);
		basicStep.addStep(MtcViewsRepository.MTC_.Basic.name);
		basicStep.addStep(MtcViewsRepository.MTC_.Basic.version);
		basicStep.addStep(MtcViewsRepository.MTC_.Basic.m2MTechnology);
		basicStep.addStep(MtcViewsRepository.MTC_.Basic.m2TTechnology);
		basicStep.addStep(MtcViewsRepository.MTC_.Basic.hOTechnology);
		basicStep.addStep(MtcViewsRepository.MTC_.Basic.description);
		
		CompositionStep locationsStep = mTC_Step.addStep(MtcViewsRepository.MTC_.Locations.class);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.metamodelsFolder);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.modelsFolder);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.hOTransformationsFolder);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.librariesFolder);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.validationsFolder);
		locationsStep.addStep(MtcViewsRepository.MTC_.Locations.workspace);
		
		CompositionStep elementsStep = mTC_Step.addStep(MtcViewsRepository.MTC_.Elements.class);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.metamodels);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.models);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.referencedResources);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.transformations);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.files);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.inputModels);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.validations);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.outputModels);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.inputFiles);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.outputFiles);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.modelValidations);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.decisions);
		elementsStep.addStep(MtcViewsRepository.MTC_.Elements.decisionInputModels);
		
		
		composer = new PartComposer(mTC_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.MTC_.Basic.class) {
					return createBasicGroup(parent);
				}
				if (key == MtcViewsRepository.MTC_.Basic.validateConformance) {
					return createValidateConformanceCheckbox(parent);
				}
				if (key == MtcViewsRepository.MTC_.Basic.name) {
					return createNameText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Basic.version) {
					return createVersionText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Basic.m2MTechnology) {
					return createM2MTechnologyText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Basic.m2TTechnology) {
					return createM2TTechnologyText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Basic.hOTechnology) {
					return createHOTechnologyText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Basic.description) {
					return createDescriptionText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.class) {
					return createLocationsGroup(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.metamodelsFolder) {
					return createMetamodelsFolderText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.modelsFolder) {
					return createModelsFolderText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder) {
					return createM2MTransformationsFolderText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder) {
					return createM2TTransformationsFolderText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.hOTransformationsFolder) {
					return createHOTransformationsFolderText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.librariesFolder) {
					return createLibrariesFolderText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.validationsFolder) {
					return createValidationsFolderText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Locations.workspace) {
					return createWorkspaceText(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.class) {
					return createElementsGroup(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.metamodels) {
					return createMetamodelsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.models) {
					return createModelsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.referencedResources) {
					return createReferencedResourcesAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.transformations) {
					return createTransformationsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.files) {
					return createFilesAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.inputModels) {
					return createInputModelsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.validations) {
					return createValidationsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.outputModels) {
					return createOutputModelsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.inputFiles) {
					return createInputFilesAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.outputFiles) {
					return createOutputFilesAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.modelValidations) {
					return createModelValidationsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.decisions) {
					return createDecisionsAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTC_.Elements.decisionInputModels) {
					return createDecisionInputModelsAdvancedTableComposition(parent);
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
		basicGroup.setText(MtcMessages.MTCPropertiesEditionPart_BasicGroupLabel);
		GridData basicGroupData = new GridData(GridData.FILL_HORIZONTAL);
		basicGroupData.horizontalSpan = 3;
		basicGroup.setLayoutData(basicGroupData);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		return basicGroup;
	}

	
	protected Composite createValidateConformanceCheckbox(Composite parent) {
		validateConformance = new Button(parent, SWT.CHECK);
		validateConformance.setText(getDescription(MtcViewsRepository.MTC_.Basic.validateConformance, MtcMessages.MTCPropertiesEditionPart_ValidateConformanceLabel));
		validateConformance.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.validateConformance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(validateConformance.getSelection())));
			}

		});
		GridData validateConformanceData = new GridData(GridData.FILL_HORIZONTAL);
		validateConformanceData.horizontalSpan = 2;
		validateConformance.setLayoutData(validateConformanceData);
		EditingUtils.setID(validateConformance, MtcViewsRepository.MTC_.Basic.validateConformance);
		EditingUtils.setEEFtype(validateConformance, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Basic.validateConformance, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValidateConformanceCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Basic.name, MtcMessages.MTCPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MtcViewsRepository.MTC_.Basic.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Basic.name, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Basic.version, MtcMessages.MTCPropertiesEditionPart_VersionLabel);
		version = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, MtcViewsRepository.MTC_.Basic.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Basic.version, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createM2MTechnologyText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Basic.m2MTechnology, MtcMessages.MTCPropertiesEditionPart_M2MTechnologyLabel);
		m2MTechnology = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData m2MTechnologyData = new GridData(GridData.FILL_HORIZONTAL);
		m2MTechnology.setLayoutData(m2MTechnologyData);
		m2MTechnology.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.m2MTechnology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2MTechnology.getText()));
			}

		});
		m2MTechnology.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.m2MTechnology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2MTechnology.getText()));
				}
			}

		});
		EditingUtils.setID(m2MTechnology, MtcViewsRepository.MTC_.Basic.m2MTechnology);
		EditingUtils.setEEFtype(m2MTechnology, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Basic.m2MTechnology, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createM2MTechnologyText

		// End of user code
		return parent;
	}

	
	protected Composite createM2TTechnologyText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Basic.m2TTechnology, MtcMessages.MTCPropertiesEditionPart_M2TTechnologyLabel);
		m2TTechnology = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData m2TTechnologyData = new GridData(GridData.FILL_HORIZONTAL);
		m2TTechnology.setLayoutData(m2TTechnologyData);
		m2TTechnology.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.m2TTechnology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2TTechnology.getText()));
			}

		});
		m2TTechnology.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.m2TTechnology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2TTechnology.getText()));
				}
			}

		});
		EditingUtils.setID(m2TTechnology, MtcViewsRepository.MTC_.Basic.m2TTechnology);
		EditingUtils.setEEFtype(m2TTechnology, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Basic.m2TTechnology, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createM2TTechnologyText

		// End of user code
		return parent;
	}

	
	protected Composite createHOTechnologyText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Basic.hOTechnology, MtcMessages.MTCPropertiesEditionPart_HOTechnologyLabel);
		hOTechnology = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData hOTechnologyData = new GridData(GridData.FILL_HORIZONTAL);
		hOTechnology.setLayoutData(hOTechnologyData);
		hOTechnology.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.hOTechnology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hOTechnology.getText()));
			}

		});
		hOTechnology.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.hOTechnology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hOTechnology.getText()));
				}
			}

		});
		EditingUtils.setID(hOTechnology, MtcViewsRepository.MTC_.Basic.hOTechnology);
		EditingUtils.setEEFtype(hOTechnology, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Basic.hOTechnology, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createHOTechnologyText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Basic.description, MtcMessages.MTCPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Basic.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, MtcViewsRepository.MTC_.Basic.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Basic.description, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLocationsGroup(Composite parent) {
		Group locationsGroup = new Group(parent, SWT.NONE);
		locationsGroup.setText(MtcMessages.MTCPropertiesEditionPart_LocationsGroupLabel);
		GridData locationsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		locationsGroupData.horizontalSpan = 3;
		locationsGroup.setLayoutData(locationsGroupData);
		GridLayout locationsGroupLayout = new GridLayout();
		locationsGroupLayout.numColumns = 3;
		locationsGroup.setLayout(locationsGroupLayout);
		return locationsGroup;
	}

	
	protected Composite createMetamodelsFolderText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.metamodelsFolder, MtcMessages.MTCPropertiesEditionPart_MetamodelsFolderLabel);
		metamodelsFolder = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData metamodelsFolderData = new GridData(GridData.FILL_HORIZONTAL);
		metamodelsFolder.setLayoutData(metamodelsFolderData);
		metamodelsFolder.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.metamodelsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, metamodelsFolder.getText()));
			}

		});
		metamodelsFolder.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.metamodelsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, metamodelsFolder.getText()));
				}
			}

		});
		EditingUtils.setID(metamodelsFolder, MtcViewsRepository.MTC_.Locations.metamodelsFolder);
		EditingUtils.setEEFtype(metamodelsFolder, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.metamodelsFolder, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMetamodelsFolderText

		// End of user code
		return parent;
	}

	
	protected Composite createModelsFolderText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.modelsFolder, MtcMessages.MTCPropertiesEditionPart_ModelsFolderLabel);
		modelsFolder = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData modelsFolderData = new GridData(GridData.FILL_HORIZONTAL);
		modelsFolder.setLayoutData(modelsFolderData);
		modelsFolder.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.modelsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, modelsFolder.getText()));
			}

		});
		modelsFolder.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.modelsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, modelsFolder.getText()));
				}
			}

		});
		EditingUtils.setID(modelsFolder, MtcViewsRepository.MTC_.Locations.modelsFolder);
		EditingUtils.setEEFtype(modelsFolder, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.modelsFolder, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createModelsFolderText

		// End of user code
		return parent;
	}

	
	protected Composite createM2MTransformationsFolderText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder, MtcMessages.MTCPropertiesEditionPart_M2MTransformationsFolderLabel);
		m2MTransformationsFolder = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData m2MTransformationsFolderData = new GridData(GridData.FILL_HORIZONTAL);
		m2MTransformationsFolder.setLayoutData(m2MTransformationsFolderData);
		m2MTransformationsFolder.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2MTransformationsFolder.getText()));
			}

		});
		m2MTransformationsFolder.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2MTransformationsFolder.getText()));
				}
			}

		});
		EditingUtils.setID(m2MTransformationsFolder, MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder);
		EditingUtils.setEEFtype(m2MTransformationsFolder, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createM2MTransformationsFolderText

		// End of user code
		return parent;
	}

	
	protected Composite createM2TTransformationsFolderText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder, MtcMessages.MTCPropertiesEditionPart_M2TTransformationsFolderLabel);
		m2TTransformationsFolder = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData m2TTransformationsFolderData = new GridData(GridData.FILL_HORIZONTAL);
		m2TTransformationsFolder.setLayoutData(m2TTransformationsFolderData);
		m2TTransformationsFolder.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2TTransformationsFolder.getText()));
			}

		});
		m2TTransformationsFolder.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, m2TTransformationsFolder.getText()));
				}
			}

		});
		EditingUtils.setID(m2TTransformationsFolder, MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder);
		EditingUtils.setEEFtype(m2TTransformationsFolder, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createM2TTransformationsFolderText

		// End of user code
		return parent;
	}

	
	protected Composite createHOTransformationsFolderText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.hOTransformationsFolder, MtcMessages.MTCPropertiesEditionPart_HOTransformationsFolderLabel);
		hOTransformationsFolder = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData hOTransformationsFolderData = new GridData(GridData.FILL_HORIZONTAL);
		hOTransformationsFolder.setLayoutData(hOTransformationsFolderData);
		hOTransformationsFolder.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.hOTransformationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hOTransformationsFolder.getText()));
			}

		});
		hOTransformationsFolder.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.hOTransformationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hOTransformationsFolder.getText()));
				}
			}

		});
		EditingUtils.setID(hOTransformationsFolder, MtcViewsRepository.MTC_.Locations.hOTransformationsFolder);
		EditingUtils.setEEFtype(hOTransformationsFolder, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.hOTransformationsFolder, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createHOTransformationsFolderText

		// End of user code
		return parent;
	}

	
	protected Composite createLibrariesFolderText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.librariesFolder, MtcMessages.MTCPropertiesEditionPart_LibrariesFolderLabel);
		librariesFolder = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData librariesFolderData = new GridData(GridData.FILL_HORIZONTAL);
		librariesFolder.setLayoutData(librariesFolderData);
		librariesFolder.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.librariesFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, librariesFolder.getText()));
			}

		});
		librariesFolder.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.librariesFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, librariesFolder.getText()));
				}
			}

		});
		EditingUtils.setID(librariesFolder, MtcViewsRepository.MTC_.Locations.librariesFolder);
		EditingUtils.setEEFtype(librariesFolder, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.librariesFolder, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLibrariesFolderText

		// End of user code
		return parent;
	}

	
	protected Composite createValidationsFolderText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.validationsFolder, MtcMessages.MTCPropertiesEditionPart_ValidationsFolderLabel);
		validationsFolder = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData validationsFolderData = new GridData(GridData.FILL_HORIZONTAL);
		validationsFolder.setLayoutData(validationsFolderData);
		validationsFolder.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.validationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, validationsFolder.getText()));
			}

		});
		validationsFolder.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.validationsFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, validationsFolder.getText()));
				}
			}

		});
		EditingUtils.setID(validationsFolder, MtcViewsRepository.MTC_.Locations.validationsFolder);
		EditingUtils.setEEFtype(validationsFolder, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.validationsFolder, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValidationsFolderText

		// End of user code
		return parent;
	}

	
	protected Composite createWorkspaceText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTC_.Locations.workspace, MtcMessages.MTCPropertiesEditionPart_WorkspaceLabel);
		workspace = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData workspaceData = new GridData(GridData.FILL_HORIZONTAL);
		workspace.setLayoutData(workspaceData);
		workspace.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.workspace, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, workspace.getText()));
			}

		});
		workspace.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Locations.workspace, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, workspace.getText()));
				}
			}

		});
		EditingUtils.setID(workspace, MtcViewsRepository.MTC_.Locations.workspace);
		EditingUtils.setEEFtype(workspace, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Locations.workspace, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWorkspaceText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createElementsGroup(Composite parent) {
		Group elementsGroup = new Group(parent, SWT.NONE);
		elementsGroup.setText(MtcMessages.MTCPropertiesEditionPart_ElementsGroupLabel);
		GridData elementsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		elementsGroupData.horizontalSpan = 3;
		elementsGroup.setLayoutData(elementsGroupData);
		GridLayout elementsGroupLayout = new GridLayout();
		elementsGroupLayout.numColumns = 3;
		elementsGroup.setLayout(elementsGroupLayout);
		return elementsGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMetamodelsAdvancedTableComposition(Composite parent) {
		this.metamodels = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.metamodels, MtcMessages.MTCPropertiesEditionPart_MetamodelsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.metamodels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				metamodels.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.metamodels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				metamodels.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.metamodels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				metamodels.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.metamodels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				metamodels.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.metamodelsFilters) {
			this.metamodels.addFilter(filter);
		}
		this.metamodels.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.metamodels, MtcViewsRepository.SWT_KIND));
		this.metamodels.createControls(parent);
		this.metamodels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.metamodels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metamodelsData = new GridData(GridData.FILL_HORIZONTAL);
		metamodelsData.horizontalSpan = 3;
		this.metamodels.setLayoutData(metamodelsData);
		this.metamodels.setLowerBound(0);
		this.metamodels.setUpperBound(-1);
		metamodels.setID(MtcViewsRepository.MTC_.Elements.metamodels);
		metamodels.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createMetamodelsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createModelsAdvancedTableComposition(Composite parent) {
		this.models = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.models, MtcMessages.MTCPropertiesEditionPart_ModelsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.models, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				models.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.models, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				models.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.models, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				models.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.models, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				models.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.modelsFilters) {
			this.models.addFilter(filter);
		}
		this.models.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.models, MtcViewsRepository.SWT_KIND));
		this.models.createControls(parent);
		this.models.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.models, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData modelsData = new GridData(GridData.FILL_HORIZONTAL);
		modelsData.horizontalSpan = 3;
		this.models.setLayoutData(modelsData);
		this.models.setLowerBound(0);
		this.models.setUpperBound(-1);
		models.setID(MtcViewsRepository.MTC_.Elements.models);
		models.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createModelsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createReferencedResourcesAdvancedTableComposition(Composite parent) {
		this.referencedResources = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.referencedResources, MtcMessages.MTCPropertiesEditionPart_ReferencedResourcesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				referencedResources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				referencedResources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				referencedResources.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				referencedResources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.referencedResourcesFilters) {
			this.referencedResources.addFilter(filter);
		}
		this.referencedResources.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.referencedResources, MtcViewsRepository.SWT_KIND));
		this.referencedResources.createControls(parent);
		this.referencedResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.referencedResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencedResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		referencedResourcesData.horizontalSpan = 3;
		this.referencedResources.setLayoutData(referencedResourcesData);
		this.referencedResources.setLowerBound(0);
		this.referencedResources.setUpperBound(-1);
		referencedResources.setID(MtcViewsRepository.MTC_.Elements.referencedResources);
		referencedResources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createReferencedResourcesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTransformationsAdvancedTableComposition(Composite parent) {
		this.transformations = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.transformations, MtcMessages.MTCPropertiesEditionPart_TransformationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.transformations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				transformations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.transformations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				transformations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.transformations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				transformations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.transformations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				transformations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.transformationsFilters) {
			this.transformations.addFilter(filter);
		}
		this.transformations.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.transformations, MtcViewsRepository.SWT_KIND));
		this.transformations.createControls(parent);
		this.transformations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.transformations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData transformationsData = new GridData(GridData.FILL_HORIZONTAL);
		transformationsData.horizontalSpan = 3;
		this.transformations.setLayoutData(transformationsData);
		this.transformations.setLowerBound(0);
		this.transformations.setUpperBound(-1);
		transformations.setID(MtcViewsRepository.MTC_.Elements.transformations);
		transformations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTransformationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFilesAdvancedTableComposition(Composite parent) {
		this.files = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.files, MtcMessages.MTCPropertiesEditionPart_FilesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.files, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				files.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.files, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				files.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.files, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				files.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.files, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				files.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.filesFilters) {
			this.files.addFilter(filter);
		}
		this.files.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.files, MtcViewsRepository.SWT_KIND));
		this.files.createControls(parent);
		this.files.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.files, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData filesData = new GridData(GridData.FILL_HORIZONTAL);
		filesData.horizontalSpan = 3;
		this.files.setLayoutData(filesData);
		this.files.setLowerBound(0);
		this.files.setUpperBound(-1);
		files.setID(MtcViewsRepository.MTC_.Elements.files);
		files.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createFilesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createInputModelsAdvancedTableComposition(Composite parent) {
		this.inputModels = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.inputModels, MtcMessages.MTCPropertiesEditionPart_InputModelsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				inputModels.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				inputModels.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				inputModels.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				inputModels.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.inputModelsFilters) {
			this.inputModels.addFilter(filter);
		}
		this.inputModels.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.inputModels, MtcViewsRepository.SWT_KIND));
		this.inputModels.createControls(parent);
		this.inputModels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputModels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inputModelsData = new GridData(GridData.FILL_HORIZONTAL);
		inputModelsData.horizontalSpan = 3;
		this.inputModels.setLayoutData(inputModelsData);
		this.inputModels.setLowerBound(0);
		this.inputModels.setUpperBound(-1);
		inputModels.setID(MtcViewsRepository.MTC_.Elements.inputModels);
		inputModels.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createInputModelsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createValidationsAdvancedTableComposition(Composite parent) {
		this.validations = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.validations, MtcMessages.MTCPropertiesEditionPart_ValidationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.validations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				validations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.validations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				validations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.validations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				validations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.validations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				validations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.validationsFilters) {
			this.validations.addFilter(filter);
		}
		this.validations.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.validations, MtcViewsRepository.SWT_KIND));
		this.validations.createControls(parent);
		this.validations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.validations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData validationsData = new GridData(GridData.FILL_HORIZONTAL);
		validationsData.horizontalSpan = 3;
		this.validations.setLayoutData(validationsData);
		this.validations.setLowerBound(0);
		this.validations.setUpperBound(-1);
		validations.setID(MtcViewsRepository.MTC_.Elements.validations);
		validations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createValidationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOutputModelsAdvancedTableComposition(Composite parent) {
		this.outputModels = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.outputModels, MtcMessages.MTCPropertiesEditionPart_OutputModelsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				outputModels.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				outputModels.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				outputModels.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				outputModels.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.outputModelsFilters) {
			this.outputModels.addFilter(filter);
		}
		this.outputModels.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.outputModels, MtcViewsRepository.SWT_KIND));
		this.outputModels.createControls(parent);
		this.outputModels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputModels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputModelsData = new GridData(GridData.FILL_HORIZONTAL);
		outputModelsData.horizontalSpan = 3;
		this.outputModels.setLayoutData(outputModelsData);
		this.outputModels.setLowerBound(0);
		this.outputModels.setUpperBound(-1);
		outputModels.setID(MtcViewsRepository.MTC_.Elements.outputModels);
		outputModels.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOutputModelsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createInputFilesAdvancedTableComposition(Composite parent) {
		this.inputFiles = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.inputFiles, MtcMessages.MTCPropertiesEditionPart_InputFilesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				inputFiles.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				inputFiles.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				inputFiles.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				inputFiles.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.inputFilesFilters) {
			this.inputFiles.addFilter(filter);
		}
		this.inputFiles.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.inputFiles, MtcViewsRepository.SWT_KIND));
		this.inputFiles.createControls(parent);
		this.inputFiles.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.inputFiles, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inputFilesData = new GridData(GridData.FILL_HORIZONTAL);
		inputFilesData.horizontalSpan = 3;
		this.inputFiles.setLayoutData(inputFilesData);
		this.inputFiles.setLowerBound(0);
		this.inputFiles.setUpperBound(-1);
		inputFiles.setID(MtcViewsRepository.MTC_.Elements.inputFiles);
		inputFiles.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createInputFilesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOutputFilesAdvancedTableComposition(Composite parent) {
		this.outputFiles = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.outputFiles, MtcMessages.MTCPropertiesEditionPart_OutputFilesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				outputFiles.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				outputFiles.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				outputFiles.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputFiles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				outputFiles.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.outputFilesFilters) {
			this.outputFiles.addFilter(filter);
		}
		this.outputFiles.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.outputFiles, MtcViewsRepository.SWT_KIND));
		this.outputFiles.createControls(parent);
		this.outputFiles.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.outputFiles, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputFilesData = new GridData(GridData.FILL_HORIZONTAL);
		outputFilesData.horizontalSpan = 3;
		this.outputFiles.setLayoutData(outputFilesData);
		this.outputFiles.setLowerBound(0);
		this.outputFiles.setUpperBound(-1);
		outputFiles.setID(MtcViewsRepository.MTC_.Elements.outputFiles);
		outputFiles.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOutputFilesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createModelValidationsAdvancedTableComposition(Composite parent) {
		this.modelValidations = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.modelValidations, MtcMessages.MTCPropertiesEditionPart_ModelValidationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.modelValidations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				modelValidations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.modelValidations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				modelValidations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.modelValidations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				modelValidations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.modelValidations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				modelValidations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.modelValidationsFilters) {
			this.modelValidations.addFilter(filter);
		}
		this.modelValidations.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.modelValidations, MtcViewsRepository.SWT_KIND));
		this.modelValidations.createControls(parent);
		this.modelValidations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.modelValidations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData modelValidationsData = new GridData(GridData.FILL_HORIZONTAL);
		modelValidationsData.horizontalSpan = 3;
		this.modelValidations.setLayoutData(modelValidationsData);
		this.modelValidations.setLowerBound(0);
		this.modelValidations.setUpperBound(-1);
		modelValidations.setID(MtcViewsRepository.MTC_.Elements.modelValidations);
		modelValidations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createModelValidationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDecisionsAdvancedTableComposition(Composite parent) {
		this.decisions = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.decisions, MtcMessages.MTCPropertiesEditionPart_DecisionsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				decisions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				decisions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				decisions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				decisions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.decisionsFilters) {
			this.decisions.addFilter(filter);
		}
		this.decisions.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.decisions, MtcViewsRepository.SWT_KIND));
		this.decisions.createControls(parent);
		this.decisions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decisionsData = new GridData(GridData.FILL_HORIZONTAL);
		decisionsData.horizontalSpan = 3;
		this.decisions.setLayoutData(decisionsData);
		this.decisions.setLowerBound(0);
		this.decisions.setUpperBound(-1);
		decisions.setID(MtcViewsRepository.MTC_.Elements.decisions);
		decisions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createDecisionsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDecisionInputModelsAdvancedTableComposition(Composite parent) {
		this.decisionInputModels = new ReferencesTable(getDescription(MtcViewsRepository.MTC_.Elements.decisionInputModels, MtcMessages.MTCPropertiesEditionPart_DecisionInputModelsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisionInputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				decisionInputModels.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisionInputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				decisionInputModels.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisionInputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				decisionInputModels.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisionInputModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				decisionInputModels.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.decisionInputModelsFilters) {
			this.decisionInputModels.addFilter(filter);
		}
		this.decisionInputModels.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTC_.Elements.decisionInputModels, MtcViewsRepository.SWT_KIND));
		this.decisionInputModels.createControls(parent);
		this.decisionInputModels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCPropertiesEditionPartImpl.this, MtcViewsRepository.MTC_.Elements.decisionInputModels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decisionInputModelsData = new GridData(GridData.FILL_HORIZONTAL);
		decisionInputModelsData.horizontalSpan = 3;
		this.decisionInputModels.setLayoutData(decisionInputModelsData);
		this.decisionInputModels.setLowerBound(0);
		this.decisionInputModels.setUpperBound(-1);
		decisionInputModels.setID(MtcViewsRepository.MTC_.Elements.decisionInputModels);
		decisionInputModels.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createDecisionInputModelsAdvancedTableComposition

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
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getValidateConformance()
	 * 
	 */
	public Boolean getValidateConformance() {
		return Boolean.valueOf(validateConformance.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setValidateConformance(Boolean newValue)
	 * 
	 */
	public void setValidateConformance(Boolean newValue) {
		if (newValue != null) {
			validateConformance.setSelection(newValue.booleanValue());
		} else {
			validateConformance.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Basic.validateConformance);
		if (eefElementEditorReadOnlyState && validateConformance.isEnabled()) {
			validateConformance.setEnabled(false);
			validateConformance.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !validateConformance.isEnabled()) {
			validateConformance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Basic.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Basic.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getM2MTechnology()
	 * 
	 */
	public String getM2MTechnology() {
		return m2MTechnology.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setM2MTechnology(String newValue)
	 * 
	 */
	public void setM2MTechnology(String newValue) {
		if (newValue != null) {
			m2MTechnology.setText(newValue);
		} else {
			m2MTechnology.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Basic.m2MTechnology);
		if (eefElementEditorReadOnlyState && m2MTechnology.isEnabled()) {
			m2MTechnology.setEnabled(false);
			m2MTechnology.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !m2MTechnology.isEnabled()) {
			m2MTechnology.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getM2TTechnology()
	 * 
	 */
	public String getM2TTechnology() {
		return m2TTechnology.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setM2TTechnology(String newValue)
	 * 
	 */
	public void setM2TTechnology(String newValue) {
		if (newValue != null) {
			m2TTechnology.setText(newValue);
		} else {
			m2TTechnology.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Basic.m2TTechnology);
		if (eefElementEditorReadOnlyState && m2TTechnology.isEnabled()) {
			m2TTechnology.setEnabled(false);
			m2TTechnology.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !m2TTechnology.isEnabled()) {
			m2TTechnology.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getHOTechnology()
	 * 
	 */
	public String getHOTechnology() {
		return hOTechnology.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setHOTechnology(String newValue)
	 * 
	 */
	public void setHOTechnology(String newValue) {
		if (newValue != null) {
			hOTechnology.setText(newValue);
		} else {
			hOTechnology.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Basic.hOTechnology);
		if (eefElementEditorReadOnlyState && hOTechnology.isEnabled()) {
			hOTechnology.setEnabled(false);
			hOTechnology.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !hOTechnology.isEnabled()) {
			hOTechnology.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Basic.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getMetamodelsFolder()
	 * 
	 */
	public String getMetamodelsFolder() {
		return metamodelsFolder.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setMetamodelsFolder(String newValue)
	 * 
	 */
	public void setMetamodelsFolder(String newValue) {
		if (newValue != null) {
			metamodelsFolder.setText(newValue);
		} else {
			metamodelsFolder.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.metamodelsFolder);
		if (eefElementEditorReadOnlyState && metamodelsFolder.isEnabled()) {
			metamodelsFolder.setEnabled(false);
			metamodelsFolder.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metamodelsFolder.isEnabled()) {
			metamodelsFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getModelsFolder()
	 * 
	 */
	public String getModelsFolder() {
		return modelsFolder.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setModelsFolder(String newValue)
	 * 
	 */
	public void setModelsFolder(String newValue) {
		if (newValue != null) {
			modelsFolder.setText(newValue);
		} else {
			modelsFolder.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.modelsFolder);
		if (eefElementEditorReadOnlyState && modelsFolder.isEnabled()) {
			modelsFolder.setEnabled(false);
			modelsFolder.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modelsFolder.isEnabled()) {
			modelsFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getM2MTransformationsFolder()
	 * 
	 */
	public String getM2MTransformationsFolder() {
		return m2MTransformationsFolder.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setM2MTransformationsFolder(String newValue)
	 * 
	 */
	public void setM2MTransformationsFolder(String newValue) {
		if (newValue != null) {
			m2MTransformationsFolder.setText(newValue);
		} else {
			m2MTransformationsFolder.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.m2MTransformationsFolder);
		if (eefElementEditorReadOnlyState && m2MTransformationsFolder.isEnabled()) {
			m2MTransformationsFolder.setEnabled(false);
			m2MTransformationsFolder.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !m2MTransformationsFolder.isEnabled()) {
			m2MTransformationsFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getM2TTransformationsFolder()
	 * 
	 */
	public String getM2TTransformationsFolder() {
		return m2TTransformationsFolder.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setM2TTransformationsFolder(String newValue)
	 * 
	 */
	public void setM2TTransformationsFolder(String newValue) {
		if (newValue != null) {
			m2TTransformationsFolder.setText(newValue);
		} else {
			m2TTransformationsFolder.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.m2TTransformationsFolder);
		if (eefElementEditorReadOnlyState && m2TTransformationsFolder.isEnabled()) {
			m2TTransformationsFolder.setEnabled(false);
			m2TTransformationsFolder.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !m2TTransformationsFolder.isEnabled()) {
			m2TTransformationsFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getHOTransformationsFolder()
	 * 
	 */
	public String getHOTransformationsFolder() {
		return hOTransformationsFolder.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setHOTransformationsFolder(String newValue)
	 * 
	 */
	public void setHOTransformationsFolder(String newValue) {
		if (newValue != null) {
			hOTransformationsFolder.setText(newValue);
		} else {
			hOTransformationsFolder.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.hOTransformationsFolder);
		if (eefElementEditorReadOnlyState && hOTransformationsFolder.isEnabled()) {
			hOTransformationsFolder.setEnabled(false);
			hOTransformationsFolder.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !hOTransformationsFolder.isEnabled()) {
			hOTransformationsFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getLibrariesFolder()
	 * 
	 */
	public String getLibrariesFolder() {
		return librariesFolder.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setLibrariesFolder(String newValue)
	 * 
	 */
	public void setLibrariesFolder(String newValue) {
		if (newValue != null) {
			librariesFolder.setText(newValue);
		} else {
			librariesFolder.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.librariesFolder);
		if (eefElementEditorReadOnlyState && librariesFolder.isEnabled()) {
			librariesFolder.setEnabled(false);
			librariesFolder.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !librariesFolder.isEnabled()) {
			librariesFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getValidationsFolder()
	 * 
	 */
	public String getValidationsFolder() {
		return validationsFolder.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setValidationsFolder(String newValue)
	 * 
	 */
	public void setValidationsFolder(String newValue) {
		if (newValue != null) {
			validationsFolder.setText(newValue);
		} else {
			validationsFolder.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.validationsFolder);
		if (eefElementEditorReadOnlyState && validationsFolder.isEnabled()) {
			validationsFolder.setEnabled(false);
			validationsFolder.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !validationsFolder.isEnabled()) {
			validationsFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#getWorkspace()
	 * 
	 */
	public String getWorkspace() {
		return workspace.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#setWorkspace(String newValue)
	 * 
	 */
	public void setWorkspace(String newValue) {
		if (newValue != null) {
			workspace.setText(newValue);
		} else {
			workspace.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Locations.workspace);
		if (eefElementEditorReadOnlyState && workspace.isEnabled()) {
			workspace.setEnabled(false);
			workspace.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !workspace.isEnabled()) {
			workspace.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initMetamodels(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMetamodels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metamodels.setContentProvider(contentProvider);
		metamodels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.metamodels);
		if (eefElementEditorReadOnlyState && metamodels.isEnabled()) {
			metamodels.setEnabled(false);
			metamodels.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metamodels.isEnabled()) {
			metamodels.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateMetamodels()
	 * 
	 */
	public void updateMetamodels() {
	metamodels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterMetamodels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetamodels(ViewerFilter filter) {
		metamodelsFilters.add(filter);
		if (this.metamodels != null) {
			this.metamodels.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterMetamodels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetamodels(ViewerFilter filter) {
		metamodelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInMetamodelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetamodelsTable(EObject element) {
		return ((ReferencesTableSettings)metamodels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initModels(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initModels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		models.setContentProvider(contentProvider);
		models.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.models);
		if (eefElementEditorReadOnlyState && models.isEnabled()) {
			models.setEnabled(false);
			models.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !models.isEnabled()) {
			models.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateModels()
	 * 
	 */
	public void updateModels() {
	models.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterModels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModels(ViewerFilter filter) {
		modelsFilters.add(filter);
		if (this.models != null) {
			this.models.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterModels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModels(ViewerFilter filter) {
		modelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInModelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInModelsTable(EObject element) {
		return ((ReferencesTableSettings)models.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initReferencedResources(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initReferencedResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencedResources.setContentProvider(contentProvider);
		referencedResources.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.referencedResources);
		if (eefElementEditorReadOnlyState && referencedResources.isEnabled()) {
			referencedResources.setEnabled(false);
			referencedResources.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedResources.isEnabled()) {
			referencedResources.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateReferencedResources()
	 * 
	 */
	public void updateReferencedResources() {
	referencedResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesFilters.add(filter);
		if (this.referencedResources != null) {
			this.referencedResources.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInReferencedResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencedResourcesTable(EObject element) {
		return ((ReferencesTableSettings)referencedResources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initTransformations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTransformations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		transformations.setContentProvider(contentProvider);
		transformations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.transformations);
		if (eefElementEditorReadOnlyState && transformations.isEnabled()) {
			transformations.setEnabled(false);
			transformations.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transformations.isEnabled()) {
			transformations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateTransformations()
	 * 
	 */
	public void updateTransformations() {
	transformations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterTransformations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTransformations(ViewerFilter filter) {
		transformationsFilters.add(filter);
		if (this.transformations != null) {
			this.transformations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterTransformations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTransformations(ViewerFilter filter) {
		transformationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInTransformationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTransformationsTable(EObject element) {
		return ((ReferencesTableSettings)transformations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initFiles(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFiles(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		files.setContentProvider(contentProvider);
		files.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.files);
		if (eefElementEditorReadOnlyState && files.isEnabled()) {
			files.setEnabled(false);
			files.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !files.isEnabled()) {
			files.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateFiles()
	 * 
	 */
	public void updateFiles() {
	files.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterFiles(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFiles(ViewerFilter filter) {
		filesFilters.add(filter);
		if (this.files != null) {
			this.files.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterFiles(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFiles(ViewerFilter filter) {
		filesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInFilesTable(EObject element)
	 * 
	 */
	public boolean isContainedInFilesTable(EObject element) {
		return ((ReferencesTableSettings)files.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initInputModels(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initInputModels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inputModels.setContentProvider(contentProvider);
		inputModels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.inputModels);
		if (eefElementEditorReadOnlyState && inputModels.isEnabled()) {
			inputModels.setEnabled(false);
			inputModels.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputModels.isEnabled()) {
			inputModels.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateInputModels()
	 * 
	 */
	public void updateInputModels() {
	inputModels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterInputModels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputModels(ViewerFilter filter) {
		inputModelsFilters.add(filter);
		if (this.inputModels != null) {
			this.inputModels.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterInputModels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputModels(ViewerFilter filter) {
		inputModelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInInputModelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInputModelsTable(EObject element) {
		return ((ReferencesTableSettings)inputModels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initValidations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initValidations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		validations.setContentProvider(contentProvider);
		validations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.validations);
		if (eefElementEditorReadOnlyState && validations.isEnabled()) {
			validations.setEnabled(false);
			validations.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !validations.isEnabled()) {
			validations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateValidations()
	 * 
	 */
	public void updateValidations() {
	validations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterValidations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValidations(ViewerFilter filter) {
		validationsFilters.add(filter);
		if (this.validations != null) {
			this.validations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterValidations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValidations(ViewerFilter filter) {
		validationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInValidationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInValidationsTable(EObject element) {
		return ((ReferencesTableSettings)validations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initOutputModels(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOutputModels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputModels.setContentProvider(contentProvider);
		outputModels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.outputModels);
		if (eefElementEditorReadOnlyState && outputModels.isEnabled()) {
			outputModels.setEnabled(false);
			outputModels.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputModels.isEnabled()) {
			outputModels.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateOutputModels()
	 * 
	 */
	public void updateOutputModels() {
	outputModels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterOutputModels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputModels(ViewerFilter filter) {
		outputModelsFilters.add(filter);
		if (this.outputModels != null) {
			this.outputModels.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterOutputModels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputModels(ViewerFilter filter) {
		outputModelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInOutputModelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputModelsTable(EObject element) {
		return ((ReferencesTableSettings)outputModels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initInputFiles(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initInputFiles(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inputFiles.setContentProvider(contentProvider);
		inputFiles.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.inputFiles);
		if (eefElementEditorReadOnlyState && inputFiles.isEnabled()) {
			inputFiles.setEnabled(false);
			inputFiles.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputFiles.isEnabled()) {
			inputFiles.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateInputFiles()
	 * 
	 */
	public void updateInputFiles() {
	inputFiles.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterInputFiles(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputFiles(ViewerFilter filter) {
		inputFilesFilters.add(filter);
		if (this.inputFiles != null) {
			this.inputFiles.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterInputFiles(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputFiles(ViewerFilter filter) {
		inputFilesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInInputFilesTable(EObject element)
	 * 
	 */
	public boolean isContainedInInputFilesTable(EObject element) {
		return ((ReferencesTableSettings)inputFiles.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initOutputFiles(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOutputFiles(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputFiles.setContentProvider(contentProvider);
		outputFiles.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.outputFiles);
		if (eefElementEditorReadOnlyState && outputFiles.isEnabled()) {
			outputFiles.setEnabled(false);
			outputFiles.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputFiles.isEnabled()) {
			outputFiles.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateOutputFiles()
	 * 
	 */
	public void updateOutputFiles() {
	outputFiles.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterOutputFiles(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputFiles(ViewerFilter filter) {
		outputFilesFilters.add(filter);
		if (this.outputFiles != null) {
			this.outputFiles.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterOutputFiles(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputFiles(ViewerFilter filter) {
		outputFilesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInOutputFilesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputFilesTable(EObject element) {
		return ((ReferencesTableSettings)outputFiles.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initModelValidations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initModelValidations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		modelValidations.setContentProvider(contentProvider);
		modelValidations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.modelValidations);
		if (eefElementEditorReadOnlyState && modelValidations.isEnabled()) {
			modelValidations.setEnabled(false);
			modelValidations.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modelValidations.isEnabled()) {
			modelValidations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateModelValidations()
	 * 
	 */
	public void updateModelValidations() {
	modelValidations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterModelValidations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModelValidations(ViewerFilter filter) {
		modelValidationsFilters.add(filter);
		if (this.modelValidations != null) {
			this.modelValidations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterModelValidations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModelValidations(ViewerFilter filter) {
		modelValidationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInModelValidationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInModelValidationsTable(EObject element) {
		return ((ReferencesTableSettings)modelValidations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initDecisions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDecisions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		decisions.setContentProvider(contentProvider);
		decisions.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.decisions);
		if (eefElementEditorReadOnlyState && decisions.isEnabled()) {
			decisions.setEnabled(false);
			decisions.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !decisions.isEnabled()) {
			decisions.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateDecisions()
	 * 
	 */
	public void updateDecisions() {
	decisions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterDecisions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecisions(ViewerFilter filter) {
		decisionsFilters.add(filter);
		if (this.decisions != null) {
			this.decisions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterDecisions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecisions(ViewerFilter filter) {
		decisionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInDecisionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecisionsTable(EObject element) {
		return ((ReferencesTableSettings)decisions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#initDecisionInputModels(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDecisionInputModels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		decisionInputModels.setContentProvider(contentProvider);
		decisionInputModels.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTC_.Elements.decisionInputModels);
		if (eefElementEditorReadOnlyState && decisionInputModels.isEnabled()) {
			decisionInputModels.setEnabled(false);
			decisionInputModels.setToolTipText(MtcMessages.MTC_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !decisionInputModels.isEnabled()) {
			decisionInputModels.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#updateDecisionInputModels()
	 * 
	 */
	public void updateDecisionInputModels() {
	decisionInputModels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addFilterDecisionInputModels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecisionInputModels(ViewerFilter filter) {
		decisionInputModelsFilters.add(filter);
		if (this.decisionInputModels != null) {
			this.decisionInputModels.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#addBusinessFilterDecisionInputModels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecisionInputModels(ViewerFilter filter) {
		decisionInputModelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCPropertiesEditionPart#isContainedInDecisionInputModelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecisionInputModelsTable(EObject element) {
		return ((ReferencesTableSettings)decisionInputModels.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.MTC_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
