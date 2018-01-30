package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchString {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("how many strings want to enter : ");
		int size=sc.nextInt();
		System.out.println("enter "+size+" strings : ");
		String str[]=new String[size];
		for(int i=0;i<size;i++) {
			str[i]=sc.next();
		}
		utility.bubbleSortString(str);

		System.out.println("\nenter the key string : ");
		String key=sc.next();

		long Starttime = System.nanoTime();
		
		utility.binarySearchString(str,key);
		
		long Endtime = System.nanoTime();
		long elapsedTime = Endtime - Starttime; 	
		System.out.println("Time require to call method in millis: "+(elapsedTime/1000)/60);
		
	}

}
