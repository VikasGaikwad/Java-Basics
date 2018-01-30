package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
	
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which u want to check : ");
		int num=sc.nextInt();
		utility.harmonicNumber(num);
		sc.close();
		
	}

}
