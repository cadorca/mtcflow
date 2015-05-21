package com.mtcflow.project.launching;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.osgi.framework.Bundle;

import com.mtcflow.project.Activator;
import com.mtcflow.project.ui.MTCTabConfiguration;

public class MtcLaunchConfigurationTab extends AbstractLaunchConfigurationTab {
	MTCTabConfiguration tabConfigurationUI;
	final Image tabImage;
	final MTCLaunchTabGroup launchGroup;

	public MtcLaunchConfigurationTab(MTCLaunchTabGroup launchGroup) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		IPath path = new Path("img/chain.png");
		URL url = FileLocator.find(bundle, path, null);
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		tabImage = desc.createImage();
		this.launchGroup = launchGroup;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}
	
	public void infoChanged(){
		super.updateLaunchConfigurationDialog();
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute("FILE", tabConfigurationUI.getFile());
		configuration.setAttribute("TAGS", tabConfigurationUI.getTags());
		configuration.setAttribute("TRANSFORMATION", tabConfigurationUI.getTransformation());
		configuration.setAttribute("MODELS", tabConfigurationUI.getModels());
		configuration.setAttribute("FILES", tabConfigurationUI.getFiles());
		configuration.setAttribute("VARIABLES", tabConfigurationUI.getVariables());
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			tabConfigurationUI.setFile(configuration.getAttribute("FILE", ""));
			tabConfigurationUI.setTags(configuration.getAttribute("TAGS", ""));
			tabConfigurationUI.setTransformation(configuration.getAttribute("TRANSFORMATION", ""));
			tabConfigurationUI.setModels(configuration.getAttribute("MODELS", ""));
			tabConfigurationUI.setFiles(configuration.getAttribute("FILES", ""));
			tabConfigurationUI.setVariables(configuration.getAttribute("VARIABLES", ""));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Image getImage() {
		return tabImage;
	}

	@Override
	public String getName() {
		return "MTC";
	}

	@Override
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		Composite comp = new Composite(parent, SWT.NONE);
		FillLayout layout = new FillLayout();
		comp.setLayout(layout);
		comp.setFont(font);

		// comp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
		// false, 1, 1));

		setControl(comp);
		if (tabConfigurationUI == null) {
			tabConfigurationUI = new MTCTabConfiguration(comp, SWT.NONE);
			tabConfigurationUI.setLaunchGroup(launchGroup);
		}
	}

}
