package com.juliospa.apps.guru.app2didemo.controllers;

import org.springframework.stereotype.Service;

import com.juliospa.apps.guru.app2didemo.services.GreetingServiceImpl;

/**
 * this not to do.
 * @author Administrador
 *
 */
@Service
public class PropertyInjectedController {

	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
