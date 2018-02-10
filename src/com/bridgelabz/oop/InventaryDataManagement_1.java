package com.bridgelabz.oop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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
				System.out.println("Enter the name : ");
				String name = scanner.next();
				jsonObject.put("name", name);
				System.out.println("enter the waight in kg : ");
				int weight = scanner.nextInt();
				jsonObject.put("weight", weight);
				System.out.println("enter the price/kg : ");
				int price = scanner.nextInt();
				jsonObject.put("price", price);
				jsonObject.put("Total Amount : ", weight * price);

				jsonArray.add(jsonObject);
			}
			parentJsonObject.put(nameOfProduct, jsonArray);

		}

		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter("/home/bridgeit/Documents/Programs/Java Basics/src/FirstInventory.json");
			System.out.println("file write success...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		printWriter.write((parentJsonObject.toString()));
		printWriter.flush();
		printWriter.close();

		// read the same file again..
		try {
			JSONParser jsonParser = new JSONParser();
			// FileReader fileReader=new FileReader("/home/bridgeit/Documents/Programs/Java
			// Basics/src/FirstInventory.json");
			// Object object=jsonParser.parse(fileReader);
			JSONObject obj = (JSONObject) jsonParser
					.parse(new FileReader("/home/bridgeit/Documents/Programs/Java Basics/src/FirstInventory.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray Wheats = (JSONArray) jsonObject.get("Wheats");

			for (Object o : Wheats) {
				JSONObject objs = (JSONObject) o;
				String name = objs.get("name").toString();
				System.out.println("name--->" + name);
			}
			/*
			 * System.out.println(Wheats.toJSONString());
			 * 
			 * System.out.println(jsonObject.toJSONString());
			 * 
			 * String name = jsonObject.get("name").toString();
			 * System.out.println("name--->" + name); Integer weight =
			 * Integer.parseInt(jsonObject.get("weight").toString()); Integer price =
			 * Integer.parseInt(jsonObject.get("price").toString()); Integer total =
			 * Integer.parseInt(jsonObject.get("Total Amount : ").toString());
			 * 
			 * System.out.println("Name: " + name); System.out.println("weight " + weight);
			 * System.out.println("price" + price); System.out.println("Total Amount :" +
			 * total);
			 */

			// fileReader.close();
			JSONArray msg = (JSONArray) jsonObject.get("msg");
			/*
			 * Iterator<String> iterator = msg.iterator(); while (iterator.hasNext()) {
			 * System.out.println(iterator.next()); }
			 */
			for (Object c : msg) {
				System.out.println(c + "");
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}
