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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import com.mtcflow.model.mtc.parts.FilePropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;
import com.mtcflow.model.mtc.utils.DialogUtils;
import com.mtcflow.model.mtc.utils.DialogUtils.DialogTypes;

// End of user code

/**
 * 
 * 
 */
public class FilePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FilePropertiesEditionPart {

	protected Text name;
	protected SelectionDialog uRI;
	protected Text type;
	protected Text description;
	protected SelectionDialog technology;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable tags;
	protected List<ViewerFilter> tagsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tagsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable referencedResources;
	protected List<ViewerFilter> referencedResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencedResourcesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FilePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence fileStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = fileStep.addStep(MtcViewsRepository.File.Basic.class);
		basicStep.addStep(MtcViewsRepository.File.Basic.name);
		basicStep.addStep(MtcViewsRepository.File.Basic.uRI);
		basicStep.addStep(MtcViewsRepository.File.Basic.type);
		basicStep.addStep(MtcViewsRepository.File.Basic.description);
		basicStep.addStep(MtcViewsRepository.File.Basic.technology);
		
		CompositionStep advancedStep = fileStep.addStep(MtcViewsRepository.File.Advanced.class);
		advancedStep.addStep(MtcViewsRepository.File.Advanced.properties);
		advancedStep.addStep(MtcViewsRepository.File.Advanced.tags);
		advancedStep.addStep(MtcViewsRepository.File.Advanced.referencedResources);
		
		
		composer = new PartComposer(fileStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.File.Basic.class) {
					return createBasicGroup(parent);
				}
				if (key == MtcViewsRepository.File.Basic.name) {
					return createNameText(parent);
				}
				if (key == MtcViewsRepository.File.Basic.uRI) {
					return createURISelectionDialog(parent);
				}
				if (key == MtcViewsRepository.File.Basic.type) {
					return createTypeText(parent);
				}
				if (key == MtcViewsRepository.File.Basic.description) {
					return createDescriptionText(parent);
				}
				if (key == MtcViewsRepository.File.Basic.technology) {
					return createTechnologySelectionDialog(parent);
				}
				if (key == MtcViewsRepository.File.Advanced.class) {
					return createAdvancedGroup(parent);
				}
				if (key == MtcViewsRepository.File.Advanced.properties) {
					return createPropertiesAdvancedTableComposition(parent);
				}
				if (key == MtcViewsRepository.File.Advanced.tags) {
					return createTagsAdvancedReferencesTable(parent);
				}
				if (key == MtcViewsRepository.File.Advanced.referencedResources) {
					return createReferencedResourcesAdvancedReferencesTable(parent);
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
		basicGroup.setText(MtcMessages.FilePropertiesEditionPart_BasicGroupLabel);
		GridData basicGroupData = new GridData(GridData.FILL_HORIZONTAL);
		basicGroupData.horizontalSpan = 3;
		basicGroup.setLayoutData(basicGroupData);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		return basicGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, MtcViewsRepository.File.Basic.name, MtcMessages.FilePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MtcViewsRepository.File.Basic.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Basic.name, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createURISelectionDialog(Composite parent) {
		createDescription(parent, MtcViewsRepository.File.Basic.uRI, MtcMessages.FilePropertiesEditionPart_URILabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Basic.uRI, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createURISelectionDialog

		// End of user code
		return parent;
	}
	
	protected void uRISelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedUri = DialogUtils.openDialogFor(current, DialogTypes.URI, uRI.getText());
		if (selectedUri != null) {
			uRI.setText(selectedUri);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.uRI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uRI.getText()));
		}
	//End of user code
	}

	
	protected Composite createTypeText(Composite parent) {
		createDescription(parent, MtcViewsRepository.File.Basic.type, MtcMessages.FilePropertiesEditionPart_TypeLabel);
		type = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, MtcViewsRepository.File.Basic.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Basic.type, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, MtcViewsRepository.File.Basic.description, MtcMessages.FilePropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, MtcViewsRepository.File.Basic.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Basic.description, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createTechnologySelectionDialog(Composite parent) {
		createDescription(parent, MtcViewsRepository.File.Basic.technology, MtcMessages.FilePropertiesEditionPart_TechnologyLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Basic.technology, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTechnologySelectionDialog

		// End of user code
		return parent;
	}
	
	protected void technologySelectionDialog() {
	//Start of user code browse button selection dialog
		String selectedTechnology = DialogUtils.openDialogFor(current, DialogTypes.Technology, technology.getText());
		if (selectedTechnology != null) {
			technology.setText(selectedTechnology);
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Basic.technology, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
		}
	//End of user code
	}

	/**
	 * 
	 */
	protected Composite createAdvancedGroup(Composite parent) {
		Group advancedGroup = new Group(parent, SWT.NONE);
		advancedGroup.setText(MtcMessages.FilePropertiesEditionPart_AdvancedGroupLabel);
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
		this.properties = new ReferencesTable(getDescription(MtcViewsRepository.File.Advanced.properties, MtcMessages.FilePropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.properties, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Advanced.properties, MtcViewsRepository.SWT_KIND));
		this.properties.createControls(parent);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.properties, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(MtcViewsRepository.File.Advanced.properties);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPropertiesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTagsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MtcViewsRepository.File.Advanced.tags, MtcMessages.FilePropertiesEditionPart_TagsLabel);		 
		this.tags = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addTags(); }
			public void handleEdit(EObject element) { editTags(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTags(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTags(element); }
			public void navigateTo(EObject element) { }
		});
		this.tags.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Advanced.tags, MtcViewsRepository.SWT_KIND));
		this.tags.createControls(parent);
		this.tags.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.tags, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tagsData = new GridData(GridData.FILL_HORIZONTAL);
		tagsData.horizontalSpan = 3;
		this.tags.setLayoutData(tagsData);
		this.tags.disableMove();
		tags.setID(MtcViewsRepository.File.Advanced.tags);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.tags,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		tags.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTags(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.tags, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(MtcViewsRepository.File.Advanced.referencedResources, MtcMessages.FilePropertiesEditionPart_ReferencedResourcesLabel);		 
		this.referencedResources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addReferencedResources(); }
			public void handleEdit(EObject element) { editReferencedResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencedResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencedResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencedResources.setHelpText(propertiesEditionComponent.getHelpContent(MtcViewsRepository.File.Advanced.referencedResources, MtcViewsRepository.SWT_KIND));
		this.referencedResources.createControls(parent);
		this.referencedResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.referencedResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencedResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		referencedResourcesData.horizontalSpan = 3;
		this.referencedResources.setLayoutData(referencedResourcesData);
		this.referencedResources.disableMove();
		referencedResources.setID(MtcViewsRepository.File.Advanced.referencedResources);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.referencedResources,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencedResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencedResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilePropertiesEditionPartImpl.this, MtcViewsRepository.File.Advanced.referencedResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Basic.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#getURI()
	 * 
	 */
	public String getURI() {
		return uRI.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#setURI(String newValue)
	 * 
	 */
	public void setURI(String newValue) {
		if (newValue != null) {
			uRI.setText(newValue);
		} else {
			uRI.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Basic.uRI);
		if (eefElementEditorReadOnlyState && uRI.isEnabled()) {
			uRI.setEnabled(false);
			uRI.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !uRI.isEnabled()) {
			uRI.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Basic.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Basic.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#getTechnology()
	 * 
	 */
	public String getTechnology() {
		return technology.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#setTechnology(String newValue)
	 * 
	 */
	public void setTechnology(String newValue) {
		if (newValue != null) {
			technology.setText(newValue);
		} else {
			technology.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Basic.technology);
		if (eefElementEditorReadOnlyState && technology.isEnabled()) {
			technology.setEnabled(false);
			technology.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !technology.isEnabled()) {
			technology.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Advanced.properties);
		if (eefElementEditorReadOnlyState && properties.isEnabled()) {
			properties.setEnabled(false);
			properties.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !properties.isEnabled()) {
			properties.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#addFilterProperties(ViewerFilter filter)
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
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#initTags(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTags(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tags.setContentProvider(contentProvider);
		tags.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Advanced.tags);
		if (eefElementEditorReadOnlyState && tags.getTable().isEnabled()) {
			tags.setEnabled(false);
			tags.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !tags.getTable().isEnabled()) {
			tags.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#updateTags()
	 * 
	 */
	public void updateTags() {
	tags.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#addFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTags(ViewerFilter filter) {
		tagsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#addBusinessFilterTags(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTags(ViewerFilter filter) {
		tagsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#isContainedInTagsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTagsTable(EObject element) {
		return ((ReferencesTableSettings)tags.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#initReferencedResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReferencedResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencedResources.setContentProvider(contentProvider);
		referencedResources.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.File.Advanced.referencedResources);
		if (eefElementEditorReadOnlyState && referencedResources.getTable().isEnabled()) {
			referencedResources.setEnabled(false);
			referencedResources.setToolTipText(MtcMessages.File_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedResources.getTable().isEnabled()) {
			referencedResources.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#updateReferencedResources()
	 * 
	 */
	public void updateReferencedResources() {
	referencedResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#addFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#addBusinessFilterReferencedResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedResources(ViewerFilter filter) {
		referencedResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.FilePropertiesEditionPart#isContainedInReferencedResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencedResourcesTable(EObject element) {
		return ((ReferencesTableSettings)referencedResources.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MtcMessages.File_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
