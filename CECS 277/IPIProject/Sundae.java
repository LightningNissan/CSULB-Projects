
/**
 * Class to create Sundaes
 * @author Nishaan Amin
 * @author Alberto Perez
 * @author Oscar Saavedra
 * @version 1.0
 * @date Feb 17, 2021
 */
public class Sundae extends IceCream {
	
	private String topping;
	private double toppingCost;
	
	/**
	 * Null constructor
	 */
	public Sundae() {
		super();
		this.topping = "";
		this.toppingCost = 0.0;
	}
	
	/**
	 * Initialize the data
	 * @param name
	 * @param calories
	 * @param cost
	 * @param topping
	 * @param toppingCost
	 */
	public Sundae(String name, int calories, double cost, 
				  String topping, double toppingCost) {
		super(name, calories, cost);
		this.topping = topping + "(Topping)";
		this.toppingCost = toppingCost;
		this.name = name +"(Sundae)";
	}
	
	/**
	 * setter for calories
	 * @param calories of sundae
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	/**
	 * setter for toppings
	 * @param topping
	 */
	public void setTopping(String topping) {
		this.topping = topping + "(Topping)";
	}
	
	/**
	 * setter for topping cost
	 * @param toppingCost
	 */
	public void setToppingCost(double toppingCost) {
		this.toppingCost = toppingCost;
	}
	
	/**
	 * getter for topping
	 * @return
	 */
	public String getTopping() {
		return this.topping;
	}
	
	/**
	 * getter for topping cost
	 * @return
	 */
	public double getToppingCost() {
		return this.toppingCost;
	}
	
	@Override
	public double getCost() {
		return super.getCost() + this.toppingCost;
	}
	
	@Override
	public String toString() {
		String outputString = "";
		outputString += String.format("\n%-30s", this.getName() + " with");
		outputString += String.format("\n%-30s", this.getTopping());
		return outputString;
	}
}//end Sundae
