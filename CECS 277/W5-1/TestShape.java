/** 
 * 
 * @author Nishaan Amin 
 *
 */
public class TestShape 
{
	/** 
	 * Main Method to run all of the code 
	 * @param args
	 */
	public static void main(String [] args) 
	{
		Shape [] s = new Shape[5];
		s[0] = new Circle(10.0, 2.0, 5.0);
		Circle c2 = new Circle(5.0, 1.0, 3.0);
		s[1] = c2;
		s[2] = new Rectangle(1.0, 2.0, 3.0, 4.0);
		s[3] = new Cylinder(5.0, 6.0, 7.0, 8.0);
		s[4] = new Cylinder(11.0, 12.0, 21.0, 51.0);
		
		// Total area of all object
		// Note - I included the Surface Area of a cylinder as Area 
		double total = 0.0;
		
		for(int i = 0; i < s.length; i++)
		{ 
			total += s[i].computeArea(); 
		}
		
		// Total area of all Rectangle objects
	 	double sumArea = 0.0;
	 	
	 	for(int i = 0; i < s.length; i++)
	 	{
	 		if(s[i] instanceof Rectangle)
	 			sumArea += s[i].computeArea();
	 	}
	 	
	 	//Total volume of Cylinders
	 	double totalVolume = 0.0;
	 	
	 	for(int i = 0; i < s.length; i++) 
	 	{
	 		if(s[i] instanceof Cylinder)
	 			totalVolume += ((Cylinder) s[i]).computeVolume();
	 	}
	 	
	 	System.out.println(s[0]); 
	 	System.out.println(s[1]); 
	 	System.out.println(s[2]); 
	 	System.out.println(s[3]); 
	 	System.out.println(s[4]); 
	 	System.out.println(); 
	 	
	 	System.out.println("Total Area Of All Shapes : " + total); 
		System.out.println("Total Rectangle Area : " + sumArea); 
		System.out.println("Total Cylinder Volume : " + totalVolume); 
	} 
} 
 