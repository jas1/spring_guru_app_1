package com.juliospa.apps.guru.app2didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juliospa.apps.guru.app2didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController; 
	
	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
//		as its passed to constructor , this will be ok :D
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
	}

}
