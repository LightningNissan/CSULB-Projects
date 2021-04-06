import java.util.Scanner;

public class MadLibs  
{
   public static void main(String[] args) 
   {   
      Scanner scnr = new Scanner(System.in); 
      
      System.out.println("Enter Word");
      String word = scnr.next(); 
      
      System.out.println("Enter Number");
      int number = scnr.nextInt();   
      
      if(!word.equals("quit") && number != 0) 
      { 
         System.out.println("Eating " + number + " " + word + " a day keeps the doctor away.");    
      } 
   
      while(!word.equals("quit") && number != 0) 
      {   
         System.out.println("Enter Word");
         word = scnr.next(); 
      
         System.out.println("Enter Number");
         number = scnr.nextInt();  
         
         if(word.equals("quit") && number == 0) 
         { 
            break; 
         } 
      
         System.out.println("Eating " + number + " " + word + " a day keeps the doctor away.");  
      } 
   } 
} 
   