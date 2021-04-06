/**
 * 
 * @author Oscar Saavedra
 * @version 1.0
 * @date Feb 17, 2021
 */
public class Candy extends DessertItem {
	
	private int calories;
	private double weight;
	private double price;
	
	/**
	 * Null constructor for Candy class
	 */
	public Candy() {
		super();
		this.calories = 0;
		this.weight = 0.0;
		this.price = 0.0;	
	}
	
	/**
	 * Overloaded constructor that initializes the Candy data
	 * @param name name of the candy
	 * @param calories calories of the candy
	 * @param weight weight in pounds of the candy
	 * @param price price per pound of the candy
	 */
	public Candy(String name, int calories, double weight, double price) {
		super(name + "(Candy)");
		this.calories = calories;
		this.weight = weight;
		this.price= price;
	}
	
	/**
	 * Setter method for the calories of Candy
	 * @param calories calories of Candy
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	/**
	 * Setter method for the weight of Candy
	 * @param weight weight in pounds of Candy
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Setter method for the price per pound of Candy
	 * @param price price per pound of Candy
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Getter method for the weight of Candy
	 * @return weight in pounds of Candy
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * Getter method for the price per pound of Candy
	 * @return price per pound of Candy
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Getter method for the calories of Candy
	 * @return calories of Candy
	 */
	@Override
	public int getCalories() {
		return this.calories;
	}
	
	/**
	 * Returns cost of Candy
	 * @return cost of Candy
	 */
	@Override
	public double getCost() {
		return this.weight * this.price;
	}

	/**
	 * Returns information about Candy
	 * @return information about Candy
	 */
	public String toString() {
		String outputString = "";
		outputString += String.format("%1$.1f lbs. @ %2$.2f /lb.", 
									  this.getWeight(), this.getPrice());
		outputString += String.format("\n%-30s", this.getName());
		return outputString;
	}
}//end Candy
