public class Rectangle extends TwoD implements Info, Shape  
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
	
	/** 
	 * Outputs the message of the class the shape is in    
	 */
	public void twoDShape() 
	{ 
		System.out.println("I am in the 2D shape Rectangle"); 
	}
	
	/** 
	 * Displays the information of the Shape 
	 */
	public void info() 
	{ 
		System.out.println(super.getColor() + " Rectangle"); 
		System.out.println("Perimeter : " + getPerimeter()); 
		System.out.println("Area : " + getArea() + "\n"); 
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
