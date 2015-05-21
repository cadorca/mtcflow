package com.mtcflow.model.mtc.cimpl;

import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

import com.mtcflow.model.mtc.MTC;

public class T2MTransformationCImpl  extends com.mtcflow.model.mtc.impl.T2MTransformationImpl {

	private final static StrSubstitutor strSubstitutor = new StrSubstitutor();
	
	@Override
	public String getName() {
		MTC mtc = (MTC) eContainer();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getName(), variables);
		}
		else
		return super.getName();
	}
	@Override
	public String getURI() {
		MTC mtc = (MTC) eContainer();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getURI(), variables);
		}
		else
		return super.getURI();
	}
	@Override
	public String getDescription() {
		MTC mtc = (MTC) eContainer();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getDescription(), variables);
		}
		else
		return super.getDescription();
	}
	@Override
	public String getTechnology() {
		MTC mtc = (MTC) eContainer();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getTechnology(), variables);
		}
		else
		return super.getTechnology();
	}
	@Override
	public String getImplementationClass() {
		MTC mtc = (MTC) eContainer();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getImplementationClass(), variables);
		}
		else
		return super.getImplementationClass();
	}
	
}


