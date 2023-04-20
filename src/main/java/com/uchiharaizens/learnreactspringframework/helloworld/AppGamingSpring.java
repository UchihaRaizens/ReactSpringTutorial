package com.uchiharaizens.learnreactspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpring {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiuration.class)) {
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("personMethod"));
		}

	}

}
