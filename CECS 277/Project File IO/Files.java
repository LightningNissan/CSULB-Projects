import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * 
 * @author Alberto Perez
 * @author Oscar Saavedra
 * @author Amin Nishaan
 * Date : 3/17/2021
 *Program writes data into a text file based on sales information from a hotel.
 *Then inputs data into separate files based on different categories. Handling and catching is
 *implemented into the program. Making an unknownTransaction exception and using CheckInput class
 */

public class Files {

	public static void main(String[] args)   {
		//Scanner input for writing data into file
		Scanner input = new Scanner (System.in);
		String service;
		boolean exit = false;
		while (!exit){
		// try and catch for Part 1:
		// Enter sales information in txt file.
		
		try {
			// PrintWrite for text file
			PrintWriter output = new PrintWriter ("data.txt");
			while (!exit){
			System.out.println("Enter Sales Info:");
			 	// Enter Client Name
				System.out.println("Enter Client name");
				output.print(input.nextLine()+ "; ");
				
				// Service sold is checked for correct categories
				// If category is not right throws a new transactionException
				System.out.println("Service Sold");
				service = input.nextLine();
				if (service.equalsIgnoreCase("dinner") == false &&
						   service.equalsIgnoreCase("conference") == false &&
						   service.equalsIgnoreCase("lodging") == false &&
						   service.equalsIgnoreCase("wedding") == false) {
					output.close();
					throw new unkownTransaction();
				}
				output.print(service+ "; ");
				
				// Enter amount of sale, uses CheckInput class
				// to see if it's a float
				System.out.println("Amount of the Sale: 0.00");
				float price = CheckInput.getFloat();
				output.printf( "%.2f",price);
				output.print("; ");
				
				// Enters date into text file, in date format
				System.out.println("Date of Even:");
				System.out.println("Month");
				output.print(CheckInput.getPositiveInt()+"/" );
				System.out.println("Day");
				output.print(CheckInput.getPositiveInt()+"/" );
				System.out.println("Year");
				output.print(CheckInput.getPositiveInt());
				output.print("\n");
				
				// Ask whether one is done with entries into text file
				System.out.println("If done enter 'yes' if not enter 'a' to add more info");
				String done = input.nextLine();
				while (done.equalsIgnoreCase("a") == false && done.equalsIgnoreCase("yes") == false )
				{
					System.out.println("Invalid Entry");
					System.out.println("If done enter 'yes' if not enter 'a' to add more info");
					done = input.nextLine();
				}
				
				
				if (done.equalsIgnoreCase("yes") == true) {
					exit = true;
				}
			}// end of second while loop
			
			output.close();
		}
		// File not found catch
		catch (FileNotFoundException y) {
			System.out.println("File Not Found Try Again");
			
		}	
		// TransactionException catched and handled by 
		// TransactionException class
		catch (unkownTransaction e) {
		}
		
	}//end of data entry while loop
		
		
	}
	

}
