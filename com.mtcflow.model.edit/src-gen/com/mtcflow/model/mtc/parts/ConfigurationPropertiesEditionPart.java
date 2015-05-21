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
public interface ConfigurationPropertiesEditionPart {

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
	 * Init the variables
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initVariables(ReferencesTableSettings settings);

	/**
	 * Update the variables
	 * @param newValue the variables to update
	 * 
	 */
	public void updateVariables();

	/**
	 * Adds the given filter to the variables edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToVariables(ViewerFilter filter);

	/**
	 * Adds the given filter to the variables edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToVariables(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the variables table
	 * 
	 */
	public boolean isContainedInVariablesTable(EObject element);




	/**
	 * Init the tags
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTags(ReferencesTableSettings settings);

	/**
	 * Update the tags
	 * @param newValue the tags to update
	 * 
	 */
	public void updateTags();

	/**
	 * Adds the given filter to the tags edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTags(ViewerFilter filter);

	/**
	 * Adds the given filter to the tags edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTags(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tags table
	 * 
	 */
	public boolean isContainedInTagsTable(EObject element);




	/**
	 * Init the libraries
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initLibraries(ReferencesTableSettings settings);

	/**
	 * Update the libraries
	 * @param newValue the libraries to update
	 * 
	 */
	public void updateLibraries();

	/**
	 * Adds the given filter to the libraries edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLibraries(ViewerFilter filter);

	/**
	 * Adds the given filter to the libraries edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLibraries(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the libraries table
	 * 
	 */
	public boolean isContainedInLibrariesTable(EObject element);




	/**
	 * Init the scripts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initScripts(ReferencesTableSettings settings);

	/**
	 * Update the scripts
	 * @param newValue the scripts to update
	 * 
	 */
	public void updateScripts();

	/**
	 * Adds the given filter to the scripts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToScripts(ViewerFilter filter);

	/**
	 * Adds the given filter to the scripts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToScripts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the scripts table
	 * 
	 */
	public boolean isContainedInScriptsTable(EObject element);




	/**
	 * Init the environments
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEnvironments(ReferencesTableSettings settings);

	/**
	 * Update the environments
	 * @param newValue the environments to update
	 * 
	 */
	public void updateEnvironments();

	/**
	 * Adds the given filter to the environments edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEnvironments(ViewerFilter filter);

	/**
	 * Adds the given filter to the environments edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEnvironments(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the environments table
	 * 
	 */
	public boolean isContainedInEnvironmentsTable(EObject element);





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
