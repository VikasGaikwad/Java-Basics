package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.utility.Utility;


/**class for to find the roots of the equation a*x*x + b*x + c.
 * @author bridgeit
 *@since 24 jan 2018
 */
public class Quadratic {

	public static void main(String []args) {
		Utility utility=new Utility();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a :");
		double a = sc.nextDouble();
		System.out.println("Enter value of b :");
		double b = sc.nextDouble();
		System.out.println("Enter value of c :");
		double c = sc.nextDouble();
		Utility.quadratic(a, b, c);
	}
}
