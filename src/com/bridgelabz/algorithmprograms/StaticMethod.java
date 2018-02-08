package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class StaticMethod {

	public static void main(String[] args) {
		long startTime=0;
		long stopTime=0;
		long elapsedTime=0;
		String array[] = {"asdf","tree","aawe","fhd","ryhre","twatataet"};
		String key="tree";
		
		//binary search for String
		String []sortedArray=Utility.bubbleSortString(array);
		startTime=System.nanoTime();
		System.out.println("key found at location : ");
		Utility.binarySearchString(sortedArray, key);
		stopTime=System.nanoTime();
		elapsedTime=(stopTime-startTime)/1000000;
		System.out.println("Elapsed time for Binary Search for String is :"+elapsedTime+" millisecond");
		
		//binary search for integer
		int [] intArray= {34,56,87,443,65,2,434,6};
		int searchKey=434;
		
		int [] sortedIntArray=Utility.insertionSortInteger(intArray);
		startTime=System.nanoTime();
		Utility.binarySearch(sortedIntArray, searchKey);
		stopTime=System.nanoTime();
		elapsedTime=(stopTime-startTime)/1000000;
		System.out.println("Elapsed time for Binary Search for Integer is :"+elapsedTime+" millisecond");
		
		//insertion sort for integer
		int [] intInsertionArray= {34,56,87,443,65,2,434,6};
		startTime=System.nanoTime();
		Utility.insertionSortInteger(intInsertionArray);
		stopTime=System.nanoTime();
		elapsedTime=(stopTime-startTime)/1000000;
		System.out.println("Elapsed time for Insertion sort for integer is :"+elapsedTime+" millisecond");
		
		//insertion sort for String
		String insertionStringArray[] = {"asdf","tree","aawe","fhd","ryhre","twatataet"};
		startTime=System.nanoTime();
		Utility.insertionSortString(insertionStringArray);
		stopTime=System.nanoTime();
		elapsedTime=(stopTime-startTime)/1000000;
		System.out.println("Elapsed time for Insertion sort for String is :"+elapsedTime+" millisecond");
		
		//bubble sort for String
		String bubbleStringArray[] = {"asdf","tree","aawe","fhd","ryhre","twatataet"};
		startTime=System.nanoTime();
		Utility.bubbleSortString(bubbleStringArray);
		stopTime=System.nanoTime();
		elapsedTime=(stopTime-startTime)/1000000;
		System.out.println("Elapsed time for bubble  sort for String is :"+elapsedTime+" millisecond");
		
		//bubble sort for int
		int [] bubbleIntArray= {34,56,87,443,65,2,434,6};
		startTime=System.nanoTime();
		Utility.bubbleSortInteger(bubbleIntArray);
		stopTime=System.nanoTime();
		elapsedTime=(stopTime-startTime)/1000000;
		System.out.println("Elapsed time for bubble  sort for integer is :"+elapsedTime+" millisecond");
		
		
	}

}
