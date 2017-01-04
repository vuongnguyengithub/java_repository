package com.java_ee_sample.task;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("productHandler")
public class ProductHandler {

	@Inject
	Event<ProductEvent> event;
	public void synchronize() {
		ProductEvent productEvent = new ProductEvent();
		event.fire(productEvent);
	}
}
