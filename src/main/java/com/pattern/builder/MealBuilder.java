package com.pattern.builder;

public class MealBuilder {
	public Meal vegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		return meal;
	}
	
	public Meal chickenMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		return meal;
	}
	
	static {
		int a = 4;
		int b = 4;
	}
	
}
