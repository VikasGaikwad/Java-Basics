package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * class for replacing string template to username
 * @author bridgeit
 * since:19 sep 2018
 */
public class StringReplace {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str1="Hello <<UserName>>, How are you?";
		System.out.println("Enter user name ");
		String str2=scanner.nextLine();
		Utility.stringReplace(str1,str2);
		scanner.close();

	}

}
