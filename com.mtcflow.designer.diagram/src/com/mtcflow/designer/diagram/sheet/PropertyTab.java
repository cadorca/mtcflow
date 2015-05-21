package com.mtcflow.designer.diagram.sheet;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;

import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage.Literals;
import com.mtcflow.model.mtc.Property;
import com.mtcflow.model.mtc.Transformation;

import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.internal.databinding.conversion.ObjectToStringConverter;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;

public class PropertyTab extends Composite {
	private DataBindingContext m_bindingContext;
	private TransactionalEditingDomain domain;
	private MTCResource commonResource = MtcFactory.eINSTANCE.createFile();
	private Transformation transformation = MtcFactory.eINSTANCE.createM2MTransformation();
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtNewText;
	private Text txtNewText_1;
	private StyledText styledText;
	private Text txtNewText_2;
	private boolean isTransformation;
	private Section transformationSection;
	private Combo combo_1;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public PropertyTab(Composite parent, int style) {
		super(parent, style);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		setLayout(new FormLayout());
		
		Section sctnNewSection = formToolkit.createSection(this, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		FormData fd_sctnNewSection = new FormData();
		fd_sctnNewSection.top = new FormAttachment(0, 3);
		fd_sctnNewSection.left = new FormAttachment(0, 3);
		sctnNewSection.setLayoutData(fd_sctnNewSection);
		formToolkit.paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Basic Info");
		sctnNewSection.setExpanded(true);
		
		Composite composite = formToolkit.createComposite(sctnNewSection, SWT.NONE);
		formToolkit.paintBordersFor(composite);
		sctnNewSection.setClient(composite);
		composite.setLayout(new FormLayout());
		
		Label lblNewLabel_1 = formToolkit.createLabel(composite, "Name:", SWT.NONE);
		FormData fd_lblNewLabel_1 = new FormData();
		fd_lblNewLabel_1.top = new FormAttachment(0, 10);
		fd_lblNewLabel_1.left = new FormAttachment(0, 10);
		lblNewLabel_1.setLayoutData(fd_lblNewLabel_1);
		
		txtNewText = formToolkit.createText(composite, "New Text", SWT.NONE);
		FormData fd_txtNewText = new FormData();
		fd_txtNewText.top = new FormAttachment(0, 5);
		fd_txtNewText.left = new FormAttachment(lblNewLabel_1, 5);
		fd_txtNewText.right = new FormAttachment(100, -10);
		txtNewText.setLayoutData(fd_txtNewText);
		
		Label lblLocation = formToolkit.createLabel(composite, "Location:", SWT.NONE);
		FormData fd_lblLocation = new FormData();
		fd_lblLocation.top = new FormAttachment(lblNewLabel_1, 10);
		fd_lblLocation.left = new FormAttachment(0);
		lblLocation.setLayoutData(fd_lblLocation);
		
		Combo combo = new Combo(composite, SWT.READ_ONLY);
		combo.setItems(new String[] {"FILE", "URL"});
		FormData fd_combo = new FormData();
		fd_combo.right = new FormAttachment(lblLocation, 70, SWT.RIGHT);
		fd_combo.top = new FormAttachment(txtNewText, 6);
		fd_combo.left = new FormAttachment(lblLocation, 1);
		combo.setLayoutData(fd_combo);
		formToolkit.adapt(combo);
		formToolkit.paintBordersFor(combo);
		
		txtNewText_1 = formToolkit.createText(composite, "New Text", SWT.NONE);
		FormData fd_txtNewText_1 = new FormData();
		fd_txtNewText_1.right = new FormAttachment(txtNewText, 0, SWT.RIGHT);
		fd_txtNewText_1.top = new FormAttachment(txtNewText, 5);
		fd_txtNewText_1.left = new FormAttachment(combo, 6);
		txtNewText_1.setLayoutData(fd_txtNewText_1);
		
		Label lblDescription = new Label(composite, SWT.NONE);
		FormData fd_lblDescription = new FormData();
		fd_lblDescription.bottom = new FormAttachment(combo, 16, SWT.BOTTOM);
		fd_lblDescription.top = new FormAttachment(combo, 2);
		fd_lblDescription.left = new FormAttachment(0);
		lblDescription.setLayoutData(fd_lblDescription);
		formToolkit.adapt(lblDescription, true, true);
		lblDescription.setText("Description");
		
		TextViewer textViewer = new TextViewer(composite, SWT.BORDER);
		styledText = textViewer.getTextWidget();
		FormData fd_styledText = new FormData();
		fd_styledText.top = new FormAttachment(lblDescription, 6);
		fd_styledText.bottom = new FormAttachment(100, -12);
		fd_styledText.right = new FormAttachment(txtNewText, 0, SWT.RIGHT);
		fd_styledText.left = new FormAttachment(0);
		styledText.setLayoutData(fd_styledText);
		formToolkit.paintBordersFor(styledText);
		
		transformationSection = formToolkit.createSection(this, Section.TWISTIE | Section.TITLE_BAR);
		fd_sctnNewSection.right = new FormAttachment(100, -7);
		FormData fd_transformationSection = new FormData();
		fd_transformationSection.left = new FormAttachment(sctnNewSection, 0, SWT.LEFT);
		fd_transformationSection.right = new FormAttachment(sctnNewSection, 0, SWT.RIGHT);
		fd_transformationSection.top = new FormAttachment(sctnNewSection, 6);
		fd_transformationSection.bottom = new FormAttachment(0, 228);
		transformationSection.setLayoutData(fd_transformationSection);
		formToolkit.paintBordersFor(transformationSection);
		transformationSection.setText("Transformation");
		transformationSection.setExpanded(true);
		
		Composite composite_1 = new Composite(transformationSection, SWT.NONE);
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		transformationSection.setClient(composite_1);
		composite_1.setLayout(new FormLayout());
		
		Label lblImplementationClass = new Label(composite_1, SWT.NONE);
		FormData fd_lblImplementationClass = new FormData();
		fd_lblImplementationClass.top = new FormAttachment(0, 10);
		fd_lblImplementationClass.left = new FormAttachment(0, 10);
		lblImplementationClass.setLayoutData(fd_lblImplementationClass);
		formToolkit.adapt(lblImplementationClass, true, true);
		lblImplementationClass.setText("Implementation Class");
		
		txtNewText_2 = formToolkit.createText(composite_1, "New Text", SWT.NONE);
		FormData fd_txtNewText_2 = new FormData();
		fd_txtNewText_2.right = new FormAttachment(0, 428);
		fd_txtNewText_2.top = new FormAttachment(lblImplementationClass, 1);
		fd_txtNewText_2.left = new FormAttachment(0, 10);
		txtNewText_2.setLayoutData(fd_txtNewText_2);
		
		ComboViewer comboViewer = new ComboViewer(composite_1, SWT.NONE);
		combo_1 = comboViewer.getCombo();
		FormData fd_combo_1 = new FormData();
		fd_combo_1.top = new FormAttachment(txtNewText_2, 6);
		fd_combo_1.right = new FormAttachment(txtNewText_2, 0, SWT.RIGHT);
		fd_combo_1.left = new FormAttachment(lblImplementationClass, 0, SWT.LEFT);
		combo_1.setLayoutData(fd_combo_1);
		formToolkit.paintBordersFor(combo_1);

		
		m_bindingContext = initDataBindings();
	}

	public MTCResource getResource() {
		return commonResource;
	}

	public void setResource(MTCResource resource) {
		if(resource instanceof Transformation){
			this.transformation = (Transformation) resource;
			transformationSection.setVisible(true);
		}else{
			transformationSection.setVisible(false);
		}
		if (m_bindingContext != null)
			m_bindingContext.dispose();
		this.commonResource = resource;
		final MTCResource tREsurce= resource;
		domain = TransactionUtil.getEditingDomain(resource);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			
			@Override
			protected void doExecute() {
				Property pro = MtcFactory.eINSTANCE.createProperty();
				pro.setName("Key");
				pro.setValue("value");
				
				tREsurce.getProperties().add(pro);
				
			}
		});
		m_bindingContext = initDataBindings();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void showTabs() {
	 
		
	}

	public boolean isTransformation() { 
		return isTransformation;
	}

	public void setTransformation(boolean isTransformation) {
		this.isTransformation = isTransformation;
	}
	public Section getTransformationSection() {
		return transformationSection;
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtNewTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtNewText);
		IObservableValue resourceNameObserveValue = EMFEditObservables.observeValue(domain, commonResource, Literals.MTC_RESOURCE__NAME);
		bindingContext.bindValue(observeTextTxtNewTextObserveWidget, resourceNameObserveValue, null, null);
		//
		IObservableValue observeTextTxtNewText_1ObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtNewText_1);
		IObservableValue resourceFileObserveValue = EMFEditObservables.observeValue(domain, commonResource, Literals.MTC_RESOURCE__FILE);
		bindingContext.bindValue(observeTextTxtNewText_1ObserveWidget, resourceFileObserveValue, null, null);
		//
		IObservableValue observeTextStyledTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(styledText);
		IObservableValue resourceDescriptionObserveValue = EMFEditObservables.observeValue(domain, commonResource, Literals.MTC_RESOURCE__DESCRIPTION);
		bindingContext.bindValue(observeTextStyledTextObserveWidget, resourceDescriptionObserveValue, null, null);
		//
		IObservableValue observeTextTxtNewText_2ObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtNewText_2);
		IObservableValue transformationImplementationClassObserveValue = EMFEditObservables.observeValue(domain, transformation, Literals.TRANSFORMATION__IMPLEMENTATION_CLASS);
		bindingContext.bindValue(observeTextTxtNewText_2ObserveWidget, transformationImplementationClassObserveValue, null, null);
		//
		IObservableList itemsCombo_1ObserveWidget = WidgetProperties.items().observe(combo_1);
		IObservableList commonResourcePropertiesObserveList = EMFEditObservables.observeList(Realm.getDefault(), domain, commonResource, Literals.MTC_RESOURCE__PROPERTIES);
		UpdateListStrategy strategy = new UpdateListStrategy();
		strategy.setConverter(new ObjectToStringConverter());
		bindingContext.bindList(itemsCombo_1ObserveWidget, commonResourcePropertiesObserveList, strategy, null);
		//
		return bindingContext;
	}
}
