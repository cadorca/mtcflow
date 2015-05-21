package com.mtcflow.project.command;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;

public class CreateDiagramCommand implements IHandler{

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if (window == null)
			return null;
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		IResource resource=null;
		resource = (IResource) selection.getFirstElement();
		try {
			createTemplateFileInProjectAt(resource.getProject(), resource.getProjectRelativePath().toPortableString(), resource.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}
	
	/**
	 * 
	 * @param project
	 * @param templateName
	 * @param filename
	 * @throws IOException
	 * @generated NOT
	 */
	public static void createTemplateFileInProjectAt(IProject project, String modelFilePath,  String modelFileName) throws IOException {
		String diagramFilePath = modelFilePath.replaceAll("[.]mtc", ".mtcd");
		Scanner scanner = null;
		try {
			Bundle bundle = Platform.getBundle("com.mtcflow.project");
			URL fileURL = bundle.getEntry("templates/default.mtcd");
			scanner = new Scanner(fileURL.openStream());
			StringBuilder templateBuilder = new StringBuilder();
			while(scanner.hasNext()){
				templateBuilder.append(scanner.nextLine()).append("\n");
			}
			String template = templateBuilder.toString();
			template = template.replaceAll("\\{modelFileName\\}", modelFileName);
			template = template.replaceAll("\\{diagramName\\}", modelFileName.replaceAll("[.]mtc", ""));
			project.getFile(diagramFilePath.replaceAll("/"+project.getName(), "")).create(new ByteArrayInputStream(template.getBytes()), true, null);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error creating the MTC Diagram File", e);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
