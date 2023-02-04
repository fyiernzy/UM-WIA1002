package Lab1.L1Q3;

import java.util.Date;

public class Account {
	private static double annualInterestRate;
	
	private int id;
	private double balance;
	private Date dateCreated;
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	
	public Account() {
		this(0, 0);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	public static double getAnnualInterestRate() {
		return Account.annualInterestRate;
	}
	
	public static double getMonthlyInterestRate() {
		return Account.annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return (Account.getMonthlyInterestRate() / 100) * this.balance;
	}
	
	public boolean withdraw(double amount) {
		if(amount < this.balance) {
			this.balance -= amount;
			return true;
		}
		
		return false;
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			return true;
		}
		
		return false;
	}
	
	public void printInfo() {
		System.out.println("Account summary: ");
		System.out.println("Balance: " + this.getBalance());
        System.out.println("Monthly Interest: " + this.getMonthlyInterest());
        System.out.println("Date Created: " + this.getDateCreated());
        System.out.println();
	}
}
