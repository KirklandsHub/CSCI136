package project;
/*
 * Kirk and Ben Game Project
 * 3/10/18
 * ItemToCollect.java
 * This class controls the attributes and methods associated with the item that will be collected
 * in the game (dragonglass)
 */

public class ItemToCollect {
	private static final String IMGNAME = "";	// set as constant because this path shouldn't change
	private static int[] position = {0,0};
	private static int numItemsToAdd, itemsLeft;
	
	
	public static void ItemsToAddIncrementer() {
		// adds one to itemsToAdd
		// called at the end of each level
	}
	
	public static int[] RandomlyAppear() {
		// sets a random position for each item to appear at
		return position;
	}
	
	public static void ItemsLeftTracker() {
		// calls Movement.CollisionDetection
		// if (collision): update itemsLeft
		// if itemsLeft = 0: call Game.LevelIncrementer
	}
	
	
	
	// imgName getter and setter
	public String getImgName() {
		return IMGNAME;
	}
	
	// position getter and setter
	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}
	
	// numItemsToAdd getter and setter
	public int getNumItemsToAdd() {
		return numItemsToAdd;
	}

	public void setNumItemsToAdd(int numItemsToAdd) {
		this.numItemsToAdd = numItemsToAdd;
	}
	
	// itemsLeft getter and setter
	public int getItemsLeft() {
		return itemsLeft;
	}

	public void setItemsLeft(int itemsLeft) {
		this.itemsLeft = itemsLeft;
	}
	
	public String toString()
	{
		return "The ItemsToCollect class works";
	}
	
}	