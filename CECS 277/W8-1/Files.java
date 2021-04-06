import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/** 
 * 
 * @author Nishaan Amin   
 *
 */
public class Files 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		String inputFile = ""; 
		String outputFile = ""; 
		
		System.out.println("Enter Input File Name (include .txt) : "); 
		inputFile = in.nextLine(); 
		System.out.println("Enter Output File Name (include .txt) : "); 
	    outputFile = in.nextLine(); 
		
		File file = new File(inputFile);
		BufferedReader bread = null;
		BufferedWriter brWrite = null; 

		try 
		{
			FileReader fr = new FileReader(file);
			bread = new BufferedReader(fr);
			File fileW = new File(outputFile);
			brWrite = new BufferedWriter(new FileWriter(fileW)); 
			String line; 

			while((line = bread.readLine()) != null) 
			{
				line = line.toUpperCase(); 
				System.out.println(line);
				brWrite.write(line);
				brWrite.newLine(); 
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found: " + file.toString());
		} 
		catch (IOException e) 
		{
			System.out.println("Unable to read file: " + file.toString());
		}
		finally 
		{
			try 
			{
				bread.close();
				brWrite.close(); 
			} 
			catch (IOException e) 
			{
				System.out.println("Unable to close file: " + file.toString());
			}
			catch(NullPointerException ex) 
			{
				// File was probably never opened!
			}
		} 
	}
}
