package com.pattern.flyweight;

import java.util.HashMap;

public class Runner {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(i);
			HashMap<String, Shape> map = ShapeFactory.getMap();
			Circle c = (Circle) map.get(circle.getColor());
			System.err.println(c.getRadius());
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
