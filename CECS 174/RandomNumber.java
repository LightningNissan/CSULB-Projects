import java.util.Scanner;
import java.util.Random; 

public class RandomNumber  
{
   public static void main(String[] args) 
   {   
      Scanner scnr = new Scanner(System.in); 
      
      boolean range = false;  
      
      int random = (int) (10 * Math.random()) + 1;  
      
      while (range == false)   
      {  
         System.out.println("Enter a number between 1 - 10");
         int number = scnr.nextInt(); 
         
         if (number <= 10 && number >= 1) 
         { 
            range = true;  
            
            System.out.println("Random number is " + random);  
            
            if (number > random) 
            { 
               System.out.println("Your number is bigger"); 
            } 
            else if (number < random) 
            { 
               System.out.println("Your number is smaller");  
            } 
            else if (number == random) 
            { 
               System.out.println("Your number is the same");  
            }             
         }
      } 
   } 
} 
      