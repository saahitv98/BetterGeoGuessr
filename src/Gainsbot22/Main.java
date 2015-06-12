package Gainsbot22;

import java.awt.*;
import javax.swing.*;

public class Main
{
	public static void main(String[] args)
	{int n=1;
		GameController Gains= new GameController(n);
		n=Gains.getLevel();
		new Window2(n);
	}
}
