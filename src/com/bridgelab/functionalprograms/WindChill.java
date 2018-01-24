package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.utility.Utility;

/**purpose: compute the windchill.
 * by command line argument.
 * @author bridgeit
 * @since 24 jan 2017
 */
public class WindChill {
	public static void main(String []args) {
		Utility utility=new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature :");
		double T = sc.nextDouble();
		System.out.println("Enter wind speed/hour :");
		double V = sc.nextInt();
		utility.windChill(T,V);
	
		
	}
}