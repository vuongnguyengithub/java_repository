package com.pattern.composite;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class Employee {
	private String name;
	private LocalDate birthdate;
	private Position position;
	private List<Employee> employees;
	
	public Employee() {
		super();
	}

	public Employee(String name, LocalDate birthdate, Position position, List<Employee> employees) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.position = position;
		this.employees = employees;
	}

	enum Position {
		CEO, HEAD_SALE, SALE, HEAD_DEV, DEV;
		
		String name;
		
		private Position() {
			this.name = StringUtils.EMPTY;
		}
		
		private Position(String position) {
			this.name =  position;
		}
		
		@Override
		public String toString() {
			return this.name();
		}
		
		public String getPosition() {
			return this.name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
