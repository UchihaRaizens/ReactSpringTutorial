package com.uchiharaizens.learnreactspringframework.gaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GamingConsole gamingConsole;
	
	@Autowired
	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}
	
	public void run() {
		System.out.println("Running game: " + gamingConsole);
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();
	}

	
}
