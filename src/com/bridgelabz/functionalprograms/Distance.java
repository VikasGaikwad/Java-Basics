package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**class for calculating the distance from origin(0,0) to
 * (x,y).This is command argument program.
 * @author bridgeit
 *@since 25 jan 2018
 *
 */
public class Distance {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X origin :");
		int X =Integer.parseInt(args[0]);
		System.out.println("Enter Y origin :");
		int Y =Integer.parseInt(args[1]);
		Utility.distance(X,Y);
		scanner.close();
		
		
	}

}
