package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ToBinaryNibble {
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the integer value : ");
		int integer=scanner.nextInt();
		Utility.intToBinary(integer);
		scanner.close();
	}

}
