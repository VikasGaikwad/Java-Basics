package com.bridgelabz.oop;

import java.io.PrintWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockReport {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		JSONObject jsonObject=new JSONObject();
		JSONArray array=new JSONArray();
		//String [] stock= {"stock_name","number_of_shares","share_price"};
		
			System.out.println("Enter the number of stocks : ");
			int number=scanner.nextInt();			

			for(int i=0;i<number;i++) {
				JSONObject innerObject=new JSONObject();
				System.out.println("enter the stock name : ");
				String s_name=scanner.next();
				innerObject.put("stock_name", s_name);
				System.out.println("enter the number of shares : ");
				int n_shares=scanner.nextInt();
				innerObject.put("number_of_shares", n_shares);
				System.out.println("enter the share prize : ");
				int s_price=scanner.nextInt();
				innerObject.put("shareprice", s_price);
				double cal=((number/100)*n_shares*s_price);
				innerObject.put("total value of each stock", cal);

				array.add(innerObject);

			}
			//jsonObject.put(array, stocks);
		
		PrintWriter printWriter = null;
		try {
			printWriter=new PrintWriter("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/stock.json");
			System.out.println("file write success...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		printWriter.write((jsonObject.toString()));
		printWriter.close();

	}
}


