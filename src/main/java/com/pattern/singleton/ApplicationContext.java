package com.pattern.singleton;

public class ApplicationContext {
	
	private static ApplicationContext context = new ApplicationContext();
	
	public static ApplicationContext getIntance() {
		return context;
	}
}
