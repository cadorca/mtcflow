/**
 */
package com.mtcflow.model.mtc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;

/**
 * This is the item provider adapter for a {@link com.mtcflow.model.mtc.MTC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MTCItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTCItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addM2MTechnologyPropertyDescriptor(object);
			addM2TTechnologyPropertyDescriptor(object);
			addHOTechnologyPropertyDescriptor(object);
			addM2MTransformationsFolderPropertyDescriptor(object);
			addM2TTransformationsFolderPropertyDescriptor(object);
			addHOTransformationsFolderPropertyDescriptor(object);
			addMetamodelsFolderPropertyDescriptor(object);
			addModelsFolderPropertyDescriptor(object);
			addValidationsFolderPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addLibrariesFolderPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addValidateConformancePropertyDescriptor(object);
			addWorkspacePropertyDescriptor(object);
			addExecutionInformationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_name_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M2M Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM2MTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_M2MTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_M2MTechnology_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__M2M_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M2T Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM2TTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_M2TTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_M2TTechnology_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__M2T_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the HO Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHOTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_HOTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_HOTechnology_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__HO_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M2M Transformations Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM2MTransformationsFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_M2MTransformationsFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_M2MTransformationsFolder_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__M2M_TRANSFORMATIONS_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M2T Transformations Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM2TTransformationsFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_M2TTransformationsFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_M2TTransformationsFolder_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__M2T_TRANSFORMATIONS_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the HO Transformations Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHOTransformationsFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_HOTransformationsFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_HOTransformationsFolder_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__HO_TRANSFORMATIONS_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metamodels Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetamodelsFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_metamodelsFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_metamodelsFolder_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__METAMODELS_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Models Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelsFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_modelsFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_modelsFolder_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__MODELS_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validations Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationsFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_validationsFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_validationsFolder_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__VALIDATIONS_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_version_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Libraries Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLibrariesFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_librariesFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_librariesFolder_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__LIBRARIES_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_description_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validate Conformance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidateConformancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_validateConformance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_validateConformance_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__VALIDATE_CONFORMANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workspace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkspacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_workspace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_workspace_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__WORKSPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTC_executionInformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTC_executionInformation_feature", "_UI_MTC_type"),
				 MtcPackage.Literals.MTC__EXECUTION_INFORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MtcPackage.Literals.MTC__FILES);
			childrenFeatures.add(MtcPackage.Literals.MTC__METAMODELS);
			childrenFeatures.add(MtcPackage.Literals.MTC__MODELS);
			childrenFeatures.add(MtcPackage.Literals.MTC__INPUT_MODELS);
			childrenFeatures.add(MtcPackage.Literals.MTC__TRANSFORMATIONS);
			childrenFeatures.add(MtcPackage.Literals.MTC__OUTPUT_MODELS);
			childrenFeatures.add(MtcPackage.Literals.MTC__VALIDATIONS);
			childrenFeatures.add(MtcPackage.Literals.MTC__CONFIGURATIONS);
			childrenFeatures.add(MtcPackage.Literals.MTC__REFERENCED_RESOURCES);
			childrenFeatures.add(MtcPackage.Literals.MTC__MODEL_VALIDATIONS);
			childrenFeatures.add(MtcPackage.Literals.MTC__INPUT_FILES);
			childrenFeatures.add(MtcPackage.Literals.MTC__OUTPUT_FILES);
			childrenFeatures.add(MtcPackage.Literals.MTC__DECISIONS);
			childrenFeatures.add(MtcPackage.Literals.MTC__DECISION_INPUT_MODELS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MTC.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("chain.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MTC)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MTC_type") :
			getString("_UI_MTC_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MTC.class)) {
			case MtcPackage.MTC__NAME:
			case MtcPackage.MTC__M2M_TECHNOLOGY:
			case MtcPackage.MTC__M2T_TECHNOLOGY:
			case MtcPackage.MTC__HO_TECHNOLOGY:
			case MtcPackage.MTC__M2M_TRANSFORMATIONS_FOLDER:
			case MtcPackage.MTC__M2T_TRANSFORMATIONS_FOLDER:
			case MtcPackage.MTC__HO_TRANSFORMATIONS_FOLDER:
			case MtcPackage.MTC__METAMODELS_FOLDER:
			case MtcPackage.MTC__MODELS_FOLDER:
			case MtcPackage.MTC__VALIDATIONS_FOLDER:
			case MtcPackage.MTC__VERSION:
			case MtcPackage.MTC__LIBRARIES_FOLDER:
			case MtcPackage.MTC__DESCRIPTION:
			case MtcPackage.MTC__VALIDATE_CONFORMANCE:
			case MtcPackage.MTC__WORKSPACE:
			case MtcPackage.MTC__EXECUTION_INFORMATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MtcPackage.MTC__FILES:
			case MtcPackage.MTC__METAMODELS:
			case MtcPackage.MTC__MODELS:
			case MtcPackage.MTC__INPUT_MODELS:
			case MtcPackage.MTC__TRANSFORMATIONS:
			case MtcPackage.MTC__OUTPUT_MODELS:
			case MtcPackage.MTC__VALIDATIONS:
			case MtcPackage.MTC__CONFIGURATIONS:
			case MtcPackage.MTC__REFERENCED_RESOURCES:
			case MtcPackage.MTC__MODEL_VALIDATIONS:
			case MtcPackage.MTC__INPUT_FILES:
			case MtcPackage.MTC__OUTPUT_FILES:
			case MtcPackage.MTC__DECISIONS:
			case MtcPackage.MTC__DECISION_INPUT_MODELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__FILES,
				 MtcFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__METAMODELS,
				 MtcFactory.eINSTANCE.createMetamodel()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__MODELS,
				 MtcFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__INPUT_MODELS,
				 MtcFactory.eINSTANCE.createInputModel()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__TRANSFORMATIONS,
				 MtcFactory.eINSTANCE.createM2TTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__TRANSFORMATIONS,
				 MtcFactory.eINSTANCE.createHOTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__TRANSFORMATIONS,
				 MtcFactory.eINSTANCE.createM2MTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__TRANSFORMATIONS,
				 MtcFactory.eINSTANCE.createMTCTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__TRANSFORMATIONS,
				 MtcFactory.eINSTANCE.createT2MTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__OUTPUT_MODELS,
				 MtcFactory.eINSTANCE.createOutputModel()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__VALIDATIONS,
				 MtcFactory.eINSTANCE.createValidation()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__CONFIGURATIONS,
				 MtcFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__REFERENCED_RESOURCES,
				 MtcFactory.eINSTANCE.createReferencedResource()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__MODEL_VALIDATIONS,
				 MtcFactory.eINSTANCE.createModelValidation()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__INPUT_FILES,
				 MtcFactory.eINSTANCE.createInputFile()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__OUTPUT_FILES,
				 MtcFactory.eINSTANCE.createOutputFile()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__DECISIONS,
				 MtcFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(MtcPackage.Literals.MTC__DECISION_INPUT_MODELS,
				 MtcFactory.eINSTANCE.createDecisionInputModel()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MtcEditPlugin.INSTANCE;
	}

}
