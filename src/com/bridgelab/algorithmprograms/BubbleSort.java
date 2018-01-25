package com.bridgelab.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many elements do you want to enter ");
		int elements=sc.nextInt();
		int []arr=new int[elements];
		System.out.println("enter  "+elements+" elements one after one");
		for(int i=0;i<elements;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("list of entered elements : ");
		for(int list:arr) {
			System.out.print(list+" ");
		}
		utility.bubbleSortInteger(arr);
		System.out.println();
		
	}

}
