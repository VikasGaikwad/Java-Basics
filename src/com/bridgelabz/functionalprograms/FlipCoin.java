package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * class for flip the coin and print the percentage of head and tail.
 * @author bridgeit
 * @since:23 sep 2018
 */
public class FlipCoin {
	public static void main(String[] args) {
	
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many times do you want to flip the coin");
		int times=scanner.nextInt();
		utility.flipCoins(times);
		scanner.close();

	}


}
