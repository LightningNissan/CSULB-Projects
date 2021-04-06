/** 
 * 
 * @author Nishaan Amin 
 *
 */
public class ShapeTester 
{
	public static void main(String[] args) 
	{
		Shape circle1 = new Circle(5.0, 7.0, 11.0, "Black"); 
		Shape circle2 = new Circle(1.0, 2.0, 3.0, "Green"); 
		
		Shape rectangle1 = new Rectangle(4.0, 5.0, 6.0, 11.0, "Orange"); 
		Shape rectangle2 = new Rectangle(3.0, 4.0, 5.0, 6.0, "Blue"); 
		
		circle1.info(); 
		circle2.info();   
	
		data(rectangle1); 
		data(rectangle2); 
		
		shapeInfo(circle1); 
		shapeInfo(rectangle1); 
		
		TwoD obj1 = new TwoD(); 
		Circle obj2 = new Circle(); 
		Rectangle obj3 = new Rectangle(); 
	
		// ob3 = (TwoD) obj1;      Cannot upcast Rectangle to TwoD 
		// ob3 = (Circle) ob1;     Cannot downcast TwoD to Circle 
		// ob3 = (Rectangle) ob1;  Cannot downcast TwoD to Rectangle 
		// ob3.twoDShape(); 
		
		// Upcasting 
		TwoD ob4 = obj2; 
		ob4.twoDShape(); 
		
		// Downcasting 
		obj1 = (Rectangle) obj3; 
		obj1.twoDShape();
		
		System.out.println(); 
		
		if(obj1 instanceof TwoD)
		{ 
			obj1.twoDShape(); 
		}
		
		if(obj1 instanceof Circle)
		{ 
			obj1.twoDShape(); 
		}
		
		if(obj1 instanceof Rectangle)
		{ 
			obj1.twoDShape(); 
		}
	} 
		
	/** 
	 * Private Static Method  for the information of obj 
	 * @param shape
	 */
	private static void data(Info obj)
	{ 
		obj.info(); 
	}
	
	/** 
	 * Private Static Method for the Area and Perimeter of the obj  
	 * @param obj
	 */
	private static void shapeInfo(Shape obj)
	{ 
		System.out.println("Area : " + obj.getArea() + ". \nPerimeter : " + obj.getPerimeter() + "\n"); 
	}
}
