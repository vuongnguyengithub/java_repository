package com.java_ee_sample.product;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class ProductBean {
	
	@Inject
	ProductService service;
	
	private List<Product> products;
	
	private Product product;
	
	@PostConstruct
	public void init() {
		products = new ArrayList<>();
		products = service.getAll();
		product = new Product();
		
		if (!products.isEmpty()) {
			product = products.get(0);
		} 
	}

	public List<Product> getProducts() {
		return products;
	}
	
	

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
