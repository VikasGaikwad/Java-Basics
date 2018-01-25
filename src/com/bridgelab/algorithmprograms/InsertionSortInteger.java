package com.bridgelab.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

/**purpose: class for sorting the integer using insertion sort.
 * @author bridgeit
 * @since 25 jan 2018
 */
public class InsertionSortInteger { 

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many integer you want to enter : ");
		int number=sc.nextInt();
		System.out.println("enter "+ number +"integers one by one : ");
		int arr[]=new int[number];
		for(int i=0;i<number;i++) {
			arr[i]=sc.nextInt();
		}

		utility.insertionSortInteger(arr);
	}

}
