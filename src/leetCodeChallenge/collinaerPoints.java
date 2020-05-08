package leetCodeChallenge;
import java.util.Scanner;

public class collinaerPoints {
     public static void main(String [] args) {
    	 int [][] co = {{2,4},{4,6},{6,8}};
    	 System.out.println(isCollinear(co));
     }
     
//     point are said to be colliner if they lie on a same line 
     // which can be check using ( (x2-x1)/(y2-y1) = (Xn - x1)/(Yn - y1))
     public static boolean isCollinear (int co[][]) {
    	    
    	 if(co.length==2) {
    		 return true;
    	 }
    	 int [] firstpoint = co[0];
    	 int secondPoint [] = co[1];
    	 int xDiff = secondPoint[0] - firstpoint[0];
    	 int yDiff = secondPoint[1] - firstpoint[1];
    	 
    	 for(int i =0 ; i<co.length;i++) {
    		 int point[] = co[i];
    		 int currentXDiff = point[0] - firstpoint[0];
    		 int currentYDiff = point[1] - firstpoint[1];
    		 if(xDiff*currentYDiff != yDiff*currentXDiff) {
    			 return false;
    		 }
    		 
    	 }
    	 
    	 
    	 
    	 
    	 return true;
     }
}
