//import java.util.Scanner;
public class Dog {
	
	private String name = "Doge";
	
	public Dog(String n) {
		name = n;
	}
	
	public String speak(String input2) {
		//Scanner sc = new Scanner(System.in);
		String split[] = input2.split(" ");
		for (String string: split) {
			if (string.matches("-?\\d+") == true) {
				System.out.println("Such an integer: " + string);
				continue;
			}
			else if ("true".equals(string) || "false".equals(string)) {
				System.out.println("Such boolean: " + string);
				continue;
			}
			else {
				System.out.println(string);
			}

		}
		//System.out.println(sc);
		//int number1 = sc.nextInt();
		//boolean boolean1 = sc.nextBoolean();
		//int number2 = sc.nextInt();
		//boolean boolean2 = sc.nextBoolean();
		//int number = sc.nextInt();
		//System.out.println(input2);
		return input2;
	}
	
	public String setSays(String says) {
		says = "Much wow!";
		return says;
	}
	
	//public void getSays() {
		//says = says;
	//}
	
	public void getName() {
	}
	
	public String setName(String n) {
		name = n;
		return name;
	}
}
