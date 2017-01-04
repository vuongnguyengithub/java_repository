package com.java_ee_sample.jaxws;

import java.util.List;

import javax.inject.Inject;

import com.java_ee_sample.product.Product;
import com.java_ee_sample.product.ProductService;

public class ProductWSImpl implements ProductWS{
	
	@Inject
	ProductService service;
	
	@Override
	public List<Product> getProducts() {
		return service.getAll();
	}

}
