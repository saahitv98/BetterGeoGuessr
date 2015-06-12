package Gainsbot22;

import java.io.File;

import javax.swing.*;

public class GameController
{
	private Window1Panel window1Panel;
	private JFrame window1;
	
	private int level = 1;
        public final int MAX_LEVEL = 10;
	
	public GameController(int level)
	{
		if (level > 0 && level <= MAX_LEVEL)
		{
			this.window1Panel = new Window1Panel("Level " + level, new File(level + ".jpg"));
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
	
	public void setLevel(int level)
	{
		window1Panel.setLevelName("Level " + level);
		window1Panel.setPicture(new File(level + ".jpg"));
		this.window1.setContentPane(this.window1Panel);
		this.window1.repaint();
	}

	public static int getLevel()
	{
		int n=1;
		return n;
	}
}
