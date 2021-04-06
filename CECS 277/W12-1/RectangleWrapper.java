public class RectangleWrapper 
{
	private static class InnerRectangle 
	{ 
		double width, length; 
		private static final InnerRectangle singleton = new InnerRectangle(); 
		
		public static InnerRectangle Singleton() 
		{ 
			return singleton; 
		}
	}
	
	/** 
	 * Sets the Length of the Rectangle 
	 * @param l
	 */
	public void setLength(double l)
	{ 
		InnerRectangle.Singleton().length = l; 
	}
	
	/** 
	 * Sets the Width of the Rectangle 
	 * @param w
	 */
	public void setWidth(double w)
	{ 
		InnerRectangle.Singleton().width = w; 
	}
	
	/** 
	 * Getter Method to get the length of a Rectangle 
	 * @ return length
	 */
	public double getLength() 
	{
		return InnerRectangle.Singleton().length;
	}
	
	/** 
	 * Getter Method to find the width of a Rectangle 
	 * @ return width 
	 */
	public double getWidth() 
	{
		return InnerRectangle.Singleton().width;
	}
	
	/** 
	 * Getter Method to find the area of a Rectangle 
	 * @ return width * length
	 */
	public double getPerimeter() 
	{
		return 2 * InnerRectangle.Singleton().width + 2 * InnerRectangle.Singleton().length;
	}
	
	/** 
	 * Getter Method to find the area of a Rectangle 
	 * @ return width * length
	 */
	public double getArea() 
	{
		return InnerRectangle.Singleton().width * InnerRectangle.Singleton().length;
	}
	
	/** 
	 * Getter Method to display the width and length of the Rectangle 
	 * @ return String  
	 */
	public String toString() 
	{
		return "Rectangle : " + InnerRectangle.Singleton().width + " X " + InnerRectangle.Singleton().length; 
	}
	
	/** 
	 * Fixes HashCode Problem  
	 */
	public int hashCode() 
	{ 
		return InnerRectangle.Singleton().hashCode(); 
	}
} 
