public class Point 
{
	private int x; 
	private int y;  
	
	public Point() 
	{ 
		x = 0; 
		y = 0; 
	}
	
	// Overload 
	/** 
	 * 
	 * @param x 
	 * @param y
	 */
	public Point(int x, int y) 
	{ 
		this.x = x; 
		this.y = y; 
	}
	
	// Setters Mutators 
	public void setX(int x) 
	{ 
		this.x = x; 
	}
	
	// Local Variable 
	// x, y local attribute  
	public void setY(int y) 
	{ 
		this.y = y; 
	}
	
	public int getX() 
	{ 
		return x; 
	}
	
	public int getY() 
	{ 
		return y; 
	}
	
	/** 
	 * @override 
	 */
	public String toString() 
	{ 
		return "(x,y) = (" + x + "," + y + ")";  
	}
}
