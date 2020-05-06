
public class Character {
	
	private String character;
	private String weapon;

	public Character() {
		
	}
	
	public String create(String s) {
		character = s;
		return character;
	}
	
	public String weapon(String s) {
		weapon = s;
		return weapon;
	}
}
