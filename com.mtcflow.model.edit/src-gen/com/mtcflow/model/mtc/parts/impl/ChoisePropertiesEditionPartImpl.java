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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.providers.MtcMessages;

// End of user code

/**
 * 
 * 
 */
public class ChoisePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ChoisePropertiesEditionPart {

	protected Text choiseValue;
	protected EObjectFlatComboViewer decision;
	protected EObjectFlatComboViewer transformation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ChoisePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence choiseStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep basicStep = choiseStep.addStep(MtcViewsRepository.Choise.Basic.class);
		basicStep.addStep(MtcViewsRepository.Choise.Basic.choiseValue);
		basicStep.addStep(MtcViewsRepository.Choise.Basic.decision);
		basicStep.addStep(MtcViewsRepository.Choise.Basic.transformation);
		
		
		composer = new PartComposer(choiseStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MtcViewsRepository.Choise.Basic.class) {
					return createBasicGroup(parent);
				}
				if (key == MtcViewsRepository.Choise.Basic.choiseValue) {
					return createChoiseValueText(parent);
				}
				if (key == MtcViewsRepository.Choise.Basic.decision) {
					return createDecisionFlatComboViewer(parent);
				}
				if (key == MtcViewsRepository.Choise.Basic.transformation) {
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
		basicGroup.setText(MtcMessages.ChoisePropertiesEditionPart_BasicGroupLabel);
		GridData basicGroupData = new GridData(GridData.FILL_HORIZONTAL);
		basicGroupData.horizontalSpan = 3;
		basicGroup.setLayoutData(basicGroupData);
		GridLayout basicGroupLayout = new GridLayout();
		basicGroupLayout.numColumns = 3;
		basicGroup.setLayout(basicGroupLayout);
		return basicGroup;
	}

	
	protected Composite createChoiseValueText(Composite parent) {
		SWTUtils.createPartLabel(parent, MtcMessages.ChoisePropertiesEditionPart_ChoiseValueLabel, propertiesEditionComponent.isRequired(MtcViewsRepository.Choise.Basic.choiseValue, MtcViewsRepository.SWT_KIND));
		choiseValue = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData choiseValueData = new GridData(GridData.FILL_HORIZONTAL);
		choiseValue.setLayoutData(choiseValueData);
		choiseValue.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoisePropertiesEditionPartImpl.this, MtcViewsRepository.Choise.Basic.choiseValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, choiseValue.getText()));
			}

		});
		choiseValue.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoisePropertiesEditionPartImpl.this, MtcViewsRepository.Choise.Basic.choiseValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, choiseValue.getText()));
				}
			}

		});
		EditingUtils.setID(choiseValue, MtcViewsRepository.Choise.Basic.choiseValue);
		EditingUtils.setEEFtype(choiseValue, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.Choise.Basic.choiseValue, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChoiseValueText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDecisionFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.Choise.Basic.decision, MtcMessages.ChoisePropertiesEditionPart_DecisionLabel);
		decision = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.Choise.Basic.decision, MtcViewsRepository.SWT_KIND));
		decision.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decision.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoisePropertiesEditionPartImpl.this, MtcViewsRepository.Choise.Basic.decision, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecision()));
			}

		});
		GridData decisionData = new GridData(GridData.FILL_HORIZONTAL);
		decision.setLayoutData(decisionData);
		decision.setID(MtcViewsRepository.Choise.Basic.decision);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.Choise.Basic.decision, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDecisionFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTransformationFlatComboViewer(Composite parent) {
		createDescription(parent, MtcViewsRepository.Choise.Basic.transformation, MtcMessages.ChoisePropertiesEditionPart_TransformationLabel);
		transformation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MtcViewsRepository.Choise.Basic.transformation, MtcViewsRepository.SWT_KIND));
		transformation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		transformation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChoisePropertiesEditionPartImpl.this, MtcViewsRepository.Choise.Basic.transformation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTransformation()));
			}

		});
		GridData transformationData = new GridData(GridData.FILL_HORIZONTAL);
		transformation.setLayoutData(transformationData);
		transformation.setID(MtcViewsRepository.Choise.Basic.transformation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MtcViewsRepository.Choise.Basic.transformation, MtcViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#getChoiseValue()
	 * 
	 */
	public String getChoiseValue() {
		return choiseValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#setChoiseValue(String newValue)
	 * 
	 */
	public void setChoiseValue(String newValue) {
		if (newValue != null) {
			choiseValue.setText(newValue);
		} else {
			choiseValue.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Choise.Basic.choiseValue);
		if (eefElementEditorReadOnlyState && choiseValue.isEnabled()) {
			choiseValue.setEnabled(false);
			choiseValue.setToolTipText(MtcMessages.Choise_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !choiseValue.isEnabled()) {
			choiseValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#getDecision()
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
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#initDecision(EObjectFlatComboSettings)
	 */
	public void initDecision(EObjectFlatComboSettings settings) {
		decision.setInput(settings);
		if (current != null) {
			decision.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Choise.Basic.decision);
		if (eefElementEditorReadOnlyState && decision.isEnabled()) {
			decision.setEnabled(false);
			decision.setToolTipText(MtcMessages.Choise_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !decision.isEnabled()) {
			decision.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#setDecision(EObject newValue)
	 * 
	 */
	public void setDecision(EObject newValue) {
		if (newValue != null) {
			decision.setSelection(new StructuredSelection(newValue));
		} else {
			decision.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Choise.Basic.decision);
		if (eefElementEditorReadOnlyState && decision.isEnabled()) {
			decision.setEnabled(false);
			decision.setToolTipText(MtcMessages.Choise_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !decision.isEnabled()) {
			decision.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#setDecisionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecisionButtonMode(ButtonsModeEnum newValue) {
		decision.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#addFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecision(ViewerFilter filter) {
		decision.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#addBusinessFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecision(ViewerFilter filter) {
		decision.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#getTransformation()
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
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#initTransformation(EObjectFlatComboSettings)
	 */
	public void initTransformation(EObjectFlatComboSettings settings) {
		transformation.setInput(settings);
		if (current != null) {
			transformation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Choise.Basic.transformation);
		if (eefElementEditorReadOnlyState && transformation.isEnabled()) {
			transformation.setEnabled(false);
			transformation.setToolTipText(MtcMessages.Choise_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transformation.isEnabled()) {
			transformation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#setTransformation(EObject newValue)
	 * 
	 */
	public void setTransformation(EObject newValue) {
		if (newValue != null) {
			transformation.setSelection(new StructuredSelection(newValue));
		} else {
			transformation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(MtcViewsRepository.Choise.Basic.transformation);
		if (eefElementEditorReadOnlyState && transformation.isEnabled()) {
			transformation.setEnabled(false);
			transformation.setToolTipText(MtcMessages.Choise_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transformation.isEnabled()) {
			transformation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#setTransformationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTransformationButtonMode(ButtonsModeEnum newValue) {
		transformation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#addFilterTransformation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTransformation(ViewerFilter filter) {
		transformation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.mtcflow.model.mtc.parts.ChoisePropertiesEditionPart#addBusinessFilterTransformation(ViewerFilter filter)
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
		return MtcMessages.Choise_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
