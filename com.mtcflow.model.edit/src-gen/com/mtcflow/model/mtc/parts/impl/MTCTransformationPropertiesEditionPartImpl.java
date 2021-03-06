/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.SelectionDialog;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;
import com.mtcflow.model.mtc.utils.DialogUtils;
import com.mtcflow.model.mtc.utils.DialogUtils.DialogTypes;

// End of user code

/**
 * 
 * 
 */
public class MTCTransformationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MTCTransformationPropertiesEditionPart {

	protected Text name;
	protected SelectionDialog uRI;
	protected SelectionDialog target;
	protected SelectionDialog implementationClass;
	protected Text description;
	protected SelectionDialog technology;
	protected EObjectFlatComboViewer preExecutionScript;
	protected EObjectFlatComboViewer postExecutionScript;
	protected ReferencesTable libraries;
	protected List<ViewerFilter> librariesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> librariesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable tags;
	protected List<ViewerFilter> tagsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tagsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable referencedResources;
	protected List<ViewerFilter> referencedResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencedResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable fileDependencies;
	protected List<ViewerFilter> fileDependenciesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fileDependenciesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable modelDependencies;
	protected List<ViewerFilter> modelDependenciesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> modelDependenciesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MTCTransformationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence mTCTransformationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = mTCTransformationStep.addStep(MtcViewsRepository.MTCTransformation.Basic.class);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.name);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.uRI);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.target);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.implementationClass);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.description);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.technology);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.preExecutionScript);
		basicStep.addStep(MtcViewsRepository.MTCTransformation.Basic.postExecutionScript);
		
		mTCTransformationStep
			.addStep(MtcViewsRepository.MTCTransformation.Libraries.class)
			.addStep(MtcViewsRepository.MTCTransformation.Libraries.libraries_);
		
		CompositionStep advancedStep = mTCTransformationStep.addStep(MtcViewsRepository.MTCTransformation.Advanced.class);
		advancedStep.addStep(MtcViewsRepository.MTCTransformation.Advanced.properties);
		advancedStep.addStep(MtcViewsRepository.MTCTransformation.Advanced.tags);
		advancedStep.addStep(MtcViewsRepository.MTCTransformation.Advanced.referencedResources);
		
		CompositionStep dependenciesStep = mTCTransformationStep.addStep(MtcViewsRepository.MTCTransformation.Dependencies.class);
		dependenciesStep.addStep(MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies);
		dependenciesStep.addStep(MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies);
		
		
		composer = new PartComposer(mTCTransformationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.MTCTransformation.Basic.class) {
					return createBasicGroup(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.name) {
					return createNameText(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.uRI) {
					return createURISelectionDialog(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.target) {
					return createTargetSelectionDialog(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.implementationClass) {
					return createImplementationClassSelectionDialog(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.description) {
					return createDescriptionText(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.technology) {
					return createTechnologySelectionDialog(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.preExecutionScript) {
					return createPreExecutionScriptFlatComboViewer(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Basic.postExecutionScript) {
					return createPostExecutionScriptFlatComboViewer(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Libraries.class) {
					return createLibrariesGroup(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Libraries.libraries_) {
					return createLibrariesAdvancedReferencesTable(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Advanced.class) {
					return createAdvancedGroup(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Advanced.properties) {
					return createPropertiesAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Advanced.tags) {
					return createTagsAdvancedReferencesTable(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Advanced.referencedResources) {
					return createReferencedResourcesAdvancedReferencesTable(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Dependencies.class) {
					return createDependenciesGroup(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies) {
					return createFileDependenciesAdvancedReferencesTable(parent);
				}
				if (key == MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies) {
					return createModelDependenciesAdvancedReferencesTable(parent);
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
		basicGroup.setText(MtcMessages.MTCTransformationPropertiesEditionPart_BasicGroupLabel);
		GridData basicGroupData = new GridData(GridData.FILL_HORIZONTAL);
		basicGroupData.horizontalSpan = 3;
		basicGroup.setLayoutData(basicGroupData);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		return basicGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.name, MtcMessages.MTCTransformationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MtcViewsRepository.MTCTransformation.Basic.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.name, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createURISelectionDialog(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.uRI, MtcMessages.MTCTransformationPropertiesEditionPart_URILabel);
		uRI = new SelectionDialog(parent, SWT.NONE);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.uRI, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createURISelectionDialog

		// End of user code
		return parent;
	}
	
	protected void uRISelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedUri = DialogUtils.openDialogFor(current, DialogTypes.URI, uRI.getText());
		if (selectedUri != null) {
			uRI.setText(selectedUri);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
		}
	//End of user code
	}

	
	protected Composite createTargetSelectionDialog(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.target, MtcMessages.MTCTransformationPropertiesEditionPart_TargetLabel);
		target = new SelectionDialog(parent, SWT.NONE);
		GridData generatorData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(generatorData);

		target.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					targetSelectionDialog();
			}
		});

		target.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
			}
		});
		target.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.target, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTargetSelectionDialog

		// End of user code
		return parent;
	}
	
	protected void targetSelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedTarget = DialogUtils.openDialogFor(current, DialogTypes.Target, target.getText());
		if (selectedTarget != null) {
			implementationClass.setText(selectedTarget);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
		}

	//End of user code
	}

	
	protected Composite createImplementationClassSelectionDialog(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.implementationClass, MtcMessages.MTCTransformationPropertiesEditionPart_ImplementationClassLabel);
		implementationClass = new SelectionDialog(parent, SWT.NONE);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.implementationClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implementationClass.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.implementationClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implementationClass.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.implementationClass, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createImplementationClassSelectionDialog

		// End of user code
		return parent;
	}
	
	protected void implementationClassSelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedClass = DialogUtils.openDialogFor(current, DialogTypes.Class, implementationClass.getText());
	if (selectedClass != null) {
		implementationClass.setText(selectedClass);
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.implementationClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, implementationClass.getText()));
	}
	//End of user code
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.description, MtcMessages.MTCTransformationPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, MtcViewsRepository.MTCTransformation.Basic.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.description, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createTechnologySelectionDialog(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.technology, MtcMessages.MTCTransformationPropertiesEditionPart_TechnologyLabel);
		technology = new SelectionDialog(parent, SWT.NONE);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.technology, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTechnologySelectionDialog

		// End of user code
		return parent;
	}
	
	protected void technologySelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedTechnology = DialogUtils.openDialogFor(current, DialogTypes.Technology, technology.getText());
		if (selectedTechnology != null) {
			technology.setText(selectedTechnology);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
		}
	//End of user code
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPreExecutionScriptFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.preExecutionScript, MtcMessages.MTCTransformationPropertiesEditionPart_PreExecutionScriptLabel);
		preExecutionScript = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.MTCTransformation.Basic.preExecutionScript, MtcViewsRepository.SWT_KIND));
		preExecutionScript.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		preExecutionScript.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.preExecutionScript, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPreExecutionScript()));
			}

		});
		GridData preExecutionScriptData = new GridData(GridData.FILL_HORIZONTAL);
		preExecutionScript.setLayoutData(preExecutionScriptData);
		preExecutionScript.setID(MtcViewsRepository.MTCTransformation.Basic.preExecutionScript);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.preExecutionScript, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPreExecutionScriptFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPostExecutionScriptFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.MTCTransformation.Basic.postExecutionScript, MtcMessages.MTCTransformationPropertiesEditionPart_PostExecutionScriptLabel);
		postExecutionScript = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.MTCTransformation.Basic.postExecutionScript, MtcViewsRepository.SWT_KIND));
		postExecutionScript.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		postExecutionScript.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Basic.postExecutionScript, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPostExecutionScript()));
			}

		});
		GridData postExecutionScriptData = new GridData(GridData.FILL_HORIZONTAL);
		postExecutionScript.setLayoutData(postExecutionScriptData);
		postExecutionScript.setID(MtcViewsRepository.MTCTransformation.Basic.postExecutionScript);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Basic.postExecutionScript, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPostExecutionScriptFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLibrariesGroup(Composite parent) {
		Group librariesGroup = new Group(parent, SWT.NONE);
		librariesGroup.setText(MtcMessages.MTCTransformationPropertiesEditionPart_LibrariesGroupLabel);
		GridData librariesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		librariesGroupData.horizontalSpan = 3;
		librariesGroup.setLayoutData(librariesGroupData);
		GridLayout librariesGroupLayout = new GridLayout();
		librariesGroupLayout.numColumns = 3;
		librariesGroup.setLayout(librariesGroupLayout);
		return librariesGroup;
	}

	/**
	 * 
	 */
	protected Composite createLibrariesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MtcViewsRepository.MTCTransformation.Libraries.libraries_, MtcMessages.MTCTransformationPropertiesEditionPart_LibrariesLabel);		 
		this.libraries = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLibraries(); }
			public void handleEdit(EObject element) { editLibraries(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLibraries(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLibraries(element); }
			public void navigateTo(EObject element) { }
		});
		this.libraries.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Libraries.libraries_, MtcViewsRepository.SWT_KIND));
		this.libraries.createControls(parent);
		this.libraries.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Libraries.libraries_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData librariesData = new GridData(GridData.FILL_HORIZONTAL);
		librariesData.horizontalSpan = 3;
		this.libraries.setLayoutData(librariesData);
		this.libraries.disableMove();
		libraries.setID(MtcViewsRepository.MTCTransformation.Libraries.libraries_);
		libraries.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addLibraries() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(libraries.getInput(), librariesFilters, librariesBusinessFilters,
		"libraries", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Libraries.libraries_,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				libraries.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveLibraries(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Libraries.libraries_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		libraries.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLibraries(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Libraries.libraries_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		libraries.refresh();
	}

	/**
	 * 
	 */
	protected void editLibraries(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				libraries.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createAdvancedGroup(Composite parent) {
		Group advancedGroup = new Group(parent, SWT.NONE);
		advancedGroup.setText(MtcMessages.MTCTransformationPropertiesEditionPart_AdvancedGroupLabel);
		GridData advancedGroupData = new GridData(GridData.FILL_HORIZONTAL);
		advancedGroupData.horizontalSpan = 3;
		advancedGroup.setLayoutData(advancedGroupData);
		GridLayout advancedGroupLayout = new GridLayout();
		advancedGroupLayout.numColumns = 3;
		advancedGroup.setLayout(advancedGroupLayout);
		return advancedGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesAdvancedTableComposition(Composite parent) {
		this.properties = new ReferencesTable(getDescription(MtcViewsRepository.MTCTransformation.Advanced.properties, MtcMessages.MTCTransformationPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Advanced.properties, MtcViewsRepository.SWT_KIND));
		this.properties.createControls(parent);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.properties, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(MtcViewsRepository.MTCTransformation.Advanced.properties);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPropertiesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTagsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MtcViewsRepository.MTCTransformation.Advanced.tags, MtcMessages.MTCTransformationPropertiesEditionPart_TagsLabel);		 
		this.tags = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addTags(); }
			public void handleEdit(EObject element) { editTags(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTags(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTags(element); }
			public void navigateTo(EObject element) { }
		});
		this.tags.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Advanced.tags, MtcViewsRepository.SWT_KIND));
		this.tags.createControls(parent);
		this.tags.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.tags, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tagsData = new GridData(GridData.FILL_HORIZONTAL);
		tagsData.horizontalSpan = 3;
		this.tags.setLayoutData(tagsData);
		this.tags.disableMove();
		tags.setID(MtcViewsRepository.MTCTransformation.Advanced.tags);
		tags.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.tags,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		tags.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTags(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createReferencedResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MtcViewsRepository.MTCTransformation.Advanced.referencedResources, MtcMessages.MTCTransformationPropertiesEditionPart_ReferencedResourcesLabel);		 
		this.referencedResources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addReferencedResources(); }
			public void handleEdit(EObject element) { editReferencedResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencedResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencedResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencedResources.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Advanced.referencedResources, MtcViewsRepository.SWT_KIND));
		this.referencedResources.createControls(parent);
		this.referencedResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.referencedResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencedResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		referencedResourcesData.horizontalSpan = 3;
		this.referencedResources.setLayoutData(referencedResourcesData);
		this.referencedResources.disableMove();
		referencedResources.setID(MtcViewsRepository.MTCTransformation.Advanced.referencedResources);
		referencedResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.referencedResources,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencedResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencedResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Advanced.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createDependenciesGroup(Composite parent) {
		Group dependenciesGroup = new Group(parent, SWT.NONE);
		dependenciesGroup.setText(MtcMessages.MTCTransformationPropertiesEditionPart_DependenciesGroupLabel);
		GridData dependenciesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		dependenciesGroupData.horizontalSpan = 3;
		dependenciesGroup.setLayoutData(dependenciesGroupData);
		GridLayout dependenciesGroupLayout = new GridLayout();
		dependenciesGroupLayout.numColumns = 3;
		dependenciesGroup.setLayout(dependenciesGroupLayout);
		return dependenciesGroup;
	}

	/**
	 * 
	 */
	protected Composite createFileDependenciesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies, MtcMessages.MTCTransformationPropertiesEditionPart_FileDependenciesLabel);		 
		this.fileDependencies = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addFileDependencies(); }
			public void handleEdit(EObject element) { editFileDependencies(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFileDependencies(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFileDependencies(element); }
			public void navigateTo(EObject element) { }
		});
		this.fileDependencies.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies, MtcViewsRepository.SWT_KIND));
		this.fileDependencies.createControls(parent);
		this.fileDependencies.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fileDependenciesData = new GridData(GridData.FILL_HORIZONTAL);
		fileDependenciesData.horizontalSpan = 3;
		this.fileDependencies.setLayoutData(fileDependenciesData);
		this.fileDependencies.disableMove();
		fileDependencies.setID(MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies);
		fileDependencies.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFileDependencies() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(fileDependencies.getInput(), fileDependenciesFilters, fileDependenciesBusinessFilters,
		"fileDependencies", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				fileDependencies.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFileDependencies(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		fileDependencies.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFileDependencies(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		fileDependencies.refresh();
	}

	/**
	 * 
	 */
	protected void editFileDependencies(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				fileDependencies.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createModelDependenciesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies, MtcMessages.MTCTransformationPropertiesEditionPart_ModelDependenciesLabel);		 
		this.modelDependencies = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addModelDependencies(); }
			public void handleEdit(EObject element) { editModelDependencies(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveModelDependencies(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromModelDependencies(element); }
			public void navigateTo(EObject element) { }
		});
		this.modelDependencies.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies, MtcViewsRepository.SWT_KIND));
		this.modelDependencies.createControls(parent);
		this.modelDependencies.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData modelDependenciesData = new GridData(GridData.FILL_HORIZONTAL);
		modelDependenciesData.horizontalSpan = 3;
		this.modelDependencies.setLayoutData(modelDependenciesData);
		this.modelDependencies.disableMove();
		modelDependencies.setID(MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies);
		modelDependencies.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addModelDependencies() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(modelDependencies.getInput(), modelDependenciesFilters, modelDependenciesBusinessFilters,
		"modelDependencies", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				modelDependencies.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveModelDependencies(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		modelDependencies.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromModelDependencies(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTCTransformationPropertiesEditionPartImpl.this, MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		modelDependencies.refresh();
	}

	/**
	 * 
	 */
	protected void editModelDependencies(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				modelDependencies.refresh();
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
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getURI()
	 * 
	 */
	public String getURI() {
		return uRI.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setURI(String newValue)
	 * 
	 */
	public void setURI(String newValue) {
		if (newValue != null) {
			uRI.setText(newValue);
		} else {
			uRI.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.uRI);
		if (eefElementEditorReadOnlyState && uRI.isEnabled()) {
			uRI.setEnabled(false);
			uRI.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !uRI.isEnabled()) {
			uRI.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getTarget()
	 * 
	 */
	public String getTarget() {
		return target.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setTarget(String newValue)
	 * 
	 */
	public void setTarget(String newValue) {
		if (newValue != null) {
			target.setText(newValue);
		} else {
			target.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.target);
		if (eefElementEditorReadOnlyState && target.isEnabled()) {
			target.setEnabled(false);
			target.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !target.isEnabled()) {
			target.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getImplementationClass()
	 * 
	 */
	public String getImplementationClass() {
		return implementationClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setImplementationClass(String newValue)
	 * 
	 */
	public void setImplementationClass(String newValue) {
		if (newValue != null) {
			implementationClass.setText(newValue);
		} else {
			implementationClass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.implementationClass);
		if (eefElementEditorReadOnlyState && implementationClass.isEnabled()) {
			implementationClass.setEnabled(false);
			implementationClass.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !implementationClass.isEnabled()) {
			implementationClass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getTechnology()
	 * 
	 */
	public String getTechnology() {
		return technology.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setTechnology(String newValue)
	 * 
	 */
	public void setTechnology(String newValue) {
		if (newValue != null) {
			technology.setText(newValue);
		} else {
			technology.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.technology);
		if (eefElementEditorReadOnlyState && technology.isEnabled()) {
			technology.setEnabled(false);
			technology.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !technology.isEnabled()) {
			technology.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getPreExecutionScript()
	 * 
	 */
	public EObject getPreExecutionScript() {
		if (preExecutionScript.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) preExecutionScript.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initPreExecutionScript(EObjectFlatComboSettings)
	 */
	public void initPreExecutionScript(EObjectFlatComboSettings settings) {
		preExecutionScript.setInput(settings);
		if (current != null) {
			preExecutionScript.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.preExecutionScript);
		if (eefElementEditorReadOnlyState && preExecutionScript.isEnabled()) {
			preExecutionScript.setEnabled(false);
			preExecutionScript.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !preExecutionScript.isEnabled()) {
			preExecutionScript.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setPreExecutionScript(EObject newValue)
	 * 
	 */
	public void setPreExecutionScript(EObject newValue) {
		if (newValue != null) {
			preExecutionScript.setSelection(new StructuredSelection(newValue));
		} else {
			preExecutionScript.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.preExecutionScript);
		if (eefElementEditorReadOnlyState && preExecutionScript.isEnabled()) {
			preExecutionScript.setEnabled(false);
			preExecutionScript.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !preExecutionScript.isEnabled()) {
			preExecutionScript.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setPreExecutionScriptButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPreExecutionScriptButtonMode(ButtonsModeEnum newValue) {
		preExecutionScript.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterPreExecutionScript(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPreExecutionScript(ViewerFilter filter) {
		preExecutionScript.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterPreExecutionScript(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPreExecutionScript(ViewerFilter filter) {
		preExecutionScript.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#getPostExecutionScript()
	 * 
	 */
	public EObject getPostExecutionScript() {
		if (postExecutionScript.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) postExecutionScript.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initPostExecutionScript(EObjectFlatComboSettings)
	 */
	public void initPostExecutionScript(EObjectFlatComboSettings settings) {
		postExecutionScript.setInput(settings);
		if (current != null) {
			postExecutionScript.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.postExecutionScript);
		if (eefElementEditorReadOnlyState && postExecutionScript.isEnabled()) {
			postExecutionScript.setEnabled(false);
			postExecutionScript.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !postExecutionScript.isEnabled()) {
			postExecutionScript.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setPostExecutionScript(EObject newValue)
	 * 
	 */
	public void setPostExecutionScript(EObject newValue) {
		if (newValue != null) {
			postExecutionScript.setSelection(new StructuredSelection(newValue));
		} else {
			postExecutionScript.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Basic.postExecutionScript);
		if (eefElementEditorReadOnlyState && postExecutionScript.isEnabled()) {
			postExecutionScript.setEnabled(false);
			postExecutionScript.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !postExecutionScript.isEnabled()) {
			postExecutionScript.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#setPostExecutionScriptButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPostExecutionScriptButtonMode(ButtonsModeEnum newValue) {
		postExecutionScript.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterPostExecutionScript(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPostExecutionScript(ViewerFilter filter) {
		postExecutionScript.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterPostExecutionScript(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPostExecutionScript(ViewerFilter filter) {
		postExecutionScript.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initLibraries(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLibraries(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		libraries.setContentProvider(contentProvider);
		libraries.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Libraries.libraries_);
		if (eefElementEditorReadOnlyState && libraries.getTable().isEnabled()) {
			libraries.setEnabled(false);
			libraries.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !libraries.getTable().isEnabled()) {
			libraries.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#updateLibraries()
	 * 
	 */
	public void updateLibraries() {
	libraries.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterLibraries(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLibraries(ViewerFilter filter) {
		librariesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterLibraries(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLibraries(ViewerFilter filter) {
		librariesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#isContainedInLibrariesTable(EObject element)
	 * 
	 */
	public boolean isContainedInLibrariesTable(EObject element) {
		return ((ReferencesTableSettings)libraries.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Advanced.properties);
		if (eefElementEditorReadOnlyState && properties.isEnabled()) {
			properties.setEnabled(false);
			properties.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !properties.isEnabled()) {
			properties.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
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
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initTags(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTags(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tags.setContentProvider(contentProvider);
		tags.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Advanced.tags);
		if (eefElementEditorReadOnlyState && tags.getTable().isEnabled()) {
			tags.setEnabled(false);
			tags.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !tags.getTable().isEnabled()) {
			tags.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#updateTags()
	 * 
	 */
	public void updateTags() {
	tags.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTags(ViewerFilter filter) {
		tagsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTags(ViewerFilter filter) {
		tagsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#isContainedInTagsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTagsTable(EObject element) {
		return ((ReferencesTableSettings)tags.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initReferencedResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReferencedResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencedResources.setContentProvider(contentProvider);
		referencedResources.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Advanced.referencedResources);
		if (eefElementEditorReadOnlyState && referencedResources.getTable().isEnabled()) {
			referencedResources.setEnabled(false);
			referencedResources.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedResources.getTable().isEnabled()) {
			referencedResources.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#updateReferencedResources()
	 * 
	 */
	public void updateReferencedResources() {
	referencedResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#isContainedInReferencedResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencedResourcesTable(EObject element) {
		return ((ReferencesTableSettings)referencedResources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initFileDependencies(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFileDependencies(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fileDependencies.setContentProvider(contentProvider);
		fileDependencies.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Dependencies.fileDependencies);
		if (eefElementEditorReadOnlyState && fileDependencies.getTable().isEnabled()) {
			fileDependencies.setEnabled(false);
			fileDependencies.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fileDependencies.getTable().isEnabled()) {
			fileDependencies.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#updateFileDependencies()
	 * 
	 */
	public void updateFileDependencies() {
	fileDependencies.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterFileDependencies(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFileDependencies(ViewerFilter filter) {
		fileDependenciesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterFileDependencies(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFileDependencies(ViewerFilter filter) {
		fileDependenciesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#isContainedInFileDependenciesTable(EObject element)
	 * 
	 */
	public boolean isContainedInFileDependenciesTable(EObject element) {
		return ((ReferencesTableSettings)fileDependencies.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#initModelDependencies(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initModelDependencies(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		modelDependencies.setContentProvider(contentProvider);
		modelDependencies.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.MTCTransformation.Dependencies.modelDependencies);
		if (eefElementEditorReadOnlyState && modelDependencies.getTable().isEnabled()) {
			modelDependencies.setEnabled(false);
			modelDependencies.setToolTipText(MtcMessages.MTCTransformation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modelDependencies.getTable().isEnabled()) {
			modelDependencies.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#updateModelDependencies()
	 * 
	 */
	public void updateModelDependencies() {
	modelDependencies.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addFilterModelDependencies(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModelDependencies(ViewerFilter filter) {
		modelDependenciesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#addBusinessFilterModelDependencies(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModelDependencies(ViewerFilter filter) {
		modelDependenciesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.MTCTransformationPropertiesEditionPart#isContainedInModelDependenciesTable(EObject element)
	 * 
	 */
	public boolean isContainedInModelDependenciesTable(EObject element) {
		return ((ReferencesTableSettings)modelDependencies.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.MTCTransformation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
