package com.pattern.decorator;

public class RedCircleDecorator extends ShapeDecorator{
	
	public RedCircleDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		System.out.println("Red Circle");
	}
	
}
