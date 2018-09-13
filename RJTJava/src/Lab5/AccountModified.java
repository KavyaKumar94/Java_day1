package Lab5;

import Lab4.Account;
import Lab4.Person;

/**
 * Lab 5
 * @author kavyakumar
 *
 *	5.3: Refer the problem statement 4.1. Modify account 
 *	class as abstract class and declare withdraw method.
 */
abstract public class AccountModified extends Person{
		
	AccountModified() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static long accNum;
	double balance;
	Person accHolder = null;
		
	void deposit(double amt) {
			
		balance+=amt;
	}
		
	abstract boolean withdraw(double amt);
	
	private static long getAccNum() {
		return accNum;
	}

		public static void setAccNum(long accNum) {
			AccountModified.accNum = accNum;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Person getAccHolder() {
			return accHolder;
		}

		public void setAccHolder(Person accHolder) {
			this.accHolder = accHolder;
		}
		
		@Override
		public String toString() {
			return "Account [balance= " + balance + ", accHolder= " + accHolder.getName() + "]";
		}
	}	

