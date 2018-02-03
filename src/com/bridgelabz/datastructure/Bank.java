package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Bank {
	public String name;
	private int account_number;
	private int balance;

	public static int DEFAULT_BALANCE=2000;
	Scanner scanner=new Scanner(System.in);

	
	public Bank(String name,int account_number,int balance) {
		this.name=name;
		this.account_number=account_number;
		this.balance=balance;
		System.out.println(" Completed...");
	}
	public int checkBalance() {
		return balance;
	}
	public void widthdraw(int value) {
		if(balance>value) {
			balance-=value;
			if(DEFAULT_BALANCE<=0) {
				System.out.println("maintain account with minimum 2000...");
				System.exit(0);

			}
			System.out.println(value+" removed from account number "+account_number+" balance left "+balance);

		}
		else {
			System.out.println("not Sufficeint balance ...press 1 checking balance...");
		}
	}
	public void diposite(int amount) {
		balance+=amount;
		this.DEFAULT_BALANCE+=amount;
		System.out.println(amount+" added to account number : "+account_number+" new balance is "+balance);

	}
	void process() {
		int action=1;
		int value;
		while(action!=0) {
			System.out.println("enter 1 to check balance : ");
			System.out.println("enter 2 to widthdraw amount : ");
			System.out.println("enter 3 to diposite amount : ");
			System.out.println("enter 0 to quite");

			if(action==1) {
				value=checkBalance();
				System.out.println("your balance : "+value);
			}
			if(action==2) {
				System.out.println("enter amount to widthdraw : ");
				value=scanner.nextInt();
				widthdraw(value);

			}
			if(action==3) {
				System.out.println("enter amount to diposite : ");
				value=scanner.nextInt();
				diposite(value);
			}
			if(action==0)
			{
				System.out.println("thank you for banking");

			}
			else
			{
				System.out.println("enter a valid input ");
			}
		}
	}


}
