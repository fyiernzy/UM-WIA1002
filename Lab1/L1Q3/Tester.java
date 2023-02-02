package Lab1.L1Q3;

public class Tester {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		account.printInfo();
	}
}
