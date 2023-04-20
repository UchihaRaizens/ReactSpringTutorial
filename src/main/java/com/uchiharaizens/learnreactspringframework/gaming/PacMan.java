package com.uchiharaizens.learnreactspringframework.gaming;

public class PacMan implements GamingConsole {

	public void up() {
		System.out.println("Pac Jump");
	}
	
	public void down() {
		System.out.println("Pac Go into hole");
	}
	
	public void left() {
		System.out.println("Pac Go back");
	}
	
	public void right() {
		System.out.println("Pac Accelerate");
	}
}
