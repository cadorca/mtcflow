package com.mtcflow.model.mtc.cimpl;

import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

import com.mtcflow.model.mtc.MTC;

public class MTCCImpl  extends com.mtcflow.model.mtc.impl.MTCImpl {

	private final static StrSubstitutor strSubstitutor = new StrSubstitutor();
	
	@Override
	public String getName() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getName(), variables);
		}
		else
		return super.getName();
	}
	@Override
	public String getM2MTechnology() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getM2MTechnology(), variables);
		}
		else
		return super.getM2MTechnology();
	}
	@Override
	public String getM2TTechnology() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getM2TTechnology(), variables);
		}
		else
		return super.getM2TTechnology();
	}
	@Override
	public String getHOTechnology() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getHOTechnology(), variables);
		}
		else
		return super.getHOTechnology();
	}
	@Override
	public String getM2MTransformationsFolder() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getM2MTransformationsFolder(), variables);
		}
		else
		return super.getM2MTransformationsFolder();
	}
	@Override
	public String getM2TTransformationsFolder() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getM2TTransformationsFolder(), variables);
		}
		else
		return super.getM2TTransformationsFolder();
	}
	@Override
	public String getHOTransformationsFolder() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getHOTransformationsFolder(), variables);
		}
		else
		return super.getHOTransformationsFolder();
	}
	@Override
	public String getMetamodelsFolder() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getMetamodelsFolder(), variables);
		}
		else
		return super.getMetamodelsFolder();
	}
	@Override
	public String getModelsFolder() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getModelsFolder(), variables);
		}
		else
		return super.getModelsFolder();
	}
	@Override
	public String getValidationsFolder() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getValidationsFolder(), variables);
		}
		else
		return super.getValidationsFolder();
	}
	@Override
	public String getVersion() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getVersion(), variables);
		}
		else
		return super.getVersion();
	}
	@Override
	public String getLibrariesFolder() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getLibrariesFolder(), variables);
		}
		else
		return super.getLibrariesFolder();
	}
	@Override
	public String getDescription() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getDescription(), variables);
		}
		else
		return super.getDescription();
	}
	@Override
	public String getWorkspace() {
		MTC mtc = this;
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getWorkspace(), variables);
		}
		else
		return super.getWorkspace();
	}
	
}


