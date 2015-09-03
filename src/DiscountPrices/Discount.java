package DiscountPrices;
import java.math.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Discount {
	 public static void main (String[] arg) {
		 
		 int purchase=0,DiscountPrice;
		 
		 		 Scanner input = new Scanner (System.in);
         
        JOptionPane.showMessageDialog(null,"         " + "Discount 10% Program");
	
        JOptionPane.showInputDialog(null,"Enter the Purcahse Price in Cents: ");
         System.out.print("Enter the Purchase Price in cents : "); 
 	     purchase= input.nextInt();
         purchase = input.nextInt();
	if (purchase >= 1000){
		DiscountPrice=(int) ((purchase)-(purchase*0.1));
		System.out.println(DiscountPrice);
	}
	else  
		purchase= 1000;
		System.out.println("The Purchas price has greater then $10.00");}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
