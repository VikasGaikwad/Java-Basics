package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

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
		long Starttime = System.nanoTime();
		utility.insertionSortInteger(arr);
		long Endtime = System.nanoTime();
		long elapsedTime = Endtime - Starttime; 	
		System.out.println("Time require to call method in millis: "+(elapsedTime/1000)/60);
		
	}

}
