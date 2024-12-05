package com.Project.QuizApp.Practice;

public class Encapsulation {

	private String accountNumber;
	private double balance;
	
	public Encapsulation(String accountNumber, double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance)
			balance-=amount;
	}
	
}
