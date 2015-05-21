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
public interface FilePropertiesEditionPart {

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
	 * @return the URI
	 * 
	 */
	public String getURI();

	/**
	 * Defines a new URI
	 * @param newValue the new URI to set
	 * 
	 */
	public void setURI(String newValue);


	/**
	 * @return the type
	 * 
	 */
	public String getType();

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the technology
	 * 
	 */
	public String getTechnology();

	/**
	 * Defines a new technology
	 * @param newValue the new technology to set
	 * 
	 */
	public void setTechnology(String newValue);




	/**
	 * Init the properties
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProperties(ReferencesTableSettings settings);

	/**
	 * Update the properties
	 * @param newValue the properties to update
	 * 
	 */
	public void updateProperties();

	/**
	 * Adds the given filter to the properties edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProperties(ViewerFilter filter);

	/**
	 * Adds the given filter to the properties edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the properties table
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element);




	/**
	 * Init the tags
	 * @param settings settings for the tags ReferencesTable 
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
	 * Init the referencedResources
	 * @param settings settings for the referencedResources ReferencesTable 
	 */
	public void initReferencedResources(ReferencesTableSettings settings);

	/**
	 * Update the referencedResources
	 * @param newValue the referencedResources to update
	 * 
	 */
	public void updateReferencedResources();

	/**
	 * Adds the given filter to the referencedResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the referencedResources table
	 * 
	 */
	public boolean isContainedInReferencedResourcesTable(EObject element);





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
