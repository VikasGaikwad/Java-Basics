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

/**purpose :-this is Utility class to define all method to which needfull for AddressBook.
 * @author bridgeit
 * @since- 14-feb-2018
 */
public class AdressBookUtility {
	static Scanner scanner=new Scanner(System.in);

	static String path="/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/utility/jsonFiles/addressBook.json";


	/**
	 * @param paththe- path to which object is from read.
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	@SuppressWarnings("unchecked")
	public static void personInfo(String path) throws FileNotFoundException, IOException, ParseException {
		File file = new File(path);
		if(file.length()==0) {
			JSONObject outerJsonObject=new JSONObject();
			System.out.println("How many Address books you want to add : ");
			int number=scanner.nextInt();
			JSONArray jsonArray=new JSONArray();
			JSONObject jsonObject1=new JSONObject();
			for(int i=1;i<=number;i++) {



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




			}
			jsonArray.add(jsonObject1);

			outerJsonObject.put("book", jsonArray);
			//System.out.println(outer);
			writeToJson(path, outerJsonObject);


		}else {
			JSONObject outerJsonObject=new JSONObject();
			JSONObject jsonObject=new JSONObject();

			System.out.println("\tHow many Address books u want to add : ");
			int number=scanner.nextInt();


			for(int i=0;i<number;i++) {



				System.out.println("Enter  First Name: ");
				String first_name=scanner.next();
				jsonObject.put("first_name", first_name);


				System.out.println("Enter Last Name: ");
				String last_name=scanner.next();
				jsonObject.put("last_name", last_name);

				System.out.println("Enter address: ");
				String address=scanner.next();
				jsonObject.put("address", address);


				System.out.println("Enter state: ");
				String state=scanner.next();
				jsonObject.put("state", state);


				System.out.println("Enter zip Code: ");
				String zip_code=scanner.next();
				jsonObject.put("zip_code", zip_code);


				System.out.println("Enter phone number: ");
				String phone_number=scanner.next();
				jsonObject.put("phone_number", phone_number);



				JSONParser jsonParser=new JSONParser();
				Object object=jsonParser.parse(new FileReader(file));
				JSONObject innerJson=(JSONObject) object; 

				JSONArray array= (JSONArray) innerJson.get("book");
				//System.out.println("before array");
				array.add(jsonObject);
				//System.out.println("after array");
				outerJsonObject.put("book", array);
				//System.out.println(outer);
				writeToJson(path, outerJsonObject);
			}

		}



	}
	/**
	 * @param path-path of file on which to write data.
	 * @param object-object of JSON Object class.
	 */
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
	/**
	 * @param paththe- path to which object is from read.
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
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


	/**	
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
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
	/**
	 * @param firstName-get the first name as parameter
	 * @param lastName-get the first name as parameter
	 * @return-return person after validating.
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	public static boolean validatePerson(String firstName,String lastName) throws FileNotFoundException, IOException, ParseException {
		System.out.println("inside in validate function1");
		boolean flag=false;
		File file = new File(path);
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(file));
		JSONObject outer = (JSONObject) obj;
		JSONArray array = (JSONArray) outer.get("book");
		JSONObject compareObj;
		for(int i=0;i<array.size();i++) {
			compareObj = (JSONObject) array.get(i);
			if((compareObj.get("first_name").equals(firstName))&&(compareObj.get("last_name").equals(lastName))) {
				System.out.println("validate object"+compareObj);
				flag=true;
			}
		}
		return flag;
	}
	/**
	 * @param firstName-get the first name as parameter
	 * @param lastName-get the first name as parameter	
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	@SuppressWarnings("unchecked")
	public static void removePerson(String firstName,String lastName) throws FileNotFoundException, IOException, ParseException {
		System.out.println("in remove function");
		File file=new File(path);
		JSONParser jsonParser=new JSONParser();
		Object obj=jsonParser.parse(new FileReader(file));
		JSONObject outerObject=(JSONObject)obj;
		JSONArray jsonArray=(JSONArray)outerObject.get("book");
		JSONObject compareObject;
		JSONObject addressArrayContainObj=new JSONObject();
		for (int i = 0; i < jsonArray.size(); i++) {
			compareObject=(JSONObject)jsonArray.get(i);
			if((compareObject.get("first_name").equals(firstName))&&(compareObject.get("last_name").equals(lastName))){
				System.out.println("before remove object"+compareObject);
				jsonArray.remove(compareObject);


				addressArrayContainObj.put("book", jsonArray);

				break;


			}

		}
		writeToJson(path, addressArrayContainObj);

	}
	/**	
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	@SuppressWarnings({ "resource" })
	public static void edit() throws FileNotFoundException, IOException, ParseException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name of person who's details you want to edit :");
		String name = scanner.nextLine();
		boolean flag=checkDetails(name);
		if(flag) {
			String [] strArray= {" ","first_name","last_name","address","state","phone_number","zip_code"};
			System.out.println("1:FirstName ,2:LastName ,3:Address ,4:State  ,5:PhoneNum,6:Zip");
			int key=scanner.nextInt();
			String param=strArray[key];
			System.out.println("enter new  : "+param);
			String newParam=scanner.next();
			UpdateDetails(name,param,newParam);
		}
		else {
			System.out.println("the person not found..Do you want to try again press Y/N");
			char ch = scanner.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				edit();
			}
		}
	}


	/**
	 * @param name-first name to be check.
	 * @param old_param-put name inside old_param
	 * @param new_Param	-new name for old name
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	@SuppressWarnings({ "unchecked" })
	private static void UpdateDetails(String name, String old_param, String new_Param) throws FileNotFoundException, IOException, ParseException {
		JSONArray updateDetailsArray=new JSONArray();
		updateDetailsArray=getPresentArray();
		JSONObject compareObject=new JSONObject();
		JSONObject containObject=new JSONObject();
		for(int i=0;i<updateDetailsArray.size();i++) {
			compareObject=(JSONObject) updateDetailsArray.get(i);
			if(compareObject.get("first_name").equals(name)) {
				compareObject.put(old_param, new_Param);
				System.out.println("updation of "+old_param+" to new "+new_Param+" success");
				break;
			}
		}
		containObject.put("book", updateDetailsArray);
		writeToJson(path, containObject);

	}
	/**	
	 * @return-return person after validating.
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	private static JSONArray getPresentArray() throws FileNotFoundException, IOException, ParseException {
		File file=new File(path);
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader(file));
		JSONObject outer=(JSONObject) obj;
		JSONArray array=(JSONArray) outer.get("book");
		return array;
	}
	private static boolean checkDetails(String name) throws FileNotFoundException, IOException, ParseException {
		boolean flag=false;
		File file = new File(path);
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(file));
		JSONObject outer = (JSONObject) obj;
		JSONArray array = (JSONArray) outer.get("book");
		JSONObject compareObj;
		for(int i=0;i<array.size();i++) {
			compareObj = (JSONObject) array.get(i);
			if(compareObj.get("first_name").equals(name)) {
				flag=true;
			}
		}
		return flag;

	}
	/**	
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	public static void sortJson() throws FileNotFoundException, IOException, ParseException {
		System.out.println("1.Sort By Name\t2.Sort By Zip code");
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
	/**
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
	@SuppressWarnings({ "unchecked" })
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
		addressArrayContainObj.put("book", jsonArray);
		writeToJson(path, addressArrayContainObj);
	}
	/**
	 * @throws FileNotFoundException-exception while file is missing.
	 * @throws IOException-exception while writing to file
	 * @throws ParseException-exception while reading from file.
	 */
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
		addressArrayContainObj.put("book", jsonArray);
		writeToJson(path, addressArrayContainObj);
	}
}
