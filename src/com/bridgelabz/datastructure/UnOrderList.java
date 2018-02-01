package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class UnOrderList {
	public static void main(String[] args) {
		unOrderedList();
	}
	public static void unOrderedList() {
		try {
			boolean found=false;
			File file = new File("/home/bridgeit/Documents/vikas/java3.txt");
			BufferedReader buffer = new BufferedReader(new FileReader(file));

			Scanner scanner = new Scanner(System.in);
			String words = buffer.readLine();

			FileWriter fileWriter = new FileWriter("/home/bridgeit/Documents/vikas/java3.txt");
			String [] string=words.split(" ");
			LinkedList<String> linkedlist=new LinkedList<String>();

			for(int i=0;i<string.length;i++) {
				linkedlist.add(string[i]);
			}

			System.out.println(linkedlist);
			System.out.println(linkedlist.toString());
			System.out.println("enter the string to search :");
			String search = scanner.next();

			for(int i=0;i<linkedlist.size();i++) 
			{
				if(linkedlist.get(i).equals(search)) 
				{
					linkedlist.remove(string[i]);
					found=true;
					break;
				}
			}
			System.out.println(linkedlist.toString());
			if (found == false) {

				linkedlist.add(search);



			}

			if (found == true) 
			{
				for (int i = 0; i < linkedlist.size(); i++) {
					String string2 = (String) (linkedlist.get(i)) + " ";
					fileWriter.write(string2);
					fileWriter.flush();
				}
			}
			else {
				for (int i = 0; i < linkedlist.size(); i++) 
				{
					String string3 = (String) linkedlist.get(i) + " ";
					fileWriter.write(string3);
					fileWriter.flush();
				}
			}
			System.out.println(linkedlist.toString());
			buffer.close();
			scanner.close();
			fileWriter.close();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
