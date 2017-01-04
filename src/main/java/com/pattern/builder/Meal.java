package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public double getCose(){
		Double d = 0d;
		items.stream().map(s -> d + s.getPrice());
		return d;
	}
}
