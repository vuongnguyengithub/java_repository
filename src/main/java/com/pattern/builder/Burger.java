package com.pattern.builder;

public abstract class Burger implements Item{
	@Override
	public Packing getPacking() {
		return new Wrapper();
	}
	
	public abstract double getPrice();
}
