import java.util.Scanner;

public class OutputWithVars 
{
   public static void main(String[] args) 
   {
      Scanner scnr = new Scanner(System.in);
      
      int userNum1;
      int userNum2; 
      
      System.out.println("Enter integer:");
      userNum1 = scnr.nextInt(); 
      
      System.out.println("You entered:" + userNum1);  
      System.out.println(userNum1 + " squared" + " is " + userNum1 * userNum1);  
      System.out.println("And " + userNum1 + " cubed" + " is " + userNum1 * userNum1 * userNum1 + "!!");  
      
      System.out.println("Enter another integer:");
      userNum2 = scnr.nextInt();  
      
      System.out.println(userNum1 + " + " + userNum2 + " is " + (userNum1 + userNum2));   
      System.out.println(userNum1 + " * " + userNum2 + " is " + userNum1 * userNum2);    
   }
} 



