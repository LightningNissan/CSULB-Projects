import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
 * 
 * @author Nishaan Amin   
 *
 */
public class Tester 
{
	public static void main(String[] args) 
	{
		char positive = 1; 
		// char negative = - 1;  Cannot convert int to char; You have to cast it  
		char negative = (char) - 1; 
		
		System.out.println(Byte.MAX_VALUE); 
		System.out.println(Byte.MIN_VALUE); 
		System.out.println(Byte.SIZE); 
		
		System.out.println(Short.MAX_VALUE); 
		System.out.println(Short.MIN_VALUE); 
		System.out.println(Short.SIZE); 
		
		System.out.println(Integer.MAX_VALUE); 
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); 
		
		System.out.println(Long.MAX_VALUE); 
		System.out.println(Long.MIN_VALUE); 
		System.out.println(Long.SIZE); 
		
		System.out.println(Float.MAX_VALUE); 
		System.out.println(Float.MIN_VALUE); 
		System.out.println(Float.SIZE); 
		
		System.out.println(Double.MAX_VALUE); 
		System.out.println(Double.MIN_VALUE); 
		System.out.println(Double.SIZE); 
		
		// System.out.println(Boolean.MAX_VALUE);    Not a field for Boolean Type 
		// System.out.println(Boolean.MIN_VALUE);    Not a field for Boolean Type   
		System.out.println(Boolean.TYPE);    
		
		System.out.println(Character.MAX_VALUE + 0); 
		System.out.println(Character.MIN_VALUE + 0); 
		System.out.println(Character.SIZE + 0); 
		
		// int maxInt = 2147483648;   Error > Out of Range   
		byte maxByte = (byte) 1000;   // No errors, but it will print a different number within the byte's range  
		
		boolean myBoolean1 = true; 
		int myInt1 = myBoolean1 ? 1 : 0;   // Casting Boolean Type to Numeric Type 
		
		int myInt2 = 1; 
		// boolean myBoolean2 = myInt2 ? true : false;   Cannot convert Numeric Type to Boolean Type            
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 12, 15)); 
		
		System.out.println("The sum of the multiples of three are : " + sumMulThree1(list)); 
		System.out.println("The sum of the multiples of three are : " + sumMulThree2(list)); 
	}
	
	public static int sumMulThree1(List <Integer> li)
	{ 
		int sum = 0; 
		
		for(int i = 0; i < li.size(); i++)
		{ 		
			if(Integer.valueOf(li.get(i)) % 3 == 0)
			{ 
				sum += li.get(i); 
			}
		}
		
		return sum; 
	} 
	
	public static int sumMulThree2(List <Integer> li)
	{ 
		int sum = 0; 
		
		for(int i = 0; i < li.size(); i++)
		{ 
			if(li.get(i) % 3 == 0) 
			{ 
				sum += li.get(i); 
			}
		}
		
		return sum; 
	} 
}
