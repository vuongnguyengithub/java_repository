package com.pattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> map = new HashMap<>();
	
	
	public static HashMap<String, Shape> getMap(){
		return map;
	}
	public static Shape getCircle(String color) {
		Circle circle = (Circle)map.get(color);
		if(circle == null) {
			circle = new Circle(color);
			map.put(color, circle);
		}
		
		System.err.println(map.size());
		return circle;
	}
}
