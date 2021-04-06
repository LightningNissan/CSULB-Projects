public class Circle extends TwoD implements Info, Shape 
{
	private double radius;  
	
	/** 
	 * Default Constructor 
	 */
	public Circle() 
	{ 
		super(); 
		radius = 0.0; 
	} 
	
	/** 
	 * Overloaded Constructor 
	 * @param x
	 * @param y
	 * @param r
	 */
	public Circle(double x, double y, double r, String c)
	{
		super(x, y, c); 
		radius = r; 
	}
	
	/** 
	 * Outputs the message of the class the shape is in    
	 */
	public void twoDShape() 
	{ 
		System.out.println("I am in the 2D shape Circle"); 
	}
	
	/** 
	 * Displays the information of the Shape 
	 */
	public void info() 
	{ 
		System.out.println(super.getColor() + " Circle"); 
		System.out.println("Perimeter : " + getPerimeter()); 
		System.out.println("Area : " + getArea() + "\n"); 
	}
	
	/** 
	 * Find the perimeter of a Circle 
	 * @ return 2 * radius * Math.PI 
	 */
	public double getPerimeter() 
	{ 
		return 2 * radius * Math.PI;
	}
	
	/** 
	 * Find the area of a Circle  
	 * @ return Math.PI * radius * radius 
	 */
	public double getArea() 
	{
		return Math.PI * radius * radius;
	}
}
