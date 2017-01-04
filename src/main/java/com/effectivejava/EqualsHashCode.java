package com.effectivejava;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class EqualsHashCode {
	private String name;
	private double price;
	private boolean isOK;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isOK() {
		return isOK;
	}
	public void setOK(boolean isOK) {
		this.isOK = isOK;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof EqualsHashCode)) return false;
		EqualsHashCode eh = (EqualsHashCode) obj;
		if(eh.isOK != this.isOK) return false;
		if(eh.name != this.name) return false;
		if(eh.price != this.price) return false;
		return true;
		
	//	new EqualsBuilder().append(this.name, eh.name).append(this.isOK, eh.isOK).isEquals();
		
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31).append(this.isOK).append(this.price).append(this.name).toHashCode();
	}
	
	
}