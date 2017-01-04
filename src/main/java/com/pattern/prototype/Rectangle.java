package com.pattern.prototype;

public class Rectangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("This is a rectangle!");
	}

	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}
}
