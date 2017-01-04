package com.java.eight.method.reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.java.eight.method.reference.Person.Gender;

public class MethodReferenceSample {
	public static void main(String... strings) {
		Person person = new Person();
		person.setAge(18);
		person.setGender(Gender.FEMALE);
		person.setName("Vuong");
		
		MethodReferenceSample sample = new MethodReferenceSample();
		
		System.out.println(sample.validate(person, (s) -> s.getAge() >18));
		System.out.println(sample.validate(person, sample::isAdult));
		System.out.println(sample.validate(person, MethodReferenceSample::isOk));
		
		
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda" };
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		}; 
			Arrays.sort(stringArray, String::compareToIgnoreCase);
			Arrays.sort(stringArray, comparator);
			
			Predicate<Person> p = new Predicate<Person>() {
				
				@Override
				public boolean test(Person t) {
					return t.getAge() > 18;
				}
			};
			sample.validate(person, p );
			
			sample.validate(person, Person::isAdult);
			
			
			Supplier<Person> s = new Supplier<Person>() {
				
				@Override
				public Person get() {
					return new Person();
				}
			};
			
			sample.canMarry(s);
			sample.canMarry(() -> new Person());
			
			sample.canMarry(Person::new);
			
			
	}
	
	
	public Person canMarry(Supplier<Person> s) {
		return s.get();
	}
	
	public static boolean isOk(Person p){
		return p.getAge() > 18;
	}
	
	public boolean isAdult(Person p) {
		return p.getAge() > 18;
	}
	
	public boolean validate(Person person, Predicate<Person> predicate) {
		return isValid(predicate, person);
	}
	
	
	public boolean validate(Person person) {
		Predicate<Person> allowToGetMarry = (s) -> s.getAge() > 18;
		Predicate<Person> allowToBuyAlcohol = (s) -> s.getAge() > 15 && s.getGender().equals(Gender.MALE);
		return isValid(allowToBuyAlcohol, person) && isValid(allowToGetMarry, person);
		
	}
	
	public boolean isValid(Predicate<Person> predicate, Person person) {
		return predicate.test(person);
	}
}
