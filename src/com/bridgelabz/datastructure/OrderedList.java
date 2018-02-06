package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class OrderedList {
	
	
	public static void main(String[] args) {
		OrderedList obj=new OrderedList();
		Scanner scanner=new Scanner(System.in);	
		// enter the file path
		String path="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/datastructure/int.txt";		
		File file=new File(path);
		if(file.exists()) {			
			Utility.readFromFile(file);
		}

	}
}