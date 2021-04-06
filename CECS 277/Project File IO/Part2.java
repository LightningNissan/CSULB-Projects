import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Part2 {
	/***
	 * Takes in txt file as command line argument data.tx
	 * @param args
	 */
	public static void main(String[] args) {
		// part 2
		File file = new File(args[0]);
		String service;
		String original; // String used for inputting into files as original text
		try {
			//Service files
			// Opens text files for all categories
		PrintWriter Dinner = new PrintWriter ("Dinner.txt");
		PrintWriter Conference = new PrintWriter ("Conference.txt");
		PrintWriter Lodging = new PrintWriter ("Lodging.txt");
		PrintWriter Wedding = new PrintWriter ("Wedding.txt");
		
		Scanner in = new Scanner(file);
		/***
		 * Adding  individual files based on type of service. 
		 */
		while (in.hasNext()) {
			service = in.nextLine();

			if (service.toLowerCase().contains("dinner") == true)
			{
				Dinner.print(service);
			}
			if (service.toLowerCase().contains("conference") == true)
			{
				Conference.print(service);
			}
			if (service.toLowerCase().contains("lodging") == true)
			{
				Lodging.print(service);
			}
			if (service.toLowerCase().contains("wedding") == true)
			{
				Wedding.print(service);
			}
		}
		System.out.println("done");


		// add and make the rest of txt files. 
		Dinner.close();
		Lodging.close();
		Wedding.close();
		Conference.close();
		}
		catch(FileNotFoundException m){
			System.out.println("File Not Found");
			
			 }
		 //Catches contains method
		catch(NoSuchElementException m){
				// ignore
			
			 }

	}

}
