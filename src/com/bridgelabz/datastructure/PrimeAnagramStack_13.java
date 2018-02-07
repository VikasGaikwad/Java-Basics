package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.utility.StackLinked;

public class PrimeAnagramStack_13 {
	public static char[] convertStringToCharArray(String string) {
		String str1=string.toLowerCase();
		char [] charArray=str1.toCharArray();
		return charArray;
	}
	public static int[] countIntFrequency(String string) {
		char [] ch=convertStringToCharArray(string);
		int [] frequency=new int[10];
		int i=0;
		int length=ch.length;
		while(i<length) {
			frequency[ch[i]-48]++;
			i++;
		}
		return frequency;
	}
	public static boolean checkAnagram(String string1,String string2) {
		boolean isAnagram=true;
		if(string1.length()!=string2.length()) {
			return isAnagram=false;
		}else {
			int [] array1=countIntFrequency(string1);
			int [] array2=countIntFrequency(string2);
			for(int i=0;i<10;i++) {
				if(array1[i]!=array2[i]) {
					isAnagram=false;
					break;
				}
			}
		}
		return isAnagram;
	}
	public static boolean checkPrimeNumber(int number) {
		boolean isPrime=false;
		int count=0;
		for(int i=0;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
			if(count==2) {
				isPrime=true;
			}
			
		}
		return isPrime;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start and end range of numbers ");
		int start = scanner.nextInt();
		int end=scanner.nextInt();
		primeAnagramStack(start, end);
		scanner.close();
	}
	public static void primeAnagramStack(int start,int end) {
		StackLinked<String> sl=new StackLinked<String>();
		boolean isPrimeAnagram=false;
		ArrayList<String> primeList=new ArrayList<String>();
		for(int j=start;j<=end;j++) {
			if(checkPrimeNumber(j)) {
				primeList.add(Integer.toString(j));
				
				
			}
		}
		
		for(int i=0;i<primeList.size()-1;i++) {
			int j=i+1;
			while(j<primeList.size()) {
				isPrimeAnagram=checkAnagram(primeList.get(i),primeList.get(j));
				if(isPrimeAnagram) {
					sl.push(primeList.get(i));
					sl.push(primeList.get(j));
				}
				j++;
			}
		}
		for(int i=sl.size();i>0;i=i-2) {
			System.out.println(sl.pop()+" "+sl.pop());
		}
		
		
	}

}
