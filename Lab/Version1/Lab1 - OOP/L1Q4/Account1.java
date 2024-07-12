package Lab1.L1Q4;

import Lab1.L1Q3.Account;
import java.util.ArrayList;

public class Account1 extends Account {
	private String name;
	private ArrayList<Transaction> ls;
	
	Account1(String name, int id, double balance) {
		super(id, balance);
		this.name = name;
		this.ls = new ArrayList<>();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Transaction> getTransactions() {
        return this.ls;
    }
	
	public boolean withdraw(double amount, String description) {
		if(amount < this.getBalance()) {
			super.withdraw(amount);
			this.ls.add(new Transaction(Transaction.WITHDRAW, amount, this.getBalance(), description));
			return true;
		}
		
		return false;
	}
	
	public boolean deposit(double amount, String description) {
		if(amount > 0) {
			super.deposit(amount);
			this.ls.add(new Transaction(Transaction.DEPOSIT, amount, this.getBalance(), description));
			return true;
		}
		
		return false;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Account summary: ");
		System.out.println("Account holder: " + this.getName());
		System.out.println("Balance: " + this.getBalance());
        System.out.println("Monthly Interest: " + this.getMonthlyInterest());
        System.out.println("Date Created: " + this.getDateCreated());
        System.out.println();
	}
	
	public void printTransactionHistory() {
		System.out.println("Transactions:");
		for(Transaction transaction : ls)
			transaction.printDetails();
	}
}
