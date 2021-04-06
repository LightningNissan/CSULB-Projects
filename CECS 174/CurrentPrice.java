import java.util.Scanner;

public class CurrentPrice 
{
   public static void main(String[] args) 
   { 
      Scanner scnr = new Scanner(System.in); 
   
      int currentPrice; 
      int lastMonthsPrice; 
   
      System.out.println("What is the current price?");
      currentPrice = scnr.nextInt();  
      
      System.out.println("What is last months price?");
      lastMonthsPrice = scnr.nextInt();  
      
      int changePrice = currentPrice - lastMonthsPrice;  
      double monthlyMortgage = 0.045 * currentPrice / 12;  
      
      System.out.print("This house is $" + currentPrice + ".");  
      System.out.print(" This change is $" + changePrice + " since last month.");   
      System.out.print(" This estimated monthly mortgage is $" + monthlyMortgage + ".");  
   } 
}  