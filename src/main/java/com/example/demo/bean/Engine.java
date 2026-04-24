package com.example.demo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine() {
		System.out.println("Engine::Constructor");
	}
	
	@PostConstruct
	public void afterBeanCreated() {
		System.out.println("Engine bean started...");
	}
	
	@PreDestroy
	public void beforeDestroyedBean() {
		System.out.println("Engine bean being destroyed...");
	}

}
