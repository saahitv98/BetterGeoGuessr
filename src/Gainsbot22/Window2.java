package Gainsbot22;

import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.*;

public class Window2
{
	public double score=0;
	private Window1Panel window1Panel;
	private JFrame window1;
	
	 public void mouseClicked(MouseEvent e) {
	      double x=e.getX();
	      double y=e.getY();
	     int pictureNumber=Window2.getLevel();
	      score=score+Scoring.getScore(x,y,Database.GetXCoordinates(pictureNumber),Database.GetYCoordinates(pictureNumber));
	    }
	
	private static final String[] levelNames = 
		{
			null,
			"",
		};
	private static final File[] fileNames = 
		{
			null, 
			new File("map.jpg"),
		};
	
	public Window2(int level)
	{
		if (level > 0 && level < levelNames.length)
		{
			this.window1Panel = new Window1Panel(levelNames[level], fileNames[level]);
			this.window1 = new JFrame("dont worry about it");
			this.window1.setContentPane(this.window1Panel);
			this.setLevel(level);
			this.window1.setSize(500, 500);
			this.window1.setVisible(true);
		} else
		{
			System.err.println("Error: cannot open level " + level);
			System.exit(69);
		}
	}
	
	public void setLevel(int level){
		window1Panel.setLevelName("Score " + score);
		window1Panel.setPicture(new File("map" + ".jpg"));
		this.window1.setContentPane(this.window1Panel);
		this.window1.repaint();
	}

	public static int getLevel()
	{
		int n=1;
		return n;
	}
}
