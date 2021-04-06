import java.util.ArrayList;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DessertItem> dessertList = new ArrayList<DessertItem>();
		
		DessertItem c1 = new Candy();
		DessertItem c2 = new Candy();
		DessertItem c3 = new Candy("Lolipop", 640, 2.5, 8.25);
		DessertItem ck1 = new Cookie();
		DessertItem ck2 = new Cookie();
		DessertItem ck3 = new Cookie("Oatmeal", 240, 15, 3.99);
		DessertItem i1 = new IceCream();
		DessertItem i2 = new IceCream();
		DessertItem i3 = new IceCream("Chocolate", 500, 9.99);
		DessertItem s1 = new Sundae();
		DessertItem s2 = new Sundae("Caramel", 600, 7.0, "HotFudge", 0.70);
		DessertItem s3 = new Sundae("BananaSplit", 560, 6.00, "Strawberries", 0.90);
		
		Checkout purchase = new Checkout();
		
		c2.name = "Corn";
		((Candy) c2).setCalories(500);
		((Candy) c2).setWeight(1.5);
		((Candy) c2).setPrice(7.25);
		dessertList.add(c1);
		dessertList.add(c2);
		dessertList.add(c3);
		System.out.println("--------------------------------------------------");
		System.out.println("CANDY TEST");
		for(DessertItem item : dessertList) {
			if(item instanceof Candy)
				printDessertItem(item);
		}
		System.out.println("--------------------------------------------------");
		

		ck2.name = "ChocChip";
		((Cookie) ck2).setCalories(250);
		((Cookie) ck2).setQuantity(17);;
		((Cookie) ck2).setPrice(4.99);;
		dessertList.add(ck1);
		dessertList.add(ck2);
		dessertList.add(ck3);
		System.out.println("COOKIE TEST");
		for(DessertItem item : dessertList) {
			if(item instanceof Cookie)
				printDessertItem(item);
		}
		System.out.println("--------------------------------------------------");
		
		
		i2.name = "Vanilla";
		((IceCream) i2).setCalories(500);
		((IceCream) i2).setCost(10.05);
		dessertList.add(i1);
		dessertList.add(i2);
		dessertList.add(i3);
		System.out.println("ICE CREAM TEST");
		for(DessertItem item : dessertList) {
			if(item instanceof IceCream)
				printDessertItem(item);
		}
		System.out.println("--------------------------------------------------");
		
		
		dessertList.add(s1);
		dessertList.add(s2);
		dessertList.add(s3);
		System.out.println("SUNDAE TEST");
		for(DessertItem item : dessertList) {
			if(item instanceof Sundae)
				printDessertItem(item);
		}
		System.out.println("--------------------------------------------------");
		
		//Put DessertItems into Checkout
		purchase.setTaxRate(0.0774837);
		for(DessertItem item : dessertList) {
			if(item.getCost() != 0)
				purchase.enterItem(item);
		}
		
		System.out.println("Output Receipt:\n");
		System.out.println("Number of items: " + purchase.numberOfItems());
		System.out.println("Total cost: " + purchase.totalCost());
		System.out.println("Total tax: " + purchase.totalTax());
		System.out.println("Cost + Tax: " + (purchase.totalCost() +purchase.totalTax()));
		System.out.println();
		
		System.out.println(purchase);
		purchase.clear();
		System.out.println("--------------------------------------------------");
		System.out.println();
		
	}
	
	public static void printDessertItem(DessertItem d) {
		System.out.print(d);
		System.out.println(String.format("%6.2f", d.getCost()));
		System.out.println();
		System.out.println(d.getName() + " calories:" + d.getCalories());
		System.out.println();
	}

}
