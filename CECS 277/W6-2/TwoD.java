public class TwoD 
{
	private double x, y; 
	private String color; 
	
	/** 
	 * Default Constructor 
	 */
	public TwoD() 
	{ 
		x = 0.0; 
		y = 0.0; 
		color = ""; 
	}
	
	/** 
	 * Overloaded Constructor 
	 * @param xPos
	 * @param yPos
	 * @param c
	 */
	public TwoD(double xPos, double yPos, String c)
	{ 
		x = xPos; 
		y = yPos; 
		color = c; 
	}
	
	/** 
	 * Set X Pos 
	 * @param xPos
	 */
	public void setX(double xPos)
	{ 
		x = xPos; 
	}
	
	/** 
	 * Set Y Pos 
	 * @param yPos
	 */
	public void setY(double yPos)
	{ 
		x = yPos; 
	}
	
	/** 
	 * Set Color  
	 * @param c 
	 */
	public void setColor(String c)
	{ 
		color = c; 
	}
	
	/** 
	 * Get X Pos 
	 * @return x 
	 */
	public double getX() 
	{ 
		return x; 
	}
	
	/** 
	 * Get Y Pos 
	 * @return y 
	 */ 
	public double getY() 
	{ 
		return y; 
	}
	
	/** 
	 * Outputs the message of the class the shape is in    
	 */
	public void twoDShape() 
	{ 
		System.out.println("I am in the 2D shape class"); 
	}

	/** 
	 * Get Color  
	 * @return color 
	 */
	public String getColor() 
	{ 
		return color; 
	}
}
