package com.bridgelabz.oop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockReport {

	@SuppressWarnings({ "resource", "unused", "unchecked" })
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of companies...");
		int number = scanner.nextInt();
		JSONObject parentObject = new JSONObject();
		JSONArray array = new JSONArray();
		for (int i = 1; i <= number; i++) {
			JSONObject jsonObject = new JSONObject();

			System.out.println("Enter the name of company : " + i);
			String company = scanner.next();
			jsonObject.put("comnapy", company);

			System.out.println("Enter the number of  share for " + company + " company ..");
			int shares = scanner.nextInt();
			jsonObject.put("Number of Shares", shares);

			System.out.println("Enter the share amount for " + company + " company");
			int amount = scanner.nextInt();
			jsonObject.put("amount of shares", amount);

			int total = amount * shares;
			int total_stock;

			jsonObject.put("total : ", total);
			array.add(jsonObject);

		}

		parentObject.put("Stock_report", array);
		System.out.print(parentObject);
		try {
			FileWriter writer = new FileWriter("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/stock.json",true);
			writer.write(parentObject.toJSONString());
			writer.close();
			System.out.println("success...");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
