package com.pattern.builder;

public abstract class ColdDrink implements Item{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing getPacking() {
		return new Bottle();
	}

	@Override
	public abstract double getPrice();

}
