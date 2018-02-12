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

public class InventaryDataManagement_1 {

	@SuppressWarnings({ "unchecked", "unused", "resource" })
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JSONObject parentJsonObject = new JSONObject();
		// JSONArray jsonArray=new JSONArray();
		String[] names = { "Rice", "Pulses", "Wheats" };
		for (String nameOfProduct : names) {
			System.out.println("enter the number of varieties of " + nameOfProduct);
			JSONArray jsonArray = new JSONArray();
			
			int varities = scanner.nextInt();
			
			for (int i = 0; i < varities; i++) {
				
				JSONObject jsonObject = new JSONObject();
				System.out.println("Enter the name of: "+nameOfProduct);
				String name = scanner.next();
				jsonObject.put("name", name);
				System.out.println("enter the waight in kg : ");
				int weight = scanner.nextInt();
				jsonObject.put("weight", weight);
				System.out.println("enter the price/kg : ");
				int price = scanner.nextInt();
				jsonObject.put("price", price);
				jsonObject.put("total", weight * price);

				jsonArray.add(jsonObject);
			}
			parentJsonObject.put(nameOfProduct, jsonArray);

		}

		FileWriter writer= null;
		try {
			writer= new FileWriter("/home/bridgeit/Documents/Programs/Java Basics/src/FirstInventory.json");
			System.out.println("file write success...");
			writer.write((parentJsonObject.toString()));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		// read the same file again..
		try {
			JSONParser jsonParser = new JSONParser();
			String url="/home/bridgeit/Documents/Programs/Java Basics/src/FirstInventory.json";
			File file=new File(url);
			if(file.exists()) {
				System.out.println("file is exist on"+file.getAbsolutePath());
			}
			else {
				System.out.println("this path is incorrect:"+file.getAbsolutePath());
			}
			
			JSONObject obj = (JSONObject) jsonParser.parse(new FileReader(url));
			//System.out.println(obj);
		


			JSONArray wheatArray = (JSONArray)obj.get("Wheats");
			JSONArray pulsesArray = (JSONArray)obj.get("Pulses");
			JSONArray riceArray = (JSONArray)obj.get("Rice");
			/*System.out.println(wheatArray);
			System.out.println(pulsesArray);
			System.out.println(riceArray);*/
			readWheats(wheatArray);
			readPulses(pulsesArray);
			readRice(riceArray);

			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

		} catch (ParseException e) {

			e.printStackTrace();
		}

	}
	private static void readWheats(JSONArray wheatArray) {
		JSONObject tempObj=null;
		for(int i=0;i<wheatArray.size();i++) {
			tempObj=(JSONObject) wheatArray.get(i);
			System.out.println("---------------------\n");
			System.out.println(tempObj.get("price"));
			System.out.println(tempObj.get("name"));
			System.out.println(tempObj.get("weight"));
			System.out.println(tempObj.get("total"));
			System.out.println("\n---------------------");
			
		}
	}
private static void readPulses(JSONArray pulsesArray) {
	JSONObject tempObj=null;
	for(int i=0;i<pulsesArray.size();i++) {
		tempObj=(JSONObject) pulsesArray.get(i);
		System.out.println("---------------------\n");
		System.out.println(tempObj.get("price"));
		System.out.println(tempObj.get("name"));
		System.out.println(tempObj.get("weight"));
		System.out.println(tempObj.get("total"));
		System.out.println("\n---------------------");
		
	}
	}
private static void readRice(JSONArray riceArray) {
	JSONObject tempObj=null;
	for(int i=0;i<riceArray.size();i++) {
		tempObj=(JSONObject) riceArray.get(i);
		System.out.println("---------------------\n");
		System.out.println(tempObj.get("price"));
		System.out.println(tempObj.get("name"));
		System.out.println(tempObj.get("weight"));
		System.out.println(tempObj.get("total"));
		System.out.println("\n---------------------");
		
	}
	
}

}
