package com.pattern.prototype;

public class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("This is a circle!");
	}
	
	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}
}
