package Gainsbot22;
import java.awt.Graphics;

public class EndPainter {

    public EndPainter(double xclick,double yclick,double actualx,double actualy) {
    }

    public static void DrawLineandRect(double xclick, double yclick,
   		 double actualx, double actualy) {
   	 int xclickround=(int) (100*(xclick-42.03));
   	 int yclickround=(int) (100*(yclick-72.38));
   	 int actualxround=(int) (100*(actualx-42.03));
   	 int actualyround=(int) (100*(actualy-72.38));
   	/* g.drawRect(xclickround,yclickround,3,3);
   	 g.drawLine(xclickround,yclickround,actualxround,actualyround); */
    }
}

