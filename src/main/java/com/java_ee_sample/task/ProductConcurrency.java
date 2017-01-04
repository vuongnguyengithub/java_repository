package com.java_ee_sample.task;

import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.inject.Inject;

@Singleton
public class ProductConcurrency {
	@Resource(name="DefaultManagedScheduledExecutorService")
	ManagedScheduledExecutorService executor;
	
	@Inject
	ProductHandler handler; 
	
	
	@Schedule(second="0/5", minute="*", hour="*")
	public void run() {
			triggerEven();
	}

	private void triggerEven() {
		handler.synchronize();
	}
	
}
