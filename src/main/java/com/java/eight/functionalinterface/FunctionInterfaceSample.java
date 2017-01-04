package com.java.eight.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.script.ScriptException;

import com.java.eight.method.reference.Person;

public class FunctionInterfaceSample {
	public static void main(String...strings) throws ScriptException {
		FunctionInterfaceSample sample = new FunctionInterfaceSample();
		Person vuong = new Person();
		vuong.setName("Vuong");
		
		List<String> names= Arrays.asList("Vuong", "Tuyen");
		
		boolean isAdultAndNameIsVuong = sample.biPredicate(vuong, names, (t, u) -> u.contains(t.getName()));
		System.out.println(isAdultAndNameIsVuong);
	}
	
	
	public <T> boolean  predicate(T t, Predicate<T> p) {
		return p.test(t);
	}
	
	public <T> void consume(T t , Consumer<T> consume) {
		consume.accept(t);
	}
	
	public <T> T supply(Supplier<T> s) {
		return s.get();
	}
	
	public <T, U> boolean biPredicate(T t, U u, BiPredicate<T,U > biPredicate) {
		return biPredicate.test(t, u);
	}
	

}
