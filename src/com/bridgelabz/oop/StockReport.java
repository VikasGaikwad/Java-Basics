package com.bridgelabz.oop;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.StockUtility;

public class StockReport {
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args){

		JSONArray jsonArray = new JSONArray();
		StockUtility utility = new StockUtility();
		System.out.println("How many numbers of  company");
		int number = StockUtility.getInt();
		String[] companyName = new String[number];
		int share[] = new int[number];
		int amount[] = new int[number];
		int total[] = new int[number];
		System.out.println("Enter company name");
		int totalStock=0;
		for(int i=0; i<number; i++){
			companyName[i] = StockUtility.getString();
		}

		for(int i=0; i<number; i++){
			System.out.println("Enter the number of shares for "+companyName[i]);
			share[i] = StockUtility.getInt();

			System.out.println("Enter the share amount of "+companyName[i]);
			amount[i] = StockUtility.getInt();
		}
		for(int i=0; i<number; i++){

			total[i] = share[i]*amount[i];
		}
		System.out.println("\n");
		
		PrintWriter printWriter =null;
		try {
			printWriter = new
					PrintWriter("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/stock_report.json");
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}

		for(int i=0; i<number; i++)
		{
			System.out.println(" company name : "+companyName[i]+", share : "+share[i]+", amount : "+amount[i]+", total : "+total[i]);
					JSONObject jsonObject = new JSONObject();
			jsonObject.put("Company Name -",companyName[i]);
			jsonObject.put("Shares -",share[i]);
			jsonObject.put("Price -",amount[i]);
			jsonObject.put("total -",total[i]);
			jsonArray.add(jsonObject);

		}

		printWriter.write(jsonArray.toJSONString());
		printWriter.flush();
		printWriter.close();
		System.out.println();
		for(int i=0; i<number; i++){
			totalStock+= share[i]*amount[i];
		}
		System.out.println("Total stock is : "+totalStock);
	}
}