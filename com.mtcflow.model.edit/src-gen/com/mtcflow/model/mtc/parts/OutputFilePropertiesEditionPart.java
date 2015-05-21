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
public interface OutputFilePropertiesEditionPart {

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
	 * @return the file
	 * 
	 */
	public EObject getFile();

	/**
	 * Init the file
	 * @param settings the combo setting
	 */
	public void initFile(EObjectFlatComboSettings settings);

	/**
	 * Defines a new file
	 * @param newValue the new file to set
	 * 
	 */
	public void setFile(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFileButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the file edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFile(ViewerFilter filter);

	/**
	 * Adds the given filter to the file edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFile(ViewerFilter filter);





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
