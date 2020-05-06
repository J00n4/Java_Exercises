
public class Car {
	
	private int year = 2000;
	private String license = null;
	
	public Car() {
		
	}
	
	public String body() {
		System.out.println("Manufacturing: Body");
		return null;
	}
	
	public String chassis() {
		System.out.println("Manufacturing: Chassis");
		return null;
	}
	
	public String tires() {
		System.out.println("Manufacturing: Wheel");
		return null;
	}
	
	public String engine() {
		System.out.println("Manufacturing: Engine");
		return null;
	}
	
	public String print() {
		System.out.println("Car parts:");
		System.out.println("	Body");
		System.out.println("	Chassis");
		System.out.println("	Engine");
		System.out.println("	4 Wheel");
		return null;
	}
}
