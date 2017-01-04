package com.java_ee_sample.product;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ProductServiceImpl implements ProductService{
	
	@Inject
	ProductDao productDao;
	
	public List<Product> getAll() {
		List<ProductEntity> productEntities = productDao.getAll();
		List<Product> products = new ArrayList<>();
		for(ProductEntity productEntity : productEntities) {
			products.add(productEnitityToProduct(productEntity));
		}
		System.out.println(">>>>>>>>>>> SIZE " + productEntities.size());
		return products;
	}
	
	private Product productEnitityToProduct(ProductEntity productEntity) {
		Product product = new Product();
		product.setDescription(productEntity.getDescription());
		product.setName(productEntity.getName());
		product.setExpiredDate(productEntity.getExpiredDate());
		product.setMadeDate(productEntity.getMadeDate());
		product.setMadeFrom(productEntity.getMadeFrom());
		product.setPrice(productEntity.getPrice());
		product.setUnit(productEntity.getUnit());
		
		return product;
	}
	
	
}
