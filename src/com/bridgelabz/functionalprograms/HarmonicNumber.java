package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
	
	
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number which u want to check : ");
		int num=scanner.nextInt();
		Utility.harmonicNumber(num);
		scanner.close();
		
	}

}
