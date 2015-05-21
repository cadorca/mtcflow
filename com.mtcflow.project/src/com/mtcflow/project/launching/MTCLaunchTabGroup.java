package com.mtcflow.project.launching;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class MTCLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {

	public MTCLaunchTabGroup() {

	}

	public void dataChanged() {
		MtcLaunchConfigurationTab aTab = (MtcLaunchConfigurationTab) getTabs()[0];
		aTab.infoChanged();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new MtcLaunchConfigurationTab(this), new CommonTab() };
		setTabs(tabs);
	}

}
