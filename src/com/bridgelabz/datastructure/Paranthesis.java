package com.bridgelabz.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {


	public static boolean balanceParanthesis(String expression ,Stack <Integer> stack) {
		
char [] ch=expression.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[') {
				stack.push(i);
				
			}
			else if(ch[i]==')' && stack.size()=='(') {
				stack.pop();
			}
			else if(ch[i]=='}' && stack.size()=='{') {
				stack.pop();
			}
			else if(ch[i]==']' && stack.size()=='[') {
				stack.pop();
			}
			else 
				return false;
			System.out.println("false");
		}

if(stack.isEmpty()) {
	System.out.println("true");
	return true;
}
return false;

	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("enter the expression");
		String expression=scanner.nextLine();
		balanceParanthesis(expression,stack);

	}

}
