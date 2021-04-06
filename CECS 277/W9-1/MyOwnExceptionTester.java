/** 
 * 
 * @author Nishaan Amin, Jocelyn Gonzalez, Hoanh Nguyen, Valeria Ruvalcaba, Brandon Pizzaro - Romero 
 * Not sure if those are the exact people in my group, but I think they all are     
 *
 */
public class MyOwnExceptionTester 
{
	public static void main(String[] args) throws MyOwnException 
	{
		Grades grade = new Grades(); 
		
		try 
		{    
			grade.lowGrade(- 1.0);           // IllegalArgumentException > Enter a grade within 0.0 to 100.0
			grade.highGrade(101.0);          // IllegalArgumentException > Enter a grade within 0.0 to 100.0
			grade.retakeClass(50.0);         // You must retake the class - Grade too low
			grade.failingGrade(50.0);        // You must retake the class - Grade too low
		}
		catch (IllegalArgumentException e) 
		{ 
			System.out.println("IllegalArgumentException > Enter a grade within 0.0 to 100.0");   
		}
		catch (MyOwnException e)
		{ 
			System.out.println(e.getMessage());  
		}
		catch (Exception e)
		{ 
			// Multiple Catch 
			// Order Matters 
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace(); 
		} 
	}
}
