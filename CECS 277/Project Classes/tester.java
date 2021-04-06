import java.util.Scanner;
/**
 * 
 * @author Alberto Perez
 * @author Nishaan Amin
 * @author Oscar Saavedra
 * 
 *
 */
public class tester {

	public static void main(String[] args) {
		
		String quit = "con";
		Airplane One = new Airplane ();
		
		System.out.println("Welcome to Perez Airlines");
		
		while (quit != "quit") {
			Scanner input = new Scanner (System.in);
			System.out.println("A)dd" + " " + "S)how" + " " +"Q)uit");
			String select = input.next();
			int num = 0;
			
			System.out.println();
			
			while(select.equalsIgnoreCase("a")== false &&
				  select.equalsIgnoreCase("s")== false &&
				  select.equalsIgnoreCase("q")== false) 
				 {System.out.println("Wrong Input, try again \n");
				  System.out.println("A)dd" + " " + "S)how" + " " +"Q)uit");
				  select = input.next();}
			
			if (select.equalsIgnoreCase("a") == true ||
				select.equalsIgnoreCase("s") == true ||
				select.equalsIgnoreCase("q") == true) {
				
				
			switch(select)
			{
			case "A","a":    System.out.println("F)irst " + "E)conomy"); select = input.next(); while(select.equalsIgnoreCase("f")== false && 
																		 							  select.equalsIgnoreCase("e")== false ) {System.out.println("Wrong Input, try again");System.out.println("F)irst " + "E)conomy");select = input.next();} // up coming switch is the main for case "A", "a"
			           switch(select) {case "F", "f": First first = new First (One); // First Class Case
							 System.out.println("Passengers? (1-2)"); do { // checks for integer input 
								    									   while (!input.hasNextInt()) {
								    											System.out.println("Please enter correct values 1-2");
								    											input.next(); // this is important!
								    											}
								    											num = input.nextInt();
								    											if (num !=1 && num !=2)System.out.println("Please enter correct values 1-2");
																				} while (num !=1 && num !=2);
																									
							 switch(num)    {case 1 , 2 : first.PassengerSearch(num, One); // Number of Passengers
							 System.out.println("A)isle "+"W)indow");	 select = input.next(); while(select.equalsIgnoreCase("a")== false && 
		 							  																  select.equalsIgnoreCase("w")== false ) {System.out.println("Wrong Input, try again");System.out.println("A)isle "+"W)indow");select = input.next();}
							 if (select.equalsIgnoreCase("a") == true) // statement for aisle selection
							 {
							 switch(num) 	{case 1: first.seatFor1("aisle", One); if(first.getAvail() == false) {System.out.println("No seating option available");}break;
							 				 case 2: first.seatFor2("aisle", One); if(first.getAvail() == false) {System.out.println("No seating option available");}break;}} // end of if statement
							 if (select.equalsIgnoreCase("w") == true) // statement for window selection
							 {
							 switch(num) 	{case 1: first.seatFor1("window", One);if(first.getAvail() == false) {System.out.println("No seating option available");}break;
							 				 case 2: first.seatFor2("window", One);if(first.getAvail() == false) {System.out.println("No seating option available");}break;}} // end of if statement
							 															 break; // passenger switch break
							 }break; // break belongs to First Class case "F","f"
							 					
			                 			case "E", "e": Econ econ = new Econ (One); // Economy Class case, case belongs to first swithc statement
			                 System.out.println("Passengers? (1-3)"); do { // checks for integer input 
								   										while (!input.hasNextInt()) {
								   											System.out.println("Please enter correct values 1-3");
								   											input.next(); // this is important!
								   											}
								   											num = input.nextInt();
								   											if (num !=1 && num !=2 && num != 3)System.out.println("Please enter correct values 1-3");
																			} while (num !=1 && num !=2 && num!=3);
			                 switch(num)    {case 1,2,3 : econ.PassengerSearch(num, One); // Number of Passengers
			                 System.out.println("A)isle "+"C)enter "+"W)indow"); select = input.next(); while(select.equalsIgnoreCase("a")== false && 
										  																     select.equalsIgnoreCase("w")== false && select.equalsIgnoreCase("c") == false  ) {System.out.println("Wrong Input, try again");System.out.println("A)isle "+"W)indow");select = input.next();}
			                 if (select.equalsIgnoreCase("a") == true)
			                 {
			                 switch(num) { case 1: econ.seatFor1("aisle", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break;
			                 			   case 2: econ.seatFor2("aisle", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break;
			                 			   case 3: econ.seatFor3("aisle", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break; }} 
			                 if (select.equalsIgnoreCase("c") == true)
			                 {
			                 switch(num) { case 1: econ.seatFor1("center", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break;
			                 			   case 2: econ.seatFor2("center", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break;
			                 			   case 3: econ.seatFor3("center", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break; }} 
			                 if (select.equalsIgnoreCase("w") == true)
			                 {
			                 switch(num) { case 1: econ.seatFor1("window", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break;
			                 			   case 2: econ.seatFor2("window", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break;
			                 			   case 3: econ.seatFor3("window", One);if(econ.getAvail() == false) {System.out.println("No seating option available");} break; }} 
			                 
			                 															break; // passenger swithc break
			                 } break; // break belongs to Economy Class case "E","e"
			                 
			                 } break; // break belongs to case "A" , "a"
			
			case "S","s":  	// prints airplane seats
						 int numsys =0;
						 for (int i = 0; i < 4 ; i += 2)
						 { 
							 StringBuffer sbr = new StringBuffer(One.getSeats()[i +1 ]);
							 sbr.reverse();
						        
							 System.out.println(" "+(numsys+=1) +"]" + One.getSeats()[i] +"  " + sbr);
						 }
						 	 System.out.println(" "+ 3 +"]" + One.getSeats()[4] +"  " + One.getSeats()[5] );
						 	 numsys = 3;
						 for (int i = 6; i < 9 ; i += 2)
						 { 
							 StringBuffer sbr = new StringBuffer(One.getSeats()[i]);
							 sbr.reverse();
						        
							 System.out.println(" "+(numsys+=1) +"]" + sbr+"  " + One.getSeats()[i+1]);
						 }
						 for (int i = 10; i < 17 ; i += 2)
						 { 
							 StringBuffer sbr = new StringBuffer(One.getSeats()[i +1]);
							 sbr.reverse();
						        
							 System.out.println(" "+(numsys+=1) +"]" + One.getSeats()[i] +"  " + sbr);
						 }
						 
						 for (int i = 18; i < 24 ; i += 2)
						 { 
							 StringBuffer sbr = new StringBuffer(One.getSeats()[i +1]);
							 sbr.reverse();
						        
							 System.out.println(""+(numsys+=1) +"]" + One.getSeats()[i] +"  " + sbr);
						 }
						 
						 	 System.out.println(""+ 13 +"]" + One.getSeats()[24] +"  " + One.getSeats()[25] );
						 	 numsys= 13;
						 for (int i = 26; i < 40 ; i += 2)
						 { 
							 StringBuffer sbr = new StringBuffer(One.getSeats()[i]);
							 sbr.reverse();
						        
							 System.out.println(""+(numsys+=1) +"]" + sbr+"  " + One.getSeats()[i+1]);
						 }

						 break; // break for case "S" , "s" 
			
			case "Q","q": quit = "quit"; break; // quit 
						 
				
			
			}} //end of main switch statement and if statement
			
		} // end of while loop
		
		

	} //end of main

}
