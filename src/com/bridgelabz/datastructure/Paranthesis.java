package com.bridgelabz.datastructure;

import java.util.Scanner;
import java.util.Stack;

import com.bridgelabz.utility.Utility;

/** purpose: class is define the equality of paranthesis.
 * @author bridgeit
 * @since 5 jan 2018
 */
public class Paranthesis {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("enter the expression");
		String expression=scanner.nextLine();
		Utility.balanceParanthesis(expression,stack);

	}

}
