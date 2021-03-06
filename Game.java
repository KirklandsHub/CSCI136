package project;
/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Game.java
 * This class controls the score, level, highscore, and prints these stats out.
 */

public class Game 
{
	
	private static String characterName;
	private static int playerScore;
	private static int highScore;	//probably going to want an array here but for now we will make it an integer
	private static int level;
	
	public Game(String characterName, int playerScore, int highScore, int level)
	{
		this.characterName = characterName;
		this.playerScore = playerScore;
		this.highScore = highScore;
		this.level = level;
		
	}
	
	
	public static void ScoreIncrementer()
	{
		//increments score by one.
		//called every time an item is collected.
	}
	
	
	
	public static void LevelIncrementer()
	{
		//increments level by one.
		//called every time all items are collected.
	}
	
	
	public static void HighScoreFileUpdator()
	{
		//We may want to put this in its own class but for now we will make it a method.
		//If the players final score is greater than or equal to the least score on file, it will replace the least score with new score and sort them accordingly.
		//called when GameOver method is called.
		
	}
	
	
	public static void GameOver()
	{
		//possibly makes a new screen to let the player now that the game is over
	}
	
	
	public static String PrintCurrentPlayerStats()
	{
		//prints players total score
		//called each time levelIncrementer is called
		String score = "" + playerScore;
		
		return score;
	}
	
	
	public static String PrintHighScore()
	{
		//prints all three highscores and the corresponding members names
		//called after GameOver is called
		String highscore = "" + highScore;
		
		return highscore;
		
	}
	
	
	public String toString()
	{
		return "The game class works";
	}

}
