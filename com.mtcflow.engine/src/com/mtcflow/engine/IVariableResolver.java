package com.mtcflow.engine;

import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;

public interface IVariableResolver {

	public void setEnvironment(MTC mtc);

	public String resolve(String expression, MTCResource resource);

}
