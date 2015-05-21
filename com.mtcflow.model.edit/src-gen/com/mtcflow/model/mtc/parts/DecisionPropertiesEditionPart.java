/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface DecisionPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the Decision Expression
	 * 
	 */
	public String getDecisionExpression();

	/**
	 * Defines a new Decision Expression
	 * @param newValue the new Decision Expression to set
	 * 
	 */
	public void setDecisionExpression(String newValue);


	/**
	 * @return the implemenetaionClass
	 * 
	 */
	public String getImplemenetaionClass();

	/**
	 * Defines a new implemenetaionClass
	 * @param newValue the new implemenetaionClass to set
	 * 
	 */
	public void setImplemenetaionClass(String newValue);




	/**
	 * Init the choises
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initChoises(ReferencesTableSettings settings);

	/**
	 * Update the choises
	 * @param newValue the choises to update
	 * 
	 */
	public void updateChoises();

	/**
	 * Adds the given filter to the choises edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToChoises(ViewerFilter filter);

	/**
	 * Adds the given filter to the choises edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToChoises(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the choises table
	 * 
	 */
	public boolean isContainedInChoisesTable(EObject element);





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
