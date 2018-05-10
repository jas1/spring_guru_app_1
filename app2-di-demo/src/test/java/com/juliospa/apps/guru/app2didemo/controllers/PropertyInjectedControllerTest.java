package com.juliospa.apps.guru.app2didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juliospa.apps.guru.app2didemo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
//		this.propertyInjectedController.greetingService = new GreetingServiceImpl(); // if commented the instantiation test will fail
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
	}

}
