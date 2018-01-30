package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class CouponNum{
	public static void couponNumbers(int numbers){
		//
		int arr[]=new int[numbers];
		
		int count=0;
		for(int i=0;i<numbers;i++) {
			
			arr[i]=(int)(Math.random()*numbers);
			count++;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					
					i--;
					
				}
			}
			
		}
		for(int x : arr)
		{
			System.out.print(x+" ");
		}

		System.out.println("\ntotal generated random numbers are : "+count);
	}


	public static void main(String args[]) {
		CouponNum cn=new CouponNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many Distinct Numbers do you want to generate : ");
		int numbers=sc.nextInt();
		cn.couponNumbers(numbers);

	}
}
