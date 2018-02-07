package com.bridgelabz.datastructure;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeChecker{
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the string");
	String str=scanner.nextLine();
	PalindromChecker(str);
}


	public static boolean PalindromChecker(String str) {
		ArrayDeque<Character> queue=new ArrayDeque<Character>();
		int i,n;
		for( i=0;i<str.length();i++) {
			queue.add(str.charAt(i));
		}
		if(queue.size()%2==0) {
			n=queue.size();
		}
		else {
			n=queue.size()-1;
		}
		while(!queue.isEmpty() && n>0) {
			if(queue.peekFirst().equals(queue.peekLast())) {
				queue.removeLast();
				queue.removeFirst();
				n=n-2;
				
			}
			else return false;
		}
		return n==0?true: false;
	}
}
