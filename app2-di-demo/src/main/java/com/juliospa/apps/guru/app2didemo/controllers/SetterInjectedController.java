package com.juliospa.apps.guru.app2didemo.controllers;

import com.juliospa.apps.guru.app2didemo.services.GreetingService;

/**
 * debated
 *
 */
public class SetterInjectedController {
	private GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

	/* the service its setted: 
	 * it can lead to " null pointers " if hello its invoked before
	 * */
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
