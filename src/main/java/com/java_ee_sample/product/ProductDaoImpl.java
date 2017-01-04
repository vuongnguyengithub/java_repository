package com.java_ee_sample.product;

import javax.ejb.Stateless;

import com.java_ee_sample.base.BaseDaoImpl;

@Stateless
public class ProductDaoImpl extends BaseDaoImpl<ProductEntity> implements ProductDao{
	
}
