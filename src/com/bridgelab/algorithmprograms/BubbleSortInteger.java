package com.bridgelab.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

/**purpose: class is define for sorting the integer array
 *  using the bubble sort technic.
 * @author bridgeit
 * @since 24 jan 2018
 *
 */
public class BubbleSortInteger {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("how many number do you want to enter");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int length=arr.length-1;		
		for(int i=0;i<size;i++) {
			System.out.print("enter number one by one : ");
			arr[i]=sc.nextInt();

		}
		System.out.println("\n\nbefore sorting the array : ");
		for(int c: arr) {
			System.out.print(c+"  ");
		}
		System.out.println();

		utility.bubbleSortInteger(arr);
	}

}
