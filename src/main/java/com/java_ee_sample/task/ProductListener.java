package com.java_ee_sample.task;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class ProductListener {
	public void synchronize(@Observes ProductEvent event) {
		System.out.println("Listenner");
	}
}
