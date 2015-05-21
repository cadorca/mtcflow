/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ChoisePropertiesEditionPart {

	/**
	 * @return the choiseValue
	 * 
	 */
	public String getChoiseValue();

	/**
	 * Defines a new choiseValue
	 * @param newValue the new choiseValue to set
	 * 
	 */
	public void setChoiseValue(String newValue);


	/**
	 * @return the decision
	 * 
	 */
	public EObject getDecision();

	/**
	 * Init the decision
	 * @param settings the combo setting
	 */
	public void initDecision(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decision
	 * @param newValue the new decision to set
	 * 
	 */
	public void setDecision(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecisionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decision edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecision(ViewerFilter filter);

	/**
	 * Adds the given filter to the decision edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecision(ViewerFilter filter);


	/**
	 * @return the transformation
	 * 
	 */
	public EObject getTransformation();

	/**
	 * Init the transformation
	 * @param settings the combo setting
	 */
	public void initTransformation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new transformation
	 * @param newValue the new transformation to set
	 * 
	 */
	public void setTransformation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTransformationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the transformation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTransformation(ViewerFilter filter);

	/**
	 * Adds the given filter to the transformation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTransformation(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
