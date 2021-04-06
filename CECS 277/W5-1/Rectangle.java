/** 
 * 
 * @author Nishaan Amin  
 *
 */
public class Rectangle extends Shape 
{
	private double width, length; 
	
	/** 
	 * Default Constructor 
	 */
	public Rectangle() 
	{ 
		super(); 
		width = 0; 
		length = 0; 
	} 
	
	/** 
	 * Overloaded Constructor 
	 * @param x
	 * @param y
	 * @param l
	 * @param w
	 */
	public Rectangle(double x, double y, double l, double w)
	{
		super(x, y); 
		length = l; 
		width = w; 
	}

	/** 
	 * Getter Method to find the area of a Rectangle 
	 * @ return width * length
	 */
	public double computeArea() 
	{
		return width * length;
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
	 * Getter Method to display the width and length of the Rectangle 
	 * @ return String  
	 */
	public String toString() 
	{
		return super.toString() + " Width, Length = " + width + ", " + length;
	}
} //end class Circle
