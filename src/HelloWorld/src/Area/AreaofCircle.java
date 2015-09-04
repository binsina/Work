package Area;

	import java.math.*;
	import java.text.DecimalFormat;
	import java.util.Scanner;
	import javax.swing.JOptionPane;


	public class AreaofCircle {
		// int number;
		  public static void main (String[] arg) {
		
		 //Scanner scan = new Scanner (System.in);
	   
	         
		  
		    {
		         Scanner input = new Scanner (System.in);
		         
		         JOptionPane.showMessageDialog(null,"         " + "Area of Circle");
		    
		   double radius = 0,area;
		    
		   //JOptionPane.showInputDialog(null,"Enter Radius:");
		  // System.out.println("Enter the Radius:"); 
		  // radius = input.nextDouble();
		        		    	  	   
		 	   
		 	   
		 	   System.out.println("Enter the Radius : "); 
		 	    radius = input.nextDouble();
		 	    
		         
		 	    
		 	DecimalFormat format = new DecimalFormat ("0.00");
		     area = (Math.PI *(Math.pow(radius,2)));
		     System.out.println(area);
		    JOptionPane.showMessageDialog(null, area, null, 0);
		    }
		 
	}
}
