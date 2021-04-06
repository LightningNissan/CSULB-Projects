/**
* Tests the BasicAccount.
* @author Nishaan Amin, Jocelyn Gonzalez  
*/
public class BasicAccountTester
{
	public static void main(String[] args)
	{
		// A BasicAccount with initial balance of 100.00
		BankAccount account = new BasicAccount(100.00);
		System.out.println(account.getBalance());
		System.out.println("Expected: 100.0 \n");
		/*withdraw - If the amount is larger than the balance,   
		the withdraw request will be denied
		*/
		account.withdraw(80.00);
		System.out.println(account.getBalance());
		System.out.println("Expected: 20.0 \n");
		/*withdraw - If the amount is larger than the balance,
		the withdraw request will be denied
		*/
		account.withdraw(50);
		System.out.println("Expected: Withdraw amount can't be larger than the balance."); 
		System.out.println(account.getBalance());
		System.out.println("Expected: 20.0 \n");  
		
		// BasicAccount with initial balance of 100.0  
		BasicAccount acc = new BasicAccount(100.0); 
		
		// Withdraw 50 dollars 
		acc.withdraw(50.0);
		System.out.println(acc.getBalance());  
		System.out.println("Expected: 50.0 \n");  
		
		// Withdraw 100 dollars 
		acc.withdraw(100.0);
		System.out.println("Expected: Withdraw amount can't be larger than the balance."); 
		System.out.println(acc.getBalance());  
		System.out.println("Expected: 50.0 \n");  
		
		// Withdraw 200 dollars with an additional 30 dollars withdrawn  
		acc.penaltyWithdraw(200.0);
		System.out.println(acc.getBalance());  
		System.out.println("Expected: -180.0 \n");  
	} 
} 
	 