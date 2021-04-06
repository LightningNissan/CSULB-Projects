import java.util.ArrayList;

/**
 * This class makes a purchase for a store of DessertItems.
 * @author Nishaan Amin
 * @author Alberto Perez
 * @author Oscar Saavedra
 * @version 1.0
 * @date Feb 17, 2021
 */
public class Checkout {
	
	private double taxRate = 0.07;
	private int totalCost;
	ArrayList<DessertItem> dessertList = new ArrayList<DessertItem>();

	/**
	 * Null constructor
	 */
	public Checkout() {
		
	}
	
	/**
	 * Setter for tax rate
	 * @param taxRate taxRate for purchase
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	/**
	 * Getter for tax rate
	 * @return the tax rate 
	 */
	public double getTaxRate() {
		return this.taxRate;
	}
	
	/**
	 * Returns the number of items
	 * @return the number of items
	 */
	public int numberOfItems() {
		return dessertList.size();
	}
	
	/**
	 * Insert a new item to the purchase
	 * @param item item being bought
	 */
	public void enterItem(DessertItem item) {
		dessertList.add(item);
	}
	
	/**
	 * clear the purchase
	 */
	public void clear() {
		dessertList.clear();
	}
	
	/**
	 * Calculte the total cost of items
	 * @return total cost of items
	 */
	public int totalCost() {
		int tempCost = 0;
		totalCost = 0;
		for(DessertItem item : dessertList) 
		{
			tempCost = (int)Math.round(item.getCost() * 100);
			totalCost += tempCost;
		}
		return totalCost;
	}
	
	/**
	 * Return the total tax
	 * @return total tax
	 */
	public int totalTax() {
		return (int) Math.round(this.totalCost() * taxRate);
	}
	
	@Override
	public String toString() {
		String outputString = "";
		
		outputString += "        CSULB's Dessert Shoppe        ";
		outputString += "\n        ----------------------        \n";
		for(DessertItem item : dessertList) 
		{
			outputString += item;
			outputString += String.format("%6.2f\n", item.getCost());
		}
		outputString += String.format("\n%-30s", "Tax:");
		outputString += String.format("%6.2f", totalTax() / 100.0);
		outputString += String.format("\n%-30s", "Total cost:");
		outputString += String.format("%6.2f", (double)(totalCost() + totalTax()) / 100);
		return outputString;
	}
}//end Checkout
