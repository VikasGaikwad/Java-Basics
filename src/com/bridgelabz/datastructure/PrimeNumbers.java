package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start and end range of numbers ");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		print2DArray(start, end);
		scanner.close();
}
	public static void print2DArray(int startOfRange, int endOfRange) {
		int start = 0;
		int end = 100;
		ArrayList<ArrayList<Integer>> arraylist = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; i++) {
			arraylist.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= endOfRange; j++) {
				if (checkPrimeNumber(j) && j > start && j <= end)
					arraylist.get(i).add(j);
			}
			start += 100;
			end += 100;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < arraylist.get(i).size(); j++) {
				System.out.print(arraylist.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	public static boolean checkPrimeNumber(int number) {
		boolean isPrime=false;
		int count=0;
		for(int i=1;i<=number;i++) 
		{
			if(number%i==0) {
				count++;
			}
			if(count==2) {
				isPrime=true;
			}
			
		}
		return isPrime;
	}

}
