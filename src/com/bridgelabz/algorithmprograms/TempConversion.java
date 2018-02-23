package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class TempConversion {
	
		public static void main(String []args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("press 1 To Convert Celsius To Fahrenheit :");
			System.out.println("press 2 To Convert Fahrenheit  To Celsius :");
			int choice = scanner.nextInt();
			
			switch(choice) {
				
			case 1:
					System.out.println("Enter a temperature in Celsius :");
					double temp = scanner.nextDouble();
					double ans = (temp*9/5)+32;
					System.out.println("Temp in Fahrenheit is :"+ans);
				break;
			case 2:
					System.out.println("Enter a temperature in Fahrenheit :");
					double temp1 = scanner.nextDouble();
					double ans1 =  (temp1-32)*5/9;
					System.out.println("Temp in Celsius is :"+ans1);
				break;
			default :
				System.out.println("Enter correct choice..");	
			}
			scanner.close();
		}
	}



