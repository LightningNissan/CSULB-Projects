public class MyOwnException extends Exception 
{
	private double grade;  
	
	/** 
	 * Default Constructor 
	 */
	public MyOwnException() 
	{ 
		super("Grade too low"); 
		System.out.println("You must retake the class"); 
	}
	
	/** 
	 * Overloaded Constructor 
	 * @param g
	 */
	public MyOwnException(double g)
	{ 
		super("Grade too low"); 
		System.out.println("You must retake the class"); 
		grade = g;
	}
	
	/** 
	 * Prints in String Format  
	 */
	public String toString()
	{ 
		return "Grade too low - You must retake the class"; 
	}
}
