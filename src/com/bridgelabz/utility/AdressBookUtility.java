package com.bridgelabz.utility;

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

public class AdressBookUtility {
	static Scanner scanner=new Scanner(System.in);
	static JSONArray jsonArray=new JSONArray();
	static String path="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/addressBook.json";


	@SuppressWarnings("unchecked")
	public static void entryCode(String path) throws FileNotFoundException, IOException, ParseException {
		File file = new File(path);
		if(file.length()==0) {
			JSONObject outerJsonObject=new JSONObject();
			System.out.println("How many Address books you want to add : ");
			int number=scanner.nextInt();

			for(int i=1;i<=number;i++) {
				JSONObject jsonObject1=new JSONObject();


				System.out.println("enter  First Name of :  person - "+i);
				String first_name=scanner.next();
				jsonObject1.put("first_name", first_name);


				System.out.println("Enter Last Name: ");
				String last_name=scanner.next();
				jsonObject1.put("last_name", last_name);

				System.out.println("Enter address: ");
				String address=scanner.next();
				jsonObject1.put("address", address);


				System.out.println("Enter state: ");
				String state=scanner.next();
				jsonObject1.put("state", state);


				System.out.println("Enter zip Code: ");
				String zip_code=scanner.next();
				jsonObject1.put("zip_code", zip_code);


				System.out.println("Enter phone number: ");
				String phone_number=scanner.next();
				jsonObject1.put("phone_number", phone_number);


				jsonArray.add(jsonObject1);


			}

			outerJsonObject.put("book", jsonArray);
			//System.out.println(outer);
			writeToJson(path, outerJsonObject);


		}else {
			JSONObject outerJsonObject=new JSONObject();
			System.out.println("\tHow many Address books u want to add : ");
			int number=scanner.nextInt();

			for(int i=0;i<number;i++) {
				JSONObject jsonObject1=new JSONObject();


				System.out.println("Enter  First Name: ");
				String first_name=scanner.next();
				jsonObject1.put("first_name", first_name);


				System.out.println("Enter Last Name: ");
				String last_name=scanner.next();
				jsonObject1.put("last_name", last_name);

				System.out.println("Enter address: ");
				String address=scanner.next();
				jsonObject1.put("address", address);


				System.out.println("Enter state: ");
				String state=scanner.next();
				jsonObject1.put("state", state);


				System.out.println("Enter zip Code: ");
				String zip_code=scanner.next();
				jsonObject1.put("zip_code", zip_code);


				System.out.println("Enter phone number: ");
				String phone_number=scanner.next();
				jsonObject1.put("phone_number", phone_number);


				JSONParser jsonParser=new JSONParser();
				JSONObject object=(JSONObject)jsonParser.parse(new FileReader(file));
				JSONArray array=(JSONArray)object.get("book");//takes complete json object with its value
				array.add(jsonObject1);

				outerJsonObject.put("book", array);
				//System.out.println(outer);
				writeToJson(path, outerJsonObject);
			}

		}



	}
	public static void writeToJson(String path,JSONObject object) {
		File file=new File(path);

		if (file.exists()) {

			try {
				FileWriter writer=new FileWriter(path);
				writer.write(object.toJSONString());
				writer.flush();
				writer.close();
				System.out.println("\tfile write successfully...");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
	public static void display(String path) throws FileNotFoundException, IOException, ParseException {

		File file=new File(path);
		if(file.length()==0) {
			System.out.println("\tfile is empty ...");
		}
		else {
			JSONParser jsonParser=new JSONParser();
			Object obJ=jsonParser.parse(new FileReader(file));
			JSONObject  object = (JSONObject) obJ;
			JSONArray arr=(JSONArray)object.get("book");
			JSONObject temp=null;
			for(int i=0;i<arr.size();i++) {
				temp=(JSONObject) arr.get(i);

				System.out.println("\t\tFirst Name : "+temp.get("first_name"));
				System.out.println("\t\tLast Name : "+temp.get("last_name"));
				System.out.println("\t\tAddress : "+temp.get("address"));
				System.out.println("\t\tPhone Number : "+temp.get("phone_number"));
				System.out.println("\t\tzip code : "+temp.get("zip_code"));
				System.out.println("\t\tState : "+temp.get("state"));
				System.out.println("**********************************************");

			}

			//scanner.close();
		}
	}
	public static void sortJson() throws FileNotFoundException, IOException, ParseException {
		System.out.println("1.By Name, 2.By Zip code");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			sortByName();
			System.out.println("successfully sorted by name");
			break;
		case 2:
			sortByZip();
			System.out.println("successfully sorted by zip code");
			break;
		default:
		}
	}
	@SuppressWarnings({ "unused", "unchecked" })
	public static void sortByName() throws FileNotFoundException, IOException, ParseException {
		File file=new File(path);
		JSONParser jsonParser=new JSONParser();
		Object obj=jsonParser.parse(new FileReader(file));
		JSONObject outerObject=(JSONObject)obj;
		JSONArray jsonArray=(JSONArray)outerObject.get("book");

		JSONObject obj1=null;
		JSONObject obj2=null;
		JSONObject temp=null;

		for(int i=0;i<jsonArray.size()-1;i++) {
			for(int j=0;j<jsonArray.size()-1;j++) {
				obj1=(JSONObject)jsonArray.get(j);
				obj2=(JSONObject)jsonArray.get(j+1);

				String n1=(String)obj1.get("first_name");
				String n2=(String)obj2.get("first_name");

				String name1=n1.toLowerCase();
				String name2=n2.toLowerCase();

				if(name1.compareTo(name2)>0) {
					temp=(JSONObject)jsonArray.get(j);
					jsonArray.remove(j);
					jsonArray.add(j,obj2);//placing  obj2 to value j
					jsonArray.remove(j+1);//now both places have [obj2,obj2] so i remove second obj2
					jsonArray.add(j+1,temp);//adding obj2 object value at second position, which is stored in temp.

				}
			}
		}
		JSONObject addressArrayContainObj=new JSONObject();
		addressArrayContainObj.put("book", temp);
		writeToJson(path, addressArrayContainObj);
	}
	@SuppressWarnings("unchecked")
	public static void sortByZip() throws FileNotFoundException, IOException, ParseException {
		File file=new File(path);
		JSONParser jsonParser=new JSONParser();
		Object obj=jsonParser.parse(new FileReader(file));
		JSONObject outerObject=(JSONObject)obj;
		JSONArray jsonArray=(JSONArray)outerObject.get("book");

		JSONObject obj1=null;
		JSONObject obj2=null;
		JSONObject temp=null;

		for(int i=0;i<jsonArray.size()-1;i++) {
			for(int j=0;j<jsonArray.size()-1;j++) {
				obj1=(JSONObject)jsonArray.get(j);
				obj2=(JSONObject)jsonArray.get(j+1);

				String zip1=(String)obj1.get("zip_code");
				String zip2=(String)obj2.get("zip_code");


				if(zip1.compareTo(zip2)>0) {
					temp=(JSONObject)jsonArray.get(j);
					jsonArray.remove(j);
					jsonArray.add(j,obj2);
					jsonArray.remove(j+1);
					jsonArray.add(j+1,temp);

				}
			}
		}
		JSONObject addressArrayContainObj=new JSONObject();
		addressArrayContainObj.put("book", temp);
		writeToJson(path, addressArrayContainObj);
	}

	public static void delete() throws FileNotFoundException, IOException, ParseException {

		
		System.out.println("Enter first name who's record you want to delete");
		String first_name =scanner.next();
		System.out.println("Enter last name who's record you want to delete");
		String last_name = scanner.next();
		boolean flag=validatePerson(first_name,last_name);
		if(flag) {
			removePerson(first_name,last_name);
			System.out.println("Person remove successfully");
		}else {
			System.out.println("person not found in record...do you want to try again press Y/N");
			char ch = scanner.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				delete();
			}
		}
	}
	public static boolean validatePerson(String first_name,String last_name) throws FileNotFoundException, IOException, ParseException {
		boolean flag=false;
		File file = new File(path);
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(file));
		JSONObject outer = (JSONObject) obj;
		JSONArray array = (JSONArray) outer.get("book");
		JSONObject compareObj;
		for(int i=0;i<array.size();i++) {
			compareObj = (JSONObject) array.get(i);
			if((compareObj.get("FirstName").equals(first_name))&&(compareObj.get("last_name").equals(last_name))) {
				flag=true;
			}
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static void removePerson(String first_name,String last_name) throws FileNotFoundException, IOException, ParseException {
		File file=new File(path);
		JSONParser jsonParser=new JSONParser();
		Object obj=jsonParser.parse(new FileReader(file));
		JSONObject outerObject=(JSONObject)obj;
		JSONArray jsonArray=(JSONArray)outerObject.get("book");
		JSONObject compareObject;
		JSONObject addressArrayContainObj=new JSONObject();
		for (int i = 0; i < jsonArray.size(); i++) {
			compareObject=(JSONObject)jsonArray.get(i);
			if((compareObject.get("first_name").equals(first_name))&&(compareObject.get("last_name").equals(last_name))){
				jsonArray.remove(compareObject);

				addressArrayContainObj.put("book", jsonArray);

				break;


			}

		}
		writeToJson(path, addressArrayContainObj);

	}

}
