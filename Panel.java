package project;
/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Panel.java
 * Panel for displaying graphics of the game (instantiates each other class and prints a test toString)
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Panel extends JPanel
{
	
	
	
	
	
	String membersName;
	

	
	ItemToCollect test = new ItemToCollect();
	
	Movement[] itemlist = new Movement[5];
	
	//ImageIcon myDG = new ImageIcon(myItem.getImagePath());
	//scale image
	//Image DGimg = myDG.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
	
	
	
	
	
	//instantiate Player class for player picture
	Player myPlayer = new Player(membersName, this, 500,50, "./src/Jon Snow.jpg");
	ImageIcon myIcon = new ImageIcon(myPlayer.getImagePath());
	//scale image
	Image newimg = myIcon.getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT);
	
	
	
	//instantiate Movement class for enemy picture
	Enemy myEnemy = new Enemy(this, myPlayer, 0,0, "./src/Night King.jpg");
	ImageIcon myIcon2 = new ImageIcon(myEnemy.getImagePath());
	//scale image
	Image newimg2 = myIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	
	
	
	//instantiate timer
	//Timer myTimer = new Timer(25, new timerListener());
	
	
	
	public Panel()
	{
	setPreferredSize(new Dimension(400,400));
	setBackground(Color.WHITE);
	
	itemlist[0]= new Movement(test.RandomlyAppearX(),test.RandomlyAppearY(),"./src/Dragonglass.jpg");
	itemlist[1]= new Movement(test.RandomlyAppearX(),test.RandomlyAppearY(),"./src/Dragonglass.jpg");
	itemlist[2]= new Movement(test.RandomlyAppearX(),test.RandomlyAppearY(),"./src/Dragonglass.jpg");
	itemlist[3]= new Movement(test.RandomlyAppearX(),test.RandomlyAppearY(),"./src/Dragonglass.jpg");
	itemlist[4]= new Movement(test.RandomlyAppearX(),test.RandomlyAppearY(),"./src/Dragonglass.jpg");
	
	
	
	
	
	//start timer and add both set both icons to scaled images
	//myTimer.start();
	myIcon.setImage(newimg);
	myIcon2.setImage(newimg2);
	//myDG.setImage(DGimg);

	
	}
	
	
	
	//Draws a new picture every time it is called using repaint()
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(), myEnemy.getX(), myEnemy.getY(), null);
		
		for(int i = 0; i < itemlist.length; i ++)
		{
			ImageIcon myDG = new ImageIcon(itemlist[i].getImagePath());
			Image DGimg = myDG.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			myDG.setImage(DGimg);
			page.drawImage(myDG.getImage(), itemlist[i].getX(), itemlist[i].getY(), null);
			
		}
		
	
	}


	
	
	
	//Start button...
	private class buttonHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			
		}
	
	}

	
}