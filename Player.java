/*
 * Kirk and Ben Game Project
 * 3/9/18
 * Player.java
 * This class controls the attributes associated with the player
 */

public class Player {
	private static final String IMGNAME = "";	// set as constant because this path shouldn't change
	private static String playerName;
	private static int[] position = {0,0};
	
	
	
	// This class has attributes, but no methods. position and playerName are changed from other
	// classes.
	
	
	
	// Getters and Setters section:
	// imgName getter
	public static String getImgName() {
		return IMGNAME;
	}
	
	// playerName getter and setter
	public static String getPlayerName() {
		return playerName;
	}
	public static void setPlayerName(String playerName) {
		Player.playerName = playerName;
	}
	
	// position getter and setter
	public static int[] getPosition() {
		return position;
	}
	public static void setPosition(int[] position) {
		Player.position = position;
	}
	
}
