package com.mtcflow.designer.diagram.sheet;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.Transformation;

public class MtcPropertySection1 extends AbstractPropertySection {

	public MtcPropertySection1() {

	}

	PropertyTab tab;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 0;
		gridLayout.horizontalSpacing = 0;
		parent.setLayout(gridLayout);
		parent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		System.out.println("Geneación");
		tab = new PropertyTab(parent, SWT.NONE);
		tab.showTabs();
	}

	MTCResource mtc;

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Assert.isTrue(selection instanceof IStructuredSelection);
		mtc = (MTCResource) transformSelectionToDomain(((IStructuredSelection) selection).getFirstElement());
		tab.setResource(mtc);
	}

	public void refresh() {
	}

	protected Object transformSelectionToDomain(Object selected) {
		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

}
