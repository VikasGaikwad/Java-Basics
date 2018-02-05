package com.bridgelabz.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.xml.namespace.QName;

import com.bridgelabz.utility.Utility;

public class BankCounter {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of people waiting in queue");
		int number=scanner.nextInt();					
		Queue<String> queue = new LinkedList<String>();		
		for(int i=0; i<number; i++ ){			
		System.out.println("Enter First Name");
		String name =scanner.next();
		queue.add(name);		
		System.out.println("Enter A/C Number");
		 int accountNumber =scanner.nextInt();
		queue.add(Integer.toString(accountNumber));
		
		System.out.println("Enter Balance");
		int balance = scanner.nextInt();
		queue.add(Integer.toString(balance));
	
	}
		while(queue.size()>0)
		{
			Bank bank = new Bank(queue.poll(),Integer.parseInt(queue.poll()),Integer.parseInt(queue.poll()));
			bank.process();
		}

}
}