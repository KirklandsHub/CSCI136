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
	
	public static boolean ItemCollisionDetection(int r1TopLeftX, int r1BottomRightX, int r1TopLeftY, int r1BottomRightY,
										  int r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)
	{
		if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY > r2TopLeftY)
				return true;
			else
				return false;
	}
	
	public boolean EnemyCollisionDetection() {
		// This will monitor the player and enemy positions to return true if they collide
		return false;
	}
	

}