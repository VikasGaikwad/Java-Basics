package com.bridgelabz.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oop.Queue;
import com.bridgelabz.oop.QueueDeck;
import com.bridgelabz.oop.Stack1;

public class oopUtility {
	static Scanner scanner=new Scanner(System.in);
	/**function is used to buy the shares.
	 * @throws IOException-throws exception while reading/writing file.
	 * @throws ParseException-occure when reading file.
	 */
	@SuppressWarnings("unchecked")
	public static void Buy() throws IOException, ParseException {

		File file = new File("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/userDetails.json");

		File file1 = new File( "/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/stockSymbol.json");

		if (file.exists() && file1.exists())
		{
			// reading stock file

			FileReader fileReader = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray stock = (JSONArray) parser.parse(fileReader);

			// reading share file

			FileReader fileReader2 = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray share = (JSONArray) parser1.parse(fileReader2);

			System.out.println("purchase/buy share");
			System.out.println();

			System.out.println("Enter user name");
			String name =scanner.next();
			Iterator<?> itr = ((List<Integer>) stock).iterator();
			Iterator<?> itr1 = ((List<Integer>) share).iterator();
			boolean flag = false;

			while (itr.hasNext())
			{
				JSONObject jsonObject = (JSONObject) itr.next();

				if (jsonObject.get("user_Name").equals(name))
				{
					System.out.println("Enter the share symbol to buy share:[@,!,#]");
					String symbol = scanner.next();

					while (itr1.hasNext())
					{
						JSONObject jsonObject2 = (JSONObject)
								itr1.next();
						if
						(jsonObject2.get("stock_Symbol").equals(symbol))
						{
							System.out.println("Enter the amount to buy the shares");
							int ammount = scanner.nextInt();

							int balalnce =
									Integer.parseInt(jsonObject.get("amount").toString());
							int price =
									Integer.parseInt(jsonObject2.get("amount").toString());
							int numberShare =
									Integer.parseInt(jsonObject.get("number_Share").toString());
							int stockShare =
									Integer.parseInt(jsonObject2.get("Count").toString());

							int numofshare = ammount /
									price;
							int newbalalnce = balalnce -
									ammount;
							int sharecountcus = numberShare
									+ numofshare;
							int sharecountstock = stockShare
									- numofshare;

							jsonObject.remove("amount");

							jsonObject.remove("number_Share");

							jsonObject.remove("Count");

							jsonObject.put("amount",
									newbalalnce);
							jsonObject.put("number_Share",
									sharecountcus);
							jsonObject2.put("Count",
									sharecountstock);

							flag = true;
							break;
						}
					}
					System.out.println();
					System.out.println("You buy shares successfully	on... ");
					// System.out.println();
				}
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(JSONValue.toJSONString(stock));
				fileWriter.flush();
				fileWriter.close();
			}

			Queue queue = new Queue();
			Stack1 stack1 = new Stack1();
			long time = System.currentTimeMillis();
			java.util.Date date = new java.util.Date(time);
			queue.enqueue(date);
			queue.print();
			System.out.println();

			System.out.println("----------------------------------");
			if (flag == false)

			{
				System.out.println("User name is not exits");
			}
			FileWriter fw = new FileWriter(file1);
			fw.write(JSONValue.toJSONString(share));
			fw.flush();
			fw.close();
		} else {
			System.out.println("File does not exits");
		}
	}
	/**function is used to sell shares.
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public static void sell() throws IOException, ParseException {

		File file = new File("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/userDetails.json");

		File file1 = new File("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/stockSymbol.json");
		if (file.exists() && file1.exists()) {

			FileReader fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray stock = (JSONArray) parser.parse(fr);

			FileReader sf = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray share = (JSONArray) parser1.parse(sf);

			System.out.println();
			System.out.println(" Sell Shares ");
			System.out.println();
			System.out.println("Enter the user name");

			String name = scanner.next();
			Iterator<?> itr = ((List<Integer>) stock).iterator();
			Iterator<?> itr1 = ((List<Integer>) share).iterator();
			boolean flag = false;
			while (itr.hasNext())
			{
				JSONObject obj = (JSONObject) itr.next();
				if (obj.get("user_Name").equals(name))
				{
					System.out.println("Enter the share symbol to sell share:[@,#,!]");
					String symbol =scanner.next();

					while (itr1.hasNext())
					{
						JSONObject obj1 = (JSONObject)
								itr1.next();
						if
						(obj1.get("stock_Symbol").equals(symbol))
						{
							System.out.println("Enter the amount");
							int ammount = scanner.nextInt();

							int bal =
									Integer.parseInt(obj.get("amount").toString());
							int price =
									Integer.parseInt(obj1.get("amount").toString());
							int noShare =
									Integer.parseInt(obj.get("number_Share").toString());
							int stockShare =
									Integer.parseInt(obj1.get("Count").toString());

							int numofshare = ammount /price;
							int newbal = bal + ammount;
							int sharecountcus = noShare -numofshare;
							int sharecountstock = stockShare+ numofshare;

							obj.remove("amount");
							obj.remove("number_Share");
							obj1.remove("Count");
							obj.put("amount", newbal);
							obj.put("number_Share",
									sharecountcus);
							obj1.put("Count",
									sharecountstock);

							flag = true;
							break;
						}
					}

					System.out.println();
					System.out.println("Your shares sold successfully ...");

					Queue queue = new Queue();
					Stack1 stack1 = new Stack1();
					long time = System.currentTimeMillis();
					java.util.Date date = new java.util.Date(time);
					queue.enqueue(date);
					queue.print();
					stack1.push(symbol);
					System.out.println();
					System.out.println("Shares symbol is: ");
					stack1.print();
					System.out.println();
					System.out.println("---------------------------------------");

					System.out.println();
				}
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(JSONValue.toJSONString(stock));
				fileWriter.flush();
				fileWriter.close();
			}
			if (flag == false) {
				System.out.println("User name not fond");
			}
			FileWriter fw = new FileWriter(file1);
			fw.write(JSONValue.toJSONString(share));
			fw.flush();
			fw.close();
		} else
		{
			System.out.println("File does not exits");
		}
	}
	/**function is used to display the user data from json file
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void display() throws IOException, ParseException {

		FileReader reader1 = new
				FileReader("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/userDetails.json");

		JSONParser jsonParser1 = new JSONParser();
		JSONArray jsonArrays_StackDtails = (JSONArray)
				jsonParser1.parse(reader1);

		System.out.println(" User Details ");
		for (Object o1 : jsonArrays_StackDtails)
		{
			JSONObject jsonDetails2 = (JSONObject) o1;
			String name = (String) jsonDetails2.get("user_Name");

			System.out.println("User Name: " + name);

			Object share = jsonDetails2.get("number_Share");
			System.out.println("Number of share: " + share);

			Object amount = jsonDetails2.get("amount");
			System.out.println("Amount: " + amount);

			System.out.println("-----------------------------------------");
		}
	}
	/**function is used to create the new user
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public static void createUser() throws IOException, ParseException{

		JSONObject stockUser = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		FileReader reader = new
				FileReader("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/userDetails.json");
		String name;
		int numberOfShare, amount;

		System.out.println("Enter First Name");
		name =scanner.next();
		stockUser.put("user_Name", name);

		System.out.println("Enter Number of Shares");
		numberOfShare = scanner.nextInt();
		stockUser.put("number_Share", numberOfShare);

		System.out.println("Enter your balance");
		amount = scanner.nextInt();
		stockUser.put("amount", amount);
		jsonArray.add(stockUser);

		JSONParser jsonParser = new JSONParser();
		JSONArray object1 = (JSONArray) jsonParser.parse(reader);

		boolean found = true;
		Iterator<?> itr1 = (object1).iterator();
		while(itr1.hasNext())
		{
			JSONObject jsonDeatils = (JSONObject) itr1.next();
			String userName = (String) jsonDeatils.get("user_Name");
			if (userName.equalsIgnoreCase(name))
			{
				System.out.println("This "+name+" user is already created");
				found = false;
			}
		}
		if (found==true)
		{
			object1.add(stockUser);
			/*((JSONArray) jsonArray).add(stockUser);*/
			FileWriter fileWriter = new
					FileWriter("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/userDetails.json");
			fileWriter.write(((JSONAware) object1).toJSONString());
			fileWriter.flush();
			fileWriter.close();

		}
	}
	/**
	 * @param suits-types of card.
	 * @param ranks-total cards with their rank.
	 */
	public static void deckOfCards(String[] suits, String[] ranks) {
		String array[][] = new String[4][9];

		// initialize deck
		int numberOfCards = suits.length * ranks.length;
		String[] deck = new String[numberOfCards];

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + " " + suits[j];


			}

		}

		for (int i = 0; i < numberOfCards; i++) {
			int random = i + (int) (Math.random() * (numberOfCards - i));
			System.out.println(random);
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}


		for (int i = 0; i < 4; i++) {
			System.out.print("Player" + (i + 1) + "\n");
			for (int j = 0; j < 9; j++) {
				array[i][j] = (deck[i + j * 4]);
				System.out.println(" " + array[i][j]+",");
			}
			System.out.println("\n");
		}
	}
	/**
	 * @param suits-types of card.
	 * @param ranks-total cards with their rank.
	 */

	public static void deckOfCardsQueue(String[] suits, String[] ranks) {

		String array[][] = new String[4][9];


		int numberOfCards = suits.length * ranks.length;
		String[] deck = new String[numberOfCards];


		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + "->" + suits[j];
				// System.out.print(""+(deck[suits.length*i + j]));
			}
		}


		for (int i = 0; i < numberOfCards; i++) {
			int random = i + (int) (Math.random() * (numberOfCards - i));
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}

		QueueDeck queueDeck = new QueueDeck();
		// distribute 9 cards to 4 player
		for (int i = 0; i < 4; i++) {
			System.out.print("Player" + (i + 1) + "\n");
			for (int j = 0; j < 9; j++) {
				array[i][j] = (deck[i + j * 4]);
				// System.out.println(" " + array[i][j]);
				queueDeck.push(array[i][j]);
				// System.out.println("" + queue);
			}
			System.out.println("\n");
		}
	}

}
