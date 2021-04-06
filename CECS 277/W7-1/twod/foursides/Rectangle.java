package twod.foursides;

public class Rectangle extends Square
{
	public String name; 
	protected String type; 
	String make; 
	private String color; 
	
	/** 
	 * Default Constructor 
	 */
	public Rectangle() 
	{ 
		super(); 
	} 
	
	/** 
	 * Overloaded Constructor 
	 * @param n
	 * @param t
	 * @param m
	 * @param c
	 */
	public Rectangle(String n, String t, String m, String c)
	{
		super(n, t, m, c); 
	}
}
