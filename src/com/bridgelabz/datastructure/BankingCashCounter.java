package com.bridgelabz.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankingCashCounter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of people waiting in the row ");
		int number=scanner.nextInt();
		int balance,account_number;
		String name;
		Queue<String>queue=new LinkedList<String>();
		for(int i=1;i<=number;i++) {
			System.out.println("enter name of : person "+i);
			 name=scanner.next();
			 queue.add(name);
			 System.out.println("enter the account number of : person "+i);
			 account_number=scanner.nextInt();
			 queue.add(Integer.toString(account_number));
			 System.out.println("enter the balance of  : person "+i);
			 balance=scanner.nextInt();
			 queue.add(Integer.toString(balance));			
		}
		while(queue.size()>0) {
			Bank bank=new Bank(queue.poll(),Integer.parseInt(queue.poll()),Integer.parseInt(queue.poll()));
			bank.process();
		}
	}

}
