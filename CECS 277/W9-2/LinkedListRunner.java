import java.util.LinkedList;
import java.util.ListIterator;

/** 
 * 
 * @author Nishaan Amin  
 *
 */
public class LinkedListRunner 
{
	public static void main(String[] args) 
	{ 
		 LinkedList<String> ll = new LinkedList<String>(); 
		 
		 ll.add("aaa"); 
		 ll.add("bbb"); 
		 ll.add("ccc"); 
		 ll.add("ddd"); 
		 ll.add("eee"); 
		 ll.add("fff"); 
		 ll.add("ggg"); 
		 ll.add("hhh"); 
		 ll.add("iii"); 
	 
		 ListIterator<String> iterator = ll.listIterator();   

		 System.out.println("With Vowels");
		 
		 // Moves forward through the list 
		 // Prints all elements  
		 while (iterator.hasNext())
		 { 
			 System.out.println(iterator.next());
		 }
        
		 // Moves backward through the list 
		 // Removes elements that start with a vowel 
		 while (iterator.hasPrevious())
		 {
			 String word = iterator.previous().toLowerCase();
            
			 if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
			 {
				 iterator.remove();
			 }
		 }
        
		 System.out.println("\nWithout Vowels");
        	
		 // Moves forward through the list 
		 // Prints all elements that start with a consonant 
		 while (iterator.hasNext())
		 { 
			 System.out.println(iterator.next());
		 }
	}
}
