package com.bridgelabz.oop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReport {


	@SuppressWarnings({ "resource", "unchecked", "unused" })
	public static void main(String[] args) {
		JSONObject outerJson=new JSONObject();
		JSONArray jsonArray=new JSONArray();

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the total number of companies : ");
		int numbers=scanner.nextInt();			

		for(int i=0;i<numbers;i++) {
			JSONObject jsonObject=new JSONObject();
			System.out.println("enter companies name/stock name : ");
			String stock_names=scanner.next();
			jsonObject.put("stock_names", stock_names);

			System.out.println("enter companies numbers of shares ");
			int number_of_share=scanner.nextInt();
			jsonObject.put("number_of_share", number_of_share);

			System.out.println("enter companies shares price : ");
			int share_price=scanner.nextInt();
			jsonObject.put("share_price", share_price);
			int sum=0;
			int stock_report_with_total_value=number_of_share*share_price;
			jsonObject.put("stock_report_with_total_value", stock_report_with_total_value);

			jsonArray.add(jsonObject);



		}

		//
		outerJson.put("stock", jsonArray);
		System.out.println(outerJson);


		String url="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/stock.json";
		File file=new File(url);

		if (file.exists()) {

			try {
				FileWriter writer=new FileWriter(url);
				writer.write(outerJson.toJSONString());
				writer.flush();
				writer.close();
				System.out.println("file write successfully...");
			} catch (IOException e) {

				e.printStackTrace();
			}
			JSONParser jsonParser=new JSONParser();
			File file2=new File(url);
			if(file.exists()) {
				try {
					JSONObject jsonObject=(JSONObject) jsonParser.parse(new FileReader(url));
					JSONArray stock_report_with_total_value= (JSONArray) jsonObject.get("stock");
					readingStock(stock_report_with_total_value);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}	
		}
	}

	private static void readingStock(JSONArray stock_report_with_total_value) {
		JSONObject tempObject=null;
		Long  total_share=(long) 0;
		for(int i=0;i<stock_report_with_total_value.size();i++) {
			tempObject=(JSONObject) stock_report_with_total_value.get(i);
			System.out.println("---------------------\n");
			System.out.println(tempObject.get("stock_names") +":"+ tempObject.get("stock_report_with_total_value"));
			Long temp=(Long) tempObject.get("stock_report_with_total_value");
			total_share=total_share+temp;
			//System.out.println(temp.getClass());
			System.out.println("\n---------------------");


		}
		System.out.println("Total shares of companies : "+total_share);

	}
}


