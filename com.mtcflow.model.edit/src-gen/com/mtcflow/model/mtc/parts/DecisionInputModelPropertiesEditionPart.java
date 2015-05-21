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
public interface DecisionInputModelPropertiesEditionPart {

	/**
	 * @return the LoadForDecisionEvaluation
	 * 
	 */
	public Boolean getLoadForDecisionEvaluation();

	/**
	 * Defines a new LoadForDecisionEvaluation
	 * @param newValue the new LoadForDecisionEvaluation to set
	 * 
	 */
	public void setLoadForDecisionEvaluation(Boolean newValue);


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
	 * Init the choisesToApply
	 * @param settings settings for the choisesToApply ReferencesTable 
	 */
	public void initChoisesToApply(ReferencesTableSettings settings);

	/**
	 * Update the choisesToApply
	 * @param newValue the choisesToApply to update
	 * 
	 */
	public void updateChoisesToApply();

	/**
	 * Adds the given filter to the choisesToApply edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToChoisesToApply(ViewerFilter filter);

	/**
	 * Adds the given filter to the choisesToApply edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToChoisesToApply(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the choisesToApply table
	 * 
	 */
	public boolean isContainedInChoisesToApplyTable(EObject element);





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
