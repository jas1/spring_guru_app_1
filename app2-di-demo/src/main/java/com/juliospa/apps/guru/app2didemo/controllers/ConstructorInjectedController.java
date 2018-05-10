package com.juliospa.apps.guru.app2didemo.controllers;

import com.juliospa.apps.guru.app2didemo.services.GreetingService;

public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	/*
	 * this way you ensure that the service its set on the 
	 */
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
