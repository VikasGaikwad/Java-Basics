package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CalendarQueue_9 {
	
		 public static void main(String[] args) throws InterruptedException 
		 {
			 Scanner scanner=new Scanner(System.in);
			 System.out.println("Enter Month:");
		     int month =scanner.nextInt();
		     System.out.println("Enter Year:");
		     int year =scanner.nextInt();     
		     Utility.queueCalender(month,year);
		     scanner.close();
		 }
	}


