/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class InputFilePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InputFilePropertiesEditionPart {

	protected EObjectFlatComboViewer file;
	protected EObjectFlatComboViewer transformation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InputFilePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence inputFileStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = inputFileStep.addStep(MtcViewsRepository.InputFile.Basic.class);
		basicStep.addStep(MtcViewsRepository.InputFile.Basic.file);
		basicStep.addStep(MtcViewsRepository.InputFile.Basic.transformation);
		
		
		composer = new PartComposer(inputFileStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.InputFile.Basic.class) {
					return createBasicGroup(parent);
				}
				if (key == MtcViewsRepository.InputFile.Basic.file) {
					return createFileFlatComboViewer(parent);
				}
				if (key == MtcViewsRepository.InputFile.Basic.transformation) {
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
		basicGroup.setText(MtcMessages.InputFilePropertiesEditionPart_BasicGroupLabel);
		GridData basicGroupData = new GridData(GridData.FILL_HORIZONTAL);
		basicGroupData.horizontalSpan = 3;
		basicGroup.setLayoutData(basicGroupData);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		return basicGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFileFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.InputFile.Basic.file, MtcMessages.InputFilePropertiesEditionPart_FileLabel);
		file = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.InputFile.Basic.file, MtcViewsRepository.SWT_KIND));
		file.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		file.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputFilePropertiesEditionPartImpl.this, MtcViewsRepository.InputFile.Basic.file, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFile()));
			}

		});
		GridData fileData = new GridData(GridData.FILL_HORIZONTAL);
		file.setLayoutData(fileData);
		file.setID(MtcViewsRepository.InputFile.Basic.file);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.InputFile.Basic.file, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFileFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTransformationFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.InputFile.Basic.transformation, MtcMessages.InputFilePropertiesEditionPart_TransformationLabel);
		transformation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.InputFile.Basic.transformation, MtcViewsRepository.SWT_KIND));
		transformation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		transformation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputFilePropertiesEditionPartImpl.this, MtcViewsRepository.InputFile.Basic.transformation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTransformation()));
			}

		});
		GridData transformationData = new GridData(GridData.FILL_HORIZONTAL);
		transformation.setLayoutData(transformationData);
		transformation.setID(MtcViewsRepository.InputFile.Basic.transformation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.InputFile.Basic.transformation, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
