package com.java.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaEight {
	public static void main(String...strings) {
		Predicate<Double> predicate = new Predicate<Double>() {
			@Override
			public boolean test(Double t) {
				return false;
			}
		};
		
		Function<Double, Double> function = new Function<Double, Double>() {
			
			@Override
			public Double apply(Double t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Supplier<Double> supplier = new Supplier<Double>() {
			
			@Override
			public Double get() {
				return null;
			}
		};
 		
		Consumer<Double> consumer = new Consumer<Double>() {
			
			@Override
			public void accept(Double t) {
			}
		};
		
		
		
		List<String> students = new ArrayList<>();
		
	}
}
