package com.pattern.decorator;

public class ShapeDecorator implements Shape{
	protected Shape decoratedShape = null;
	
	public ShapeDecorator(Shape shape) {
		this.decoratedShape =  shape;
	}
	
	@Override
	public void draw() {
		this.decoratedShape.draw();
	}
}
