package com.bridgelab.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

/**purpose: class is defined for sort the string 
 * array using insertion sort technic.
 * @author bridgeit
 * @since 25 jan 2017
 */
public class InsertionSortString {
	public static void main(String []args) {
	Utility utility=new Utility();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = sc.nextLine();
	int length = str.length();
	char arr[] = new char[length];
	utility.insertionSortString(arr,str);
	
}



}
