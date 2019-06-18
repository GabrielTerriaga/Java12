package entities;

public class Account {

	private String name;
	protected int numAcc;
	private double balance;
	
	
	//CONSTRUTORES
	public Account() {
		
	}
	
	public Account(String name, int numAcc, double balance) {
		this.name = name;
		this.numAcc = numAcc;
		this.balance = balance;
	}
	
	public Account(String name, int numAcc) {
		this.name = name;
		this.numAcc = numAcc;
	}
	
	
	// GET SET
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumAcc() {
		return numAcc;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// METEDOS PARA INSERER DEPOSITO E SAQUE
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance = balance - 5.00;
		this.balance -= amount;
	}
	
	
	
	public String toString() {
		return "Account "
				+ numAcc
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);				
	}
	
	
}
