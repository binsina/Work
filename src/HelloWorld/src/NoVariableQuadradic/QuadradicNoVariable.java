package NoVariableQuadradic;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;

public class QuadradicNoVariable {
	
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	    double x = 0;
	    double answer = 0;
	    JFrame frame = new JFrame("Per Scholas E.Hernandez:Programming Class");
	    //Jframe controls the banner of the out screen
	    String code = JOptionPane.showInputDialog(
	            frame, 
	            "Enter the Password to continue (Hint: its 1234)", 
	            "Per Scholas E.Hernandez:Programming Class", 
	            JOptionPane.WARNING_MESSAGE);
	       
	    String name = JOptionPane.showInputDialog(frame, "What is your name?");
	   //the string name will connect the input of the user to the system out print
	   
	    
	    
	    String input1 = JOptionPane.showInputDialog(frame, "Please enter a value for x:?");
	    System.out.print("Enter the value of x : "); 
	     x = input.nextDouble();
	    
	    
          answer = (3 * (x * x) - (8 * x) + 4);
       
          System.out.printf(" %s, Please note that at the Value of %s, The resulting Value is: %s",name,x,answer); 
	      JOptionPane.showMessageDialog(null,answer); 
	}

}
	
