package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class VendingMachine{
	public static int total=0,index=0;



	public static int vendingMachine(int money,int [] notes) {
		
		if(money==0||index>notes.length) {
			return 0;
		}
		if(money>notes[index]) {
	while(money!=0) {
		money=money-notes[index];
		System.out.println(notes[index]);
			//int rem=money%notes[index];
			//int cla=money/10;
			//total=total+ cla;
			
			//System.out.println(notes[index]+" notes..... "+cla);
	}index++;
		}
	//	index++;
		
		
		return vendingMachine(money, notes);
	}

	

	public static void main(String[] args) {
		

		Scanner scanner=new Scanner(System.in);
		int money;
		System.out.println("enter money : ");
		money=scanner.nextInt();
		int notes[]= {1000,500,100,50,10,5,2,1};
		vendingMachine(money,notes);
		System.out.println("total number of notes to change "+total);
	}
}
