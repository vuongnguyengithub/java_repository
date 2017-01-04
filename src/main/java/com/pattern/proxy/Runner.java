package com.pattern.proxy;

public class Runner {
	public static void main(String ... strings) {
		ProxyImage image = new ProxyImage("fileName");
		image.display();
	}
}
