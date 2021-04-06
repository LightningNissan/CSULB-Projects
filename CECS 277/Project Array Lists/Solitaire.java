import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner; 

/** 
 * Implements Bulgarian Solitaire, 
 * date 02/03/21 
 * @author Nishaan Amin, Alberto Perez, Oscar Saavedra 
 * @version 1.0  
 */
public class Solitaire
{
	/** 
	 * Main method to run the entire code  
	 * @param args
	 */
	public static void main(String[] args) 
	{ 
		// Declare and initialize Array Lists    
		ArrayList<Integer> piles = new ArrayList<Integer>(); 
		ArrayList<Integer> solitaire = new ArrayList<Integer>(); 

		Scanner in = new Scanner(System.in); 
		
		// Declare and initialize variables 
		int cardsInPile;   
		int remainingCards = 45; 
		int pileCount = 1; 
		
		// Asks user to enter the amount of piles within a range of 1 - 45 
		System.out.println("Enter Amount of Piles - (1 to 45) :"); 
		pileCount = CheckInput.getIntRange(1,  45);                
		
		// For Loop to generate a randomized number of cards in one pile per iteration 
		for (int i = 0; i < pileCount - 1; i++) 
		{ 
			cardsInPile = (int) (Math.random() * (remainingCards - pileCount + i + 1)) + 1; 
			piles.add(cardsInPile); 
			remainingCards -= cardsInPile; 
		} 
		
		// Adds the remaining cards as the last pile to ensure that the total amount of cards = 45   
		piles.add(remainingCards);  
		
		// Display the initial pile  
		System.out.println("The initial piles are :");
		System.out.println(piles);
		
		// For Loop to add the numbers 1 - 9 in the solitaire Array List 
		for (int i = 0; i < 9; i++)
		{ 
			solitaire.add(i + 1); 
		}

		// Nested For Loop to subtract 1 card from every pile 
		for (;;)
		{ 
			int newPile = 0; 
			
			for (int i = 0; i < piles.size(); i++) 
			{ 
				piles.set(i, piles.get(i) - 1); 
		        
				// If Statement to remove any piles from the Array List that have a value of 0 
				if (piles.get(i) == 0)
				{ 
					piles.remove(i); 
					i--; 
				}   		
		        newPile++;      
			}
			
			// Add all of those cards to a new pile and display the new pile 
			piles.add(newPile);  
			System.out.println("The new piles are :");
			System.out.println(piles); 
			
			// Make a temporary Array List that contains the elements of the piles Array List and sort it 
			ArrayList<Integer> temp = piles; 
			Collections.sort(temp); 
			
			// If Statement to that determines whether or not the for loop stops by making sure the elements from each Array List are equal to each other 
			if (temp.equals(solitaire) == true)
			{ 
				break;  
			}
		} 
		
		// Sorts and displays the final result of piles from least to greatest to make the output look more aesthetically pleasing 
		Collections.sort(piles); 
		System.out.println("The sorted piles are :");
		System.out.println(piles);  
	}  
} 
	
