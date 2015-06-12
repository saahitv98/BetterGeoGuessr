package Gainsbot22;

import java.awt.Graphics;

public class Display {
    
    private static int pictureNumber;
    static double score=0;
    static double xclick;
    static double yclick;
    
    public static void main(String[] args)
    {
   	 //insert 2 windows display code here
    }
    
    public static void AdvanceButton()
    {
   	 //onClick()
   	 pictureNumber=pictureNumber+1;
   	 DisplayImage(pictureNumber+1);
    }
    
    private static void DisplayImage(int i) {
   	 // TODO Auto-generated method stub
   	 
    }

    public static void SubmitAnswer()
    {
   	 //onClick()
   	 double actualx=Database.GetXCoordinates(pictureNumber);
   	 double actualy=Database.GetYCoordinates(pictureNumber);
   	 EndPainter.DrawLineandRect(xclick,yclick,actualx,actualy);
   	 score=score+Scoring.getScore(xclick,yclick,actualx,actualy);
   	 Scoring.DisplayScore();
   	 AdvanceButton();
    }

}


