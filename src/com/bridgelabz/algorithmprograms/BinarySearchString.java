package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchString {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("how many strings want to enter : ");
		int size=scanner.nextInt();
		System.out.println("enter "+size+" strings : ");
		String str[]=new String[size];
		for(int i=0;i<size;i++) {
			str[i]=scanner.next();
		}
		Utility.bubbleSortString(str);

		System.out.println("\nenter the key string : ");
		String key=scanner.next();

		long Starttime = System.nanoTime();
		
		Utility.binarySearchString(str,key);
		
		long Endtime = System.nanoTime();
		long elapsedTime = Endtime - Starttime; 	
		System.out.println("Time require to call method in millis: "+(elapsedTime/1000)/60);
		scanner.close();
	}

}
