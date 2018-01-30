package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class DayOfWeek{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String string=null;
		boolean flag=true;
		while(flag) {
			System.out.println("enter month : ");
			int month=sc.nextInt();
			if(month>12||month<1) {
				System.out.println("enter the month betwee 1 and 12 ");
				continue;
			}
			System.out.println("enter date : ");
			int day=sc.nextInt();
			if(day<0||day>31) {
				System.out.println("enter the date between 0 to 31 : ");
				continue;
			}
			System.out.println("enter the year : ");
			int year=sc.nextInt();
			if(year<1||year>10000) {
				System.out.println("enter the year between 1 to 10000");
				continue;
			}
			int y0 = year - (14 - month) / 12;
			int x = y0 + y0/4 - y0/100 +y0/400;
			int m0 = month + 12 * ((14 - month) / 12) - 2;
			int d0 = (day + x + 31 * m0 / 12) % 7;  
			if(d0>=0 && d0<=6) {
				switch(d0) {
				case 0:
					System.out.println("day of week is sunday");
					break;
				case 1:
					System.out.println("Day of  week is Monday");
					break;
				case 2:
					System.out.println("Day of  week is Tuesday");
					break;
				case 3:
					System.out.println("Day of  week is Wednesday");
					break;
				case 4:
					System.out.println("Day of  week is Thursday");
					break;
				case 5:
					System.out.println("Day of  week is Friday");
					break;
				case 6:
					System.out.println("Day of the  is saturday");
					break;
				default:
					System.out.println("choice Wrong...");
				}
			}

		}

	}


}
