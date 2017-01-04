package com.pattern.facade;

public class ShapeMaker {
	private Trapezoid trapezoid;
	private Rhombus rhombus;
	private Rectangle rectangle;
	
	public ShapeMaker() {
		this.trapezoid = new Trapezoid();
		this.rectangle = new Rectangle();
		this.rhombus = new Rhombus();
	}
	
	public void drawRectangle() {
		this.rectangle.draw();
	}
	
	public void drawTrapezoid() {
		this.trapezoid.draw();
	}
	
	public void drawRhrombus() {
		this.rhombus.draw();
	}
	
	
	public ShapeMaker(Trapezoid trapezoid, Rhombus rhombus, Rectangle rectangle) {
		super();
		this.trapezoid = trapezoid;
		this.rhombus = rhombus;
		this.rectangle = rectangle;
	}



	public Trapezoid getTrapezoid() {
		return trapezoid;
	}
	public void setTrapezoid(Trapezoid trapezoid) {
		this.trapezoid = trapezoid;
	}
	public Rhombus getRhombus() {
		return rhombus;
	}
	public void setRhombus(Rhombus rhombus) {
		this.rhombus = rhombus;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	
}
