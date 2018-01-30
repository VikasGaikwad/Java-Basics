package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int length = str.length();
		char arr[] = new char[length];
		utility.insertionSortString(arr,str);

	}

}
