package com.bridgelabz.datastructure;

import java.util.Arrays;

import com.bridgelabz.utility.Stack;

public class PrimeAnagramStack_13 {
public static void main(String[] args) {
		
		System.out.println("Anagram number in 2D array: ");
		System.out.println();
		twoDAnagramStack(1000);
		
	}
	public static void twoDAnagramStack(int size) {
		Stack stack = new Stack();
		int number = size;
		boolean status2, status, status1;
		
		for (int i = 11; i < size; i++)
		{
			for (int j = i + 1; j < number - 1; j++)
			{
				status2 = anagramNumStack(i, j);
				status1 = primeNumStack(i);
				status = primeNumStack(j);
				
				if (status2 && status && status1) 
				{
					
					
					stack.push(i);
					stack.push(j);
				
					
				}

			}
		}
		stack.printStack();
		
	}
	public static boolean primeNumStack(int num) {
		
		if (num < 2)
		{
			return false;
		} else {
			int temp;
			for (int i = 2; i <= num / 2; i++) {
				temp = num % i;
				if (temp == 0) {
					return false;

				}
			}
			return true;
		}

	}

	public static boolean anagramNumStack(int num, int num1) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(num);
		str2 = String.valueOf(num1);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}

}
