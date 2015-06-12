package Gainsbot22;


import java.util.ArrayList;


public class Database {
    
    public static Double GetXCoordinates(int pictureNumber)
    {
   	 ArrayList<Double> xs = new ArrayList<>();
   	 xs.add(42.098508997913385);
   	 return xs.get(pictureNumber-1);
    }
    
    public static Double GetYCoordinates(int pictureNumber)
    {
   	 ArrayList<Double> ys = new ArrayList<>();
   	 ys.add(-71.37792974710464);
   	 return ys.get(pictureNumber-1);
    }
}


