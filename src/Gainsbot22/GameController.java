package Gainsbot22;

import java.io.File;

import javax.swing.*;

public class GameController
{
	private Window1Panel window1Panel;
	private JFrame window1;
        
        private Window2Panel window2Panel;
        private JFrame window2;
	
	private int level = 1;
        public final int MAX_LEVEL = 10;
        
        int totalScore = 0;
	
	public GameController(int level)
	{
            if (level > 0 && level <= MAX_LEVEL)
            {
                this.window1Panel = new Window1Panel("Level " + level, new File(level + ".jpg"));
                this.window1 = new JFrame("dont worry about it");
                this.window1.setContentPane(this.window1Panel);
                this.window1.setSize(500, 500);
                this.window1.addWindowListener(new KillOnClickX());
                
                this.window2Panel = new Window2Panel(this);
                this.window2 = new JFrame("saahit suxz");
                this.window2.setContentPane(this.window2Panel);
                this.window2.setSize(564,808);
                this.window2.setResizable(false);
                this.window2.addWindowListener(new KillOnClickX());
                
                this.window1.setVisible(true);
                this.window2.setVisible(true);
                
                this.setLevel(level);
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

	public int getLevel()
	{
	    return level;
	}
        
        /**
         * Called when the map is clicked.
         */
        public void onMapClicked(int x, int y)
        {
            int score = LocationData.scoreFromClick(this.level, x, y);
            
            JDialog dialog = new JDialog(this.window2, "Score");
            dialog.add(new JLabel("You scored " + score + "!"));
            dialog.setSize(100, 100);
            dialog.setVisible(true);
            
            this.totalScore += score;
            
            if (this.level == MAX_LEVEL)
            {
                JDialog finalDialog = new JDialog(this.window2, "Score");
                finalDialog.add(new JLabel("Your final score was " + totalScore + "!"));
                finalDialog.setSize(100, 100);
                finalDialog.setVisible(true);
                System.exit(0);
            } else
            {
                this.setLevel(this.level + 1);
            }
        }
}
