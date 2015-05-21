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
public interface MTCPropertiesEditionPart {

	/**
	 * @return the validateConformance
	 * 
	 */
	public Boolean getValidateConformance();

	/**
	 * Defines a new validateConformance
	 * @param newValue the new validateConformance to set
	 * 
	 */
	public void setValidateConformance(Boolean newValue);


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
	 * @return the version
	 * 
	 */
	public String getVersion();

	/**
	 * Defines a new version
	 * @param newValue the new version to set
	 * 
	 */
	public void setVersion(String newValue);


	/**
	 * @return the M2MTechnology
	 * 
	 */
	public String getM2MTechnology();

	/**
	 * Defines a new M2MTechnology
	 * @param newValue the new M2MTechnology to set
	 * 
	 */
	public void setM2MTechnology(String newValue);


	/**
	 * @return the M2TTechnology
	 * 
	 */
	public String getM2TTechnology();

	/**
	 * Defines a new M2TTechnology
	 * @param newValue the new M2TTechnology to set
	 * 
	 */
	public void setM2TTechnology(String newValue);


	/**
	 * @return the HOTechnology
	 * 
	 */
	public String getHOTechnology();

	/**
	 * Defines a new HOTechnology
	 * @param newValue the new HOTechnology to set
	 * 
	 */
	public void setHOTechnology(String newValue);


	/**
	 * @return the Description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new Description
	 * @param newValue the new Description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the metamodelsFolder
	 * 
	 */
	public String getMetamodelsFolder();

	/**
	 * Defines a new metamodelsFolder
	 * @param newValue the new metamodelsFolder to set
	 * 
	 */
	public void setMetamodelsFolder(String newValue);


	/**
	 * @return the modelsFolder
	 * 
	 */
	public String getModelsFolder();

	/**
	 * Defines a new modelsFolder
	 * @param newValue the new modelsFolder to set
	 * 
	 */
	public void setModelsFolder(String newValue);


	/**
	 * @return the M2MTransformationsFolder
	 * 
	 */
	public String getM2MTransformationsFolder();

	/**
	 * Defines a new M2MTransformationsFolder
	 * @param newValue the new M2MTransformationsFolder to set
	 * 
	 */
	public void setM2MTransformationsFolder(String newValue);


	/**
	 * @return the M2TTransformationsFolder
	 * 
	 */
	public String getM2TTransformationsFolder();

	/**
	 * Defines a new M2TTransformationsFolder
	 * @param newValue the new M2TTransformationsFolder to set
	 * 
	 */
	public void setM2TTransformationsFolder(String newValue);


	/**
	 * @return the HOTransformationsFolder
	 * 
	 */
	public String getHOTransformationsFolder();

	/**
	 * Defines a new HOTransformationsFolder
	 * @param newValue the new HOTransformationsFolder to set
	 * 
	 */
	public void setHOTransformationsFolder(String newValue);


	/**
	 * @return the librariesFolder
	 * 
	 */
	public String getLibrariesFolder();

	/**
	 * Defines a new librariesFolder
	 * @param newValue the new librariesFolder to set
	 * 
	 */
	public void setLibrariesFolder(String newValue);


	/**
	 * @return the validationsFolder
	 * 
	 */
	public String getValidationsFolder();

	/**
	 * Defines a new validationsFolder
	 * @param newValue the new validationsFolder to set
	 * 
	 */
	public void setValidationsFolder(String newValue);


	/**
	 * @return the workspace
	 * 
	 */
	public String getWorkspace();

	/**
	 * Defines a new workspace
	 * @param newValue the new workspace to set
	 * 
	 */
	public void setWorkspace(String newValue);




	/**
	 * Init the metamodels
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMetamodels(ReferencesTableSettings settings);

	/**
	 * Update the metamodels
	 * @param newValue the metamodels to update
	 * 
	 */
	public void updateMetamodels();

	/**
	 * Adds the given filter to the metamodels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMetamodels(ViewerFilter filter);

	/**
	 * Adds the given filter to the metamodels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMetamodels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the metamodels table
	 * 
	 */
	public boolean isContainedInMetamodelsTable(EObject element);




	/**
	 * Init the models
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
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
	 * Init the referencedResources
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
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
	 * Init the transformations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTransformations(ReferencesTableSettings settings);

	/**
	 * Update the transformations
	 * @param newValue the transformations to update
	 * 
	 */
	public void updateTransformations();

	/**
	 * Adds the given filter to the transformations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTransformations(ViewerFilter filter);

	/**
	 * Adds the given filter to the transformations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTransformations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the transformations table
	 * 
	 */
	public boolean isContainedInTransformationsTable(EObject element);




	/**
	 * Init the files
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFiles(ReferencesTableSettings settings);

	/**
	 * Update the files
	 * @param newValue the files to update
	 * 
	 */
	public void updateFiles();

	/**
	 * Adds the given filter to the files edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFiles(ViewerFilter filter);

	/**
	 * Adds the given filter to the files edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFiles(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the files table
	 * 
	 */
	public boolean isContainedInFilesTable(EObject element);




	/**
	 * Init the inputModels
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInputModels(ReferencesTableSettings settings);

	/**
	 * Update the inputModels
	 * @param newValue the inputModels to update
	 * 
	 */
	public void updateInputModels();

	/**
	 * Adds the given filter to the inputModels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputModels(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputModels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputModels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inputModels table
	 * 
	 */
	public boolean isContainedInInputModelsTable(EObject element);




	/**
	 * Init the validations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initValidations(ReferencesTableSettings settings);

	/**
	 * Update the validations
	 * @param newValue the validations to update
	 * 
	 */
	public void updateValidations();

	/**
	 * Adds the given filter to the validations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToValidations(ViewerFilter filter);

	/**
	 * Adds the given filter to the validations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToValidations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the validations table
	 * 
	 */
	public boolean isContainedInValidationsTable(EObject element);




	/**
	 * Init the outputModels
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOutputModels(ReferencesTableSettings settings);

	/**
	 * Update the outputModels
	 * @param newValue the outputModels to update
	 * 
	 */
	public void updateOutputModels();

	/**
	 * Adds the given filter to the outputModels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputModels(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputModels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputModels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outputModels table
	 * 
	 */
	public boolean isContainedInOutputModelsTable(EObject element);




	/**
	 * Init the inputFiles
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInputFiles(ReferencesTableSettings settings);

	/**
	 * Update the inputFiles
	 * @param newValue the inputFiles to update
	 * 
	 */
	public void updateInputFiles();

	/**
	 * Adds the given filter to the inputFiles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputFiles(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputFiles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputFiles(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inputFiles table
	 * 
	 */
	public boolean isContainedInInputFilesTable(EObject element);




	/**
	 * Init the outputFiles
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOutputFiles(ReferencesTableSettings settings);

	/**
	 * Update the outputFiles
	 * @param newValue the outputFiles to update
	 * 
	 */
	public void updateOutputFiles();

	/**
	 * Adds the given filter to the outputFiles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputFiles(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputFiles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputFiles(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outputFiles table
	 * 
	 */
	public boolean isContainedInOutputFilesTable(EObject element);




	/**
	 * Init the modelValidations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initModelValidations(ReferencesTableSettings settings);

	/**
	 * Update the modelValidations
	 * @param newValue the modelValidations to update
	 * 
	 */
	public void updateModelValidations();

	/**
	 * Adds the given filter to the modelValidations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToModelValidations(ViewerFilter filter);

	/**
	 * Adds the given filter to the modelValidations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToModelValidations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the modelValidations table
	 * 
	 */
	public boolean isContainedInModelValidationsTable(EObject element);




	/**
	 * Init the decisions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDecisions(ReferencesTableSettings settings);

	/**
	 * Update the decisions
	 * @param newValue the decisions to update
	 * 
	 */
	public void updateDecisions();

	/**
	 * Adds the given filter to the decisions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecisions(ViewerFilter filter);

	/**
	 * Adds the given filter to the decisions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecisions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decisions table
	 * 
	 */
	public boolean isContainedInDecisionsTable(EObject element);




	/**
	 * Init the decisionInputModels
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDecisionInputModels(ReferencesTableSettings settings);

	/**
	 * Update the decisionInputModels
	 * @param newValue the decisionInputModels to update
	 * 
	 */
	public void updateDecisionInputModels();

	/**
	 * Adds the given filter to the decisionInputModels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecisionInputModels(ViewerFilter filter);

	/**
	 * Adds the given filter to the decisionInputModels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecisionInputModels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decisionInputModels table
	 * 
	 */
	public boolean isContainedInDecisionInputModelsTable(EObject element);





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
