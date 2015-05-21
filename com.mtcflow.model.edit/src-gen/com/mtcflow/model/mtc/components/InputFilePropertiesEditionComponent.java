/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.parts.InputFilePropertiesEditionPart;
import com.mtcflow.model.mtc.parts.MtcViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class InputFilePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for file EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fileSettings;
	
	/**
	 * Settings for transformation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings transformationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InputFilePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject inputFile, String editing_mode) {
		super(editingContext, inputFile, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MtcViewsRepository.class;
		partKey = MtcViewsRepository.InputFile.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final InputFile inputFile = (InputFile)elt;
			final InputFilePropertiesEditionPart basePart = (InputFilePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MtcViewsRepository.InputFile.Basic.file)) {
				// init part
				fileSettings = new EObjectFlatComboSettings(inputFile, MtcPackage.eINSTANCE.getInputFile_File());
				basePart.initFile(fileSettings);
				// set the button mode
				basePart.setFileButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MtcViewsRepository.InputFile.Basic.transformation)) {
				// init part
				transformationSettings = new EObjectFlatComboSettings(inputFile, MtcPackage.eINSTANCE.getInputFile_Transformation());
				basePart.initTransformation(transformationSettings);
				// set the button mode
				basePart.setTransformationButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(MtcViewsRepository.InputFile.Basic.file)) {
				basePart.addFilterToFile(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof File);
					}
					
				});
				// Start of user code for additional businessfilters for file
				// End of user code
			}
			if (isAccessible(MtcViewsRepository.InputFile.Basic.transformation)) {
				basePart.addFilterToTransformation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof T2MTransformation);
					}
					
				});
				// Start of user code for additional businessfilters for transformation
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == MtcViewsRepository.InputFile.Basic.file) {
			return MtcPackage.eINSTANCE.getInputFile_File();
		}
		if (editorKey == MtcViewsRepository.InputFile.Basic.transformation) {
			return MtcPackage.eINSTANCE.getInputFile_Transformation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InputFile inputFile = (InputFile)semanticObject;
		if (MtcViewsRepository.InputFile.Basic.file == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fileSettings.setToReference((File)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				File eObject = MtcFactory.eINSTANCE.createFile();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				fileSettings.setToReference(eObject);
			}
		}
		if (MtcViewsRepository.InputFile.Basic.transformation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				transformationSettings.setToReference((T2MTransformation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				T2MTransformation eObject = MtcFactory.eINSTANCE.createT2MTransformation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				transformationSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			InputFilePropertiesEditionPart basePart = (InputFilePropertiesEditionPart)editingPart;
			if (MtcPackage.eINSTANCE.getInputFile_File().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.InputFile.Basic.file))
				basePart.setFile((EObject)msg.getNewValue());
			if (MtcPackage.eINSTANCE.getInputFile_Transformation().equals(msg.getFeature()) && basePart != null && isAccessible(MtcViewsRepository.InputFile.Basic.transformation))
				basePart.setTransformation((EObject)msg.getNewValue());
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			MtcPackage.eINSTANCE.getInputFile_File(),
			MtcPackage.eINSTANCE.getInputFile_Transformation()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MtcViewsRepository.InputFile.Basic.file || key == MtcViewsRepository.InputFile.Basic.transformation;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
