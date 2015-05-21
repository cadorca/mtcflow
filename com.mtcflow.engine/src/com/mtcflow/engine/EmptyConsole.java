package com.mtcflow.engine;

import java.io.PrintStream;

public class EmptyConsole implements IMTCConsole {

	@Override
	public PrintStream getPrintStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printError(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void println(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logException(String message, Throwable t) {
		// TODO Auto-generated method stub
		
	}

}
