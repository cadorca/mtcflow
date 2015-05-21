package com.mtcflow.project.launching;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class LaunchMTCShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IStructuredSelection sSelection = (IStructuredSelection) window.getActivePage().getSelection();
		Object selectedResource = sSelection.getFirstElement();
		if (!(selectedResource instanceof IResource)) {
			return;
		}
		final IResource resource = (IResource) selectedResource;
		handleLaunch(resource, mode);
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);
		handleLaunch(resource, mode);
	}

	public void handleLaunch(final IResource resource, final String mode) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfiguration selectedConfiguration = null;
		try {
			ILaunchConfiguration[] configurations = manager.getLaunchConfigurations();
			for (ILaunchConfiguration iLaunchConfiguration : configurations) {
				if (iLaunchConfiguration.getType().getIdentifier().equals(MTCLaunch.MTC_LAUNCH_CONFIGURATION) && iLaunchConfiguration.getName().equals(resource.getName())) {
					selectedConfiguration = iLaunchConfiguration;
					break;
				}
			}
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		if (selectedConfiguration == null) {
			ILaunchConfigurationType launchType = manager.getLaunchConfigurationType(MTCLaunch.MTC_LAUNCH_CONFIGURATION);
			try {
				ILaunchConfigurationWorkingCopy workingCopy = launchType.newInstance(null, resource.getName());
				workingCopy.setAttribute("FILE", resource.getFullPath().toPortableString());
				List<String> list = workingCopy.getAttribute(IDebugUIConstants.ATTR_FAVORITE_GROUPS, (List<String>) null);
				if (list == null) {
					list = new ArrayList<String>();
				}
				list.add(IDebugUIConstants.ID_DEBUG_LAUNCH_GROUP);
				list.add(IDebugUIConstants.ID_RUN_LAUNCH_GROUP);
				workingCopy.setAttribute(IDebugUIConstants.ATTR_FAVORITE_GROUPS, list);
				workingCopy.doSave();
				selectedConfiguration = workingCopy;
			} catch (CoreException e) {
				// log.log(Level.WARNING,
				// "Unable to create a new launch configuration.", e);
			}
		}
		MTCLaunch launcher = new MTCLaunch();
		try {
			launcher.launch(selectedConfiguration, mode, null, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
