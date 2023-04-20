package com.uchiharaizens.learnreactspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uchiharaizens.learnreactspringframework.gaming.GameRunner;
import com.uchiharaizens.learnreactspringframework.gaming.GamingConsole;
import com.uchiharaizens.learnreactspringframework.gaming.PacMan;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		return new PacMan();
	}
	
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
}
