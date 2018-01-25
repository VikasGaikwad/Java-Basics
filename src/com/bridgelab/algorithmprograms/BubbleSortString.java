package com.bridgelab.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

/**purpose :Bubble sort an array of Strings
 * @author bridgeit
 * @since
 */
public class BubbleSortString {
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many Strings u want to enter :");
		int size=sc.nextInt();
		//String [] arr=new String[size];
		//String[] Array;
		String []arr=new String[size];
		
System.out.println("enter "+ size+" elements one by one");
		
		for(int i=0;i<size;i++){
			
			arr[i]=sc.next();
		}
		utility.bubbleSortString(arr,size);
	}

}
