package project;

/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Enemy.java
 * This class controls the attributes and methods associated with the Enemy object
 */

public class Enemy {
	private static final String IMGNAME = "";	// set as constant because this path shouldn't change
	private static int[] position = {0,0};
	private int speed;
	
	
	
	public static int[] RandomlyAppear() {
		// sets a random position for enemy to start at
		// will be called at the beginning of each level
		return position;
	}
	
	public static void MoveTowardPlayer() {
		// uses player position to determine which direction to move, and then updates position
		// This will be called from timer in the main panel		
	}
	
	public static void EnemySpeedIncrementer() {
		// This will be called from LevelIncrementer in the game class
		// It will increase the speed, which will be used by the Timer() in the Panel
	}
	
	
	// Getters and Setters section:
	// imgName getter
	public static String getImgname() {
		return IMGNAME;
	}
	
	// position getter and setter
	public static int[] getPosition() {
		return position;
	}

	public static void setPosition(int[] position) {
		Enemy.position = position;
	}
	
	// speed getter and setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString()
	{
		return "The Enemy class works";
	}
}