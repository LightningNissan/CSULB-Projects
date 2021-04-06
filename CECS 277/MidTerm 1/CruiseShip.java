public class CruiseShip extends Ship 
{
	private int maxPassengers; 
	
	public CruiseShip() 
	{
		super(); 
	}
	
	public CruiseShip(String name, int year, int maxPass) 
	{ 
		super(name, year); 
		maxPassengers = maxPass; 
	}
	
	public void setMaxPassengers(int maxPass) 
	{ 
		maxPassengers = maxPass; 
	}
	
	public int getMaxPassengers() 
	{ 
		return maxPassengers; 
	}
	
	public String toString()
	{
		return "The name of the ship is " + getName() + ". It was built in " + getYear() + ". The maximum number of passengers are " + getMaxPassengers() + " passengers."; 
	} 
}
