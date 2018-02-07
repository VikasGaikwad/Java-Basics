package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeAnagram_12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the start and end range of numbers");
		int start=scanner.nextInt();
		int end=scanner.nextInt();
		printPrimeAnagram(start,end);
		scanner.close();
	}
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
	public static void printPrimeAnagram(int start,int end) {
		boolean isPrimeAnagram=false;
		ArrayList<String>  primeList=new ArrayList<String>();
		ArrayList<ArrayList<String>> arrayList=new ArrayList<ArrayList<String>>();
		for(int i=0;i<2;i++) {
			arrayList.add(new ArrayList<String>());
			for(int j=start;j<end;j++) {
				if(checkPrimeNumber(j)) {
					primeList.add(Integer.toString(j));
				}
			}
			
		}
		for(int i=0;i<primeList.size()-1;i++) {
			int j=i+1;
		while(j<primeList.size()) {
			isPrimeAnagram=checkAnagram(primeList.get(i),primeList.get(j));
			if(isPrimeAnagram) {
				arrayList.get(0).add(primeList.get(i));
				arrayList.get(1).add(primeList.get(j));
				
			}
			j++;
		}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<arrayList.get(i).size();j++) {
				System.out.println(arrayList.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}
	
	
	


}