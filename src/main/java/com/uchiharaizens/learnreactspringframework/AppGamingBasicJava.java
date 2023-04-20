package com.uchiharaizens.learnreactspringframework;

import com.uchiharaizens.learnreactspringframework.gaming.GameRunner;
import com.uchiharaizens.learnreactspringframework.gaming.MarioGame;
import com.uchiharaizens.learnreactspringframework.gaming.SuperCobraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var superCobraGame = new SuperCobraGame();
		var gameRunner = new GameRunner(superCobraGame);
		gameRunner.run();

	}

}
 