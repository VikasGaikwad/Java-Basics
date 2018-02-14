package com.bridgelabz.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.AdressBookUtility;

public class AddressBookNew {
	
	static Scanner scanner=new Scanner(System.in);
	static String path="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/addressBook.json";

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		char ch;
		do {
			System.out.println("*****************************");

			System.out.println("1. Add new person"+"\n2. Delete Person"+"\n3. Sorting "+"\n4. Display");
			System.out.println("*****************************");

			System.out.println("select choice : ");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Adding new person\n");
				AdressBookUtility.entryCode(path);
				break;
			case 2:System.out.println("Delete  persons info :");
			AdressBookUtility.delete();
				break;

			case 3:
				System.out.println("enter choice for sorting :  ");
				AdressBookUtility.sortJson();
				break;
			case 4:
				System.out.println("Displaying values from json : ");
				AdressBookUtility.display(path);
				break;
			default :
				System.out.println("incorrect choice..");
				break;
			}
			System.out.println("do you want to continue : Y/N");
			ch=scanner.next().charAt(0);
		}while(ch=='Y' ||ch=='y'); 


	}

	
}
