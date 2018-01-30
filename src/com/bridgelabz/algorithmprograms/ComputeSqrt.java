package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class ComputeSqrt{

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		double nonnegative = sc.nextDouble(); 
		double epsilon = 1e-15;
		double t = nonnegative; 
		
		while (Math.abs(t - nonnegative / t) > epsilon * t) 
		{ 
			t = (nonnegative / t + t) / 2.0;
		
		} 
		System.out.println(t); 
	}
}

