package com.java_ee_sample.task;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import com.java_ee_sample.product.Product;

@ApplicationScoped
public class ProductPool {
	private static Queue<Product> products;
	
	@PostConstruct
	public void init() {
		products = new LinkedBlockingQueue<>();
		products.add(new Product("Kimchi", "Thit luoc"));
		products.add(new Product("Trung chien", "Thit luoc"));
		products.add(new Product("Dua leo", "Thit luoc"));
	}
	
	public static boolean hasNext() {
		return products != null && !products.isEmpty();
	}
	
	public static Product getProduct(){
		return products.poll();
	}
	
}
