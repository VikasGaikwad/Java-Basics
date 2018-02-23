package com.bridgelabz.datastructure;


import java.io.File;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class OrderedList {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);	
		// enter the file path
		String path="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/datastructure/int.txt";		
		File file=new File(path);
		if(file.exists()) {			
			Utility.readFromFile(file);
		}
scanner.close();
	}
}