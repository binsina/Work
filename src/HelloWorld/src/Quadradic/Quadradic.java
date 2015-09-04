package Quadradic;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.math.*;
public class Quadradic {
	

	
	  public static void main(String[] args)
	  {
	    Scanner input = new Scanner(System.in);
	    JOptionPane.showMessageDialog(null,"Welcome To the Quadradic Formula Program:3a2-8b+c ");
	    String name = JOptionPane.showInputDialog(null, "What is your name?");
	    JFrame frame = new JFrame("Per Scholas E.Hernandez:Programming Class");
	    
	    double a = 0;
	    double b = 0;
	    double c = 0;
	    double answer = 0;
        //double input1;
        //double input2;
        //double input3;
        //double answer1;
        
	    String input1 = JOptionPane.showInputDialog(frame, "Please enter a value for a:?");
	   String input2 = JOptionPane.showInputDialog(frame, "Please enter a value for b:?");
	    String input3 = JOptionPane.showInputDialog(frame, "Please enter a value for c:?");
	    
	    System.out.print("Enter the value of a : "); 
	    a = input.nextDouble();
	      
	    
	    System.out.print("Enter the value of b : "); 
	    b = input.nextDouble();
	 
	    
	    System.out.print("Enter the value of c : "); 
	    c = input.nextDouble();
	   
	    answer = (3 * (Math.pow(a,2)) - (8 * b) + c);
	    //answer1=((3 * (input1 * input1))-(8 * input2 +input3));
	    //System.out.print("The Answer to the Equation 3x2-8x+c is:" + " " + answer);
	    
	    System.out.printf(" %s,The Answer to the Equation 3x2-8x+c is: %s",name,answer); 
	      JOptionPane.showMessageDialog(null,answer); 
	   
	    
	   
	   
	    }
	  }
