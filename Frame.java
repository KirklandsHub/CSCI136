package project;
/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Frame.java
 */

import javax.swing.JFrame;


public class Frame
{
	static JFrame startFrame = new JFrame("Start Screen");
	static JFrame gameFrame = new JFrame("Game Screen");
	static JFrame gameOverFrame = new JFrame("Game Over");
	
	public static void main(String[] args) {			
			startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			StartPanel startPanel = new StartPanel();
			GameOverPanel gameOverPanel = new GameOverPanel();
			startFrame.getContentPane().add(startPanel);	
			startFrame.pack();	
			startFrame.setVisible(true);
			
	}
	
	public static void startGame() {
		startFrame.dispose();
		gameFrame.getContentPane().removeAll();
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gamePanel = new GamePanel();
		gameFrame.getContentPane().add(gamePanel);	
		gameFrame.pack();
		gameFrame.setVisible(true);
		
	}
	
	public static void gameOver() {
		gameFrame.dispose();
		gameOverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameOverPanel gameOverPanel = new GameOverPanel();
		gameOverFrame.getContentPane().add(gameOverPanel);	
		gameOverFrame.pack();
		gameOverFrame.setVisible(true);
		gameFrame.dispose();
		
	}
	
	public static void startScreen() {
		gameOverFrame.dispose();
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StartPanel startPanel = new StartPanel();
		startFrame.getContentPane().add(startPanel);	
		startFrame.pack();	
		startFrame.setVisible(true);
		gameOverFrame.dispose();
	}
	
}