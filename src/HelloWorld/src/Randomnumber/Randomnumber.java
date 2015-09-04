package Randomnumber;
import java.util.Random;
import java.util.Scanner;

public class Randomnumber {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			
		
		
		Random rand = new Random();
				
		Scanner input = new Scanner (System.in);
						
		int numbertoGuess=rand.nextInt(10);
		int numberofTries =2;
		numberofTries++;
		int guess = 0;
		boolean win = false;
		while (win == false) {
			for (int i =0;i<3; i++) {		
		System.out.println(numbertoGuess);
		System.out.println("I am thinking of a number from 1 to 10, you must guess what it is in 3 tries!");
		guess = input.nextInt();
			
		if (guess == numbertoGuess) {
		win = true;
		System.out.println ("You win!");
		}
		else if(guess>numbertoGuess)
		
		{System.out.println("Your getting Colder!!");
		}
		else if ((guess+1 <numbertoGuess))
			
		{System.out.println("your getting hotter!!");
		   }
		}
	
			
		System.out.println ("The number was" +" "+ numbertoGuess);
		System.out.println ("It took you " + numberofTries +" " + "tries, the program will start again");
	}
		
}
}	
