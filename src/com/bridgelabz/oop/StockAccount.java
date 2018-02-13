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

public class StockAccount {
	static Scanner scanner=new Scanner(System.in);
	public static String path="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/stockAccount.json";

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) throws IOException, ParseException {

		JSONObject outerJson=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		JSONArray jarr = new JSONArray();
		//Scanner scanner = new Scanner(System.in);

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

			double dollars=stock_report_with_total_value/60;
			jsonObject.put("value_in_dollar", dollars);

			File file=new File(path);
			JSONParser jsonParser=new JSONParser();
			JSONObject jsonObject2=	(JSONObject) jsonParser.parse(new FileReader(file));

			jarr = (JSONArray) jsonObject2.get("stock");

			jarr.add(jsonObject);



		}


		outerJson.put("stock", jarr);

		//System.out.println(outerJson);
		writeToJson(path, outerJson);
		readFromJson(path);




		//valueOf(jsonArray);


	}
	/*public static void valueOf() throws FileNotFoundException, IOException, ParseException {
		File file=new File(path);
		JSONParser jsonParser=new JSONParser();
		JSONObject outer_Json = null;
		
			outer_Json = (JSONObject) jsonParser.parse(new FileReader(path));
		
		
		JSONArray stockNameArray=(JSONArray)outer_Json.get("stock");
		JSONObject tempObject=new JSONObject();
		for(int i=0;i<stockNameArray.size();i++) {
			tempObject=(JSONObject) stockNameArray.get(i);
			System.out.println("stock_name: "+tempObject.get("stock_names"));
			System.out.println("value_in_dollar: "+tempObject.get("value_in_dollar"));
			System.out.println("number_of_share: "+tempObject.get("number_of_share"));
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
	public static void readFromJson(String path) {
		File file=new File(path);
		JSONParser jsonParser=new JSONParser();
		if(file.exists()) {
			try {
				JSONObject outer_Json = (JSONObject) jsonParser.parse(new FileReader(path));
				JSONArray stockNameArray=(JSONArray)outer_Json.get("stock");
				JSONObject tempObject=new JSONObject();
				for(int i=0;i<stockNameArray.size();i++) {
					tempObject=(JSONObject) stockNameArray.get(i);
					System.out.println("stock_name: "+tempObject.get("stock_names"));
				}

			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}




		}

	}
	@SuppressWarnings("unused")
	public static void printShare() {
		File file=new File(path);
		JSONParser jsonParser=new JSONParser();
		try {
			JSONObject outer_Json = (JSONObject) jsonParser.parse(new FileReader(path));
			JSONArray value_in_dollarArray=(JSONArray)outer_Json.get("stock");
			JSONObject tempObject=new JSONObject();
			for(int i=0;i<value_in_dollarArray.size();i++) {
				tempObject=(JSONObject) value_in_dollarArray.get(i);
				System.out.println("value_in_dollar: "+tempObject.get("value_in_dollar"));
				System.out.println(tempObject);
			}
			buyShares();

		} catch (Exception e) {
		}
		
	}
	@SuppressWarnings("unused")
	public static void buyShares() throws FileNotFoundException, IOException, ParseException {
		System.out.println("your total shares  value in dollar : ");
		readFromJson(path);
		System.out.println("Enter the number of shares to buy : ");
		int number_shares=scanner.nextInt()*60;//shares are multiply by 60, in dollar range..
		//making changes in json file..


	}

}
