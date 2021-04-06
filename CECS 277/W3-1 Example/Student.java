
public class Student extends person  
{
	private double gpa; 
	
	/** 
	 * Default Student Constructor 
	 */
	public Student() 
	{ 
		gpa = 0.0; 
	}
	
	/** 
	 * Overloaded Student Constructor 
	 * @param g
	 */
	public Student(double g)
	{ 
		gpa = g; 
	}
	
	/** 
	 * Setter Method to set the GPA 
	 * @param newGPA
	 */
	public void setGPA(double newGPA)
	{ 
		this.gpa = newGPA; 
	}
	
	/** 
	 * Getter Method to get the GPA 
	 * @return gpa 
	 */
	public double getGPA()
	{ 
		return gpa; 
	}
	
	/** 
	 * Method to ensure that the output is a String  
	 */
	public String toString() 
	{ 
		return gpa + "";  
	}
}

