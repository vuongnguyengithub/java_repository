package com.pattern.prototype;

public abstract class Shape implements Cloneable{
	
	private String id;
	
	public abstract String getType();
	
	public abstract void draw();
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	protected Object clone() {
		Object shape = null;
		try {
			shape = super.clone();
		} catch(Exception ex) {
			System.err.println("Cannot clone the object");
		}
		return shape;
	}
	
	
}
