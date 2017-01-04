package com.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;

import com.pattern.filter.Person.MaritalStatus;

public class CriteriaSingle implements Criteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return persons.stream().filter(s -> s.getMaritalStatus().equals(MaritalStatus.SINGLE)).collect(Collectors.toList());
	}
}
