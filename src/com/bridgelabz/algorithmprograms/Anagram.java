package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * class for check the two input strings are 
 * anagram or not.
 * @author bridgeit
 * @since 24 jan 2018
 */
public class Anagram {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string 1 : ");
		String string1=sc.nextLine().toLowerCase();
		System.out.println("enter the string 2 : ");
		String string2=sc.nextLine().toLowerCase();
		utility.anagram(string1,string2);

	}

}
