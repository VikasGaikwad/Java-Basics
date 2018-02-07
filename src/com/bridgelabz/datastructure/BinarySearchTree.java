package com.bridgelabz.datastructure;

import java.util.Scanner;

public class BinarySearchTree{
	public static long find(long n)
	{
		long sum=0;
		if(n<=1)
			return 1;
		else
		{
			
			for(int i=1;i<=n;i++)
			{
				sum = sum+(find(i-1)*find(n-i));
			}
		}
		return sum;
		
}
	public static void main(String[] args) {
		BinarySearchTree obj=new BinarySearchTree();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value to search passible binary trees : ");
		long number=scanner.nextLong();
		scanner.close();
	long deep=(long) find(number);
	System.out.println(deep);
	
	
		
		
	}
}