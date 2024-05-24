package com.driver;

public class Account {
	private String accountName;
    public int balance = 1000;

    public Account(String name) {
        this.accountName = name;
    }

    public void sendMoney(Account receiver, int amount) {
    	// your code goes here
        if(this.balance >= amount){
            System.out.println(this.accountName+" sending amount " +amount);
            this.balance -= amount;
            receiveMoney(amount);
            System.out.println(this.accountName+" has send amount "+amount);
        }else{
            System.out.println(this.accountName+" has insufficient balance.");
        }

    }

    public void receiveMoney(int amount) {
        synchronized (this) {
        	// your code goes here
            System.out.println(this.accountName+ " has received amount "+amount+". New balance is "+this.balance);
            this.balance += amount;

        }
    }
}
