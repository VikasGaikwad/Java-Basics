package com.bridgelab.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

/**purpose : Take a range of 0 - n Numbers and find the 
 * Prime numbers in that range.
 * @author bridgeit
 * @since 24 jan 2017
 */
public class PrimeNumber {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range from 0 to ");
		int x=sc.nextInt();
		utility.primeNumber(x);
		/*below function is for palindrome + prime numbers*/
		utility.paliPrime(x);

	}

}
