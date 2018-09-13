package Lab4;
/**
 * Lab 4
 * @author kavyakumar
 *
 *	a. Add a variable called minimum Balance and assign final modifier.
	b. Override method called withdraw (This method should check for minimum
		balance and allow withdraw to happen)

 */
public class SavingsAccount extends Account{

	public SavingsAccount(String name, double amt) {
		super(name, amt);
	}
	final double minimumBalance = 500;
	
	@Override
	boolean withdraw(double amt) {
		
		double temp = balance;
		temp -= amt;
		
		if (temp < minimumBalance) {
			System.out.println("Ensure minimum balance of INR 500 in your account. Please withdraw a smaller amount."); 
			return false;
		}
		balance = temp;
		return true;
	}

}
