package com.bridgelabz.algorithmprograms;


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
		Scanner scanner=new Scanner(System.in);


		System.out.println("enter the string 1 : ");
		String string1=scanner.nextLine().toLowerCase();
		System.out.println("enter the string 2 : ");
		String string2=scanner.nextLine().toLowerCase();
		Utility.anagram(string1,string2);
		scanner.close();
	}

}
