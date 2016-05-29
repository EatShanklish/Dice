package com.Shanklish.DiceRoll;
import java.util.Scanner;
import java.util.Random;

public class DiceRoll 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		
		do 
		{	
			System.out.println("Please enter the number of sides on your dice:");
			int sides = scan.nextInt();
			
			String garbage = scan.nextLine(); // catches empty line
			
			int rollOne = rollDice(sides);
			int rollTwo = rollDice(sides);
			
			System.out.println("Your first roll yielded: " + rollOne + " \nYour second roll yielded: " + rollTwo);
			
			if(rollOne == 1 && rollTwo == 1)
				System.out.println("Snake Eyes");
			
			else if( (rollOne == 7 || rollOne ==11) && (rollTwo == 7 || rollTwo==11) )
				System.out.println("Craps!");
			
			else if(rollOne == 6 && rollTwo == 6)
				System.out.println("Box Cars!");
			
			System.out.println("Would you like to try again?");
			choice = scan.nextLine();
		
		} while (choice.equalsIgnoreCase("y"));
	}

	public static int rollDice(int x)
	{
		Random rand = new Random();
		int n = rand.nextInt(x);
		
		return n;
	}
}
