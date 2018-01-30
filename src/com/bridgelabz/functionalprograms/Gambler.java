package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**class for gambler which checks the win and lose with
 * their percentage score.
 * @author bridgeit
 * since 24 jan 2018
 */
public class Gambler {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the stake money : ");
		int stake=sc.nextInt();
		System.out.println("enter the winnig target : ");
		int goal=sc.nextInt();
		System.out.println(" enter the trials : ");
		int trial=sc.nextInt();
		utility.gambler(stake,goal,trial);
	}

}
