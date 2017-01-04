package com.pattern.factory;

public class ShapeFactory {
	public static Shape getShap(int n) {
		if (n % 3 == 0) return new Rectangle();
		else if (n%3 == 1) return new Circle();
		else return new Square();
	}
}
