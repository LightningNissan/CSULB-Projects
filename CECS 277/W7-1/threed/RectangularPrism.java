package threed;

public class RectangularPrism 
{
	public String name; 
	protected String type; 
	String make; 
	private String color; 
	
	/** 
	 * Default Constructor 
	 */
	public RectangularPrism() 
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
	public RectangularPrism(String n, String t, String m, String c)
	{
		name = n; 
		type = t; 
		make = m; 
		color = c;
	}
}
