package Lab4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  Lab 4
 * @author kavyakumar
 *
 *	4.1: Refer the case study 1in Page No: 5 and create Account Class 
 *	as shown below in class diagram. Ensure minimum balance of INR 500 
 *	in a bank account is available.
 *	
 *	a) Create Account for smith with initial balance as INR 2000 and for 
 *		Kathy with initial balance as 3000.(accNum should be auto generated).
	b) Deposit 2000 INR to smith account.
	c) Withdraw 2000 INR from Kathy account.
	d) Display updated balances in both the account.
	e) Generate toString() method.

 */

public class Account extends Person{
	
	private static long accNum;
	double balance;
	Person accHolder = null;
	
	public Account(String name, double amt) {
		
		accHolder = new Person();
		accHolder.setName(name);
		balance = amt;
		accNum++;
	}
	
	void deposit(double amt) {
		
		balance+=amt;
	}
	
	boolean withdraw(double amt) {
		
		double temp = balance;
		temp -= amt;
		
		if (temp < 500) {
			System.out.println("Ensure minimum balance of INR 500 in your account. Please withdraw a smaller amount."); 
			return false;
		}
		balance = temp;
		return true;
	}

	private static long getAccNum() {
		return accNum;
	}

	private static void setAccNum(long accNum) {
		Account.accNum = accNum;
	}

	private double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	private Person getAccHolder() {
		return accHolder;
	}

	private void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	@Override
	public String toString() {
		return "Account [balance= " + balance + ", accHolder= " + accHolder.getName() + "]";
	}
	
	public static void main(String[] args) {
		
		Account ac1 = new Account("Smith", 2000);
		Account ac2 = new Account("Kathy", 3000);
		
		ac1.deposit(2000);
		boolean check = ac2.withdraw(4000);
		
		String bal1 = ac1.toString();
		String bal2 = ac2.toString();
		
		System.out.println(bal1);
		System.out.println(bal2);
	}
}

//public class Account extends Person {
//
//	private static long tempAcc = 100;
//	private long accNum;
//	double balance;
//	Person accHolder = null;;
//	Map<Long, CustomPair> bankDatabase = new HashMap<>();
//	
//	
//	public Account(String name, double amt) {
//		
//		accHolder = new Person();
//		accHolder.setName(name);
//		balance = amt;
//		tempAcc++;
//		accNum = tempAcc;
//		
//		bankDatabase.put(accNum, new CustomPair(name, balance));
//		
//	}
//	
//	void deposit(long accNum, double amt) {
//		
//		if(!checkValidAccNum(accNum))
//			return;
//		
//		String name = getAccHolder();
//		double bal = getBalance();
//		bal += amt;
//		
//		bankDatabase.put(accNum, new CustomPair(name, bal));
//		return;
//	}
//	
//	void withdraw(long accNum, double amt) {
//		
//		if(!checkValidAccNum(accNum))
//			return;
//	
//		String name = getAccHolder();
//		double bal = getBalance();
//		bal -= amt;
//		
//		if (bal < 500) {
//			System.out.println("Ensure minimum balance of INR 500 in your account. Please withdraw a smaller amount.");
//			return;
//		}
//		bankDatabase.put(accNum, new CustomPair(name, bal));
//		return;
//}
//	
//	
//	double getbalance(long accNum) {
//		
//		if(!checkValidAccNum(accNum))
//			
//			return 0;
//		
//		return getBalance();
//	}
//	
//	boolean checkValidAccNum(long accNum) {
//		
//		if(!bankDatabase.containsKey(accNum)) {
//			System.out.println("Invalid account number");
//			return false;
//		}
//		return true;
//	}
//	
//	private long getAccNum(String name) {
//		
//		long accnum = 0;
//		 
//			
//		for(long key : bankDatabase.keySet()) {
//				
//			if(name.equals(bankDatabase.containsValue(name))) {
//				accnum = key;
//			}
//		}
//		
//		return accnum;
//	}
//
//	private void setAccNum(long accNum) {
//		this.accNum = accNum;
//	}
//
//	private double getBalance() {
//		CustomPair cp = new CustomPair();
//		double bal = cp.getBalance();
//		return bal;
//	}
//
//	private String getAccHolder() {
//		
//		CustomPair cp = new CustomPair();
//		String accHolder = cp.getName();
//		return accHolder;
//	}
//
//	private void setAccHolder(Person accHolder) {
//		this.accHolder = accHolder;
//	}
//
//	public static void main(String[] args) {
//
//		Account ac1 = new Account("Smith", 2000);
//		Account ac2 = new Account("Kathy", 3000);
//		
//		ac1.getAccNum("Smith");
//		
//		
//
//	}
//
//}
