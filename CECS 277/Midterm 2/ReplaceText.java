import java.io.*;
import java.util.Scanner; 

/** 
 * 
 * @author Nishaan Amin   
 *
 */
public class ReplaceText
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		String inputFile = ""; 
		String outputFile = "";  
		
		// Input names of the files 
		System.out.println("Enter Input File Name (Include .txt) : "); 
		inputFile = in.nextLine(); 
		System.out.println("Enter Output File Name (Include .txt) : "); 
	    outputFile = in.nextLine(); 
		
		File file = new File("C:\\Users\\Light\\eclipse-workspace\\Midterm 2\\src\\" + inputFile);
		BufferedReader bread = null;
		BufferedWriter brWrite = null; 

		try 
		{
			// Replace "the" with "abc" and print the new text into a new .txt file 
			FileReader fr = new FileReader(file);
			bread = new BufferedReader(fr);
			File fileW = new File("C:\\Users\\Light\\eclipse-workspace\\Midterm 2\\src\\" + outputFile);
			brWrite = new BufferedWriter(new FileWriter(fileW)); 
			String line = bread.readLine(); 
			String fileContent = "";

			while(line != null) 
			{
				fileContent += line + System.lineSeparator(); 
				line = bread.readLine(); 
			}
			
			String modifiedFileContent = fileContent.replaceAll(args[0], args[1]);    // Command Line 
			brWrite.write(modifiedFileContent); 
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
				// File Was Never Opened 
			}
		} 
	}
}
