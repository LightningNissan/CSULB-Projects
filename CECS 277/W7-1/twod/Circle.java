package twod;

public class Circle 
{
	public String name; 
	protected String type; 
	String make; 
	private String color; 
	
	/** 
	 * Default Constructor 
	 */
	public Circle() 
	{ 
		name = ""; 
		type = ""; 
		make = ""; 
		color = ""; 
	} 
	
	/** 
	 * Overloaded Constructor 
	 * @param n
	 * @param t
	 * @param m
	 * @param c
	 */
	public Circle(String n, String t, String m, String c)
	{
		name = n; 
		type = t; 
		make = m; 
		color = c;
	}
}
