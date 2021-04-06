/** 
 * 
 * @author Nishaan Amin 
 *
 */
public class Cylinder extends Circle 
{
    private double height;
    
    /** 
     * Default Constuctor 
     */
	public Cylinder() 
	{ 
		super(); 
		height = 0; 
	} 
	
	/** 
	 * Overloaded Constructor 
	 * @param x
	 * @param y
	 * @param r
	 * @param h
	 */
    public Cylinder(double x, double y, double r, double h)
    { 
		super(x, y, r);  
	 	height = h; 
    }

	/** 
	 * Getter Method to find the height of a Cylinder 
	 * @ return height 
	 */
    public double getHeight() 
    {
    	return height;
    }
    
	/** 
	 * Getter Method to find the surface area of a Cylinder 
	 * @ return 2 * Math.PI * Math.pow(super.getRadius(), 2) + 2 * Math.PI * super.getRadius() * height 
	 */
    public double computeArea() 
    { 
    	return 2 * Math.PI * Math.pow(super.getRadius(), 2) + 2 * Math.PI * super.getRadius() * height; 
    }
    
	/** 
	 * Getter Method to find the volume of a Cylinder 
	 * @ return height * Math.PI * Math.pow(super.getRadius(), 2)
	 */
    public double computeVolume()
    {
    	return height * Math.PI * Math.pow(super.getRadius(), 2);
    }
    
	/** 
	 * Getter Method to display the height of the Cylinder 
	 * @ return String  
	 */
	public String toString() 
	{
		return super.toString() + " Height = " + height;
	}
}
