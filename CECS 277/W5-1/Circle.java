/**
*
* @author Susan Nachawati
*
*/
public class Circle extends Shape 
{
	/** 
	 * Default Constructor 
	 */
	private double radius; Circle()
	{
		super(); //call Shape
		radius = 0;
	}
	
	/** 
	 * Overloaded Constructor
	 * @param x
	 * @param y
	 * @param r
	 */
	public Circle (double x, double y, double r) 
	{
		super(x, y); //call Shape(x,y)
		radius = r;
	}
	
	/** 
	 * Getter Method to find the area of a Circle  
	 * @ return Math.PI * radius * radius 
	 */
	public double computeArea() 
	{
		return Math.PI * radius * radius;
	}
	
	/** 
	 * Getter Method to find the radius of a Circle  
	 * @ return radius 
	 */
	public double getRadius() 
	{
		return radius;
	}
	
	/** 
	 * Getter Method to display the radius of the Circle
	 * @ return String  
	 */
	public String toString() 
	{
		return super.toString() + " Radius = " + radius;
	}
} //end class Circle
	