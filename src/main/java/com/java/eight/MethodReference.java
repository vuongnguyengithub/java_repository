package com.java.eight;

public class MethodReference {
	
	public MethodReference() {
		
	}
	
	public static String getName(){
		return MethodReference.class.getSimpleName();
	}
	
	public Number getNumber() {
		return MethodReference.class.getFields().length;
	}
	
}
