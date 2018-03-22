package project;

/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Movement.java
 * This class contains the methods associated with the movement of the ItemToCollect, Player, and
 * Enemy Class objects.
 */


//currently only being accessed by enemy in panel
public class Movement 
{
	
	private int x;
	private int y;
	private String imagePath;
	
	public Movement(int x, int y, String imagePath)
	{
		
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;	
	}
	
	
	
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
	
	

	public boolean ItemCollisionDetection() {
		// This will monitor the player and item positions to return true if they collide
		return false;
	}
	
	public boolean EnemyCollisionDetection() {
		// This will monitor the player and enemy positions to return true if they collide
		return false;
	}
}