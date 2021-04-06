/**
 * Creates a cookie of dessertItem
 * @author Nishaan Amin
 * @author Alberto Perez
 * @author Oscar Saavedra
 * @version 1.0
 * @date Feb 17, 2021
 */
public class Cookie extends DessertItem {
	
	private int calories;
	private int quantity;
	private double price;
	
	/**
	 * Null constructor for Cookie class
	 */
	public Cookie() {
		super();
		this.calories = 0;
		this.quantity = 0;
		this.price = 0.0;
	}
	
	/**
	 * 
	 * @param name name of the cookie
	 * @param calories calories of the cookie
	 * @param quantity quantity of cookies
	 * @param price price per dozen of cookies
	 */
	public Cookie(String name, int calories, int quantity, double price) {
		super(name + "(Cookie)");
		this.calories = calories;
		this.quantity = quantity;
		this.price = price;
	}
	
	/**
	 * Setter method for the calories of Cookie
	 * @param calories calories of Cookie
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	/**
	 * Setter method for the quantity Cookie
	 * @param quantity quantity of Cookie
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Setter method for the price per dozen of Cookie
	 * @param price price per dozen of Cookie
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Getter method for the quantity of cookies
	 * @return quantity of cookies
	 */
	public int getQuantity() {
		return this.quantity;
	}
	
	/**
	 * Getter method for the price per dozen of Cookie
	 * @return price per dozen of Cookie
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Getter method for the calories of Cookie
	 * @return calories of Cookie
	 */
	@Override
	public int getCalories() {
		return this.calories;
	}
	
	/**
	 * Returns cost of Cookie
	 * @return cost of Cookie
	 */
	@Override
	public double getCost() {
		return this.quantity * (this.price / 12);
	}
	
	/**
	 * Returns information about Cookie
	 * @return information about Cookie
	 */
	@Override
	public String toString() {
		String outputString = "";
		outputString += String.format("%1$d @ %2$.2f /dz.", 
									  this.getQuantity(), this.getPrice());
		outputString += String.format("\n%-30s", this.getName());
		return outputString;
	}
}//end Cookie
