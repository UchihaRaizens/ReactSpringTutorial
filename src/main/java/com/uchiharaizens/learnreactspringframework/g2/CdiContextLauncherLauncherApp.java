package com.uchiharaizens.learnreactspringframework.g2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	DataService dataService;

	
	public DataService getDataService() {
		return dataService;
	}

	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter injection");
		this.dataService = dataService;
	}
	
}

@Named
class DataService {
	
}

@Configuration
@ComponentScan
public class CdiContextLauncherLauncherApp {
	
	public static void main(String[] args) {	
		try(var context = 
				new AnnotationConfigApplicationContext(
						CdiContextLauncherLauncherApp.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
	}
}
