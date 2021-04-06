import java.util.ArrayList;
/**
 * 
 * @author Alberto Perez
 * @author Nishaan Amin
 * @author Oscar Saavedra
 * 
 *Economy class seats for Airplane
 */
public class Econ extends Airplane {
	String [] classSeats = new String[40]; 
	ArrayList <Integer> indexSeats = new ArrayList <> (); // used to hold onto index of seats available
	char [] seat = new char [5];
    boolean available = true; // determines if seats are available
	
    /**
     * Default Constructor
     */
    public Econ() {};
    
    /**
     * Overloaded Constructor
     * @param F
     * Adds to the String classSeats
     */
	public Econ (Airplane F) 
	{super();
	 for (int i = 0; i < classSeats.length; i++)
		 {classSeats[i] = F.getSeats()[i];}}
	
	//public ArrayList <Integer> get() {return indexSeats;}
	
	
	/**
	 * Looks up number of seats of selected number of passengers
	 * @param numPassenger
	 * @param F
	 * @return ArrayList IndexSeats
	 */
	public ArrayList <Integer> PassengerSearch(int numPassenger, Airplane F)
	{
	
		for (int i = 10; i < 40; i ++) {
			classSeats[i] = F.getSeats()[i]; 
			}
		
		
		if (numPassenger == 1)
		{
			for (int i = 10; i < classSeats.length ; i++)
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
			for (int i = 10; i < classSeats.length ; i++) // checks classSeats for two passengers
			{ 
				;
				if( classSeats[i].contains(". . .") == true )
				{
					
					indexSeats.add(i); // inserts index string from classSeats to passengerSeats
				}
				;
				if ( classSeats[i].contains(". . *") == true )
				{
					indexSeats.add(i); // inserts index string from classSeats to passengerSeats
				}
				;
			    if( classSeats[i].contains("* . .") == true )
				{
					indexSeats.add(i); // inserts index string from classSeats to passengerSeats
				}
				}}
		
		else if (numPassenger == 3)
		{
			for (int i = 10; i < classSeats.length ; i++) // checks classSeats for three passengers
			{
				if( classSeats[i].contains(". . .") == true)
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
	public boolean seatFor1 (String SeatType, Airplane F) 
	{
		if (SeatType.equalsIgnoreCase("window") == true)//ROW 1 & 2 WINDOW 
		{
			for (int i = 0; i < indexSeats.size(); i++) 
			{
				if((indexSeats.get(i) >= 10 && indexSeats.get(i) < 25) && // ROW 1							/
						classSeats[indexSeats.get(i)].charAt(0) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append(classSeats[indexSeats.get(i)].charAt(2))
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				if((indexSeats.get(i) >= 25 && indexSeats.get(i) < 40) && // ROW 2							/
						classSeats[indexSeats.get(i)].charAt(4) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append(classSeats[indexSeats.get(i)].charAt(2))
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append('*')
														.toString(); 
					indexSeats.clear(); return true;
				}}}
		
		if (SeatType.equalsIgnoreCase("center") == true)//ROW 1 & 2 Center
		{
			for (int i = 0; i < indexSeats.size(); i++) 
			{
				if((indexSeats.get(i) >= 10 && indexSeats.get(i) < 25) && // ROW 1							/
						classSeats[indexSeats.get(i)].charAt(2) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				if((indexSeats.get(i) >= 25 && indexSeats.get(i) < 40) && // ROW 2							/
						classSeats[indexSeats.get(i)].charAt(2) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}}}
		
		
		if (SeatType.equalsIgnoreCase("aisle") == true)//ROW 1 & 2 Aisle
		{
			for (int i = 0; i < indexSeats.size(); i++) 
			{
				if((indexSeats.get(i) >= 10 && indexSeats.get(i) < 25) && // ROW 1							/
						classSeats[indexSeats.get(i)].charAt(4) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append(classSeats[indexSeats.get(i)].charAt(2))
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append('*')
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				if((indexSeats.get(i) >= 25 && indexSeats.get(i) < 40) && // ROW 2							/
						classSeats[indexSeats.get(i)].charAt(0) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append(classSeats[indexSeats.get(i)].charAt(2))
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}}}
		available =false;
		indexSeats.clear(); return false;
	}
	
	/**
	 * Searches for seats for 2 passengers and type of seat
	 * @param SeatType
	 * @param F
	 * @return bool
	 */
	public boolean seatFor2 (String SeatType, Airplane F) 
	{
		if (SeatType.equalsIgnoreCase("window") == true)//ROW 1 & 2 WINDOW 
		{
			for (int i = 0; i < indexSeats.size(); i++) 
			{
				if((indexSeats.get(i) >= 10 && indexSeats.get(i) < 25) && // ROW 1							/
						classSeats[indexSeats.get(i)].charAt(0) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				else if((indexSeats.get(i) >= 25 && indexSeats.get(i) < 40) && // ROW 2							/
						classSeats[indexSeats.get(i)].charAt(4) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append('*')
														.toString(); 
					indexSeats.clear(); return true;
				}}}
		
		else if (SeatType.equalsIgnoreCase("center") == true)//ROW 1 & 2 Center
		{
			for (int i = 0; i < indexSeats.size(); i++) 
			{
				if((indexSeats.get(i) >= 10 && indexSeats.get(i) < 25) && // ROW 1							/
						(classSeats[indexSeats.get(i)].charAt(2) == '.'&&
						 classSeats[indexSeats.get(i)].charAt(0) == '.'))  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append('*')
														.append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				else if((indexSeats.get(i) >= 10 && indexSeats.get(i) < 25) && // ROW 1							/
						(classSeats[indexSeats.get(i)].charAt(2) == '.'&&
						 classSeats[indexSeats.get(i)].charAt(4) == '.'))  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append('*')
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				else if((indexSeats.get(i) >= 25 && indexSeats.get(i) < 40) && // ROW 2							/
						(classSeats[indexSeats.get(i)].charAt(2) == '.'&&
						 classSeats[indexSeats.get(i)].charAt(0) == '.'))  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				else if((indexSeats.get(i) >= 25 && indexSeats.get(i) < 40) && // ROW 2							/
						(classSeats[indexSeats.get(i)].charAt(2) == '.'&&
						 classSeats[indexSeats.get(i)].charAt(4) == '.'))  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append('*')
														.toString(); 
					indexSeats.clear(); return true;
				}}}
		
		
		else if (SeatType.equalsIgnoreCase("aisle") == true)//ROW 1 & 2 Aisle
		{
			for (int i = 0; i < indexSeats.size(); i++) 
			{
				if((indexSeats.get(i) >= 10 && indexSeats.get(i) < 25) && // ROW 1							/
						classSeats[indexSeats.get(i)].charAt(4) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append(classSeats[indexSeats.get(i)].charAt(0))
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append('*')
														.toString(); 
					indexSeats.clear(); return true;
				}
				
				else if((indexSeats.get(i) >= 25 && indexSeats.get(i) < 40) && // ROW 2							/
						classSeats[indexSeats.get(i)].charAt(0) == '.' )  
				{
					F.getSeats()[indexSeats.get(i)]= new StringBuilder()
														.append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(1))
											            .append('*')
											            .append(classSeats[indexSeats.get(i)].charAt(3))
											            .append(classSeats[indexSeats.get(i)].charAt(4))
														.toString(); 
					indexSeats.clear(); return true;
				}}}
		available =false;
		indexSeats.clear(); return false;
	}
	
	
	/**
	 * Searches for seats for 3 passengers and type of seat
	 * @param SeatType
	 * @param F
	 * @return boolean
	 */
	public boolean seatFor3 (String SeatType, Airplane F)
	{
		
		if ((SeatType.equalsIgnoreCase("window") == true || 
			SeatType.equalsIgnoreCase("center" ) == true || 
			SeatType.equalsIgnoreCase("aisle") == true) && (indexSeats.size()>0))
		{
			for (int i = 0; i < indexSeats.size(); i++) {
			
		if (F.getSeats()[indexSeats.get(i)] == ". . .") {
			F.getSeats()[indexSeats.get(i)] = "* * *"; 
			i = indexSeats.size();} }
			
			indexSeats.clear(); return true;
		}
		
		available =false;
		indexSeats.clear(); return false;
	}
	
	/**
	 * 
	 * @return available
	 */
	public boolean getAvail() {return available;}
	
	@Override 
	public String toString() {
		return "this is the Econ Class";
	}
	
}
