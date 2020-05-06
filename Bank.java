import java.util.ArrayList;

public class Bank {
	private String accnum;
	private String amount;
	private String limit;
	
	ArrayList<Bank> accountlist = new ArrayList<Bank>(); {
	accountlist.add(new Bank());
	}
	public Bank(){
	
	}
	public void Bank(String n, String m, String l){
		accnum = n;
		amount = m;
		limit = l;
	}
	public String getAccountnumber(){
		return accnum;
	}
	public String getAmount(){
		return amount;
	}
	public String getCreditlimit(){
		return limit;
	}
	public void addAccount() {
		
	}
	public void addCreditAccount() {
		
	}
	public void deleteAccount(String s) {
		//accountlist.remove(indexOf(s));
	}
	public void findAccount() {
		
	}
	public void withdraw(String a) {
		
	}
}
