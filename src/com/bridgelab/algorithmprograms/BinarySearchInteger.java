package com.bridgelab.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.utility.Utility;

/**
 * purpose: class for Binary Search method for integer.
 * @author bridgeit
 * @since 24 jan 2017
 */
public class BinarySearchInteger {

		public static void main(String[] args) {
			Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		BinarySearchInteger b=new BinarySearchInteger();		
		System.out.println("how many number do you want to enter");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int length=arr.length-1;
		int right = 0;
		int left = length-1;
		for(int i=0;i<size;i++) {
			System.out.print("enter number one by one : ");
			arr[i]=sc.nextInt();

		}

		System.out.println("element search for : ");
		int key=sc.nextInt();
		
		utility.insertionSortInteger(arr);
		System.out.println("after sorting array : ");
		for(int a:arr) {
			System.out.print(a+" ");
			
		}
		System.out.println();
		int mid = utility.binarySearch(arr, key);
		System.out.println("element found at location : "+mid);
	}

}
