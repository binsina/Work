package Payroll;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class PayrollProgram
{
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);

				String cleanInputBuffer;
				String employeeName;
				double hourlyRate;
				double hoursWorked;
				double sum;
				double tax;
				
				
				
				
				JFrame frame = new JFrame("Per Scholas E.Hernandez:Programming Class");
				
			//System.out.println("Welcome to the Payroll Program!\n");
			JOptionPane.showMessageDialog(null,"Welcome to the Payroll Program!\n");
			 // String name = JOptionPane.showInputDialog(frame, "Enter your name?");
			boolean end = false;
			
			while (end == false)
			{
				hourlyRate = -1;
				hoursWorked = -1;
                       tax = -1;
                                //Enter Name with the option to stop the loop by typing stop
                                System.out.println("Enter Name of Employee(enter 'stop' to exit program): ");
                               
                                employeeName = input.nextLine();
                
					int lengthName = employeeName.length();
                    if (lengthName <0){
                    	System.out.println("Please Enter a Name not Numbers");
                    }
                    	//check to see if user is putting in letter only and not numbers    
                    	cleanInputBuffer = input.nextLine();
                     
                    	if ("stop".equals(employeeName)) 
					end = true;
                    	//JOptionPane.showInputDialog(null,"Enter a positive hourly rate:");
					System.out.println("Enter a positive hourly rate:");
						hourlyRate = input.nextDouble();
                    
				while (hoursWorked < 0)
				{
					//JOptionPane.showInputDialog(null,"Enter a positive number of hours worked:");
					System.out.println("Enter a positive number of hours worked:");
						hoursWorked = input.nextDouble();
				}
				sum = hourlyRate * hoursWorked;
				tax = 0.10 * sum;
			
				
				//JOptionPane.showMessageDialog(null,"The employee %s was paid $ %s this week\n\n",employeeName, sum);
				//JOptionPane.showInputDialog(null,"The employee %s was taxed $ %s this week\n\n", employeeName, tax);
				System.out.printf("The employee %s was paid $ %s this week\n\n", employeeName, sum);
				System.out.printf("The employee %s was taxed $ %s this week\n\n", employeeName, tax);
				cleanInputBuffer = input.nextLine();

			}

		}
}
	


