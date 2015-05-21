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
public interface OutputModelPropertiesEditionPart {

	/**
	 * @return the modelAlias
	 * 
	 */
	public String getModelAlias();

	/**
	 * Defines a new modelAlias
	 * @param newValue the new modelAlias to set
	 * 
	 */
	public void setModelAlias(String newValue);


	/**
	 * @return the metamodelAlias
	 * 
	 */
	public String getMetamodelAlias();

	/**
	 * Defines a new metamodelAlias
	 * @param newValue the new metamodelAlias to set
	 * 
	 */
	public void setMetamodelAlias(String newValue);




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
	 * @return the model
	 * 
	 */
	public EObject getModel();

	/**
	 * Init the model
	 * @param settings the combo setting
	 */
	public void initModel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new model
	 * @param newValue the new model to set
	 * 
	 */
	public void setModel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setModelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter);

	/**
	 * Adds the given filter to the model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter);


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
