public class Rectangle extends TwoD implements Shape 
{
	private double width, length; 
	
	/** 
	 * Default Constructor 
	 */
	public Rectangle() 
	{ 
		super(); 
		width = 0.0; 
		length = 0.0; 
	} 
	
	/** 
	 * Overloaded Constructor 
	 * @param x
	 * @param y
	 * @param l
	 * @param w
	 */
	public Rectangle(double x, double y, double l, double w, String c)
	{
		super(x, y, c); 
		length = l; 
		width = w; 
	}
	
	public void info() 
	{ 
		System.out.println(super.getColor() + " Rectangle"); 
	}
	
	/** 
	 * Find the perimeter of a Rectangle 
	 * @ return 2 * (width + length) 
	 */
	public double getPerimeter() 
	{ 
		return 2 * (width + length);
	}
	
	/** 
	 * Find the area of a Rectangle 
	 * @ return width * length
	 */
	public double getArea() 
	{ 
		return width * length;
	}
}
