package com.bridgelab.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.utility.Utility;

public class BinarySearchString {

	public static void binarySearchString(String []str,String key) {
		int low=0;
		int high=str.length-1;
		int mid=0;
		
		while(low<=high) {	
			mid=(low+high)/2;
			if(key.compareTo(str[mid])==0) {
				System.out.println(mid);
				//break;
			}
			else if(key.compareTo(str[mid])<0) {
				high=mid;
				System.out.println(mid);
				//break;
			}
			else if(key.compareTo(str[mid])>0)
			{
				low=mid+1;
				System.out.println(mid);
				//break;
			}
			break;
		}
		/*if(low>high) {
			
		}
		else {
			System.out.println(key+" found at location "+mid);
		}*/

		
	}

	public static void main(String[] args) {
		Utility utility=new Utility();
		BinarySearchString obj=new BinarySearchString();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many strings want to enter : ");
		int size=sc.nextInt();
		System.out.println("enter "+size+" strings : ");
		String str[]=new String[size];
		for(int i=0;i<size;i++) {
			str[i]=sc.next();
		}
		utility.bubbleSortString(str,size);
		
		System.out.println("\nenter the key string : ");
		String key=sc.next();

	
obj.binarySearchString(str,key);

	}

}
