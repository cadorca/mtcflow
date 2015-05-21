/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import com.mtcflow.model.mtc.parts.MtcViewsRepository;
import com.mtcflow.model.mtc.parts.forms.ChoisePropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.ConfigurationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.DecisionInputModelPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.DecisionPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.FilePropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.HOTransformationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.InputFilePropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.InputModelPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.LibraryPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.M2MTransformationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.M2TTransformationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.MTCPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.MTCTransformationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.MetamodelPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.ModelEnvironmentPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.ModelPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.ModelValidationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.OutputFilePropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.OutputModelPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.PropertyPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.ReferencedResourcePropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.ScriptPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.T2MTransformationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.TagPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.ValidationPropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.forms.VariablePropertiesEditionPartForm;
import com.mtcflow.model.mtc.parts.impl.ChoisePropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.ConfigurationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.DecisionInputModelPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.DecisionPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.FilePropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.HOTransformationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.InputFilePropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.InputModelPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.LibraryPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.M2MTransformationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.M2TTransformationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.MTCPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.MTCTransformationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.MetamodelPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.ModelEnvironmentPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.ModelPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.ModelValidationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.OutputFilePropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.OutputModelPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.PropertyPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.ReferencedResourcePropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.ScriptPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.T2MTransformationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.TagPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.ValidationPropertiesEditionPartImpl;
import com.mtcflow.model.mtc.parts.impl.VariablePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class MtcPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == MtcViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == MtcViewsRepository.MTC_.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new MTCPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new MTCPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Metamodel.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new MetamodelPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new MetamodelPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.ReferencedResource.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ReferencedResourcePropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ReferencedResourcePropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.File.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new FilePropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new FilePropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Model.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ModelPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ModelPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Validation.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ValidationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ValidationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.HOTransformation.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new HOTransformationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new HOTransformationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.M2MTransformation.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new M2MTransformationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new M2MTransformationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.M2TTransformation.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new M2TTransformationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new M2TTransformationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.MTCTransformation.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new MTCTransformationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new MTCTransformationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.T2MTransformation.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new T2MTransformationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new T2MTransformationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.InputModel.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new InputModelPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new InputModelPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.OutputModel.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new OutputModelPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new OutputModelPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Variable.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new VariablePropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new VariablePropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Configuration.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ConfigurationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ConfigurationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Library.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new LibraryPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new LibraryPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Tag.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new TagPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new TagPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Script.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ScriptPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ScriptPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.ModelEnvironment.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ModelEnvironmentPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ModelEnvironmentPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Property.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new PropertyPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new PropertyPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.ModelValidation.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ModelValidationPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ModelValidationPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.OutputFile.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new OutputFilePropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new OutputFilePropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.InputFile.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new InputFilePropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new InputFilePropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Decision.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new DecisionPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new DecisionPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.DecisionInputModel.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new DecisionInputModelPropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new DecisionInputModelPropertiesEditionPartForm(component);
		}
		if (key == MtcViewsRepository.Choise.class) {
			if (kind == MtcViewsRepository.SWT_KIND)
				return new ChoisePropertiesEditionPartImpl(component);
			if (kind == MtcViewsRepository.FORM_KIND)
				return new ChoisePropertiesEditionPartForm(component);
		}
		return null;
	}

}
