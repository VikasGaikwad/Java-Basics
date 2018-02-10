package com.bridgelabz.oop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManagement_4 {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		JSONParser jsonParser=new JSONParser();
		try {
			FileReader fileReader=new FileReader("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/stock.json");
			Object object=jsonParser.parse(fileReader);
			JSONObject jsonObject=(JSONObject)object;
			
			//reading the string from file
			int amount=(int)jsonObject.get("amount of shares");
			int total=(int) jsonObject.get("total : ");
			int shares=(int) jsonObject.get("Number of Shares");
			String company=(String) jsonObject.get("comnapy ");
			
			//reading array
			JSONArray array=(JSONArray) jsonObject.get("stock_report");

			//printing all values from object
			System.out.println("amount of shares : "+amount);
			System.out.println("total :"+total);
			System.out.println("number of shares : "+shares);
			System.out.println("company : "+company);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}


	}

}
