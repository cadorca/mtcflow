/*******************************************************************************
 * Copyright (c) 2013 Camilo Alvarez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Camilo Alvarez (cadorca@gmail.com)  - initial API and implementation
 ******************************************************************************/
/*
 * 
 */
package com.mtcflow.designer.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationEnvironmentsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationLibrariesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationScriptsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationTagsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationVariablesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationOutputTransformationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationOutputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCResourceReferencedResourcesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEnvironmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelMetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelValidationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationInputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TagEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationFileDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationModelDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationEditPart;
import com.mtcflow.designer.diagram.edit.parts.VariableEditPart;
import com.mtcflow.designer.diagram.part.Messages;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;

/**
 * @generated
 */
public class MtcNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public MtcNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<MtcNavigatorItem> result = new ArrayList<MtcNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, MTCEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof MtcNavigatorGroup) {
			MtcNavigatorGroup group = (MtcNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof MtcNavigatorItem) {
			MtcNavigatorItem navigatorItem = (MtcNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (MtcVisualIDRegistry.getVisualID(view)) {

		case MTCEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			MtcNavigatorGroup links = new MtcNavigatorGroup(Messages.NavigatorGroupName_MTC_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2MTransformationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MetamodelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ValidationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ReferencedResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ConfigurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(InputModelEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(OutputModelEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelMetamodelEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelValidationsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationOutputFilesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationInputFilesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationModelDependenciesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationFileDependenciesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case M2MTransformationEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_M2MTransformation_2026_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_M2MTransformation_2026_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(InputModelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(OutputModelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationModelDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationFileDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case T2MTransformationEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_T2MTransformation_2028_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_T2MTransformation_2028_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(InputModelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(OutputModelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationInputFilesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationModelDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationFileDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MTCTransformationEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_MTCTransformation_2029_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_MTCTransformation_2029_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(InputModelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(OutputModelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationOutputFilesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationInputFilesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationModelDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationFileDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case M2TTransformationEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_M2TTransformation_2030_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_M2TTransformation_2030_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(InputModelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationOutputFilesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationModelDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationFileDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MetamodelEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Metamodel_2032_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Metamodel_2032_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelMetamodelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ModelEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Model_2033_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Model_2033_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(InputModelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(OutputModelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelMetamodelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelValidationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationModelDependenciesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ValidationEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Validation_2034_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Validation_2034_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelValidationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ReferencedResourceEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_ReferencedResource_2035_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_ReferencedResource_2035_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConfigurationEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, MtcVisualIDRegistry.getType(LibraryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, MtcVisualIDRegistry.getType(ScriptEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, MtcVisualIDRegistry.getType(VariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, MtcVisualIDRegistry.getType(TagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, MtcVisualIDRegistry.getType(ModelEnvironmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case FileEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_File_2038_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_File_2038_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationOutputFilesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationInputFilesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationFileDependenciesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HOTransformationEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup incominglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_HOTransformation_2039_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_HOTransformation_2039_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(InputModelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(OutputModelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationOutputFilesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationInputFilesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationModelDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(TransformationFileDependenciesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LibraryEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Library_3008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ScriptEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Node sv = (Node) view;
			MtcNavigatorGroup outgoinglinks = new MtcNavigatorGroup(Messages.NavigatorGroupName_Script_3009_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InputModelEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_InputModel_4027_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_InputModel_4027_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2MTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OutputModelEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_OutputModel_4028_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_OutputModel_4028_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ModelValidationsEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_ModelValidations_4031_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_ModelValidations_4031_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ValidationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MTCResourceReferencedResourcesEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_MTCResourceReferencedResources_4033_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_MTCResourceReferencedResources_4033_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ReferencedResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MetamodelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ValidationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ReferencedResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(LibraryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ScriptEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case M2TTransformationOutputFilesEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_M2TTransformationOutputFiles_4034_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_M2TTransformationOutputFiles_4034_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case T2MTransformationInputFilesEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_T2MTransformationInputFiles_4035_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_T2MTransformationInputFiles_4035_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HOTransformationOutputTransformationsEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_HOTransformationOutputTransformations_4039_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_HOTransformationOutputTransformations_4039_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2MTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TransformationModelDependenciesEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_TransformationModelDependencies_4040_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_TransformationModelDependencies_4040_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TransformationFileDependenciesEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_TransformationFileDependencies_4041_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_TransformationFileDependencies_4041_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(HOTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MTCTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(T2MTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(M2TTransformationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ModelMetamodelEditPart.VISUAL_ID: {
			LinkedList<MtcAbstractNavigatorItem> result = new LinkedList<MtcAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MtcNavigatorGroup target = new MtcNavigatorGroup(Messages.NavigatorGroupName_ModelMetamodel_4043_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MtcNavigatorGroup source = new MtcNavigatorGroup(Messages.NavigatorGroupName_ModelMetamodel_4043_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(MetamodelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), MtcVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MTCEditPart.MODEL_ID.equals(MtcVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<MtcNavigatorItem> createNavigatorItems(Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<MtcNavigatorItem> result = new ArrayList<MtcNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new MtcNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<MtcNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof MtcAbstractNavigatorItem) {
			MtcAbstractNavigatorItem abstractNavigatorItem = (MtcAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
