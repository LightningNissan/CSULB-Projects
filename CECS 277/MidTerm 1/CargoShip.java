public class CargoShip extends Ship 
{
	private int tons; 
	
	public CargoShip() 
	{
		super(); 
	}
	
	public CargoShip(String name, int year, int t)
	{ 
		super(name, year); 
		tons = t; 
	}
	
	public void setTons(int t) 
	{ 
		tons = t; 
	}
	
	public int getTons() 
	{ 
		return tons; 
	}
	
	public String toString() 
	{ 
		return "The name of the ship is " + getName() + ". It was built in " + getYear() + ". The cargo capacity is " + getTons() + " tons.";
	}
}
	
