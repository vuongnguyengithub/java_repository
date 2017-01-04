package com.pattern.filter;

import java.util.List;

public class AndCriteria implements Criteria{
	private Criteria firstCriteria;
	private Criteria secondCriteria;
	
	public AndCriteria(Criteria first, Criteria second) {
		this.firstCriteria = first;
		this.secondCriteria = second;
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



	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return firstCriteria.meetCriteria(secondCriteria.meetCriteria(persons));
	}
	
	
}
