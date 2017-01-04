package com.pattern.factory;

public class Square implements Shape {
	
	@Override
	public void draw() {
		System.out.println("I am "+ this.getClass());
	}
}
