import java.util.ArrayList;
/** 
 * 
 * @author Nishaan Amin, Sunnyong Hur 
 *
 */
public class ArrayListRunner 
{
	/** 
	 * Invoke various ways to add, remove, and modify elements from Array Lists 
	 */
	public static void main(String[] args) 
	{
		// Creating new array list 
		ArrayList<String> names = new ArrayList<String>(); 
		
		//Prints an empty array list 
		System.out.println("Empty List: " + names); // prints out the ArrayList it is empty []
		
		//Add names and print the filled Array List 
		names.add("Alice"); 	
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		System.out.println("Full List: " + names);
		 
		//Print the names corresponding to the first and last index 
		System.out.println("First Name: " + names.get(0)); 
		System.out.println("Last Name: " + names.get(names.size() - 1)); 
		
		//Print the size of the Array List 
		System.out.println("Size: " + names.size()); 
		
		//Change the first index to "Alice B. Toklas" 
		//Print the modified Array List 
		names.set(0, "Alice B. Toklas"); 
		System.out.println(names); 
		
		//Add "Doug" ahead of "David" using the index location 
		//Print the modified Array List 
		names.add(4, "Doug"); 
		System.out.println(names); 
		
		//For Each Loop to print out the names contained in the Array List 
		for(String name : names)
		{ 
			System.out.print(name + " "); 
		}
		
		System.out.println(); 
		
		 //Make a new Array List that calls the ArrayList Constructor 
		 //Accepts another ArrayList as an argument too 
		 //Print the new Array List 
		ArrayList names2 = new ArrayList(names);
		System.out.println(names2); 

		//Remove the first element of the Array List via the index 
		//Print both Array Lists to verift that only the names Array List was modified  
	    names.remove(0);
	    System.out.println(names);
	    System.out.println(names2);
	}
}