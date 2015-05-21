package com.mtcflow.model.mtc.cimpl;

import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

import com.mtcflow.model.mtc.MTC;

public class PropertyCImpl  extends com.mtcflow.model.mtc.impl.PropertyImpl {

	private final static StrSubstitutor strSubstitutor = new StrSubstitutor();
	
	@Override
	public String getName() {
		MTC mtc = (MTC) eContainer().eResource().getAllContents().next();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getName(), variables);
		}
		else
		return super.getName();
	}
	@Override
	public String getValue() {
		MTC mtc = (MTC) eContainer().eResource().getAllContents().next();
		if(mtc!=null && mtc.getExecutionInformation() !=null && mtc.getExecutionInformation().get("variables")!=null ){
			Map variables = (Map) mtc.getExecutionInformation().get("variables");
			return strSubstitutor.replace(super.getValue(), variables);
		}
		else 
		return super.getValue();
	}
	
}


