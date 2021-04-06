public class DemoDriver 
{
	public static void main(String[] args) 
	{
		Point p1; // Reference 
		p1 = new Point(2, 3);  
		System.out.println(p1);   
		System.out.println(p1.toString());   
		
		Point3 p3 = new Point3();  
		System.out.println(p3); 
		p3.setX(99);
		System.out.println(p3); 
	}
}







