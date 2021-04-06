public class Circle extends TwoD implements Shape 
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
	
	public void info() 
	{ 
		System.out.println(super.getColor() + " Circle"); 
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
