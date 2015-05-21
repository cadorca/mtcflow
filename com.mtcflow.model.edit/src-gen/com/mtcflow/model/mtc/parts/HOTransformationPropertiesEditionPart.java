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
public interface HOTransformationPropertiesEditionPart {

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
	 * @return the target
	 * 
	 */
	public String getTarget();

	/**
	 * Defines a new target
	 * @param newValue the new target to set
	 * 
	 */
	public void setTarget(String newValue);


	/**
	 * @return the implementationClass
	 * 
	 */
	public String getImplementationClass();

	/**
	 * Defines a new implementationClass
	 * @param newValue the new implementationClass to set
	 * 
	 */
	public void setImplementationClass(String newValue);


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
	 * @return the preExecutionScript
	 * 
	 */
	public EObject getPreExecutionScript();

	/**
	 * Init the preExecutionScript
	 * @param settings the combo setting
	 */
	public void initPreExecutionScript(EObjectFlatComboSettings settings);

	/**
	 * Defines a new preExecutionScript
	 * @param newValue the new preExecutionScript to set
	 * 
	 */
	public void setPreExecutionScript(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPreExecutionScriptButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the preExecutionScript edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPreExecutionScript(ViewerFilter filter);

	/**
	 * Adds the given filter to the preExecutionScript edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPreExecutionScript(ViewerFilter filter);


	/**
	 * @return the postExecutionScript
	 * 
	 */
	public EObject getPostExecutionScript();

	/**
	 * Init the postExecutionScript
	 * @param settings the combo setting
	 */
	public void initPostExecutionScript(EObjectFlatComboSettings settings);

	/**
	 * Defines a new postExecutionScript
	 * @param newValue the new postExecutionScript to set
	 * 
	 */
	public void setPostExecutionScript(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPostExecutionScriptButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the postExecutionScript edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPostExecutionScript(ViewerFilter filter);

	/**
	 * Adds the given filter to the postExecutionScript edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPostExecutionScript(ViewerFilter filter);




	/**
	 * Init the libraries
	 * @param settings settings for the libraries ReferencesTable 
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
	 * Init the outputTransformations
	 * @param settings settings for the outputTransformations ReferencesTable 
	 */
	public void initOutputTransformations(ReferencesTableSettings settings);

	/**
	 * Update the outputTransformations
	 * @param newValue the outputTransformations to update
	 * 
	 */
	public void updateOutputTransformations();

	/**
	 * Adds the given filter to the outputTransformations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputTransformations(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputTransformations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputTransformations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outputTransformations table
	 * 
	 */
	public boolean isContainedInOutputTransformationsTable(EObject element);




	/**
	 * Init the modelDependencies
	 * @param settings settings for the modelDependencies ReferencesTable 
	 */
	public void initModelDependencies(ReferencesTableSettings settings);

	/**
	 * Update the modelDependencies
	 * @param newValue the modelDependencies to update
	 * 
	 */
	public void updateModelDependencies();

	/**
	 * Adds the given filter to the modelDependencies edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToModelDependencies(ViewerFilter filter);

	/**
	 * Adds the given filter to the modelDependencies edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToModelDependencies(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the modelDependencies table
	 * 
	 */
	public boolean isContainedInModelDependenciesTable(EObject element);




	/**
	 * Init the fileDependencies
	 * @param settings settings for the fileDependencies ReferencesTable 
	 */
	public void initFileDependencies(ReferencesTableSettings settings);

	/**
	 * Update the fileDependencies
	 * @param newValue the fileDependencies to update
	 * 
	 */
	public void updateFileDependencies();

	/**
	 * Adds the given filter to the fileDependencies edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFileDependencies(ViewerFilter filter);

	/**
	 * Adds the given filter to the fileDependencies edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFileDependencies(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the fileDependencies table
	 * 
	 */
	public boolean isContainedInFileDependenciesTable(EObject element);





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
