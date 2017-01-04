package com.pattern.bridge;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI api) {
		this.drawAPI = api;
	}
	
	public abstract void draw();
}
