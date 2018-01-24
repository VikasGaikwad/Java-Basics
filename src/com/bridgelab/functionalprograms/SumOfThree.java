package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.utility.Utility;



/** class for Read in N integers and counts the number of 
 * triples that sum to exactly 0.
 * @author bridgeit
 * @since 23 jan 2018
 */
public class SumOfThree{
	
	public static void main(String[] args)
	{	
		Utility utility = new Utility();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size_of_array=sc.nextInt();

		int arr[]=new int[size_of_array];

		System.out.println("enter the elements in  array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		utility.sumOfThree(arr);



	}		

}
