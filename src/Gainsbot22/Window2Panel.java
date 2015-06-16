package Gainsbot22;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.awt.*;
import java.io.File;

import javax.swing.*;

public class Window2Panel extends JPanel implements MouseListener
{
    private GameController gc;
    private Image mapImage;
    private final static File MAP_FILE = new File("map.jpg");
    
    public Window2Panel(GameController gc)
    {
        this.gc = gc;
        try
        {
            this.mapImage = javax.imageio.ImageIO.read(MAP_FILE);
        } catch (Exception e)
        {
            System.err.println("ERROR: Can't open map image file");
            System.exit(80085);
        }
        this.addMouseListener(this);
    }
    
    @Override public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(mapImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        this.gc.onMapClicked(e.getX(), e.getY());
    }

    @Override public void mousePressed(MouseEvent e) { }

    @Override public void mouseReleased(MouseEvent e) { }

    @Override public void mouseEntered(MouseEvent e) { }

    @Override public void mouseExited(MouseEvent e) { }
    
}
