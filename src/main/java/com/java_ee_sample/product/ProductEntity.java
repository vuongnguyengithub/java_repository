package com.java_ee_sample.product;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.java_ee_sample.base.BaseEntity;

@Entity(name="product")
@Table(name="product")
public class ProductEntity extends BaseEntity{
	
	private String name;
	
	@Column(name="made_date")
	private Date madeDate;
	
	@Column(name="made_from")
	private String madeFrom;
	
	private BigDecimal price;
	private String unit;
	
	@Column(name="expired_date")
	private Date expiredDate;
	private String description;
	private String model;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getMadeDate() {
		return madeDate;
	}
	public void setMadeDate(Date madeDate) {
		this.madeDate = madeDate;
	}
	public String getMadeFrom() {
		return madeFrom;
	}
	public void setMadeFrom(String madeFrom) {
		this.madeFrom = madeFrom;
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
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
