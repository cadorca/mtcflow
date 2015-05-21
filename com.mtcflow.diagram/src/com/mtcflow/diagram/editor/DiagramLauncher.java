package com.mtcflow.diagram.editor;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.osgi.service.prefs.BackingStoreException;

import com.mtcflow.diagram.Activator;

public class DiagramLauncher implements IEditorLauncher {

	static {
		Object factory = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get("aird");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mtcd", factory);
	}

	@Override
	public void open(IPath file) {
		final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		final IFile dFile = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocation(file.removeFileExtension().addFileExtension("mtcd"))[0];
		final ProjectScope ps = new ProjectScope(dFile.getProject());
		final IEclipsePreferences prefs = ps.getNode(Activator.PLUGIN_ID);
		String diagramId = prefs.get(dFile.getProjectRelativePath().toPortableString(), null);
		URI diagramURI = null;
		if (diagramId == null) {
			diagramURI = URI.createURI("/" + dFile.getProject().getName() + "/" + dFile.getProjectRelativePath().toPortableString());
			final ResourceSet rs = new ResourceSetImpl();
			final Resource rsc = rs.createResource(diagramURI);
			try {
				rsc.load(null);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			final DAnalysis root = (DAnalysis) rsc.getContents().get(0);
			final DView dView = root.getOwnedViews().get(0);
			final DRepresentation rep = dView.getOwnedRepresentations().get(0);
			diagramId = ((XMIResource) rsc).getID(rep.getOwnedAnnotationEntries().get(0).getData());
			rsc.unload();
			prefs.put(dFile.getProjectRelativePath().toPortableString(), diagramId);
			try {
				prefs.flush();
			} catch (BackingStoreException ex) {
				ex.printStackTrace();
			}
		}

		try {
			diagramURI = URI.createURI("platform:/resource/" + dFile.getProject().getName() + "/" + dFile.getProjectRelativePath().toPortableString()).appendFragment(diagramId);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		final Session session = getSession(diagramURI.trimFragment());
		final SessionEditorInput sEditor = new SessionEditorInput(diagramURI, "Default", session);
		try {
			IDE.openEditor(page, sEditor, DDiagramEditor.EDITOR_ID, true);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	protected Session getSession(URI sessionModelURI) {
		Session sessionFromURI;
		try {
			sessionFromURI = SessionManager.INSTANCE.getSession(sessionModelURI, new NullProgressMonitor());
			if (sessionFromURI != null) {
				if (!sessionFromURI.isOpen()) {
					sessionFromURI.open(new NullProgressMonitor());
				}
				IEditingSession uiSession = SessionUIManager.INSTANCE.getOrCreateUISession(sessionFromURI);
				uiSession.open();
			}
		} catch (IllegalStateException e) {
			sessionFromURI = null;
			// Silent catch: can happen if failing to retrieve the session from
			// its URI
		}
		return sessionFromURI;
	}

}
