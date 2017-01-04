package com.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReferenceToAStaticMethodExample {
	public static void main(String[] strings) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> primes = ReferenceToAStaticMethodExample
				.findPrimeNumber(numbers,ReferenceToAStaticMethodExample :: isPrime);
		primes.forEach(System.out::println);
	}
	
	
	public static boolean isPrime(Integer number) {
		if (number == 1) return false;
		for (int i = 2 ; i< number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static List<Integer> findPrimeNumber(List<Integer> numbers, Predicate<Integer> predicate) {
		List<Integer> sortedNumbers = new ArrayList<>();
		numbers.stream().filter((n) -> predicate.test(n)).forEach((i) -> sortedNumbers.add(i));
		return sortedNumbers;
	}
}
