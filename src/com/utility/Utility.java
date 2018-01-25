package com.utility;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bridgeit
 * @since:19 sep 2018
 */
public class Utility {


	/**
	 * Function to replace the String.
	 * @param str1
	 * @param str2
	 */
	public static void stringReplace(String str1,String str2){
		System.out.println(str1.replaceAll("<<UserName>>", str2));

	}



	/**
	 * Function to flip the coin.
	 * @param times
	 * @param heads
	 * @param tails
	 */
	public static void flipCoins(int times){
		double heads=0,tails=0;
		for(int i=0;i<times;i++){
			double rand=Math.random();
			if(rand>.5){
				//System.out.println(heads);
				heads++;
			}
			else{
				//System.out.println(tails);
				tails++;
			}
		}
		System.out.println("***************************************************************");
		System.out.println("*****total number of heads out of "+times+ " is " + heads);
		System.out.println("*****total number of tails out of "+times+ " is " + tails);
		int per1,per2;
		per1=(int) ((heads/times)*100);
		per2=(int) ((tails/times)*100);
		System.out.println("*****the percentage of head is : ="+per1+"%");
		System.out.println("*****the percentage of tails is : ="+per2+"%");
		System.out.println("***************************************************************");

	}
	/**
	 * Function to check year is Leap or Not.
	 * @param year
	 */
	public static void isLeapYear(int year){
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{						
			System.out.println(year+" is leap year ");
		}


		else
		{
			System.out .println("this is not leap year");
		}
	}
	/**
	 * Function to calculate the power of given integer number.
	 * @param value
	 * @return power
	 */
	public static int powerOfTwo(int value){
		System.out.println("the power of 2^"+value+" is "+(Math.pow(2,value)));


		for(int i=1;i<=value;i++)
		{
			System.out.println("power of 2^"+i+ " is " +(Math.pow(2,i )));	
		}
		return value;

	}

	/**
	 * Function to calculate the Harmonic number.
	 * @param num
	 */
	public static void harmonicNumber(int num){
		float sum=0;
		for(int i=1;i<=num;i++){
			// System.out.println("1 / "+i);
			sum=sum+(float)1/i;


		}
		System.out.println("***************************************************************");
		System.out.println("********the total sum of harmonic number is : "+sum+"********");
		System.out.println("***************************************************************");

	}


	/**
	 * Function to check the prime factors.
	 * @param n
	 */
	public static void primeFactors(int n)
	{

		while (n%2==0)
		{
			System.out.print(2 + " ");
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i+= 2)
		{
			while (n%i == 0)
			{
				System.out.print(i + " ");
				n /= i;
			}
		}


		if (n > 2)
			System.out.print(n);
	}	

	/**
	 * Function Print Number of Wins and Percentage of Win and Loss.
.
	 * @param stake
	 * @param goal
	 * @param trial
	 */
	public static void gambler(int stake,int goal,int trial){
		int win=0;
		int bet=0;
		int lose=0;
		for(int i=0;i<trial;i++){
			int cash=stake;

			while((cash>0) && (cash<goal))
			{
				double r=Math.random();

				bet++;
				if(Math.random()>.5)
					cash++;


				else

					cash--;

			}
			if(cash==goal)
				win++;

			if(cash==0)
				lose++;


		}
		System.out.println("win : "+win);
		System.out.println("Avg bets of win = " + (win / (double)trial)*100);
		System.out.println("lose : "+lose);
		System.out.println("Avg bets of lose = " + (lose / (double)trial)*100);
	}


	/** Function to print array elements.
	 * @param arrayElements
	 * @param rows
	 * @param columns
	 */
	public static <T> void print2DArray(T[][] arrayElements, int rows, int columns) {
		PrintWriter writer = new PrintWriter(System.out);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				writer.print(arrayElements[i][j] + " ");
				writer.flush();
			}
			System.out.println();
		}

	}


	/**
	 * Function for finding triplets from entered values.
	 * @param arr
	 */
	public static void sumOfThree(int[] arr){
		int count=0;

		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						count++;	
						System.out.println("triplets found at location : "+i+" "+j+" "+k);
						System.out.println("Addition of triplets  : ("+arr[i]+")+("+arr[j]+")+("+arr[k]+") =0");
					}

				}

			}

		}
		System.out.println("total triplets found : "+count);
	}

	/**Function to check the distance from origin origin.
	 * @param X
	 * @param Y
	 */
	public static void distance(int X,int Y){
		double ans = Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
		System.out.println("Distance  is : "+ans);
	}
	/** function to calculate the Quadratic value.
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void  quadratic(double a,double b,double c){
		double delta = (b*b)-(4*a*c);
		System.out.println(delta);
		double X1 =(-b+Math.sqrt(delta)/(2*a));
		double X2 = (-b-Math.sqrt(delta)/(2*a));
		float xx=(int)X1;
		System.out.println("Root 1 of X :"+X1);
		System.out.println("Root 2 of X :"+X2);
		//return 0;
	}
	/**Function for Comparing chacractors of two String.
	 * @param string1
	 * @param string2
	 * desc- replaceAll() is used to remove all the white spaces.
	 */
	public static void anagram(String string1,String string2){
		String whitespace1=string1.replaceAll("\\s","");
		String whitespace2=string2.replaceAll("\\s","");
		char []ch1=whitespace1.toCharArray();
		char []ch2=whitespace2.toCharArray();
		if(ch1.length==ch2.length){
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)){
				System.out.println("string is anagram");
			}
			else
			{
				System.out.println("string is not Anagram");
			}
		}
	}

	/**Function to display prime numbers in given range.
	 * @param x
	 */
	public static void primeNumber(int x){
		for(int i=2; i < x; i++){
			boolean checkPrime = true;
			for(int j=2; j < i ; j++){
				if(i % j == 0){
					checkPrime = false;
					break;
				}
			}

			if(checkPrime)
				System.out.println(i + " ");
		}
	}

	/**Function to check given number is prime or not.
	 * @param x
	 */
	public static boolean checkPrime(int x){
		int count=0;
		for(int i=1;i<=x;i++){
			if(x%i==0){
				count++;
			}
		}
		if(count==2)
			return true;
		return false;
	}
	/**
	 * Function to check the prime number is prime or not
	 * @param x
	 */
	public static void paliPrime(int x) {
		for(int i=1;i<=x;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;

				}
			}
			if(count==2) {

				int num =i;
				int rev=0;
				int sum=0;
				while(num>0) {
					rev = num%10;
					sum=(sum*10)+rev;
					num=num/10;
				}
				if(sum==i) {
					System.out.println();
					System.out.print(i+" ");

				}
			}

		}

	}
	/**Function to calculate the windchill
	 * @param T
	 * @param V
	 */
	public static void windChill(double T,double V) {

		if((T<51) && (V<120||V>3)) {
			double ans = 35.74 + (0.6215*T) + ((0.4275*T)-35.75)*(Math.pow(V, 0.16));
			System.out.println("Wind chill is :"+ans);
		}
		else {
			System.out.println("Enter correct values...");
		}
	}

	/**Function used to sorting the unsorted array and 
	 * search integer element using binary search.
	 * @param arr
	 * @param key
	 * @return 
	 */
	public static int binarySearch(int arr[],int key) {
		Scanner sc=new Scanner(System.in);

		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last)/2;

		while( first <= last )
		{
			if ( arr[middle] < key ){

				first = middle + 1;
				//System.out.println(first);
			}

			else if ( arr[middle] == key )
			{
				return middle;
			}
			else 
			{
				last = middle - 1;
			}
			middle = (first + last)/2;
		}
		if ( first > last )
			return -1;
		return middle;



	}
	/**Fuction define the insertion sort operation on int array.
	 * @param arr
	 */
	public static void insertionSortInteger(int []arr) {
		int n=arr.length;
		for(int j=1;j<n;j++) {
			int key=arr[j];
			int i=j-1;
			while(i>-1 && arr[i]>key) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
			System.out.print("[");
			for(int d:arr) {
				System.out.print(d+" , ");
			}
			System.out.println("]");
		}
	}

	/**Function is defined for sorting the array string using 
	 * insertion sort.
	 * @param arr
	 * @param str
	 */
	public static void insertionSortString(char[] arr,String str) {
		int length=str.length();
		for(int i=0;i<length;i++) {
			arr[i] = str.charAt(i);
		}
		for(int j=1;j<length;j++) {
			char  key = arr[j];
			int i=j-1;

			while((i>-1)&&(arr[i]>key)) {
				arr[i+1] = arr[i];
				i--;
			}

			arr[i+1] = key;
		}
		System.out.println("after sorting string : ");
		for(int k=0;k<length;k++){
			System.out.print(" "+arr[k]);
		}
	}

	/**Fuction define thesortingthe integer array using the
	 * Bubble Sort technic.
	 * @param arr
	 */
	public static void bubbleSortInteger(int []arr) { 
		int n = arr.length; for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}

		}
		System.out.println("\n\nafter sorting the array : ");
		for(int c: arr) {
			System.out.print(c+"  ");
		}

	}
	/**Function used to Sorts an array of String by 
	 * using the bubble sort
	 * @param arr
	 */
	public static void bubbleSortString(String[] arr,int size)
	{
		Scanner sc=new Scanner(System.in);
		//int size=arr.length;
		String temp;

		for(int x=1;x<size;x++)
		{
			for(int y=0;y<size-x;y++)
			{
				if(arr[y].compareTo(arr[y+1])>0)
				{
					temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;

				}
			}
		}
		System.out.println("The sorted values are ");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"  ");
		}	
	}

}


