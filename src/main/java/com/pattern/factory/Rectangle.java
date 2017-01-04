package com.pattern.factory;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("I am " + this.getClass());
	}

}
