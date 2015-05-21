package com.mtcflow.project.launching;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import com.mtcflow.engine.eclipse.MTCEclipseUtils;

public class MTCLaunch implements ILaunchConfigurationDelegate {

	public final static String MTC_LAUNCH_CONFIGURATION = "com.mtcflow.project.launching.MTCLaunchConfiguration";

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(configuration.getAttribute("FILE", ""));
		String transformationName = configuration.getAttribute("TRANSFORMATION", "").trim();
		String tagList = configuration.getAttribute("TAGS", "").trim();
		ArrayList<String> tags = null;
		if (!tagList.isEmpty()) {
			String[] tNames = tagList.split(",");
			tags = new ArrayList<String>();
			for (String string : tNames) {
				tags.add(string.trim());
			}
		}

		String modelList = configuration.getAttribute("MODELS", "").trim();
		ArrayList<String> models = null;
		if (!modelList.isEmpty()) {
			String[] tNames = modelList.split(",");
			models = new ArrayList<String>();
			for (String string : tNames) {
				models.add(string.trim());
			}
		}

		String stringVariables = configuration.getAttribute("VARIABLES", "").trim();
		HashMap<String, Object> variables = new HashMap<String, Object>();
		Properties pro = new Properties();
		try {
			pro.load(new StringReader(stringVariables));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Entry<Object, Object> entry : pro.entrySet()) {
			variables.put(entry.getKey().toString(), entry.getValue());
		}

		MTCEclipseUtils.startMTC(resource, transformationName, models, tags, variables);
	}

}
