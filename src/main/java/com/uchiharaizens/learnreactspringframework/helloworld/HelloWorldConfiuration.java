package com.uchiharaizens.learnreactspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

@Configuration
public class HelloWorldConfiuration {

	@Bean
	public String name() {
		return "Lukas";
	}
	
	@Bean
	public Integer age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Lukas", 27);
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age() );
	}
	
	@Bean
	public Person personMethod(String name, Integer age) {
		return new Person(name, age);
	}
}
