/** 
 *    
 * @author Nishaan Amin  
 *
 */
public class RectangleTester 
{
	public static void main(String[] args) 
	{
		Rectangle myRectangle1 = Rectangle.getSingleton(); 
		myRectangle1.setLength(25); 
		myRectangle1.setWidth(15); 
		
		Rectangle myRectangle2 = Rectangle.getSingleton();  
		
		System.out.println("Making Singleton Rectangle using Lazy Instantiation Method :"); 
		System.out.println("Rectangle 1 [" + myRectangle1.toString() + " | " + myRectangle1.hashCode() + "]");
		System.out.println("Rectangle 2 [" + myRectangle2.toString() + " | " + myRectangle2.hashCode() + "]");
		System.out.println(); 
		
		RectangleWrapper myRectangle3 = new RectangleWrapper(); 
		myRectangle3.setLength(45); 
		myRectangle3.setWidth(35); 
		
		RectangleWrapper myRectangle4 = new RectangleWrapper();
		
		System.out.println("Making Singleton Rectangle using Inner Class Method :"); 
		System.out.println("Rectangle 3 [" + myRectangle3.toString() + " | " + myRectangle3.hashCode() + "]");
		System.out.println("Rectangle 4 [" + myRectangle4.toString() + " | " + myRectangle4.hashCode() + "]");
	}
}
