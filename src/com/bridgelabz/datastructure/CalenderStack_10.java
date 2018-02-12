package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class CalenderStack_10
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		 System.out.println("Enter Month:");
	     int month = Utility.scanner.nextInt();
	     System.out.println("Enter Year:");
	     int year = Utility.scanner.nextInt();     
	     Utility.stackCalender(month,year);
	 }	
}