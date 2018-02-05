package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Arrays;

/**purpose : Prime Number Program and store only the numbers in that
 *  range that are Anagrams.
 * @author bridgeit
 * @since 5 feb 2018
 */
public class Anagram2DArray {
	
	
	/**function to check wheather the number is prime or not
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * funtion to check wheather the tow String are anagram or not.
	 * @param anagram1
	 * @param anagram2
	 * @return
	 */
	public static boolean isAnagram(String anagram1,String anagram2) {
		char [] char1=anagram1.toCharArray();
		char [] char2=anagram2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		String string1=String.valueOf(char1);
		String string2=String.valueOf(char2);
		if(string1.equals(string2)) 
			return true;
		else
			return false;
	}



public static void main(String[] args) {
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	int primeNumber[][]=new int[10][100];
	int i,j;
	String prime="";
	for(i=0;i<10;i++) {
		for(j=0;j<100;j++) {
			int num=i*100+j;
			if(isPrime(num)) {
				primeNumber[i][j]=num;
				prime=prime+num;
			}
		}
	}
	int [][]anagram=new int[10][100];
	String strArray[]=prime.split(" ");
	for( i=0;i<strArray.length;i++) {
		for(j=i+1;j<strArray.length;j++) {
			if(isAnagram(strArray[i],strArray[j])) {
				arrayList.add(Integer.parseInt(strArray[i]));
				arrayList.add(Integer.parseInt(strArray[j]));
			}
		}
	}
	arrayList.sort(null);
	i=j=0;
	int k=0;
	while(j<arrayList.size() && i<10) {
		k=0;
			
		int rem=arrayList.get(j)/100;
		while(j<arrayList.size()&& arrayList.get(j)/100==rem) {
			anagram[i][k]=arrayList.get(j);
			k++;
			j++;

		}
		i++;
	}
	for( i=0;i<9;i++) {
		for( j=0;j<anagram.length;j++) {
			if(anagram[i][j]!=0) {
				System.out.print(anagram[i][j]+" ");

			}
			System.out.println();
		}
	}

}

}
