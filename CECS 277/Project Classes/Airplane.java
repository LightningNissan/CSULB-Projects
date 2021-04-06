/**
 * 
 * @author Alberto Perez
 * @author Nishaan Amin
 * @author Oscar Saavedra
 * @date 3/3/21
 *
 *	Project will output a airplane seating arrangement. Acquiring input from the user on 
 *	the type of class seating, numbers of passengers and type of seat. It will update the 
 *  seats as the become filled up. 
 */
public class Airplane {
	
	
	private String[] seats = {".   ." ,".   ." ,".   ." ,".   ." ,".   ." , // seatSections in first class
			  ".   ." ,".   ." ,".   ." ,".   ." ,".   ." ,
			  ". . ." ,". . ." ,". . ." ,". . ." ,". . ." , // seatSections in econ class
			  ". . ." ,". . ." ,". . ." ,". . ." ,". . ." ,
			  ". . ." ,". . ." ,". . ." ,". . ." ,". . ." ,
			  ". . ." ,". . ." ,". . ." ,". . ." ,". . ." ,
			  ". . ." ,". . ." ,". . ." ,". . ." ,". . ." ,
			  ". . ." ,". . ." ,". . ." ,". . ." ,". . ." };
	
	public Airplane() {}

	/**
	 * Returns String array seats
	 * @return
	 */
	public String [] getSeats(){
		return seats;
	}

	@Override
	public String toString() {
		return "this is the airplane class";
	}
		
	
}
