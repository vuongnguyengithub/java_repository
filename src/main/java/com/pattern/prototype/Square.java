package com.pattern.prototype;

public class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("This is a square");
	}
	
	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}
}
