package com.pattern.decorator;

public class Runner {
	public static void main(String ...strings) {
		RedCircleDecorator circleDecorator = new RedCircleDecorator(new Circle());
		circleDecorator.draw();
	}
}
