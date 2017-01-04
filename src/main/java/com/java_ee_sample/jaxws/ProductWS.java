package com.java_ee_sample.jaxws;

import java.util.List;

import com.java_ee_sample.product.Product;

public interface ProductWS {
	List<Product> getProducts();
}
