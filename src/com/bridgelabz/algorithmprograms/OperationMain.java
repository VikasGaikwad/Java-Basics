package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class OperationMain extends Operation {
	static String [] time_counter= {
			"binarySearch","binarySearchString","insertionSortInteger","insertionSortString",
			"bubbleSortInteger","bubbleSortString"
	};
	static double[] elapsed_Time=new double[time_counter.length];
	static double start_time=0;
	static double end_time=0;
	static double elapsedtime=0;
	static double conversion=100000;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the String : ");
		String string=scanner.nextLine().toLowerCase();
		String[] charInput = string.split(" ");
		System.out.println("enter key String : ");
		String key = scanner.nextLine().toLowerCase(); 
		System.out.println("how many number u want to enter");
		int numOfElements = scanner.nextInt();
		int []intInput = new int[numOfElements];	
		System.out.println("Enter "+numOfElements+" int elements");
		for (int i = 0; i < intInput.length; i++) {
			intInput[i]=scanner.nextInt();
		}
		callMethods(intInput,charInput, key);
		//sortMethods();
		//display();
	
	}
	public static void callMethods(int[] intInput,String []charInput, String key) {
		String sortedArray=Utility.bubbleSortString(charInput);
		System.out.println("calling bubble sort for integers");
		start_time =java.lang.System.nanoTime();
		bubbleSortInteger(intInput);
		end_time = java.lang.System.nanoTime();
		elapsedtime =(end_time-start_time)/conversion;
		elapsed_Time[0]=elapsedtime;
		System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");
		
		
		System.out.println("calling binary search for integers : ");
		start_time =java.lang.System.nanoTime();
		bubbleSortInteger(intInput);
		binarySearch(intInput,key);
		end_time = java.lang.System.nanoTime();
		elapsedtime =(end_time-start_time)/conversion;
		elapsed_Time[0]=elapsedtime;
		System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");
	}
	

}
