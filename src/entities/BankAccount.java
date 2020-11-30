package entities;

public class BankAccount {
	
	private int accountNumber;
	private String name;
	private double balance;
	private static double withdrawTax = 5.0; 
	
	
	
	public BankAccount(int accountNumber, String name, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	} 
	
	public BankAccount(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = 0;
	} 
	

	public int getAccountNumber() {
		return accountNumber;
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

	public void deposit(double deposit) {
		this.balance += deposit;
		
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw + withdrawTax ;
		
	}
	
	public String toString() {
		return "Account "+ this.accountNumber + ", Holder: " + name + ", Balance: $" +String.format("%.2f", balance);
	}
	

}
