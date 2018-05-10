package com.juliospa.apps.guru.app2didemo.services;

public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO = "hello";

	@Override
	public String sayGreeting() {

		return HELLO;
	}

}
