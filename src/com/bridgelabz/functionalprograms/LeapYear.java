package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
/**class for check the year is leap or not.
 * @author bridgeit
 *since:20 sep 2018
 */
public class LeapYear
{

	public static void main(String [] args)
	{
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the year : ");
		int year=scanner.nextInt();
		Utility.isLeapYear(year);
		scanner.close();


	}	
}


