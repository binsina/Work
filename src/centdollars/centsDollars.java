package centdollars;

import java.math.*;
	import java.text.DecimalFormat;
	import java.util.Scanner;
	import javax.swing.JOptionPane;

	public class centsDollars {
		public static void main(String[] args){
		     double Dollar;
		     double C;
		     double output;
			Scanner scan = new Scanner (System.in);
			 Scanner input = new Scanner (System.in);
	        JOptionPane.showMessageDialog(null,"Welcome lets Convert Cents to Dollars");
	        
	        JOptionPane.showInputDialog(null,"Enter the amount of Cents you have:");
	        System.out.print("Enter the amount of cents");
	        C= input.nextDouble();
	       
	      
		    Dollar=(C % 100);	
		
	      JOptionPane.showMessageDialog(null, "Dollar amount:"  + Dollar);
	      System.out.print("The Dollar amount is:" + " " + Dollar);
	      
		}
	
	
	
	}
	
