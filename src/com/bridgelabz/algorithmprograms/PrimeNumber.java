package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**purpose : Take a range of 0 - n Numbers and find the 
 * Prime numbers in that range.
 * @author bridgeit
 * @since 24 jan 2017
 */
public class PrimeNumber {
	
	public static void main(String[] args) {
		int [] anagram_array=new int[1000];
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range from 0 to ");
		int x=sc.nextInt();
		utility.primeNumber(x);
		/*below function is for palindrome + prime numbers*/
		utility.paliPrime(x);
		
		

	}

}
