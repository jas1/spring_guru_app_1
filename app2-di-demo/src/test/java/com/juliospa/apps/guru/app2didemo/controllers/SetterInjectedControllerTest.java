package com.juliospa.apps.guru.app2didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juliospa.apps.guru.app2didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
//		this.propertyInjectedController.greetingService = new GreetingServiceImpl(); // if commented the instantiation test will fail
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
	}

}
