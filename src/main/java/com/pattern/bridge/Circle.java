package com.pattern.bridge;

public class Circle extends Shape{
	
	public Circle(DrawAPI api) {
		 super(api);
	}

	@Override
	public void draw() {
		super.drawAPI.drawCircle(1, 1, 1);
	}
}
