/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ModelValidationPropertiesEditionPart {

	/**
	 * @return the stopOnError
	 * 
	 */
	public Boolean getStopOnError();

	/**
	 * Defines a new stopOnError
	 * @param newValue the new stopOnError to set
	 * 
	 */
	public void setStopOnError(Boolean newValue);


	/**
	 * @return the validation
	 * 
	 */
	public EObject getValidation();

	/**
	 * Init the validation
	 * @param settings the combo setting
	 */
	public void initValidation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new validation
	 * @param newValue the new validation to set
	 * 
	 */
	public void setValidation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setValidationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the validation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToValidation(ViewerFilter filter);

	/**
	 * Adds the given filter to the validation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToValidation(ViewerFilter filter);




	/**
	 * Init the models
	 * @param settings settings for the models ReferencesTable 
	 */
	public void initModels(ReferencesTableSettings settings);

	/**
	 * Update the models
	 * @param newValue the models to update
	 * 
	 */
	public void updateModels();

	/**
	 * Adds the given filter to the models edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToModels(ViewerFilter filter);

	/**
	 * Adds the given filter to the models edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToModels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the models table
	 * 
	 */
	public boolean isContainedInModelsTable(EObject element);





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
