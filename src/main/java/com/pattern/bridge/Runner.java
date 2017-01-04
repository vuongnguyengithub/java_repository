package com.pattern.bridge;

public class Runner {
	public static void main(String...strings) {
		Circle circle = new Circle(new RedCircle());
		circle.draw();
	}
}
