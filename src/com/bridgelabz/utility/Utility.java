
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * @author bridgeit
 * @since:19 sep 2018
 */
public class Utility {
	public static void scannerInt(int x) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
	}
	public static void scannerString(File file) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
	}

	public static void scannerdouble(double x) {
		Scanner scanner=new Scanner(System.in);
		double doubleValue=scanner.nextDouble();
	}


	/**
	 * Function to replace the String.
	 * 
	 * @param str1
	 * @param str2
	 */
	public static Scanner scanner=new Scanner(System.in);
	public static long startTime() {
		long a = System.nanoTime();
		elapsedTime(a, a);
		return a;
	}

	public static long endTime() {
		long b = System.nanoTime();
		elapsedTime(b, b);
		return b;
	}

	public static long elapsedTime(long a, long b) {
		long elapsedTime = b - a;
		System.out.println("Time require to call method in millis: " + (elapsedTime / 1000) / 60);
		return elapsedTime;

	}

	public static void stringReplace(String str1, String str2) {
		System.out.println(str1.replaceAll("<<UserName>>", str2));

	}

	/**
	 * Function to flip the coin.
	 * 
	 * @param times
	 * @param heads
	 * @param tails
	 */
	public void flipCoins(int times) {
		double heads = 0, tails = 0;
		for (int i = 0; i < times; i++) {
			double rand = Math.random();
			if (rand > .5) {
				// System.out.println(heads);
				heads++;
			} else {
				// System.out.println(tails);
				tails++;
			}
		}
		System.out.println("total number of heads out of " + times + " is " + heads);
		System.out.println("total number of tails out of " + times + " is " + tails);
		double per1, per2;
		per1 = (double) ((heads / times) * 100);
		per2 = (double) ((tails / times) * 100);
		System.out.println("the percentage of head is : =" + per1 + "%");
		System.out.println("the percentage of tails is : =" + per2 + "%");

	}

	/**
	 * Function to check year is Leap or Not.
	 * 
	 * @param year
	 */
	public static void isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is leap year ");
		}

		else {
			System.out.println(year + " is not leap year");
		}
	}

	/**
	 * Function to calculate the power of given integer number.
	 * 
	 * @param value
	 * @return power
	 */
	public static int powerOfTwo(int value) {
		System.out.println("the power of 2^" + value + " is " + (Math.pow(2, value)));

		for (int i = 1; i <= value; i++) {
			System.out.println("power of 2^" + i + " is " + (Math.pow(2, i)));
		}
		return value;

	}

	/**
	 * Function to calculate the Harmonic number.
	 * 
	 * @param num
	 */
	public static void harmonicNumber(int num) {
		float sum = 0;
		for (int i = 1; i <= num; i++) {
			// System.out.println("1 / "+i);
			sum = sum + (float) 1 / i;

		}
		System.out.println("the total sum of harmonic number is : " + sum);

	}

	/**
	 * Function to check the prime factors.
	 * 
	 * @param n
	 */
	public static void primeFactors(int n) {

		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}

		if (n > 2)
			System.out.print(n);
	}

	/**
	 * Function Print Number of Wins and Percentage of Win and Loss. .
	 * 
	 * @param stake
	 * @param goal
	 * @param trial
	 */
	public static void gambler(int stake, int goal, int trial) {
		int win = 0;
		int bet = 0;
		int lose = 0;
		for (int i = 0; i < trial; i++) {
			int cash = stake;

			while ((cash > 0) && (cash < goal)) {
				double r = Math.random();

				bet++;
				if (Math.random() > .5)
					cash++;

				else

					cash--;

			}
			if (cash == goal)
				win++;

			if (cash == 0)
				lose++;

		}
		System.out.println("win : " + win);
		System.out.println("Avg bets of win = " + (win / (double) trial) * 100);
		System.out.println("lose : " + lose);
		System.out.println("Avg bets of lose = " + (lose / (double) trial) * 100);
	}

	/**
	 * Function to print array elements.
	 * 
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
	 * 
	 * @param arr
	 */
	public static void sumOfThree(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println("triplets found at location : " + i + " " + j + " " + k);
						System.out.println(
								"Addition of triplets  : (" + arr[i] + ")+(" + arr[j] + ")+(" + arr[k] + ") =0");
					}

				}

			}

		}
		System.out.println("total triplets found : " + count);
	}

	/**
	 * Function to check the distance from origin origin.
	 * 
	 * @param X
	 * @param Y
	 */
	public static void distance(int X, int Y) {
		double ans = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
		System.out.println("Distance  is : " + ans);
	}

	/**
	 * function to calculate the Quadratic value.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadratic(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		System.out.println(delta);
		double X1 = (-b + Math.sqrt(delta) / (2 * a));
		double X2 = (-b - Math.sqrt(delta) / (2 * a));
		float xx = (int) X1;
		System.out.println("Root 1 of X :" + X1);
		System.out.println("Root 2 of X :" + X2);
		// return 0;
	}

	/**
	 * To fix the first position element and pass remaining string to the same
	 * function
	 * 
	 * @param l
	 * @param r
	 */
	public void permute(String str, int l, int r) {
		if (l == r) {
			System.out.println("l==r :");
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				System.out.println("Before swap :" + str);
				str = swap(str, l, i);
				System.out.println("After swap :" + str);
				permute(str, l + 1, r);

			}
		}
	}

	/**
	 * @param To
	 *            interchanging the position of i and j
	 * @param i
	 * @param j
	 * @return
	 */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * Function for Comparing chacractors of two String.
	 * 
	 * @param string1
	 * @param string2
	 *            desc- replaceAll() is used to remove all the white spaces.
	 */
	public static void anagram(String string1, String string2) {
		String whitespace1 = string1.replaceAll("\\s", "");
		String whitespace2 = string2.replaceAll("\\s", "");
		char[] ch1 = whitespace1.toCharArray();
		char[] ch2 = whitespace2.toCharArray();
		if (ch1.length == ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("string is anagram");
			} else {
				System.out.println("string is not Anagram");
			}
		}
	}

	/**
	 * Function to display prime numbers in given range.
	 * 
	 * @param x
	 */
	/*
	 * public static void primeNumber(int x) { int arr_anagram[]=new int[1000]; int
	 * k=0; for (int i = 2; i < x; i++) { boolean checkPrime = true; for (int j = 2;
	 * j < i; j++) { if (i % j == 0) { checkPrime = false; break; } }
	 * 
	 * if (checkPrime) { arr_anagram[k]=i; k++; System.out.println(i + " ");
	 * 
	 * }
	 * 
	 * } }
	 */

	/**
	 * Function to check given number is prime or not.
	 * 
	 * @param x
	 */
	/*
	 * public static boolean checkPrime(int x) { int count = 0; for (int i = 1; i <=
	 * x; i++) { if (x % i == 0) { count++; } } if (count == 2) return true; return
	 * false; }
	 */

	/**
	 * Function to check the prime number is prime or not
	 * 
	 * @param x
	 */
	/*
	 * public static void paliPrime(int x) { for (int i = 1; i <= x; i++) { int
	 * count = 0; for (int j = 1; j <= i; j++) { if (i % j == 0) { count++;
	 * 
	 * } } if (count == 2) {
	 * 
	 * int num = i; int rev = 0; int sum = 0; while (num > 0) { rev = num % 10; sum
	 * = (sum * 10) + rev; num = num / 10; } if (sum == i) { System.out.println();
	 * System.out.print(i + " ");
	 * 
	 * } }
	 * 
	 * }
	 * 
	 * }
	 */

	/**
	 * Funtion is defined entered two numbers/strings are anagram or not.
	 * 
	 * @param anagram1
	 * @param anagram2
	 * @return
	 */
	public static boolean anagramDetection(String anagram1, String anagram2) {

		char char1[] = anagram1.toCharArray();
		char char2[] = anagram2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		String string1 = String.valueOf(char1);
		String string2 = String.valueOf(char2);

		if (!string1.equals(string2))
			return false;

		return true;
	}

	/**
	 * Function to define the number is prime or not.
	 * 
	 * @param start
	 * @return
	 */
	public static String isPrimeNumber(int start) {
		String primeNumber = "";
		for (int i = 1; i <= start; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumber = primeNumber + i + " ";
			}
		}
		return primeNumber;
	}

	/**
	 * Function defines the number is Palindrome or not.
	 * 
	 * @param arraysAnagram
	 */
	public static void palindrom(String[] arraysAnagram) {
		int[] numbers = new int[arraysAnagram.length];
		for (int i = 0; i < arraysAnagram.length; i++) {
			numbers[i] = Integer.parseInt(arraysAnagram[i]);
		}
		int temp, reverse_num, rem = 0, i = 0, num = 0;
		while (i < numbers.length) {
			temp = numbers[i];
			num = temp;
			reverse_num = 0;
			while (temp != 0) {
				rem = temp % 10;
				temp = temp / 10;
				reverse_num = reverse_num * 10 + rem;
			}
			i++;
			if (num == reverse_num)
				System.out.print(" " + num);
		}
	}

	/**
	 * Function to calculate the windchill
	 * 
	 * @param T
	 * @param V
	 */
	public static void windChill(double T, double V) {

		if ((T < 51) && (V < 120 || V > 3)) {
			double ans = 35.74 + (0.6215 * T) + ((0.4275 * T) - 35.75) * (Math.pow(V, 0.16));
			System.out.println("Wind chill is :" + ans);
		} else {
			System.out.println("Enter correct values...");
		}
	}
	/**
	 * Function defines that outputs the binary (base 2) representation of the
	 * decimal number typed as the input.
	 * 
	 * @param num
	 */
	public static void toBinary(int num) {
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary is :" + binary);
		int a = Integer.parseInt(binary);
		int j = 1;
		int deci = 0;
		int rem = 1;
		while (a > 0) {
			rem = a % 10;
			deci = deci + rem * j;
			j = j * 2;
			a = a / 10;
		}
		char ch[] = binary.toCharArray();
		int count = 0;
		int sum = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == '1') {
				System.out.print(sum + (int) (Math.pow(2, count)) + "+");
				//sum = sum + (int) (Math.pow(2, count));
			}
			count++;
		}
		System.out.println(" sum is :" + sum);
		if (sum == num) {
			System.out.println("power of 2");
		} else {
			System.out.println("Not power of 2");
		}
	}

	/**
	 * Function defines the accurate number between 1 to N-1
	 * 
	 */
	public static void findYournumber() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a num for range");

		int N = (int) Math.pow(2, sc.nextInt());
		int range = N - 1;
		System.out.println("Think num between " + 0 + " to " + range);

		int low = 0;
		int high = range;
		int mid = (low + high) / 2;
		while (low != mid) {

			System.out.println("Is your num present in " + low + " To " + mid + " Enter True or False");
			boolean flag = sc.nextBoolean();
			if (flag == true) {

				high = mid;
				mid = (low + high) / 2;
			} else if (flag == false) {

				low = mid;
				mid = (low + high) / 2;
			}
		}
		System.out.println("Which one is our num " + low + " or " + high);
		int ans = sc.nextInt();
		System.out.println("Your Num is " + ans);
	}

	/**
	 * Function is used to convert integer to Binary
	 * 
	 * @param integer
	 */
	public static void intToBinary(int integer) {
		String as = Integer.toBinaryString(integer);
		System.out.println("\n Binary value of " + integer + " : " + Integer.toBinaryString(integer));
		nibbleCounting(as);
	}

	/**
	 * Function is defined for conversion of Binary to integer
	 * 
	 * @param as
	 */
	public static void binaryToInt(String as) {
		int x = Integer.parseInt(as, 2);
		System.out.println("\n Binary to decimal : " + Integer.parseInt(as, 2));
		if (resultantPowerOfTwo(x))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	/**
	 * Function is used to sorting the integer array using merge sort.
	 * 
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void sort(int[] a, int low, int high)

	{

		int N = high - low;

		if (N <= 1)

			return;

		int mid = low + N / 2;

		// recursively sort

		sort(a, low, mid);

		sort(a, mid, high);

		// merge two sorted subarrays

		int[] temp = new int[N];

		int i = low, j = mid;

		for (int k = 0; k < N; k++)

		{

			if (i == mid)

				temp[k] = a[j++];

			else if (j == high)

				temp[k] = a[i++];

			else if (a[j] < a[i])

				temp[k] = a[j++];

			else

				temp[k] = a[i++];

		}

		for (int k = 0; k < N; k++)

			a[low + k] = temp[k];

	}

	/**
	 * Function is defined to swap the nibble of Binary stream.
	 * 
	 * @param as
	 */
	public static void nibbleCounting(String as) {
		char[] array = as.toCharArray();
		while (as.length() != 8) {
			as = 0 + as;

		}
		int j = 4;
		char[] array1 = as.toCharArray();
		for (int i = 0; i < array1.length / 2; i++) {
			char temp = array1[i];
			array1[i] = array1[j];
			array1[j] = temp;
			j++;
		}

		System.out.println("\n after swapping nibble : ");
		System.out.println(array1);

		String array3 = String.valueOf(array1);
		binaryToInt(array3);

	}

	/**
	 * Function is defined to check the int number is resultant power of two or not.
	 * 
	 * @param x
	 * @return
	 */
	public static boolean resultantPowerOfTwo(int x) {
		if (x == 0)
			return false;

		while (x != 1) {
			if (x % 2 != 0)
				return false;
			x = x / 2;
		}
		if (x % 2 != 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		return true;

	}
	/**funtion reads the file from file manager.
	 * 
	 */
	public static void readFile(File file) {
		try {
			//File file=new File("/home/bridgeit/Documents/Programs/Java Basics/src/Unoredered.txt");
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String  words=bufferedReader.readLine();
			fileDataList(words);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**function used to writing data to the file.
	 * @param linkedlist
	 */
	public static void writeFile(LinkedList linkedlist) {
		try {
			FileWriter fileWriter=new FileWriter("/home/bridgeit/Documents/Programs/Java Basics/src/Unoredered.txt");
			for(int i=0;i<linkedlist.size();i++) {
				String addWord=linkedlist.get(i)+" ";
				fileWriter.write(addWord);
				fileWriter.flush();
				//fileWriter.close();

			}


		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/**function used to list the data from file.
	 * @param words
	 */
	public static void fileDataList(String words) {
		String [] string=words.split(" ");
		for(String element:string) {
			System.out.println(element);
		}
		LinkedList<String> linkedlist=new LinkedList<String>();
		for(int i=0;i<string.length;i++)
		{
			linkedlist.add(string[i]);


		}
		System.out.println(linkedlist);
		searchFromFile(linkedlist);
	}
	/**function used to search the int from file.
	 * @param linkedlist
	 */
	/**
	 * @param linkedlist
	 */
	@SuppressWarnings({ "unchecked", "resource" })
	public static void searchFromFile(@SuppressWarnings("rawtypes") LinkedList linkedlist) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the word to search from file : ");
		String search=scanner.nextLine();
		boolean found = true;
		for(int i=0;i<linkedlist.size();i++) 
		{
			if(linkedlist.get(i).equals(search)) 
			{
				found = false;
				linkedlist.remove(search);
				writeFile(linkedlist);
				break;

			}

		}

		if(found == true) {

			linkedlist.add(search);
			writeFile(linkedlist);

		}

	}
	/**function used to sread values from file.
	 * @param file
	 */
	public static void readFromFile(File file) {
		try {

			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String  words=bufferedReader.readLine();

			filesDataList(words);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void filesDataList(String words) {
		String [] string=words.split(" ");
		Arrays.sort(string);
		for(String element:string) {
			System.out.println(element);
		}
		LinkedList<String> linkedlist=new LinkedList<String>();
		for(int i=0;i<string.length;i++)
		{
			linkedlist.add(string[i]);


		}
		System.out.println(linkedlist);
		searchingFromFile(linkedlist);
	}
	/**function used to search the int from file.
	 * @param linkedlist
	 */
	@SuppressWarnings({ "unchecked", "resource" })
	public static void searchingFromFile(@SuppressWarnings("rawtypes") LinkedList linkedlist) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to search from file : ");
		String search=scanner.nextLine();
		boolean found = true;
		for(int i=0;i<linkedlist.size();i++) 
		{
			if(linkedlist.get(i).equals(search)) 
			{
				found = false;
				linkedlist.remove(search);
				writeToFile(linkedlist);
				break;

			}

		}

		if(found == true) {

			linkedlist.add(search);
			writeToFile(linkedlist);

		}

	}
	/**function used to write data to file.
	 * @param linkedlist
	 */
	public static void writeToFile(LinkedList linkedlist) {
		try {
			FileWriter fileWriter=new FileWriter("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/datastructure/int.txt");
			for(int i=0;i<linkedlist.size();i++) {
				String addWord=linkedlist.get(i)+" ";
				fileWriter.write(addWord);

				fileWriter.flush();
				//fileWriter.close();

			}


		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/**function is used to check parenthesis.
	 * @param exp
	 * @param stk
	 */
	public static void balanceParanthesis(String exp, Stack<Integer> stk)
	{
		int length = exp.length();

		System.out.println("\nMatches and Mismatches:\n");
		for (int i = 0; i < length; i++) 
		{
			char ch = exp.charAt(i);
			if (ch == '(')
				stk.push(i);

			else if (ch == ')') 
			{
				try {
					int p = stk.pop();
					System.out.println("parenthes is matched");
				} catch (Exception e) 
				{
					System.out.println("Parenthes is un mached");
				}
			}
		}
		while (!stk.isEmpty()) {
			System.out.println((stk.pop()) + " is un matched");
		}
}
	/*
	 * This Function calls All Sorting algorithm
	 * @param string[]
	 * @param int []
	 */
	public static void callAlgos(String[] sTring, int[] iNteger) 
	{
		// TODO Auto-generated method stub
		String [] algoArray = {"binarySearchString","binarySearchInt","insertionSortString","insertionSortInt","bubbleSortString","bubbleSortInt"};
		double elapsedTime[] = new double[algoArray.length];
		double startTime,endTime,eTime=0;
		int k=0;
		startTime = System.nanoTime();
		System.out.println("Enter The String That You Want To Find");
		String stringFind = scanner.next();
		if(Utility.binarySearchString(Utility.bubbleSortString(sTring),stringFind))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do binary search of String is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		System.out.println("Enter The value That You Want To Find");
		int findNumber = scanner.nextInt();
		if(Utility.binarySearchInt(Utility.bubbleSortInt(iNteger),findNumber))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do binary search of Integers is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		Utility.insertionSortString(sTring);
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do insertion Sort of String is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		Utility.insertionSortInt(iNteger);
		endTime  = System.nanoTime();
		eTime = ((endTime-startTime)*Math.pow(10, -9));
		System.out.println("Time required to do insertion Sort of Integers is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		Utility.bubbleSortString(sTring);
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do bubble Sort of String is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		
		startTime = System.nanoTime();
		Utility.bubbleSortInt(iNteger);
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do bubble Sort Integers is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		sortElapsedTime(elapsedTime,algoArray);
	}
	/*
	 * To arrange elapsedtime of each sorting method
	 * @param elapsedTime[]
	 * @param algoArray[]  
	 */
	public static void sortElapsedTime(double []elapsedTime,String[]algoArray) 
	{
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<elapsedTime.length;i++)
		{
			for(j=0;j<elapsedTime.length;j++)
			{
				if(elapsedTime[i]>elapsedTime[j])
				{
					//elapsed time sorting
					double temp = elapsedTime[i];
					elapsedTime[i] = elapsedTime[j];
					elapsedTime[j] = temp;
					//respective array sorting
					String temp1 = algoArray[i];
					algoArray[i] = algoArray[j];
					algoArray[j] = temp1;
				}
			 
			}
			
		}
		System.out.println("Sorted Array In Ascending Order:");
		for(i=elapsedTime.length-1;i>=0;i--)
		{
			System.out.println(algoArray[i]+" = "+elapsedTime[i]);
		}
		
	}
	 /*
	  * binarySearchString function to read string and find whether the user 
	  * expected word is there in the string or not
	  */
	 public static boolean binarySearchString(String [] city,String key)
	 {
		 int i,j;
			int len = city.length; 
			for(i=0;i<city.length;i++)
			{
				for(j=i+1;j<city.length;j++)
				{
					if(city[i].compareTo(city[j])>0)
					{
						String str;
						str = city[i];
						city[i] = city[j];
						city[j] = str;
					}
				}
			}
			for(i=0;i<len ;i++)
			{
				System.out.print(city[i]+" ");
			}
			System.out.println();
			int mid = len/2,start = 0,end = len-1;
			for(i=0;i<len ;i++)
			{
				int num;
				num=key.compareTo(city[mid]);
				if(num==0)
				{	
					return true;
					
				}
				else if (num<0)
				{
					end = mid--; 
					mid = (start+end)/2;
				}		
				else
				{
					start = mid++;
					mid = (start+end)/2;
				}
			}
			return false; 
		}
			
		/*
		 *function is used to Bubble Sort for Integers
		 */

		public static int[] bubbleSortInt(int[] iNteger) 
		{
			// TODO Auto-generated method stub
			for(int i = 0;i<iNteger.length;i++)
			{
				for(int j = i+1;j<iNteger.length;j++)
				{
					if(iNteger[j]<iNteger[i])
					{
						int temp = iNteger[i];
						iNteger[i] = iNteger[j] ;
						iNteger[j] = temp;
					}
				}
			}
			System.out.println("Sorted Array Of BubbleSort:");
			for(int i = 0;i<iNteger.length;i++)
			{
				System.out.print( iNteger[i]+"   ");
			}
			System.out.println();
			return iNteger;
		}
		
		/*
		 * function is used to Bubble Sort for Strings
		 */
		public static String[] bubbleSortString(String[] sTring) 
		{
			// TODO Auto-generated method stub
			for(int i = 0;i<sTring.length;i++)
			{
				for(int j = i+1;j<sTring.length;j++)
				{
					if(sTring[j].compareTo(sTring[i])<0)
					{
						String temp = sTring[i];
						sTring[i] = sTring[j] ;
						sTring[j] = temp;
					}
				}
			}
			System.out.println("Sorted Array Of BubbleSort:");
			for(int i = 0;i<sTring.length;i++)
			{
				System.out.print( sTring[i]+"   ");
			}
			System.out.println();	
			return sTring;
		}
		/*
		 * function is used to Insertion Sort for Integers
		 */

		public static void insertionSortInt(int[] iNteger) 
		{
			// TODO Auto-generated method stub
			int i,j;
			
			for(j=1;j<iNteger.length;j++)
			{
				i = j-1;  
				while(i>=0)
				{
					if(iNteger[j]<(iNteger[i]))
					{
						int  str;
						str = iNteger[j];
						iNteger[j] = iNteger[i];
						iNteger[i] = str;
					}
					i--;
				}
				
			}
			System.out.println("Sorted Array Of Insertion Sort:");
			for(i = 0;i<iNteger.length;i++)
			{
				System.out.print( iNteger[i]+"   ");
			}
			System.out.println();
		}
		/*function is used to soerting the string using insertion sort
		 * 
		 */
		public static void insertionSortString(String[] string) 
		{
			// TODO Auto-generated method stub
			int i,j;
			for(i = 1;i<string.length;i++) 
			{
				for(j =i;j>0;j--) 
				{
					if(string[j].compareTo(string[j-1])<0) 
					{
						 String temp = string[j];
						 string[j] = string[j-1];
						 string[j-1] = temp;
					}
				}
			}
			
			for(i=0;i<string.length;i++)
				System.out.print(string[i]+" ");
			System.out.println();
		}
		/*function is used to search the binary integer range.
		 * binary Search for Integers
		 */
		public static boolean binarySearchInt(int[] iNteger,int key) 
		{
			// TODO Auto-generated method stub
			
			int i,j;
			
			int mid = iNteger.length/2,start = 0,end = iNteger.length-1;
			for(i=0;i<iNteger.length ;i++)
			{
				if(key==iNteger[mid])
				{
					return true;
					
				}else if(key<iNteger[mid])
				{
					end = mid-1; 
					mid = (start+end)/2;
				}
				else
				{
					start = mid+1;
					mid = (start+end)/2;
				}
			}

			return false;
}
		/**function will check the year is leap or not
		 * @param year
		 * @return
		 */
		public static boolean LeapYear(int year)
		{
			if(year%400 == 0||year%4 == 0 && year%100!=0)
				return true;
			else
				return false;
			
		}
		/**function is defined for display the actual 
		 * date of calander.
		 * @param d
		 * @param m
		 * @param y
		 * @return
		 */
		public static int weekDay(int d,int m,int y)
		{
			int y1=0,x,m1,d1;
			y1 = y - (14 - m) / 12;
			x = y1 + y1/4 -y1/100 + y1/400;
			m1 = m + 12 * ((14 - m) / 12) - 2;
			d1 = (d+ x + 31*m1 / 12) % 7;
			return d1;
			
		}
		/**function is used to diaplay the calander using queue.
		 * @param month
		 * @param year
		 */
		public static void queueCalender(int month, int year)
		{
			// TODO Auto-generated method stub
			int count=0;
			int number =1;
			LinkedListQueue<LinkedListQueue<String>> queue = new LinkedListQueue<LinkedListQueue<String>>();
			for(int i=0;i<6;i++) 
			{
			queue.enqueue(new LinkedListQueue<String>());
			}
			//to return the day where we will start the month
			int day=weekDay(number,month, year);
			//making a Queue to store the days of the week
			queue.getAtPosition(0).enqueue("sun");
			queue.getAtPosition(0).enqueue("mon");
			queue.getAtPosition(0).enqueue("tue");
			queue.getAtPosition(0).enqueue("wed");
			queue.getAtPosition(0).enqueue("thr");
			queue.getAtPosition(0).enqueue("fri");
			queue.getAtPosition(0).enqueue("sat");
			
			//array list for number of days that a month carries
			int []daysOfTheMonths = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			String[] months = {"",                              
			           "January", "February", "March","April", "May", "June","July", "August", "September",
			           "October", "November", "December"
			       		};
			//Setting feb as 29 if the year is leap
			if(LeapYear(year)&& month==2)
				daysOfTheMonths[2]=29;
			
			for(int j = 1; j < 7; j++ ) 
			{
				for(int k =0;k<7;k++) 
				{
					if(count < day) 
					{
						queue.getAtPosition(j).enqueue("   ");
						count++;
					}
					else if(number<=daysOfTheMonths[month]) 
					{
						if(number<10)
							queue.getAtPosition(j).enqueue(" "+Integer.toString(number++)+" ");
						else
						queue.getAtPosition(j).enqueue(Integer.toString(number++)+" ");
					}
				}
		    }
			System.out.println(" "+months[month]+" "+year);
			for(int i=0;i<6;i++) 
			{
				for(int j =0;j<7;j++)
				{
					String date =queue.getAtPosition(i).dequeue();
					if(date==null)
					{
						break;
					}
					System.out.print(" "+date);
				}
				System.out.println();
			}
		}
		 
			/**function is used to store the queue in stack and dispaly 
			 * the calander..
			 * @param month
			 * @param year
			 */
			public static void stackCalender(int month, int year) 
			{
					// TODO Auto-generated method stub
				int count=0;
				int number =1;
				int indexCounter =0;
				int loopCounter =0;
				LinkedListStack<String> stack1=new LinkedListStack<>();
				LinkedListStack<String> stack2 = new LinkedListStack<String>();
				String []weekDays = {"sun","mon","tue","wed","thr","fri","sat"};
				
				//array list for number of days that a month carries
				int []daysMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
						
				//Setting feb as 29 if the year is leap
				if(LeapYear(year) && month==2)
					daysMonth[2]=29;
				
				//to return the day where we will start the month
				int day=weekDay(number,month, year);		
				
				//for(int i = 0; i < 7; i++ ) {
				while(count < day) {
					stack1.push("   ");
				    count++;
				}
				while(number<=daysMonth[month]) 
				{
					if(number<10)
						stack1.push(" "+Integer.toString(number++)+" ");
					else
						stack1.push(Integer.toString(number++)+" ");
				}
				//to make sure that printing array doesnt runs out of loop
				indexCounter =count+(number-1);
				
				//moving elements from one stack to another
				for(int i=stack1.size()-1;i>=0;i--) 
				{
					stack2.push(stack1.pop());
				}
				
				//Displaying the Calander
				//month and year
				System.out.println(" "+daysMonth[month]+" "+year);
				//days of the week
				for (int i = 0; i < weekDays.length; i++) 
				{
					System.out.print(" "+weekDays[i]);
				}
				System.out.println();
				for(int i =0;i<6;i++) 
				{
					for(int j=0;j<7;j++) 
					{
						if(loopCounter==indexCounter)
							break;
						System.out.print(" "+stack2.pop());
						loopCounter++;
					}
					System.out.println();
				}
			}
			/**function is used to print prime numbers using 2D array
			 * @param startOfRange
			 * @param endOfRange
			 */
			public static void print2DArray(int startOfRange, int endOfRange) {
				int start = 0;
				int end = 100;
				ArrayList<ArrayList<Integer>> arraylist = new ArrayList<ArrayList<Integer>>();
				for (int i = 0; i < 10; i++) {
					arraylist.add(new ArrayList<Integer>());
				}
				for (int i = 0; i < 10; i++) {
					for (int j = start; j <= endOfRange; j++) {
						if (checkPrimeNumber(j) && j > start && j <= end)
							arraylist.get(i).add(j);
					}
					start += 100;
					end += 100;
				}
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < arraylist.get(i).size(); j++) {
						System.out.print(arraylist.get(i).get(j) + " ");
					}
					System.out.println();
				}
			}
			/**function is used to check the prime numbers.
			 * @param number
			 * @return
			 */
			public static boolean checkPrimeNumber(int number) {
				boolean isPrime=false;
				int count=0;
				if (number < 2)
				{
					return false;
				} else {
					int temp;
					for (int i = 2; i <= number / 2; i++) {
						temp = number % i;
						if (temp == 0) {
							return false;

						}
					}
					return true;
				}

		}
			/**function is used add number in 2D array
			 * @param size
			 */
			public static void twoDAnagram(int size) {

				int number = size;
				boolean check3, check2, check1;
				@SuppressWarnings("unused")
				int k = 1;
				int temp =100;
				for (int i = 11; i < size; i++)
				{
					for (int j = i + 1; j < number - 1; j++)
					{
						check3 = anagramNum(i, j);
						check1 = primeNum(i);
						check2 = primeNum(j);

						if (check3 && check2 && check1) 
						{

							if(j>temp){
								System.out.println();
								temp = temp+100;
							}
							System.out.print(" " + i + " ");
							System.out.print(" " + j + " ");

						}

					}
				}
				System.out.println();
			}
			/**function is used to check the numbr is prime or not
			 * @param num
			 * @return
			 */
			public static boolean primeNum(int num) {

				if (num < 2)
				{
					return false;
				} else {
					int temp;
					for (int i = 2; i <= num / 2; i++) {
						temp = num % i;
						if (temp == 0) {
							return false;

						}
					}
					return true;
				}

			}

			/**function is used to check the anagram
			 * @param num
			 * @param num1
			 * @return
			 */
			public static boolean anagramNum(int num, int num1) {
				String str1 = "";
				String str2 = "";
				str1 = String.valueOf(num);
				str2 = String.valueOf(num1);
				char[] charFromWord = str1.toCharArray();
				char[] charFromAnagram = str2.toCharArray();
				Arrays.sort(charFromWord);
				Arrays.sort(charFromAnagram);
				return Arrays.equals(charFromWord, charFromAnagram);

			}
			/**function is used to check the the number
			 * inside the queue is anagram or not
			 * @param size
			 */
			public static void twoDAnagramQueue(int size) {
				Queue queue = new Queue();
				int number = size;
				boolean status2, status, status1;
				int k = 1;
				int temp =100;
				for (int i = 11; i < size; i++)
				{
					for (int j = i + 1; j < number - 1; j++)
					{
						status2 = anagramNumQueue(i, j);
						status1 = primeNumQueue(i);
						status = primeNumQueue(j);
						
						if (status2 && status && status1) 
						{
		 

							queue.enqueue(i);

							queue.enqueue(j);
							
						}

					}
				}
				queue.print();
				
			}
			/**function is used to check the prime number from queue
			 * @param num
			 * @return
			 */
			public static boolean primeNumQueue(int num) {
				
				if (num < 2)
				{
					return false;
				} else {
					int temp;
					for (int i = 2; i <= num / 2; i++) {
						temp = num % i;
						if (temp == 0) {
							return false;

						}
					}
					return true;
				}

			}

			/**function is used to check the anagram number from queue
			 * @param num
			 * @param num1
			 * @return
			 */
			public static boolean anagramNumQueue(int num, int num1) {
				String str1 = "";
				String str2 = "";
				str1 = String.valueOf(num);
				str2 = String.valueOf(num1);
				char[] charFromWord = str1.toCharArray();
				char[] charFromAnagram = str2.toCharArray();
				Arrays.sort(charFromWord);
				Arrays.sort(charFromAnagram);
				return Arrays.equals(charFromWord, charFromAnagram);

			}
			/**
			 * @param message-getting string from Expression class to change with expression.
			 * @param strToBeReplace-accept the pattern which is to be changed.
			 * @param replceStr-replace the string with new pattern.
			 * @return-return the message
			 */
			public static String replaceMent(String message,String strToBeReplace,String replceStr) {
				
				Pattern pattern = Pattern.compile(strToBeReplace);
				Matcher matcher = pattern.matcher(message);
				while(matcher.find()) {
					message = matcher.replaceAll(matcher.quoteReplacement(replceStr));
				}
				return message;
			}
			

}

			
			
