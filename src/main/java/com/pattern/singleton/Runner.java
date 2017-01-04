package com.pattern.singleton;

public class Runner {
	public static void main(String... strings) {

		Controller controller = Controller.getInstance("First");
		System.out.println(controller.getName()); // First
		controller = Controller.getInstance("Second");
		System.out.println(controller.getName()); // First

	}

	static class Controller {
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
}
