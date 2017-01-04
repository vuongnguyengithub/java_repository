package com.pattern.flyweight;

public class Circle implements Shape{
	
	private Number x;
	private Number y;
	private Number radius;
	private String color;
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Circle(Number x, Number y, Number radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}



	public Circle(String color) {
		this.color = color;
	}



	public Number getX() {
		return x;
	}



	public void setX(Number x) {
		this.x = x;
	}



	public Number getY() {
		return y;
	}



	public void setY(Number y) {
		this.y = y;
	}



	public Number getRadius() {
		return radius;
	}



	public void setRadius(Number radius) {
		this.radius = radius;
	}



	 @Override
	   public void draw() {
	      System.err.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	   }
}
