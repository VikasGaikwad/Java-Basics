package com.bridgelabz.oop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AddressBook {
	static String path="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/addressBook.json";
	static Scanner scanner=new Scanner(System.in);
	static JSONArray array=new JSONArray();
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		entryCode();
		//
		
		
	}
		/*JSONObject jsonObject=new JSONObject();
		System.out.println("How many Address books u want to add : ");
		int number=scanner.nextInt();
		
		for(int i=0;i<number;i++) {
			JSONObject jsonObject1=new JSONObject();
			

			System.out.println("enter  First Name: ");
			String first_name=scanner.next();
			jsonObject1.put("first_name", first_name);


			System.out.println("Enter Last Name: ");
			String last_name=scanner.next();
			jsonObject1.put("last_name", last_name);

			System.out.println("Enter address: ");
			String address=scanner.next();
			jsonObject1.put("address", address);


			System.out.println("Enter state: ");
			String state=scanner.next();
			jsonObject1.put("state", state);


			System.out.println("Enter zip Code: ");
			String zip_code=scanner.next();
			jsonObject1.put("zip_code", zip_code);


			System.out.println("Enter phone number: ");
			String phone_number=scanner.next();
			jsonObject1.put("phone_number", phone_number);

			
			array.add(jsonObject1);

			
		}
		
		jsonObject.put("address", array);
		System.out.println(jsonObject);
		writeToJson(path, jsonObject);

	}*/
	public static void writeToJson(String path,JSONObject object) {
		File file=new File(path);

		if (file.exists()) {

			try {
				FileWriter writer=new FileWriter(path);
				writer.write(object.toJSONString());
				writer.flush();
				writer.close();
				System.out.println("file write successfully...");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
	public static void entryCode() {
		JSONObject jsonObject=new JSONObject();
		System.out.println("How many Address books u want to add : ");
		int number=scanner.nextInt();
		
		for(int i=0;i<number;i++) {
			JSONObject jsonObject1=new JSONObject();
			

			System.out.println("enter  First Name: ");
			String first_name=scanner.next();
			jsonObject1.put("first_name", first_name);


			System.out.println("Enter Last Name: ");
			String last_name=scanner.next();
			jsonObject1.put("last_name", last_name);

			System.out.println("Enter address: ");
			String address=scanner.next();
			jsonObject1.put("address", address);


			System.out.println("Enter state: ");
			String state=scanner.next();
			jsonObject1.put("state", state);


			System.out.println("Enter zip Code: ");
			String zip_code=scanner.next();
			jsonObject1.put("zip_code", zip_code);


			System.out.println("Enter phone number: ");
			String phone_number=scanner.next();
			jsonObject1.put("phone_number", phone_number);

			
			array.add(jsonObject1);

			
		}
		
		jsonObject.put("address", array);
		System.out.println(jsonObject);
		writeToJson(path, jsonObject);

	
		
	}

}
