package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.utility.Utility;

/**
 * class for calculating the prime factors.
 * @author bridgeit
 * since 24 jan 2018
 */
public class PrimeFactors {
	public static void main(String args[])
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which u want prime factors");
		int number=sc.nextInt();
		utility.primeFactors(number);
		

	}	
}


