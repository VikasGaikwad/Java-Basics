package com.bridgelabz.oop;

import java.io.IOException;
import java.util.Scanner;


import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.oopUtility;

/**purpose: implements a data type that might be used by a financial institution 
 * to keep track of customer information.
 * @author bridgeit
 *@since:10-feb-2018
 */
public class StockAccout {
	static Scanner scanner=new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, ParseException {


		//Utility utility = new Utility();
		int choice;
		System.out.println();
		
		System.out.println();
		do {
			System.out.println("1.create user");
			System.out.println("2.Buy");
			System.out.println("3.Sell");
			System.out.println("4.display");
			System.out.println("5.Exit");
			choice = scanner.nextInt();
			String name, symbol;
			int amount;
			switch (choice) {
			case 1:
				System.out.println("Details of user");
				System.out.println();
				oopUtility.createUser();
				break;

			case 2:
				oopUtility.Buy();
				break;

			case 3:
				oopUtility.sell();
				break;

			case 4:
				oopUtility.display();
				break;
			case 5:
				System.exit(0);
				break;

			}
		} while (choice <= 4);

	}


	
}






