/** 
 * 
 * @author Nishaan Amin  
 *
 */
public class Rectangle  
{
	private double width, length; 
	private static Rectangle singleton = new Rectangle(); 
	
	public static synchronized Rectangle getSingleton() 
	{ 
		if(singleton == null)
		{ 
			singleton = new Rectangle(); 
		}
		return singleton; 
	}
	
	public static Rectangle getUnmanagedSingleton() 
	{ 
		if(singleton == null)
		{ 
			singleton = new Rectangle(); 
		}
		return singleton; 
	}  
	
	/** 
	 * Default Constructor 
	 */
	private Rectangle() {}  
	
	
	/** 
	 * Sets the Length of the Rectangle 
	 * @param l
	 */
	public void setLength(double l)
	{ 
		length = l; 
	}
	
	/** 
	 * Sets the Width of the Rectangle 
	 * @param w
	 */
	public void setWidth(double w)
	{ 
		width = w; 
	}
	
	/** 
	 * Getter Method to get the length of a Rectangle 
	 * @ return length
	 */
	public double getLength() 
	{
		return length;
	}
	
	/** 
	 * Getter Method to find the width of a Rectangle 
	 * @ return width 
	 */
	public double getWidth() 
	{
		return width;
	}
	
	/** 
	 * Getter Method to find the area of a Rectangle 
	 * @ return width * length
	 */
	public double getPerimeter() 
	{
		return 2 * width + 2 * length;
	}
	
	/** 
	 * Getter Method to find the area of a Rectangle 
	 * @ return width * length
	 */
	public double getArea() 
	{
		return width * length;
	}
	
	/** 
	 * Getter Method to display the width and length of the Rectangle 
	 * @ return String  
	 */
	public String toString() 
	{
		return "Rectangle : " + width + " X " + length; 
	}
} 
