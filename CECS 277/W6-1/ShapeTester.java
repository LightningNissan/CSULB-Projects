/** 
 * 
 * @author Nishaan Amin 
 *
 */
public class ShapeTester 
{
	public static void main(String[] args) 
	{
		Shape circle1 = new Circle(); 
		Shape circle2 = new Circle(1.0, 2.0, 3.0, "Green"); 
		
		Shape rectangle1 = new Rectangle(); 
		Shape rectangle2 = new Rectangle(3.0, 4.0, 5.0, 6.0, "Blue"); 
		
		circle1.info(); 
		System.out.println("Perimeter : " + circle1.getPerimeter()); 
		System.out.println("Area : " + circle1.getArea() + "\n");
		
		circle2.info(); 
		System.out.println("Perimeter : " + circle2.getPerimeter()); 
		System.out.println("Area : " + circle2.getArea() + "\n");
		
		rectangle1.info(); 
		System.out.println("Perimeter : " + rectangle1.getPerimeter()); 
		System.out.println("Area : " + rectangle1.getArea() + "\n");
		
		rectangle2.info(); 
		System.out.println("Perimeter : " + rectangle2.getPerimeter()); 
		System.out.println("Area : " + rectangle2.getArea() + "\n");
	}
	
	/** 
	 * Private Static Method  
	 * @param shape
	 */
	private static void data(Shape shape)
	{ 
		shape.info(); 
	}
}
