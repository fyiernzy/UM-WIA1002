package Lab1.L1Q4;

import java.util.Date;

public class Transaction {
	public static char WITHDRAW = 'W';
	public static char DEPOSIT = 'D';
	
	String typeS;
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		this.date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public char getType() {
		return this.type;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void printDetails() {
		System.out.println("Date: " + this.getDate());
        System.out.println("Type: " + this.getType());
        System.out.println("Amount: " + this.getAmount());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Description: " + this.getDescription());
        System.out.println();
	}
}
