package threed;

public class Cylinder 
{
	public String name; 
	protected String type; 
	String make; 
	private String color; 
	
	/** 
	 * Default Constructor 
	 */
	public Cylinder() 
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
	public Cylinder(String n, String t, String m, String c)
	{
		name = n; 
		type = t; 
		make = m; 
		color = c;
	}
}

