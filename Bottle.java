public class Bottle {
	private String name;
	private String manufacturer;
	private double total_energy;
	private double size;
	private double price;
	
	public Bottle(){
	
	}
	public Bottle(String n, String m, double s, double p){
		name = n;
		manufacturer = m;
		size =  s;
		price = p;
	}
	public String getName(){
		return name;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public double getEnergy(){
		total_energy = 0.3;
		return total_energy;
	}
	public double getSize() {
		return(size);
	}
	public double getPrice() {
		return(price);
	}
}