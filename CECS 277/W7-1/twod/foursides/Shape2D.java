package twod.foursides;

public class Shape2D 
{
	public String name; 
	protected String type; 
	String make; 
	private String color; 
	
	/** 
	 * Default Constructor 
	 */
	public Shape2D() 
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
	public Shape2D(String n, String t, String m, String c)
	{
		name = n; 
		type = t; 
		make = m; 
		color = c;
	}
}
