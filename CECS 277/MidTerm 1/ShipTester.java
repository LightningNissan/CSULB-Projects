import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipTester 
{
	public static void main(String[] args)
	{
		ArrayList<Ship> arr = new ArrayList<Ship>(); 
		
		Ship ship1 = new Ship(); 
		Ship ship2 = new Ship("Titanic", 1925); 
		
		CruiseShip cruise1 = new CruiseShip(); 
		CruiseShip cruise2 = new CruiseShip("Mayflower", 1615, 1000); 
		
		CargoShip cargo1 = new CargoShip(); 
		CargoShip cargo2 = new CargoShip("USS Constitution", 2000, 100); 
		
		arr.add(ship1); 
		arr.add(ship2); 
		arr.add(cargo1); 
		arr.add(cargo2); 
		arr.add(cruise1); 
		arr.add(cruise2); 
		
		Collections.sort(arr);
		
		for(Ship s : arr)
		{ 
			System.out.println(s); 
		}
	}
}
