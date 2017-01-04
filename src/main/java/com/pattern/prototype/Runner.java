package com.pattern.prototype;

public class Runner {
	public static void main(String ...strings) {
		ShapeCache.loadCache();
		Shape shape = ShapeCache.getShape(1);
		shape.draw();
	}
}
