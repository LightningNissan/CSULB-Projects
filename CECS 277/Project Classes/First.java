import java.util.ArrayList;
/**
 * 
 * @author Alberto Perez
 * @author Nishaan Amin
 * @author Oscar Saavedra
 * 
 *First class seats for Airplane
 */
public class First extends Airplane {

	String [] classSeats = new String[40];// seatSections in first class

	ArrayList <Integer> indexSeats = new ArrayList <> (); // used to hold onto index of available seats
	char [] seat = new char [5];
    boolean available = true; // determines if seats are available 
	
    /**
     * Default Constructor
     */
    public First() {};
    
    /**
     * Overloaded Constructor
     * @param F
     * adds Strings to array classSeats
     */
	public First(Airplane F) 
	{super();
	 for (int i = 0; i < classSeats.length ; i++) 
	 	 {classSeats[i] = F.getSeats()[i]; }}
	
	
	/**
	 * Looks up number of seats of selected number of passengers
	 * @param numPassenger
	 * @param F
	 * @return ArrayList IndexSeats
	 */
	public ArrayList <Integer> PassengerSearch(int numPassenger, Airplane F)
	{
		for (int i = 0; i < 40; i ++) {
			classSeats[i] = F.getSeats()[i]; 
			//System.out.println(F[i]);
			}
		
		if (numPassenger == 1)
		{
			for (int i = 0; i < 10 ; i++)
			{
				 for (int p = 0; p < 5; p++) 
				 { 
					  seat[p] =classSeats[i].charAt(p); // turns each string in array seats into chars
							
				 }
				 for (int p = 0; p < 5; p++) // checks available seats and sets to array updateSeats
				 {
					  if (seat[p] == '.') { // adds element of classSeats to passengerSeats
						  indexSeats.add(i);
						  p =5;
					  	  }}}}
		
		else if (numPassenger == 2)
		{
			for (int i = 0; i < 10; i++) // checks classSeats for two passengers
			{
				if( classSeats[i] == ".   .")
				{
					indexSeats.add(i); // inserts string from classSeats to passengerSeats
				}}}
		
	return indexSeats;	
	}// END of PassengerSearch
	
	
	/**
	 * Searches for seats for 1 passenger and type of seat
	 * @param SeatType
	 * @param F 
	 * @return boolean
	 */
	public boolean seatFor1 (String SeatType, Airplane F) // returns string to change and input into airplane class
	{	if (SeatType.equalsIgnoreCase("window") == true) // WINDOW 1 PASSENGER
		{
			for (int i = 0; i < indexSeats.size(); i++) // ROW1
			{
				if ( (indexSeats.get(i)>= 0 && indexSeats.get(i) < 5)  
											&& classSeats[indexSeats.get(i)] == ".   ." ) 
				{
					F.getSeats()[indexSeats.get(i)] = "*   ."; indexSeats.clear(); return true;
				}
				
				if ( (indexSeats.get(i)>= 0 && indexSeats.get(i) < 5)  
											&& classSeats[indexSeats.get(i)] == ".   *" ) 
				{
					F.getSeats()[indexSeats.get(i)] = "*   *"; indexSeats.clear(); return true;
				}}
						
			
			for (int i = 0; i < indexSeats.size(); i++) // ROW2
			{
				if ( (indexSeats.get(i)>= 5 && indexSeats.get(i) <= 9)  
											&& classSeats[indexSeats.get(i)] == ".   ." ) 
				{
					F.getSeats()[indexSeats.get(i)] = ".   *"; indexSeats.clear(); return true;
				}
				
				if ( (indexSeats.get(i)>= 5 && indexSeats.get(i) <= 9)  
											&& classSeats[indexSeats.get(i)] == "*   ." ) 
				{
					F.getSeats()[indexSeats.get(i)] = "*   *"; indexSeats.clear(); return true;
				}}} // END OF WINDOW
			
			
		else if (SeatType.equalsIgnoreCase("aisle") == true) // AISLE
		{
			for (int i = 0; i < indexSeats.size(); i++) // ROW1
			{
				if ( (indexSeats.get(i)>= 0 && indexSeats.get(i) < 5)  
											&& classSeats[indexSeats.get(i)] == ".   ." ) 
				{
					F.getSeats()[indexSeats.get(i)] = ".   *"; indexSeats.clear(); return true;
				}
				
				if ( (indexSeats.get(i)>= 0 && indexSeats.get(i) < 5)  
											&& classSeats[indexSeats.get(i)] == "*   ." ) 
				{
					F.getSeats()[indexSeats.get(i)] = "*   *"; indexSeats.clear(); return true;
				}}
						
			
			for (int i = 0; i < indexSeats.size(); i++) // ROW2
			{
				if ( (indexSeats.get(i)>= 5 && indexSeats.get(i) <= 9)  
											&& classSeats[indexSeats.get(i)] == ".   ." ) 
				{
					F.getSeats()[indexSeats.get(i)] = "*   ."; indexSeats.clear(); return true;
				}
				
				if ( (indexSeats.get(i)>= 5 && indexSeats.get(i) <= 9)  
											&& classSeats[indexSeats.get(i)] == ".   *" ) 
				{
					F.getSeats()[indexSeats.get(i)] = "*   *"; indexSeats.clear();return true;
				}}}
	indexSeats.clear();
	available = false;
	return false;

	} // END OF seatFor1
	
	
	/**
	 * Searches for seats for 2 passengers and type of seat
	 * @param SeatType
	 * @param F
	 * @return boolean
	 */
	public Boolean seatFor2 (String SeatType, Airplane F) 
	{
		if ((SeatType.equalsIgnoreCase("window") == true) ||
			(SeatType.equalsIgnoreCase("aisle") == true)) // for window or aisle
		{
			for (int i = 0; i < indexSeats.size(); i++)
			{
				if ( (indexSeats.get(i)>= 0 && indexSeats.get(i) <= 9)
							               && classSeats[indexSeats.get(i)] == ".   ." )
				{
					F.getSeats()[indexSeats.get(i)] = "*   *"; indexSeats.clear(); return true;
	}}}
	
	indexSeats.clear();
	available = false;
	return false; 	
	} // END OF seatFor2
	
	
	/**
	 * 
	 * @return available
	 */
	public boolean getAvail() {return available;}
	
	@Override
	public String toString() {
		return "this is the First Class";
	}
	
}
