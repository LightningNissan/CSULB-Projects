import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/** 
 * 
 * @author Nishaan Amin 
 *
 */
public class Friends 
{
   @SuppressWarnings("resource")
   public static void main(String[] args) 
   {   
       HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
       List<String> friends = new ArrayList<String>(); 
       Scanner in = new Scanner(System.in);
       
       // Sue's Friends 
       friends.add("Bob");
       friends.add("Jose");
       friends.add("Alex");
       friends.add("Cathy");
       hashMap.put("Sue", friends);

       // Cathy's Friends 
       friends = new ArrayList<String>();
       friends.add("Bob");
       friends.add("Alex");
       hashMap.put("Cathy", friends);

       // Bob's Friends 
       friends = new ArrayList<String>();
       friends.add("Alex");
       friends.add("Jose");
       friends.add("Jerry");
       /* It says in the instructions that Cathy is friends with Bob, 
       but it is not stated whether or not Bob is friends is Cathy, 
       so I assumed Bob is friends with Cathy */ 
       friends.add("Cathy");
       hashMap.put("Bob", friends);
       
       System.out.println("Type Quit to Exit the Program \n");
       
       while(true)
       { 
    	   System.out.println("Enter Name : ");
           String name = in.nextLine();
           friends = hashMap.get(name);
           
		   if (name.equals("Quit"))
		   { 
			   System.out.println("Program Ended");
			   break; 
		   }
		   if (friends == null)
		   { 
		       System.out.println(name + " is not in the HashMap \n");
		   } 
		   else
		   { 
		       System.out.println(friends + "\n");
		   } 
       } 
   }
}