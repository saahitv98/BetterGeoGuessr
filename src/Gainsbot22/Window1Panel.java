package Gainsbot22;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Window1Panel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7044385053527846210L;
	private JLabel levelNamePane;
	private Image img;
	private Image resizedImg;
	private ImagePane imagePane;
	
	public Window1Panel(String levelName, File pictureFile)
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.levelNamePane = new JLabel(levelName);
		try
		{
			this.img = javax.imageio.ImageIO.read(pictureFile);
		} catch (IOException e)
		{
			System.err.println("Error: unable to read picture from file.");
			e.printStackTrace();
			System.exit(1);
		}
		this.imagePane = new ImagePane();
		this.add(this.levelNamePane);
		this.add(this.imagePane);
	}
	
	public void setPicture(File pictureFile)
	{
		try
		{
			this.img = javax.imageio.ImageIO.read(pictureFile);
		} catch (IOException e)
		{
			System.err.println("Error: unable to read picture from file.");
			e.printStackTrace();
			System.exit(420);
		}
		this.repaint();
	}
	
	public void setLevelName(String text)
	{
		this.levelNamePane.setText(text);
		this.repaint();
	}
	
	private class ImagePane extends JComponent
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 4576027401606150918L;

		@Override
		public void paint(Graphics g)
		{
			resizedImg = img.getScaledInstance(g.getClipBounds().width, g.getClipBounds().height, Image.SCALE_DEFAULT);
			super.paint(g);
			g.drawImage(resizedImg, 0, 0, null);
		}
	}
}
