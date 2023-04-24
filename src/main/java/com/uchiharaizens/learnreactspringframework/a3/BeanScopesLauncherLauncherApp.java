package com.uchiharaizens.learnreactspringframework.a3;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
	
}

@Scope(value="prototype")
@Component
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherLauncherApp {
	
	public static void main(String[] args) {	
		try(var context = 
				new AnnotationConfigApplicationContext(
						BeanScopesLauncherLauncherApp.class)) {
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
	}
}
