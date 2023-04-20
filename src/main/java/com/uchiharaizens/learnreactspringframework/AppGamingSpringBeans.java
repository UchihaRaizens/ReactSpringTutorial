package com.uchiharaizens.learnreactspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.uchiharaizens.learnreactspringframework.gaming.GameRunner;
import com.uchiharaizens.learnreactspringframework.gaming.GamingConsole; 

public class AppGamingSpringBeans {

	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			GamingConsole temp =(GamingConsole) context.getBean("game");
			temp.left();
			
			context.getBean(GamingConsole.class).right();
			context.getBean(GameRunner.class).run();
		}
	}
}
