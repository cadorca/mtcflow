package com.mtcflow.model.mtc.cimpl;

import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

import com.mtcflow.model.mtc.MTC;

public class OutputModelCImpl  extends com.mtcflow.model.mtc.impl.OutputModelImpl {

	private final static StrSubstitutor strSubstitutor = new StrSubstitutor();
	
	@Override
	public String getModelAlias() {
		MTC mtc = (MTC) eContainer();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getModelAlias(), variables);
		}
		else
		return super.getModelAlias();
	}
	@Override
	public String getMetamodelAlias() {
		MTC mtc = (MTC) eContainer();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getMetamodelAlias(), variables);
		}
		else
		return super.getMetamodelAlias();
	}
	
}


