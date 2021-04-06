import java.util.Scanner;

public class LeapYear  
{
   public static void main(String[] args) 
   {  
      Scanner scnr = new Scanner(System.in);   
     
      System.out.println("Enter Year > ");
      int year = scnr.nextInt();   
      
      if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)   
      { 
         System.out.println(year + " - leap year");   
      } 
      else  
      { 
         System.out.println(year + " - not a leap year");    
      } 
   } 
} 


       
         
      
      