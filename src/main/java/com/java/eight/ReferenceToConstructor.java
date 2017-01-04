package com.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReferenceToConstructor {

	public static void main(String... strings) {
		Function<Double, Double> f = new Function<Double,Double>() {

			@Override
			public Double apply(Double t) {
				return Math.sqrt(t);
			}
			
		};
		List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 6);
		List<Double> squareNumbers = ReferenceToConstructor.findSquareRoot(numbers, Double :: new);
		squareNumbers.forEach(System.out::println);
	}

	private static List<Double> findSquareRoot(List<Integer> list, Function<Double, Double> f) {
		List<Double> result = new ArrayList<>();
		list.forEach(x -> result.add(f.apply(Math.sqrt(x))));
		return result;
	}
}
