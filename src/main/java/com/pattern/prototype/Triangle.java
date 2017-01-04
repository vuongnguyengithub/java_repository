package com.pattern.prototype;

public class Triangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("This is a triangle!");
	}

	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}
}
