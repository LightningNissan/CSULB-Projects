/** 
 * 
 * @author Nishaan Amin   
 *
 */
public class MyOwnExceptionTester 
{
	public static void main(String[] args) 
	{
		Weight o1 = new Weight(); 
		
		try 
		{ 
			// Dangerous Instructions 
			o1.WeightCheck(200); 
			System.out.println("\nwill execute...."); 
			// int a = 4 / 0; 
			trouble(); 
			System.out.println("\nwill not execute....if exception is thrown");
		}
		catch (ArithmeticException e) 
		{ 
			System.out.println("\n I am throwing tantrum....");
			System.out.println(e.getMessage());   
		}
		catch (OverWeight e)
		{ 
			System.out.println("\n You are perfect the way you are....");
		}
		catch (Exception e)
		{ 
			// Multiple Catch 
			// Order Matters 
			System.out.println("\n I am throwing tantrum....");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace(); 
		}
		finally 
		{ 
			System.out.println("\nThis is in Finally....");
		}
	}
	
	public static void trouble() throws Exception 
	{ 
		System.out.println("I just want to cause trouble....");
		// throw New Exception("\nTrouble... trouble"); 
		throw new OverWeight(); 
	}
}
