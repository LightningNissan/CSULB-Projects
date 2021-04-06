import threed.Cylinder;
import threed.RectangularPrism;
import twod.Circle;
import twod.foursides.Rectangle;
import twod.foursides.Shape2D;
import twod.foursides.Square;

/** 
 * 
 * @author Nishaan Amin 
 *
 */
public class ShapeTester 
{
	public static void main(String[] args) 
	{
		Circle circle = new Circle("Circle", "2DShape", "Non Polygon", "Green"); 
		Rectangle rectangle = new Rectangle("Rectangle", "2DShape", "Polygon", "Blue"); 
		Square square = new Square("Square", "2DShape", "Polygon", "Orange"); 
		Cylinder cylinder = new Cylinder("Cylinder", "3DShape", "Non Polyhedron", "Red"); 
		RectangularPrism rectangularPrism = new RectangularPrism("Rectangular Prism", "3DShape", "Polyhedron", "Black"); 
		Shape2D Shape2D = new Shape2D("Shape2D", "2DShape", "Flat Shape", "Yellow"); 
		
		System.out.println(circle.name); 
		// System.out.println(rectangle.type);      Visibility is not Public 
		// System.out.println(square.make);         Visibility is not Public 
		// System.out.println(cylinder.color);      Visibility is not Public 
		System.out.println(rectangularPrism.name); 
		System.out.println(Shape2D.name); 
	}
}
