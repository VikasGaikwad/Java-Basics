package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StaticMethod
{

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
 			System.out.println("Enter String:");
	 		String userInput =scanner.nextLine().toLowerCase();
	 		String [] sTring = userInput.split("\\s");
			System.out.println("Enter The Size Of int Array:");
			int i,length=0;
			length = scanner.nextInt();
			int [] iNteger = new int[length];
			System.out.println("Enter Integer Array Elements: ");
			for(i=0;i<length;i++)
			{
				iNteger [i]= scanner.nextInt();
			}
			Utility.callAlgos(sTring,iNteger);
		}
}