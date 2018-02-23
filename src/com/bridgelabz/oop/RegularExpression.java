package com.bridgelabz.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.beans.Expression;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**purpose:-Regular Expression Demonstration program.
@since-13-feb-2018
 * @author bridgeit
 *
 */
public class RegularExpression {

	private static Scanner sc= new Scanner(System.in);
	private static String[] pattern = { "<full name>", "<name>", "xxxxxxxxxx", "01/01/2016" };
	private static String message = "Hello <name>,\nWe have your fullname as <full name> in our system. \n"
			+ "Your contact number is 91-xxxxxxxxxx. \n" + "Please,let us know in case of any clarification \n"
			+ "Thankyou BridgeLabz \n01/01/2018.";
	private static String[] replacePattern = new String[pattern.length];
	
	
	public static void main(String args[]) {
		int index=0;
		System.out.println("Enter a full name:");
		String fullName = sc.nextLine();
		
		replacePattern[index++]=fullName;
		
		System.out.println("Enter name:");
		
		String name = sc.nextLine();
		replacePattern[index++]= name;
		
		System.out.println("Enter mobile no:");
		String mobile = sc.nextLine();
		replacePattern[index++]=mobile;
		
		Date dt = new Date();
		SimpleDateFormat sm =new SimpleDateFormat("DD/MM/YY");
		replacePattern[index++]=sm.format(dt);
		
		for(int i=0;i<pattern.length;i++) {
			message = Utility.replaceMent(message,pattern[i],replacePattern[i]);
		}
		System.out.println("");
		System.out.println(message);
	}
}