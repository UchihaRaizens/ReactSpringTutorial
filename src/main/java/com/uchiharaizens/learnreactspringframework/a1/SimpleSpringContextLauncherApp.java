package com.uchiharaizens.learnreactspringframework.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApp {	
	
	public static void main(String[] args) {	
		try(var context = 
				new AnnotationConfigApplicationContext(
						SimpleSpringContextLauncherApp.class)) {
			
		}
	}
}
