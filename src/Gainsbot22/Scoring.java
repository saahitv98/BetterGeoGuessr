package Gainsbot22;

public class Scoring {
    
    public static double getScore(double x, double y, double actualx, double actualy)
    {
   	 double maxDistance=getDistance(42.037066,-71.4548555,42.090591,-71.401640);
   	 double score=1000.0-1000.0*getDistance(x,y,actualx,actualy)/maxDistance;
   	 return score;
    }
    
    public static double getDistance(double  x, double y, double actualx, double actualy)
    {
   	 double distance=(Math.sqrt(Math.pow(x-actualx, 2)+Math.pow(y-actualy, 2)));
   	 return distance;
    }

    public static void DisplayScore() {
   	 // TODO Auto-generated method stub
   	 
    }
}

