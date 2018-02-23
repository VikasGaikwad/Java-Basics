package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**purpose :Bubble sort an array of Strings
 * @author bridgeit
 * @since
 */
public class BubbleSortString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);


		System.out.println("how many Strings u want to enter :");
		int size=scanner.nextInt();

		String []arr=new String[size];

		System.out.println("enter "+ size+" elements one by one");

		for(int i=0;i<size;i++){

			arr[i]=scanner.next();
		}
		long Starttime = System.nanoTime();
		Utility.bubbleSortString(arr);
		long Endtime = System.nanoTime();
		long elapsedTime = Endtime - Starttime; 	
		System.out.println("Time require to call method in millis: "+(elapsedTime/1000)/60);
		scanner.close();
	}

}
