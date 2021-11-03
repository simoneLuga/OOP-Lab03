package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount {
	
	private int userID;
	private double balance;
	private int nTransactions;
	private static double ATM_TRANSACTION_FEE = 1;
	
	public StrictBankAccount(int userID,double balance) {
		this.userID = userID;
		this.balance = balance;
	}
	
	
	//operation
	public void withdraw(int usrID, double amount) {
		if(checkUser(usrID)&& (this.balance > amount))
		{
			this.balance-= amount;
			this.nTransactions++;
			System.out.println("OK");
		}
		else {
			System.out.println("Faild");
		}
	}
	
	public void deposit(int usrID, double amount) {
		if(checkUser(usrID))
		{
			this.balance+= amount;
			this.nTransactions++;
			System.out.println("OK");
		}
	}
	
	public void depositFromATM(int usrID, double amount) {
		if(checkUser(usrID))
		{
			this.balance+= amount;
			this.nTransactions++;
			this.balance-= ATM_TRANSACTION_FEE;
			System.out.println("OK");
		}
	}

	public void withdrawFromATM(int usrID, double amount) {
		if(checkUser(usrID)&& (this.balance > amount+ATM_TRANSACTION_FEE))
		{
			this.balance+= amount;
			this.balance-= ATM_TRANSACTION_FEE;
			this.nTransactions++;
			System.out.println("OK");
		}else {
			System.out.println("Faild");
		}
	}
	 
	 
	 //nothing   
	public void chargeManagementFees(int usrID) {
		this.balance= this.balance-(5 + 0.1*this.nTransactions++);
	}
	 
	 
	 //Get
	public double getBalance() {
		return this.balance;
	}

	public int getTransactionsCount() {
	    return this.nTransactions;
	}
	
	public int getUserID() {
		return userID;
	}
	
	//check
	private boolean checkUser(final int id) {
        return this.userID == id;
    }
	 

	    

	   

	
}
