import java.util.Arrays;

/** 
 * 
 * @author Nishaan Amin   
 *
 */
public class ExceptionsTester 
{
	public static void main(String[] args) throws Exception 
	{
		int[] arr = new int[5]; 
		
		// System.out.println(arr[5]);             // java.lang.ArrayIndexOutOfBoundsException   
		// System.out.println(arr[0] / 0);         // java.lang.ArithmeticException
		
		try
		{ 
			getInt(arr);         
			// System.out.println(arr[5]);         // ArrayIndexOutOfBoundsException : Array Length is less than 6    
			// System.out.println(arr[4] / 0);     // ArithmeticException : You cannot divide by 0   
		}
		catch (ArrayIndexOutOfBoundsException e)
		{ 
			System.out.println("ArrayIndexOutOfBoundsException : Array Length is less than 6"); 
		}
		catch (ArithmeticException e)
		{ 
			System.out.println("ArithmeticException : You cannot divide by 0"); 
			System.out.println("Here is the Divided Array Value Revised : " + arr[4] / 1); 
		}
	}

	private static void getInt(int[] arr) throws Exception 
	{
		for (int i = 0; i < arr.length; i++)   
		{ 
			Arrays.fill(arr, i);
		}	
	}
}
