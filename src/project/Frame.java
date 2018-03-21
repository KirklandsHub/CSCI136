package project;
/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Frame.java
 */

import javax.swing.JFrame;


public class Frame 
{
	public static void main(String[] args)
	{
			JFrame myFrame = new JFrame("");
				
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			
			Panel myPanel = new Panel();
			myFrame.getContentPane().add(myPanel);	
			myFrame.pack();	
			myFrame.setVisible(true);
				
	}
}