/*Design a Ship class that the following members:
•	A field for the name of the ship (a string).
•	A field for the year that the ship was built (an int).
•	A constructor and appropriate accessors and mutators.
•	A toString method that displays the ship’s name and the year it was built. */ 

public class Ship implements Comparable<Ship>
{
	private String name;
	private int year;
	
	public Ship() 
	{
		name = "noname";
		year = 1000;
	}
	
	public Ship(String n, int y)
	{
		name = n;
		year = y;
	} 
	
	public void setName(String n) 
	{ 
		name = n; 
	}
	
	public void setYear(int y)
	{ 
		year = y; 
	}
	
	public String getName() 
	{
		return name;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public int compareTo(Ship ship)
	{ 
		if(getYear() > ship.getYear()) 
		{ 
			return 1; 
		}
		else 
		{ 
			return 0; 
		}
	}
	
	public String toString() 
	{
		return "The name of the ship is " + name + ". It was built in " + year + ".";
	}
}
