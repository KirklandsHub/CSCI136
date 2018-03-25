package project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Player.java
 * This class controls the attributes associated with the player
 */

public class Player implements KeyListener
{
	private String playerName,imagePath;
	private GamePanel myPlayer;
	private int x, y;
	final static int WIDTH = 120, HEIGHT = 100;
	
	
	
	// Constructor
	public Player(String playerName, GamePanel myPlayer, int x, int y, String imagePath) 
	{
		this.playerName = playerName;
		this.myPlayer = myPlayer;
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;	
		myPlayer.addKeyListener(this);
		myPlayer.setFocusable(true);
	}
		
	//makes player move in direction of key pressed
	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		if(arg0.getKeyCode() == KeyEvent.VK_A)
		{
			setX(getX()-5);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_D)
		{
			setX(getX()+5);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_W)
		{
			setY(getY()-5);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_S)
		{
			setY(getY()+5);
		}
		
	myPlayer.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {}	
	@Override
	public void keyTyped(KeyEvent e) {}
	
	
	
	
	//maybe needs to get put into movement class???
	public int getX() 
	{
		return x;
	}

	public int getY() 
	{
		return y;
	}

	public String getImagePath() 
	{
		
		return imagePath;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	

	// playerName getter and setter
	public String getPlayerName() 
	{
		return playerName;
	}
	
}