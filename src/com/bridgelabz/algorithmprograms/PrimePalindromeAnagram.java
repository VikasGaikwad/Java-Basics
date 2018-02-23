package com.bridgelabz.algorithmprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**purpose : class for find the number is prime+Anagram+ palindrome or not.
 * @author bridgeit
 * @since: 30 jan 2018
 */
public class PrimePalindromeAnagram {
	
	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter last number to find the prime number upto ....");
		int start=scanner.nextInt();
		//int end=scanner.nextInt();
		String primeNumber=Utility.isPrimeNumber(start);


		String[] anagram=primeNumber.split(" ");//when space comes, will hit to new line
		System.out.println(primeNumber);

		int[] numbers = new int[anagram.length];
		for(int i = 0;i < anagram.length;i++)
			numbers[i] = Integer.parseInt(anagram[i]);

		LinkedHashSet<String> object=new LinkedHashSet<String>();
		System.out.println("The Angram number are.......");
		for(int i=0;i<anagram.length;i++){
			for(int j=i+1;j<anagram.length;j++) {
				if(Utility.anagramDetection(anagram[i],anagram[j])) {
					object.add(anagram[i]);
					object.add(anagram[j]);
				}
			}
		}
		System.out.println(object);
		System.out.println("Palindrom Numbers are........");
		String[] anagramNumber=new String[object.size()];

		object.toArray(anagramNumber);
		Utility.palindrom(anagramNumber);
		scanner.close();
	}

}