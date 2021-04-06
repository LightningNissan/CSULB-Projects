public class Grades 
{
	/** 
	 * Checks if you grade low enough to retake the class 
	 * @param grade
	 * @throws MyOwnException
	 */
	public void retakeClass(double grade) throws MyOwnException 
	{ 
		if (grade < 70.0)
		{ 
			throw new MyOwnException(); 
		}
	}
	
	/** 
	 * Checks if you have a failing grade 
	 * @param grade
	 * @throws MyOwnException
	 */
	public void failingGrade(double grade) throws MyOwnException 
	{ 
		if (grade < 60.0)
		{ 
			throw new MyOwnException(grade); 
		}
	}
	
	/** 
	 * Checks if your grade is too low to be valid 
	 * @param grade
	 * @throws IllegalArgumentException
	 */
	public void lowGrade(double grade) throws IllegalArgumentException 
	{ 
		if (grade < 0.0)
		{ 
			throw new IllegalArgumentException(); 
		}
	}
	
	/** 
	 * Checks if your grade is too high to be valid  
	 * @param grade
	 * @throws IllegalArgumentException
	 */
	public void highGrade(double grade) throws IllegalArgumentException  
	{ 
		if (grade > 100.0 )
		{ 
			throw new IllegalArgumentException();   
		}
	}
}
