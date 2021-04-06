/**
 * Creates Ice cream from dessertitem
 * @author Nishaan Amin
 * @author Alberto Perez
 * @author Oscar Saavedra
 * @version 1.0
 * @date Feb 17, 2021
 */
public class IceCream extends DessertItem {
	
	protected int calories;
	private double cost;
	
	/**
	 * Null
	 */
	public IceCream() {
		super();
		this.calories = 0;
		this.cost = 0.0;
	}
	
	/**
	 * 
	 * @param name
	 * @param calories
	 * @param cost
	 */
	public IceCream(String name, int calories, double cost) {
		super(name +"(IceCream)");
		this.calories = calories;
		this.cost = cost;
	}
	
	/**
	 * 
	 * @param calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	/**
	 * 
	 * @param cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public int getCalories() {
		return this.calories;
	}
	
	@Override
	public double getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		String outputString = "";
		outputString += String.format("\n%-30s", this.getName());
		return outputString;
	}
}//end IceCream
