package com.pattern.factory;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am " + this.getClass());
		
	}
	
	
}
