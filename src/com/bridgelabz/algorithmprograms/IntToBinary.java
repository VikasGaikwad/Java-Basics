package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

import com.bridgelabz.utility.Utility;

public class IntToBinary {
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the integer value : ");
		int integer=scanner.nextInt();
		Utility.intToBinary(integer);
	}

}