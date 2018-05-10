package com.juliospa.apps.guru.app2didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.juliospa.apps.guru.app2didemo.controllers.MyController;

@SpringBootApplication
public class App2DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App2DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		controller.hello();
	}
}
