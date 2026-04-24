package com.example.demo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean{
	
	public Motor() {
		System.out.println("Motor::Constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// after bean object creation
		System.out.println("Executed some logic just after bean creation..");
		
	}

	@Override
	public void destroy() throws Exception {
		// execute some logic before destruction of bean object
		System.out.println("Executed some logic just befor bean being destryed...");
	}

}
