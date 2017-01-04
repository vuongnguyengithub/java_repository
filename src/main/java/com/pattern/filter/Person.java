package com.pattern.filter;

import com.google.gson.Gson;

public class Person {
	private Gender gender;
	private String name;
	private MaritalStatus maritalStatus;
	
	public Person(Gender gender, String name, MaritalStatus maritalStatus) {
		super();
		this.gender = gender;
		this.name = name;
		this.maritalStatus = maritalStatus;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	enum Gender {
		MALE, FEMALE;
	}
	
	enum MaritalStatus {
		SINGLE, MARRIED, WIDOW;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
