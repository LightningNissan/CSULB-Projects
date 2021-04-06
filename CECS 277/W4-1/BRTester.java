import java.awt.Rectangle; 

/** 
 * 
 * @author Nishaan Amin 
 *
 */
public class BRTester 
{
	/** 
	 * Main Method to display the area and the perimeter of the Rectangle 
	 * @param args
	 */
	public static void main(String [] args) 
	{
		Rectangle r = new Rectangle(1,2,3,4);
		r.getArea();
		r.getPerimeter();   
		
		Rectangle s = new BetterRectangle(1,2,3,4);
		s.getArea();
		s.getPerimeter();

		BetterRectangle t = new BetterRectangle(1,2,3,4);
		System.out.println("Area : " + t.getArea()); 
		System.out.println("Perimeter : " + t.getPerimeter());

		BetterRectangle u = new Rectangle(1,2,3,4);
		u.getArea();
		u.getPerimeter();  
	}
}
