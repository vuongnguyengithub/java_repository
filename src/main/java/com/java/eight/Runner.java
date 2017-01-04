package com.java.eight;

import java.util.function.Supplier;

public class Runner {
	
	public static void main(String... strings) {
		String s = "Hello world!";
		print(s :: length);
		print(() -> s.length());
		print(new Supplier<Integer>() {

			@Override
			public Integer get() {
				return s.length();
			}
		});
	}
	
	public static void print(Supplier<Integer> supplier) {
		System.out.println(supplier.get());
	}
}
