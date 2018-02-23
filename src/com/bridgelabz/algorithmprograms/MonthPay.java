package com.bridgelabz.algorithmprograms;

import java.util.*;
public class MonthPay{

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of Principal Loan Amount (P) :");
		double P = scanner.nextDouble();
		System.out.println("Enter years (Y) :");
		double Y = scanner.nextDouble();
		System.out.println("Enter monthly interest in percentage (R) :");
		double R = scanner.nextDouble();
		
		System.out.println("Monthly Payment is : "+String.format("%.2f",(Example.mothlyPayment(P,Y,R))));
		scanner.close();
	}
}	
class Example{	
	public static double mothlyPayment(double P,double Y,double R) {
		double n = 12*Y;
		double r = R/(12*100);
		double cal = Math.pow((1+r),(-n));
		double payment = (P*r)/(1-cal);
		return payment;
	}

}
