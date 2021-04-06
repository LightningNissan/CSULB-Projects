/**
 * The DessertItem class is a superclass from which specific types 
 * of DessertItems can be derived.
 * @author Oscar Saavedra
 * @author Nishaan Amin
 * @author Alberto Perez
 * @date February 17, 2021
 *
 */
public abstract class DessertItem /*implements Comparable */{
	
	protected String name;

	/**
	 * Null constructor for DessertItem class
	 */
	public DessertItem() {
		this("");
	}
	
	/**
	 * Initializes DessertItem data
	 */
	public DessertItem(String name) {
		this.name = name;
	}
	
	/**
	 * Returns name of DessertItem
	 * @return name of DessertItem
	 */
	public final String getName() {
		return name;
	}
	
	/*public static DessertItem max(DessertItem a, DessertItem b) {
		DessertItem max = a;
		
		if(a.compareTo(b) == 0)
		{
			max.name = "";
		}
		else if(a.compareTo(b) == 1)
		{
			max = a;
		}
		else {
			max = b;
		}
		
		return max;
	}
	*/
	
	
	/*public int compareTo(DessertItem b) {
		if(this.getCalories() == b.getCalories())
		{
			return 0;
		}
		else if(this.getCalories() > b.getCalories())
		{
			return 1;
		}
		else {
			return -1;
		}
	}*/

	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */
	public abstract double getCost();
	
	/**
	 * Returns calories of DessertItem
	 * @return calories of DessertItem
	 */
	public abstract int getCalories();
	
}//end of DessertItem class