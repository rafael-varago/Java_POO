package entities;

public class BankAccount {

	public static final double TAX = 5.0;
	
	private int acct_num; 
	private String name;
	private double balance;
	
	//created a basic constructor just so the program works initially, without compiling errors
	public BankAccount() {
	}
	
	//if there is an initial deposit
	public BankAccount(int acct_num, String name, double deposit) {
		this.acct_num = acct_num;
		this.name = name;
		this.balance = deposit;
	}
	
	//if there's no initial deposit
	public BankAccount(int acct_num, String name) {
		this.acct_num = acct_num;
		this.name = name;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + TAX);
	}

	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return acct_num;
	}
	
	public String toString() {
		return "Account " + acct_num + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}
}

