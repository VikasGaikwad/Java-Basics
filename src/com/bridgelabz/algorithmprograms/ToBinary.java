package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ToBinary {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Decimal num :");
		int num = scanner.nextInt();
		
		Utility.toBinary(num);
		scanner.close();
	}
}