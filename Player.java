package project;

/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Player.java
 * This class controls the attributes associated with the player
 */

public class Player {
	private static final String IMGNAME = "";	// set as constant because this path shouldn't change
	private String playerName;
	private static int[] position = {0,0};
	
	// This class has attributes, but no methods. position and playerName are changed from other
	// classes.
	
	// Constructor
	public Player(String playerName) 
	{
		this.playerName = playerName;
	}
	
	// Getters and Setters section:
	// imgName getter
	public static String getImgName() {
		return IMGNAME;
	}
	
	// playerName getter and setter
	public String getPlayerName() {
		return playerName;
	}
	
	// position getter and setter
	public static int[] getPosition() {
		return position;
	}
	public static void setPosition(int[] position) {
		Player.position = position;
	}
	
	public String toString()
	{
		return "The Player class works";
	}
	
}