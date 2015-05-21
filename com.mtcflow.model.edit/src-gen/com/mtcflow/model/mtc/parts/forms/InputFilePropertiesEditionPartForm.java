/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

import com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class InputFilePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, InputFilePropertiesEditionPart {

	protected EObjectFlatComboViewer file;
	protected EObjectFlatComboViewer transformation;



	/**
	 * For {@link ISection} use only.
	 */
	public InputFilePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InputFilePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence inputFileStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = inputFileStep.addStep(MtcViewsRepository.InputFile.Basic.class);
		basicStep.addStep(MtcViewsRepository.InputFile.Basic.file);
		basicStep.addStep(MtcViewsRepository.InputFile.Basic.transformation);
		
		
		composer = new PartComposer(inputFileStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.InputFile.Basic.class) {
					return createBasicGroup(widgetFactory, parent);
				}
				if (key == MtcViewsRepository.InputFile.Basic.file) {
					return createFileFlatComboViewer(parent, widgetFactory);
				}
				if (key == MtcViewsRepository.InputFile.Basic.transformation) {
					return createTransformationFlatComboViewer(parent, widgetFactory);
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
		basicSection.setText(MtcMessages.InputFilePropertiesEditionPart_BasicGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFileFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, MtcViewsRepository.InputFile.Basic.file, MtcMessages.InputFilePropertiesEditionPart_FileLabel);
		file = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.InputFile.Basic.file, MtcViewsRepository.FORM_KIND));
		widgetFactory.adapt(file);
		file.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fileData = new GridData(GridData.FILL_HORIZONTAL);
		file.setLayoutData(fileData);
		file.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputFilePropertiesEditionPartForm.this, MtcViewsRepository.InputFile.Basic.file, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFile()));
			}

		});
		file.setID(MtcViewsRepository.InputFile.Basic.file);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.InputFile.Basic.file, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFileFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTransformationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, MtcViewsRepository.InputFile.Basic.transformation, MtcMessages.InputFilePropertiesEditionPart_TransformationLabel);
		transformation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.InputFile.Basic.transformation, MtcViewsRepository.FORM_KIND));
		widgetFactory.adapt(transformation);
		transformation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData transformationData = new GridData(GridData.FILL_HORIZONTAL);
		transformation.setLayoutData(transformationData);
		transformation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputFilePropertiesEditionPartForm.this, MtcViewsRepository.InputFile.Basic.transformation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransformation()));
			}

		});
		transformation.setID(MtcViewsRepository.InputFile.Basic.transformation);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.InputFile.Basic.transformation, MtcViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#getFile()
	 * 
	 */
	public EObject getFile() {
		if (file.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) file.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#initFile(EObjectFlatComboSettings)
	 */
	public void initFile(EObjectFlatComboSettings settings) {
		file.setInput(settings);
		if (current != null) {
			file.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.InputFile.Basic.file);
		if (eefElementEditorReadOnlyState && file.isEnabled()) {
			file.setEnabled(false);
			file.setToolTipText(MtcMessages.InputFile_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !file.isEnabled()) {
			file.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#setFile(EObject newValue)
	 * 
	 */
	public void setFile(EObject newValue) {
		if (newValue != null) {
			file.setSelection(new StructuredSelection(newValue));
		} else {
			file.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.InputFile.Basic.file);
		if (eefElementEditorReadOnlyState && file.isEnabled()) {
			file.setEnabled(false);
			file.setToolTipText(MtcMessages.InputFile_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !file.isEnabled()) {
			file.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#setFileButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFileButtonMode(ButtonsModeEnum newValue) {
		file.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#addFilterFile(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFile(ViewerFilter filter) {
		file.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#addBusinessFilterFile(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFile(ViewerFilter filter) {
		file.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#getTransformation()
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
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#initTransformation(EObjectFlatComboSettings)
	 */
	public void initTransformation(EObjectFlatComboSettings settings) {
		transformation.setInput(settings);
		if (current != null) {
			transformation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.InputFile.Basic.transformation);
		if (eefElementEditorReadOnlyState && transformation.isEnabled()) {
			transformation.setEnabled(false);
			transformation.setToolTipText(MtcMessages.InputFile_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transformation.isEnabled()) {
			transformation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#setTransformation(EObject newValue)
	 * 
	 */
	public void setTransformation(EObject newValue) {
		if (newValue != null) {
			transformation.setSelection(new StructuredSelection(newValue));
		} else {
			transformation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.InputFile.Basic.transformation);
		if (eefElementEditorReadOnlyState && transformation.isEnabled()) {
			transformation.setEnabled(false);
			transformation.setToolTipText(MtcMessages.InputFile_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transformation.isEnabled()) {
			transformation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#setTransformationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTransformationButtonMode(ButtonsModeEnum newValue) {
		transformation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#addFilterTransformation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTransformation(ViewerFilter filter) {
		transformation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart#addBusinessFilterTransformation(ViewerFilter filter)
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
		return MtcMessages.InputFile_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
