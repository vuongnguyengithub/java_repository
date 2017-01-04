package com.java_ee_sample.task;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.inject.Inject;

import com.java_ee_sample.product.ProductService;

@Stateless
public class ReportBean {
	@Resource
	ManagedScheduledExecutorService executor;
	
	@Inject
	ProductService service;
	
	 public void runReports() {
		 executor.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("SIZE " + service.getAll());
			}
		}, 2, 10, TimeUnit.SECONDS);
	    }
}
