package com.uchiharaizens.learnreactspringframework.gaming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.uchiharaizens.learnreactspringframework.gaming")
public class AppGamingSpringBeans {
	
	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(AppGamingSpringBeans.class)) {
			
			GamingConsole temp =(GamingConsole) context.getBean(GamingConsole.class);
			temp.left();
			
			context.getBean(GamingConsole.class).right();
			context.getBean(GameRunner.class).run();
		}
	}
}
