package com.pattern.composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.pattern.composite.Employee.Position;

public class Runner {
	public static void main(String ...strings) {
		
		Employee ceo = new Employee("Markus Baur",LocalDate.now(), Position.CEO, null);
		List<Employee> axonEmployees = new ArrayList<>();
		axonEmployees.add(ceo);
	}
}
