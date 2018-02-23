package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


/**class for to find the roots of the equation a*x*x + b*x + c.
 * @author bridgeit
 *@since 24 jan 2018
 */
public class Quadratic {

	public static void main(String []args) {
	
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter value of a :");
		double a = scanner.nextDouble();
		System.out.println("Enter value of b :");
		double b = scanner.nextDouble();
		System.out.println("Enter value of c :");
		double c = scanner.nextDouble();
		Utility.quadratic(a, b, c);
		scanner.close();
	}
}
