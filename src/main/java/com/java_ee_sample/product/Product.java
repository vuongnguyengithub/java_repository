package com.java_ee_sample.product;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
	
	private String name;
	private String description;
	private String madeFrom;
	private Date madeDate;
	private Date expiredDate;
	private BigDecimal price;
	private String unit;
	
	
	
	public Product(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Product() {
		super();
	}
	public Product(String name, String description, String madeFrom, Date madeDate, Date expiredDate, BigDecimal price,
			String unit) {
		super();
		this.name = name;
		this.description = description;
		this.madeFrom = madeFrom;
		this.madeDate = madeDate;
		this.expiredDate = expiredDate;
		this.price = price;
		this.unit = unit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMadeFrom() {
		return madeFrom;
	}
	public void setMadeFrom(String madeFrom) {
		this.madeFrom = madeFrom;
	}
	public Date getMadeDate() {
		return madeDate;
	}
	public void setMadeDate(Date madeDate) {
		this.madeDate = madeDate;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	
}
