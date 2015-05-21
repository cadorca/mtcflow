package com.mtcflow.project.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.mtcflow.project.launching.MTCLaunchTabGroup;

public class MTCTabConfiguration extends Composite {
	private Text txtFileName;
	private Text txtModels;
	private Text txtFiles;
	private Text txtTransformation;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtVariables;
	private MTCLaunchTabGroup launchGroup;
	private Text txtTags;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MTCTabConfiguration(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setText("MTC File");
		new Label(this, SWT.NONE);
		
		txtFileName = new Text(this, SWT.BORDER);
		GridData gd_txtFileName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtFileName.widthHint = 270;
		txtFileName.setLayoutData(gd_txtFileName);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
				if (dialog.open() != Window.OK) {
					return;
				}
				IFile file = (IFile) dialog.getResult()[0];
				txtFileName.setText(file.getFullPath().toPortableString());
			}
		});
		btnNewButton.setText("Browse MTC File ...");
		
		Label lblTransformation = new Label(this, SWT.NONE);
		lblTransformation.setText("Transformation");
		
		Label lblNewLabel_2 = new Label(this, SWT.NONE);
		formToolkit.adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("TAGs");
		
		txtTransformation = new Text(this, SWT.BORDER);
		txtTransformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		txtTags = new Text(this, SWT.BORDER);
		txtTags.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(txtTags, true, true);
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		lblNewLabel_1.setText("Models");
		new Label(this, SWT.NONE);
		
		txtModels = new Text(this, SWT.BORDER);
		txtModels.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblFiles = new Label(this, SWT.NONE);
		lblFiles.setText("Files");
		new Label(this, SWT.NONE);
		
		txtFiles = new Text(this, SWT.BORDER);
		txtFiles.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblVariables = new Label(this, SWT.NONE);
		lblVariables.setText("Variables (One variable per line)");
		new Label(this, SWT.NONE);
		
		txtVariables = formToolkit.createText(this, "New Text", SWT.MULTI);
		txtVariables.setText("output=?");
		GridData gd_txtVariables = new GridData(SWT.FILL, SWT.TOP, true, true, 2, 1);
		gd_txtVariables.minimumHeight = 100;
		txtVariables.setLayoutData(gd_txtVariables);
		ModifyListener mListener = new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				launchGroup.dataChanged();
			}
		};
		txtFileName.addModifyListener(mListener);
		txtTags.addModifyListener(mListener);
		txtTransformation.addModifyListener(mListener);
		txtModels.addModifyListener(mListener);
		txtFiles.addModifyListener(mListener);
		txtVariables.addModifyListener(mListener);

	}
	
	public String getFile(){
		return txtFileName.getText();
	}
	
	public void setFile(String fileName){
		txtFileName.setText(fileName);
	}
	
	public String getTransformation() {
		return txtTransformation.getText();
	}

	public void setTransformation(String transformation) {
		txtTransformation.setText(transformation);
	}

	public String getModels() {
		return txtModels.getText();
	}

	public void setModels(String models) {
		txtModels.setText(models);
	}

	public String getFiles() {
		return txtFiles.getText();
	}

	public void setFiles(String files) {
		txtFiles.setText(files);
	}

	public String getVariables() {
		return txtVariables.getText();
	}

	public void setVariables(String variables) {
		txtVariables.setText(variables);
	}
	
	public String getTags() {
		return txtTags.getText();
	}

	public void setTags(String tags) {
		txtTags.setText(tags);
	}

	public MTCLaunchTabGroup getLaunchGroup() {
		return launchGroup;
	}

	public void setLaunchGroup(MTCLaunchTabGroup launchGroup) {
		this.launchGroup = launchGroup;
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
