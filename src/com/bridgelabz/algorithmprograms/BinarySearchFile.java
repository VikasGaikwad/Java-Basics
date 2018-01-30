package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchFile {

	public static void main(String[] args) {
		Utility utility=new Utility();
		try {
			
			String word=null;
			Scanner scanner=new Scanner(System.in);
			File file = new File("/home/bridgeit/test folder/java.txt");

			if(file.exists()) {
				
					BufferedReader bufferReader=new BufferedReader(new FileReader(file));


					word=bufferReader.readLine();

					bufferReader.close();
					String[] array=word.split(",");


					for(String ele:array) {
						System.out.println(ele);
					}
					/*for(int i=0;i<str.length;i++) {
						str[i]=str[i].replaceAll("[^\\w","");
					}*/
					
					Utility.bubbleSortString(array);
					System.out.println("\nenter the key string : ");
					String key=scanner.next();
					Utility.binarySearchString(array, key);
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();

		}
		
	}
	
}






