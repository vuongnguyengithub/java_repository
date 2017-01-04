package com.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;

import com.pattern.filter.Person.Gender;

public class CriteriaFemale implements Criteria{
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return persons.stream().filter(s -> s.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
	}
}
