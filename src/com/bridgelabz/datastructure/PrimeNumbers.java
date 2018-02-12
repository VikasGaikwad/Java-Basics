package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start and end range of numbers ");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		Utility.print2DArray(start, end);
		scanner.close();
}

}
