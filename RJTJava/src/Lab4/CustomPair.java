package Lab4;

public class CustomPair {

	String name;
	double balance;
	
	CustomPair(String name, double balance) {
		
		this.name = name;
		this.balance = balance;
	}

	public CustomPair() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
