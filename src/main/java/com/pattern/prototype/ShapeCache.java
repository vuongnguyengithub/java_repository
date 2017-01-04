package com.pattern.prototype;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> cache = new Hashtable<>();
	
	public static Shape getShape(String id) {
		return (Shape)cache.get(id).clone();
	}
	
	public static void loadCache() {
		  Circle circle = new Circle();
	      circle.setId("1");
	      cache.put(circle.getId(),circle);

	      Square square = new Square();
	      square.setId("2");
	      cache.put(square.getId(),square);

	      Rectangle rectangle = new Rectangle();
	      rectangle.setId("3");
	      cache.put(rectangle.getId(), rectangle);	
	}

	public static Shape getShape(int i) {
		return getShape(String.valueOf(i));
	}
}
