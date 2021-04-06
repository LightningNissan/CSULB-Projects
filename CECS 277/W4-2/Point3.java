public class Point3 /*sub*/ extends Point /*super*/  
{
	private int z; 
	private int x;
	
	public Point3() 
	{ 
		super(); 
		z = 0; 
	}
	
	public void setX(int b)
	{
		x = b; 
	}
	
	public void setZ(int b)
	{ 
		x = b
	}

	public int getX() 
	{ 
		return x; 
	}
	
	public int getZ() 
	{ 
		return z; 
	}
	
	// Overload 
	public Point3(int m, int n, int p)
	{ 
		super(m, n); 
		z = p;  
	}
	
	// Setters 
	// Get 
	/** 
	 * @override  
	 */
	public String toString() 
	{ 
		return super.toString() + " z" + z + x + super.getX();    
	}
}



