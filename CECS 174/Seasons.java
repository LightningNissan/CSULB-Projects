import java.util.Scanner;

public class Seasons 
{
   public static void main(String[] args) 
   {  
      Scanner scnr = new Scanner(System.in); 
   
      System.out.println("Enter Month > ");
      String input_month = scnr.next();  
      
      System.out.println("Enter Day > ");
      int input_day = scnr.nextInt();   
      
      if (input_month.equals("December") && 31 >= input_day && input_day >= 21)  
      { 
	      System.out.println("Winter");  
      } 
      else if (input_month.equals("January") && 31 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Winter");   
      } 
      else if (input_month.equals("February") && 28 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Winter");   
      } 
      else if (input_month.equals("March") && 20 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Winter");   
      } 
      else if (input_month.equals("March") && 31 >= input_day && input_day >= 20) 
      { 
	      System.out.println("Spring");  
      } 
      else if (input_month.equals("April") && 30 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Spring");  
      } 
      else if (input_month.equals("May") && 31 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Spring");   
      } 
      else if (input_month.equals("June") && 20 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Spring");  
      } 
      else if (input_month.equals("June") && 30 >= input_day && input_day >= 21) 
      { 
	      System.out.println("Summer");   
      } 
      else if (input_month.equals("July") && 31 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Summer");   
      } 
      else if (input_month.equals("August") && 31 >= input_day && input_day >= 1) 
      { 
	      System.out.println("Summer");   
      } 
      else if (input_month.equals("September") && 21 >= input_day && input_day >= 1)
      {  
	      System.out.println("Summer");  
      } 
      else if (input_month.equals("September") && 30 >= input_day && input_day >= 22) 
      { 
         System.out.println("Autumn");   
      } 
      else if (input_month.equals("October") && 31 >= input_day && input_day >= 1) 
      { 
         System.out.println("Autumn");  
      }  
      else if (input_month.equals("November") && 30 >= input_day && input_day >= 1) 
      { 
         System.out.println("Autumn");   
      } 
      else if (input_month.equals("December") && 20 >= input_day && input_day >= 1) 
      { 
         System.out.println("Autumn");    
      } 
      else 
      { 
         System.out.println("Invalid");
      } 
   } 
} 
         
            
    
    
    
 

    
    
 


 


 