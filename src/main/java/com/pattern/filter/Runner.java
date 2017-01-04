package com.pattern.filter;

import java.util.Arrays;
import java.util.List;

import com.pattern.filter.Person.Gender;
import com.pattern.filter.Person.MaritalStatus;

public class Runner {
	public static void main(String ... strings) {
		Person obama = new Person(Gender.MALE, "Obama", MaritalStatus.MARRIED);
		Person putin = new Person(Gender.MALE, "Putin", MaritalStatus.SINGLE);
		Person clinton = new Person(Gender.FEMALE, "Clinton", MaritalStatus.MARRIED);
		Person ozawa = new Person(Gender.FEMALE, "Ozawa", MaritalStatus.SINGLE);
		List<Person> persons = Arrays.asList(obama, putin, clinton, ozawa);
		
		List<Person> single = new CriteriaSingle().meetCriteria(persons);
		List<Person> female = new CriteriaFemale().meetCriteria(persons);
		
		List<Person> singleOrFemale = new OrCriteria(new CriteriaSingle(), new CriteriaFemale()).meetCriteria(persons);
		
		single.forEach(System.out :: println);
		
		female.forEach(System.out :: println);
		
		singleOrFemale.forEach(System.out :: println);
		
	}
}
