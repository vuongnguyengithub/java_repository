package com.pattern.singleton;

public class Controller {
	private static Controller controller;

	private String name;

	private Controller(String name) {
		this.name = name;
	}

	public static Controller getInstance(String name) {
		if (controller == null) {
			controller = new Controller(name);
		}
		return controller;
	}

	public String getName() {
		return name;
	}

}
