import java.util.Scanner;

/** 
 * Static functions used to check console input for validity.
 *
 * Use:	Place CheckInput class in the same project folder as your code.
 *	Call CheckInput functions from your code using "CheckInput."
 *
 * Example:  int num = CheckInput.getInt();
 *
 * @author Shannon Cleary 2020
 */
public class CheckInput 
{
	/**
	 * Checks if the inputted value is an integer.
	 * @return the valid input.
	 */
	public static int getInt() 
	{
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean valid = false;
		
		System.out.println("Enter An Integer"); 
		
		while(!valid) 
		{
			if(in.hasNextInt()) 
			{
				input = in.nextInt();
				valid = true;
			} 
			else 
			{
				in.next(); //clear invalid string
				System.out.println( "Invalid Input, Enter An Integer");
			}
		System.out.println("Got Integer " + input);  
		}
		return input;
	}
	
	/**
	 * Checks if the inputted value is an integer and 
	 * within the specified range (ex: 1-10)
	 * @param low lower bound of the range.
	 * @param high upper bound of the range.
	 * @return the valid input.
	 */
	public static int getIntRange(int low, int high) 
	{
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean valid = false;
		while(!valid) 
		{
			if(in.hasNextInt()) 
			{
				input = in.nextInt();
				if(input <= high && input >= low) 
				{
					valid = true;
				} 
				else 
				{
					System.out.println("Invalid Range, Enter an Integer 1 - 45 :");
				}
			} 
			else 
			{
				in.next(); //clear invalid string
				System.out.println("Invalid Input, Enter an Integer :");
			}
		}
		return input;
	}
	/**
	 * Checks if the inputted value is a non-negative integer.
	 * @return the valid input.
	 */
	public static int getPositiveInt() 
	{
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean valid = false;
		
		System.out.println("Enter An Positive Integer"); 
		
		while(!valid) 
		{
			if(in.hasNextInt()) 
			{
				input = in.nextInt();
				if(input >= 0) 
				{
					valid = true;
				} 
				else 
				{
					System.out.println("Invalid Range, Enter A Positive Integer");
				}
			} 
			else 
			{
				in.next(); //clear invalid string
				System.out.println("Invalid Input, Enter A Positive Integer");
			}
		System.out.println("Got Positive Value " + input);  
		}
		return input;
	}

	/**
	 * Checks if the inputted value is a double.
	 * @return the valid input.
	 */
	public static double getDouble() 
	{
		Scanner in = new Scanner(System.in);
		double input = 0;
		boolean valid = false;
		
		System.out.println("Enter A Double"); 
		
		while(!valid) 
		{
			if(in.hasNextDouble()) 
			{
				input = in.nextDouble();
				valid = true;
			} 
			else 
			{
				in.next(); //clear invalid string
				System.out.println("Invalid Input, Enter A Double");
			}
		System.out.println("Got Double " + input);  
		}
		return input;
	}
	
	/**
	 * Takes in a string from the user.
	 * @return the inputted String.
	 */
	public static String getString() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A String"); 
		String input = in.nextLine();
		System.out.println("Got String " + input); 
		return input; 
	}

	/**
	 * Takes in a yes/no from the user.
	 * @return true if yes, false if no.
	 */
	public static boolean getYesNo() 
	{
		boolean valid = false;
		while(!valid) 
		{
			String s = getString();
			if( s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y")) 
			{
				return true;
			} 
			else if( s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n")) 
			{
				return false;
			} 
			else 
			{
				System.out.println("Invalid Input.");
			}
		}
		return false;
	}	
	
	public static void main(String[] args) 
	{
		System.out.println( "We are going to create a menu");
		System.out.println( "Practice data entry validation");
		System.out.println( "Practice Concatenation");
		
		Scanner keyboard = new Scanner(System.in);
		int num = 0; // example validation //= CheckInput.getInt();
		
		// Display the menu and get the menu option
		System.out.println("Lab2\t Please select from the following");
		System.out.println("1. Get an integer value");
		System.out.println("2. Get integer in a range");
		System.out.println("3. Get a real value");
		System.out.println("4. Get a positive integer");
		System.out.println("5. Get String");
		num = keyboard.nextInt(); 
		
		while(num < 1 || num > 5) 
		{ 
			// Invalid menu option
			System.out.println("\nInvalid entry. try again\n");
		
			// Display the menu and get the menu option
			System.out.println("Lab2\t Please select from the following");
			System.out.println("1. Get an integer value");
			System.out.println("2. Get integer in a range");
			System.out.println("3. Get a real value");
			System.out.println("4. Get a positive integer");
			System.out.println("5. Get String");
			num = keyboard.nextInt();  
		} 
		
		int low = 0; 
		int high = 0; 
		
		switch(num) 
		{ 
			case 1 : 
				getInt(); 
			case 2 : 
				getIntRange(low, high); 
			case 3 : 
				getDouble(); 
;			case 4 : 
				getPositiveInt(); 
			case 5 : 
				getString(); 
		}
	}
} 
