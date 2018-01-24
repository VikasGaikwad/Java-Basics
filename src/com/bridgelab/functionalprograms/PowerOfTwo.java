package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.utility.Utility;



/**
 * purpose:class defines the 2 power of nth integer number.
 * This is command argument program.
 * @author bridgeit
 * @since 22 jan 2018
 */
public class PowerOfTwo {

	public static void main(String args[])
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int value=Integer.parseInt(args[0]);
		utility.powerOfTwo(value);

	}
}

