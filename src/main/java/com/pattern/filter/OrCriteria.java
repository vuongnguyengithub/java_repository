package com.pattern.filter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria{
	
	private Criteria firstCriteria;
	private Criteria secondCriteria;
	
	public OrCriteria(Criteria first, Criteria second) {
		this.firstCriteria = first;
		this.secondCriteria = second;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		Set<Person> orPerson = new HashSet<>();
		orPerson.addAll(firstCriteria.meetCriteria(persons));
		orPerson.addAll(secondCriteria.meetCriteria(persons));
		return orPerson.stream().collect(Collectors.toList());
		
	}

	public Criteria getFirstCriteria() {
		return firstCriteria;
	}

	public void setFirstCriteria(Criteria firstCriteria) {
		this.firstCriteria = firstCriteria;
	}

	public Criteria getSecondCriteria() {
		return secondCriteria;
	}

	public void setSecondCriteria(Criteria secondCriteria) {
		this.secondCriteria = secondCriteria;
	}
	
}
