package twod.foursides;

public class Square
{
	public String name; 
	protected String type; 
	String make; 
	private String color; 
	
	/** 
	 * Default Constructor 
	 */
	public Square() 
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
	public Square(String n, String t, String m, String c)
	{
		name = n; 
		type = t; 
		make = m; 
		color = c;
	}
}

