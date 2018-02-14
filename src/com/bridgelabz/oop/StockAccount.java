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
	

		public static void main(String args[]) throws IOException, ParseException {
			Scanner sc = new Scanner(System.in);
			char ch;
			do {
				System.out.println("1:Buy 2:Sell");
				int choice= sc.nextInt();
				
				switch(choice) {
				
				case 3:StockOperation.createAccount();
					break;
				case 1:CompanyShare compshare = StockOperation.buyStocks();
					if(compshare!=null) {
						StockOperation.saveUserFile(compshare);
					}else {
						System.out.println("Data not stored in compshare Object");
					}
					break;
				case 2:StockOperation.sell();
						StockOperation.save();
					break;
				default:	
				
				}
				System.out.println("Do you want to continue :y/Y");
				ch =sc.next().charAt(0);
			}while(ch=='y'||ch=='Y');
		}
	}