import java.util.Scanner;

public class ExactChange  
{
   public static void main(String[] args) 
   {  
      Scanner scnr = new Scanner(System.in);  
      
      int dimes, nickels, dollars, pennies, quarters;  
      
      System.out.println("Enter Total Change > ");
      int change = scnr.nextInt();

      if (change == 0)   
      { 
         System.out.println("No change");   
      } 
      else  
      { 
         if (change % 100 == 0)  
         { 
            dollars = change / 100;   
            
            if (dollars != 0)  
            { 
               if (dollars > 1)   
               { 
                  System.out.println(dollars +  " Dollars");  
               } 
               else  
               { 
                  System.out.println(dollars + " Dollar");   
               } 
            }  
         } 
         else 
         { 
            dollars = change / 100;  
            change %= 100;  
            quarters = change / 25;  
            change %= 25;  
            dimes = change / 10;  
            change %= 10;  
            nickels = change / 5;  
            change %= 5;  
            pennies = change;   
        
            if (dollars != 0)  
            { 
               if (dollars > 1)   
               { 
                  System.out.println(dollars +  " Dollars");  
               } 
               else  
               { 
                  System.out.println(dollars + " Dollar");   
               } 
            } 
                  
            if (quarters != 0)  
            { 
               if (quarters > 1)   
               { 
                  System.out.println(quarters + " Quarters"); 
               }  
               else  
               { 
                  System.out.println(quarters + " Quarter");  
               } 
            }  
                     
            if (dimes != 0)    
            { 
               if (dimes > 1)  
               { 
                  System.out.println(dimes + " Dimes");  
               } 
               else  
               { 
                  System.out.println(dimes + " Dime");   
               } 
            } 
                     
            if (nickels != 0)   
            { 
               if (nickels > 1)  
               { 
                  System.out.println(nickels + " Nickels");   
               } 
               else  
               { 
                  System.out.println(nickels + " Nickel");   
               } 
            } 
                     
            if (pennies != 0)  
            { 
               if (pennies > 1)  
               { 
                  System.out.println(pennies + " Pennies");  
               }  
               else  
               { 
                  System.out.println(pennies + " Penny");  
               } 
            }  
         } 
      } 
   } 
} 


            
            

 






 

