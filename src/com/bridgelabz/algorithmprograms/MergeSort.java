package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class MergeSort 

{
	

	public static void main(String[] args) 

	{

		Scanner scanner = new Scanner( System.in );        

		System.out.println("Merge Sort Test\n");

		
		System.out.println("Enter number of integer elements");

		int n = scanner.nextInt();
		int arr[] = new int[ n ];

		System.out.println("\nEnter "+ n +" integer elements");

		for (int i = 0; i < n; i++)

			arr[i] = scanner.nextInt();
		Utility.sort(arr, 0, n);


		System.out.println("\nElements after  merge sorting ");        

		for (int i = 0; i < n; i++)

			System.out.print(arr[i]+" ");            

		System.out.println();      
		scanner.close();

	}    

}