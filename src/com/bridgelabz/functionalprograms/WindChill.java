package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**purpose: compute the windchill.
 * by command line argument.
 * @author bridgeit
 * @since 24 jan 2017
 */
public class WindChill {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Temperature :");
		double T = scanner.nextDouble();
		System.out.println("Enter wind speed/hour :");
		double V = scanner.nextInt();
		Utility.windChill(T,V);
	scanner.close();
		
	}
}