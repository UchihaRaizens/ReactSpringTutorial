package com.uchiharaizens.learnreactspringframework.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApp {
	
	public static void main(String[] args) {	
		try(var context = 
				new AnnotationConfigApplicationContext(
						DependencyInjectionLauncherApp.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(
					System.out::println	);
		}
	}
}
