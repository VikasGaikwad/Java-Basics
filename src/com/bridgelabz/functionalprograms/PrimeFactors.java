package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * class for calculating the prime factors.
 * @author bridgeit
 * since 24 jan 2018
 */
public class PrimeFactors {
	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number which u want prime factors");
		int number=scanner.nextInt();
		Utility.primeFactors(number);
		scanner.close();

	}	
}


