package com.bridgelabz.oop;

import java.io.PrintWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventaryDataManagement {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);		
		JSONObject parentJsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		String [] names= {"Rice","Pulses","Wheats"};
		for(String nameOfProduct:names) {
			System.out.println("enter the number of varieties of "+nameOfProduct);
			int varities=scanner.nextInt();
			for(int i=0;i<varities;i++) {
				JSONObject jsonObject=new JSONObject();
				System.out.println("Enter the name : ");
				String name=scanner.next();
				jsonObject.put("name",name);
				System.out.println("enter the waight in kg : ");
				int weight= scanner.nextInt();
				jsonObject.put("waight",weight);
				System.out.println("enter the price/kg : ");
				int price= scanner.nextInt();
				jsonObject.put("price",price);
				jsonObject.put("Total Amount : ", weight*price);
				
				jsonArray.add(jsonObject);
			}
			parentJsonObject.put(nameOfProduct, jsonArray);
			
		}
		
		PrintWriter printWriter = null;
		try {
			printWriter=new PrintWriter("/home/bridgeit/Documents/Programs/Java Basics/src/FirstInventory.json");
			System.out.println("file write success...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		printWriter.write((parentJsonObject.toString()));
		printWriter.close();

	}

}
