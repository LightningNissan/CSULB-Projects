public class person 
{
	private String name; 
	private int age;  
	
	/** 
	 * Default person Constructor 
	 */
	public person() 
	{ 
		name = "new born"; 
		age = 0; 	
	}
	
	/** 
	 * Overloaded person Constructor 
	 * @param n
	 * @param a
	 */
	public person(String n, int a)
	{ 
		name = n; 
		age = a;  
	}
	
	/** 
	 * Setter Method to set the name 
	 * @param newName
	 */
	public void setName(String newName)
	{ 
		this.name = newName; 
	}
	
	/** 
	 * Setter Method to set the age 
	 * @param newAge
	 */
	public void setAge(int newAge)
	{ 
		this.age = newAge; 
	}
	
	/** 
	 * Getter Method to get the name  
	 * @return name 
	 */
	public String getName()
	{ 
		return name; 
	}
	
	/** 
	 * Getter Method to get the age 
	 * @return age 
	 */
	public int getAge()
	{ 
		return age; 
	}
	
	/** 
	 * Method to ensure that the output is a String   
	 */
	public String toString() 
	{ 
		return name + " " + age;  
	}
}
