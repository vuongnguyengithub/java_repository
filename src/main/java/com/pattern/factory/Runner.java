package com.pattern.factory;

public class Runner {
	public static void main(String ...strings) {
		Shape shape = ShapeFactory.getShap(4);
		shape.draw();
	}
}
