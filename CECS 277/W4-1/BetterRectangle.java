import java.awt.Rectangle; 

public class BetterRectangle extends Rectangle 
{
	/** 
	 * Default Constructor  
	 */
	public BetterRectangle() {} 
	
	/** 
	 * Overloaded Constructor 
	 * @param x
	 * @param y
	 * @param h
	 * @param w
	 */
	public BetterRectangle(int x, int y, int h, int w) 
	{ 
		super.setSize(h, w);
	} 
	
	/** 
	 * Getter Method to find the area of the Rectangle 
	 * @return area 
	 */
	public double getArea() 
	{
		double area = this.getWidth() * this.getHeight(); 
		return area; 
	}
	
	/** 
	 * Getter Method to find the perimeter of the Rectangle 
	 * @return perimeter 
	 */
	public double getPerimeter() 
	{ 
		double perimeter = 2 * (this.getWidth() + this.getHeight()); 
		return perimeter; 
	}
}

