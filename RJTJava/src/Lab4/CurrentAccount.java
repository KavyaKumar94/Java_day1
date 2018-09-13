package Lab4;
/**
 * Lab 4
 * @author kavyakumar
 *
 *	a. Add a variable called overdraft Limit
	b. Override method called withdraw (checks whether overdraft limit is reached
	and returns a boolean value accordingly)
 */
public class CurrentAccount extends Account{

	public CurrentAccount(String name, double amt) {
		super(name, amt);
	}
	final double overdraftLimit = 500;
	
	//Cannot override void to boolean.
	//Hence, i updated parent class method return type to boolean.
	@Override
	boolean withdraw(double amt) {
		
		double temp = balance;
		temp -= amt;
		
		if (temp <= overdraftLimit) {
			System.out.println("Overdraft limit has reached in your account. Please withdraw a smaller amount."); 
			return false;
		}
		balance = temp;
		return true;
	}

}
