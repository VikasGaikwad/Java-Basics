package com.bridgelabz.datastructure;

import java.util.Scanner;

public class BinarySearchTree{
	public static int binaryTreeSearch(int number,int k) {
		int res = 1;
		if (k > number - k)
	        k = number - k;
		 for (int i = 0; i < k; ++i)
		    {
		        res *= (number - i);
		        res /= (i + 1);
		    }
		  System.out.println(res);
		    return res;
	}
	public static void main(String[] args) {
		BinarySearchTree obj=new BinarySearchTree();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value to search passible binary trees : ");
		int number=scanner.nextInt();
	int deep=	obj.binaryTreeSearch(2*number,number);
	System.out.println(deep);
	/* return;*/
		
		
		
	}
}