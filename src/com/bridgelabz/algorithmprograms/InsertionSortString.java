package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**purpose: class is defined for sort the string
 * or words 
 * array using insertion sort technic.
 * @author bridgeit
 * @since 25 jan 2017
 */
public class InsertionSortString {
	public static void main(String []args) {
	Utility utility=new Utility();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string: ");
	String str=sc.nextLine();
	String [] string=str.split(" ");
	System.out.println("before sort : ");
	for(String element:string) {
	System.out.println(element);
	}
	utility.insertionSortString(string);
	
	
}



}
