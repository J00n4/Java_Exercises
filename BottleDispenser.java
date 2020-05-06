import java.util.ArrayList;
import java.util.Scanner;
public class BottleDispenser {
	private int bottles;
	private float money;
	
	ArrayList<Bottle> bottleslist = new ArrayList<Bottle>(); {
	bottleslist.add(new Bottle("Pepsi Max", "Pepsi", 0.5, 1.8));
	bottleslist.add(new Bottle("Pepsi Max", "Pepsi", 1.5, 2.2));
	bottleslist.add(new Bottle("Coca-Cola Zero", "Pepsi", 0.5, 2.0));
	bottleslist.add(new Bottle("Coca-Cola Zero", "Pepsi", 1.5, 2.5));
	bottleslist.add(new Bottle("Fanta Zero", "Pepsi", 0.5, 1.95));
	}
	
	
	public BottleDispenser() {
		bottles = bottleslist.size();
		money = 0;
	}
	
	public void addMoney() {
		money += 1;
		System.out.println("Klink! Added more money!");
	}
	
	public void buyBottle() {
		if (bottles == 0) {
			System.out.println("Dispenser is empty!");
		}
		else {
			String input = "";
			System.out.print("Your choice: ");
			Scanner reader1 = new Scanner(System.in);
			input = reader1.nextLine();
			int inputti = Integer.parseInt(input);
			if (money < bottleslist.get(inputti-1).getPrice()) {
				System.out.println("Add money first!");
			}
			else {
				money -= bottleslist.get(inputti-1).getPrice();
				System.out.println("KACHUNK! " + bottleslist.get(inputti-1).getName() + " came out of the dispenser!");
				bottleslist.remove(inputti-1);
			}
			//reader1.close();
			}

	}
	
	public void returnMoney() {
		//String back = String.format("%.02f", money);
		System.out.format("Klink klink. Money came out! You got %.02f€ back", money); //+ back + "€ back.");
		System.out.println();
	}
	
	public void listBottle() {
		int monesko = 1;
		for (int i = 0; i < bottleslist.size(); i++) {
			System.out.println(monesko + ". Name: " + bottleslist.get(i).getName());
			System.out.println("	Size: " + bottleslist.get(i).getSize() + "	Price: " + bottleslist.get(i).getPrice());
			monesko++;
		}
	}
}
