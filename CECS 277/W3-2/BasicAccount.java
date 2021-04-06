/** 
 *  A basic account has a balance that can be changed by
 *	deposits and withdrawals.
 */
public class BasicAccount extends BankAccount 
{
	private double balance; 
	
	 /**
	  * Constructs a bank account with a zero balance.
	  */
	 public BasicAccount()
	 {
		 balance = 0;
	 }
	
	/** 
	 * Constructs a basic account with a given balance.
	 * @param bal
	 */
	public BasicAccount(double bal)
	{ 
		balance = bal; 
	}
	
	/** 
	 * Withdraws money from the bank account.
	 * @param amount  
	 */
	public void withdraw(double amount) 
	{ 
		 double newBalance = balance - amount;
		 
		 if(newBalance < 0.0)
		 { 
			 System.out.println("Withdraw amount can't be larger than the balance."); 
		 }
		 else 
		 { 
			 balance = newBalance; 
		 }
	}
	
	/** 
	 * Withdraws money from the bank account with the addition of an overdraft fee if the account goes negative  
	 * @param amount
	 */
	public void penaltyWithdraw(double amount) 
	{ 
		 double newBalance = balance - amount;
		 
		 if(newBalance < 0.0)
		 { 
			 balance = newBalance - 30.0; 
		 }
		 else 
		 { 
			 balance = newBalance; 
		 }
	}
	
	/** 
	 *  Gets the current balance of the bank account.
	 *  @return the current balance
	 */
	public double getBalance() 
	{ 
		return balance; 
	}
}


