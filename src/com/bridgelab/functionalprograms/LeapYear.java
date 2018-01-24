package com.bridgelab.functionalprograms;
import java.util.Scanner;
import com.utility.Utility;
/**class for check the year is leap or not.
 * @author bridgeit
 *since:20 sep 2018
 */
public class LeapYear
{

	public static void main(String [] args)
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year : ");
		int year=sc.nextInt();
		utility.isLeapYear(year);


	}	
}


