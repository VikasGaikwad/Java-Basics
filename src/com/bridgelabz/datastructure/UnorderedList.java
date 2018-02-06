package com.bridgelabz.datastructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/** purpose: Read the Text from a file, split it into words 
 *  and arrange it as Linked List.If the Word is not found 
 *  then add it to the list, and if it found then remove the 
 *  word from the List
 * @author bridgeit
 * @since 3 jan 2018
 */
public class UnorderedList {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		// enter the file path
		String path="/home/bridgeit/Documents/Programs/Java Basics/src/Unoredered.txt";		
		File file=new File(path);
		if(file.exists()) {
			Utility.readFile(file);
		}

	}

}
