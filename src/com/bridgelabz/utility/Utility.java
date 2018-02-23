
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



/**purpose: This class is used to define the all functions.
 * @author bridgeit
 * @since:19 sep 2018
 */
public class Utility {

	static Scanner scanner=new Scanner(System.in);
	public static int scannerInt(int x) {		
		int number=scanner.nextInt();
		return number;
	}
	public static String scannerString(String stringFind) {
		String string=scanner.next();
		return string;
	}		
	/**
	 * @return the starting time.
	 */
	public static long startTime() {
		long a = System.nanoTime();
		elapsedTime(a, a);
		return a;
	}

	/**
	 * @return the end time
	 */
	public static long endTime() {
		long b = System.nanoTime();
		elapsedTime(b, b);
		return b;
	}

	/**
	 * @param a- start time
	 * @param b- end time
	 * @return-returns the elapsed time.
	 */
	public static long elapsedTime(long a, long b) {
		long elapsedTime = b - a;
		System.out.println("Time require to call method in millis: " + (elapsedTime / 1000) / 60);
		return elapsedTime;

	}

	/**
	 * @param str1-old string
	 * @param str2-new string
	 */
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
	 * @param value-integer value
	 * @return power-power of integer value.
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
	 * @param stake-initial value of money
	 * @param goal-target value of money
	 * @param trial- total trial to play the game.
	 */
	public static void gambler(int stake, int goal, int trial) {
		int win = 0;		
		int lose = 0;
		for (int i = 0; i < trial; i++) {
			int cash = stake;

			while ((cash > 0) && (cash < goal)) {
				
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
	 * @param arrayElements-size of array elements
	 * @param rows-size of rows
	 * @param columns-size of columns
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
	 * @param arr-total size of array elements.
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
	 * Function to check the distance from origin .
	 * 
	 * @param X-x origin
	 * @param Y-y origin
	 */
	public static void distance(int X, int Y) {
		double ans = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
		System.out.println("Distance  is : " + ans);
	}

	/**
	 * function to calculate the Quadratic value.
	 * 
	 * @param a-value a
	 * @param b-value b
	 * @param c-value c
	 */
	public static void quadratic(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		System.out.println(delta);
		double X1 = (-b + Math.sqrt(delta) / (2 * a));
		double X2 = (-b - Math.sqrt(delta) / (2 * a));		
		System.out.println("Root 1 of X :" + X1);
		System.out.println("Root 2 of X :" + X2);

	}

	/**
	 * To fix the first position element and pass remaining string to the same
	 * function
	 * 
	 * @param l-left value
	 * @param r-right value
	 */
	public void permute(String str, int left, int right) {
		if (left == right) {
			System.out.println("left==right :");
			System.out.println(str);
		} else {
			for (int i = left; i <= right; i++) {
				System.out.println("Before swap :" + str);
				str = swap(str, left, i);
				System.out.println("After swap :" + str);
				permute(str, left + 1, right);

			}
		}
	}

	/**
	 * @param To interchanging the position of i and j
	 * @param i
	 * @param j
	 * @return
	 */
	public String swap(String string, int i, int j) {
		char temp;
		char[] charArray = string.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * Function for Comparing characters of two String.
	 * @param string1-user input string
	 * @param string2-user input string
	 * Disc- replaceAll() is used to remove all the white spaces.
	 * 		toCharArray() is used to convert the string into character array.
	 * 		sort()-used to sort the characters in ascending order.
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
	 * @param number-to check weather the number is prime or not.
	 * @return- it returns the prime number.
	 */
	public static String isPrimeNumber(int number) {
		String primeNumber = "";
		for (int i = 1; i <= number; i++) {
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


	/**Function defines the number is Palindrome or not.
	 * @param palindromeString-user input number.
	 */
	public static void palindrom(String[] palindromeString) {
		int[] numbers = new int[palindromeString.length];
		for (int i = 0; i < palindromeString.length; i++) {
			numbers[i] = Integer.parseInt(palindromeString[i]);
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
	 * @param T-temperature
	 * @param V-value
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
	 * @param num-binary number
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
		System.out.println("Enter a num for range");
		int N = (int) Math.pow(2, scanner.nextInt());
		int range = N - 1;
		System.out.println("Think num between " + 0 + " to " + range);
		int low = 0;
		int high = range;
		int mid = (low + high) / 2;
		while (low != mid) {

			System.out.println("Is your num present in " + low + " To " + mid + " Enter True or False");
			boolean flag = scanner.nextBoolean();
			if (flag == true) {

				high = mid;
				mid = (low + high) / 2;
			} else if (flag == false) {

				low = mid;
				mid = (low + high) / 2;
			}
		}
		System.out.println("Which one is our num " + low + " or " + high);
		int ans = scanner.nextInt();
		System.out.println("Your Num is " + ans);
	}

	/**
	 * Function is used to convert integer to Binary
	 * 
	 * @param integer-user input integer number.
	 */
	public static void intToBinary(int integer) {
		String as = Integer.toBinaryString(integer);
		System.out.println("\n Binary value of " + integer + " : " + Integer.toBinaryString(integer));
		nibbleCounting(as);
	}

	/**Function is defined for conversion of Binary to integer
	 * @param binaryNumber-user input binary number.
	 */
	public static void binaryToInt(String binaryNumber) {
		int x = Integer.parseInt(binaryNumber, 2);
		System.out.println("\n Binary to decimal : " + Integer.parseInt(binaryNumber, 2));
		if (resultantPowerOfTwo(x))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	/**
	 * Function is used to sorting the integer array using merge sort.
	 * 
	 * @param number-integer number which we want to find
	 * @param low-starting index of array
	 * @param high-end index of array
	 */
	public static void sort(int[] number, int low, int high)

	{

		int N = high - low;

		if (N <= 1)

			return;

		int mid = low + N / 2;

		// recursively sort

		sort(number, low, mid);

		sort(number, mid, high);

		// merge two sorted subarrays

		int[] temp = new int[N];

		int i = low, j = mid;

		for (int k = 0; k < N; k++)

		{

			if (i == mid)

				temp[k] = number[j++];

			else if (j == high)

				temp[k] = number[i++];

			else if (number[j] < number[i])

				temp[k] = number[j++];

			else

				temp[k] = number[i++];

		}

		for (int k = 0; k < N; k++)

			number[low + k] = temp[k];

	}

	/**
	 * Function is defined to swap the nibble of Binary stream.
	 * 
	 * @param string-user input string which having binary values
	 */
	public static void nibbleCounting(String string) {	
		while (string.length() != 8) {
			string = 0 + string;
		}
		int j = 4;
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length / 2; i++) {
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j++;
		}
		System.out.println("\n after swapping nibble : ");
		System.out.println(array);
		String array3 = String.valueOf(array);
		binaryToInt(array3);

	}

	/**
	 * Function is defined to check the int number is resultant power of two or not.
	 * 
	 * @param number-user input integer number.
	 * @return-returns the resultant power of two.
	 */
	public static boolean resultantPowerOfTwo(int number) {
		if (number == 0)
			return false;

		while (number != 1) {
			if (number % 2 != 0)
				return false;
			number = number / 2;
		}
		if (number % 2 != 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		return true;

	}

	/**function reads the file from system.
	 * @param file-path/location of file.
	 */
	public static void readFile(File file) {
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String  words=bufferedReader.readLine();
			fileDataList(words);
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**function used to writing data to the file.
	 * @param linkedlist-LinkedList class's object.
	 */
	public static void writeFile(LinkedList<String> linkedlist) {
		try {
			FileWriter fileWriter=new FileWriter("/home/bridgeit/Documents/Programs/Java Basics/src/Unoredered.txt");
			for(int i=0;i<linkedlist.size();i++) {
				String addWord=linkedlist.get(i)+" ";
				fileWriter.write(addWord);
				fileWriter.flush();
				fileWriter.close();

			}


		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/**function used to read the data from file.
	 * @param string-user input string.
	 */
	public static void fileDataList(String string) {
		String [] word=string.split(" ");
		for(String element:word) {
			System.out.println(element);
		}
		LinkedList<String> linkedlist=new LinkedList<String>();
		for(int i=0;i<word.length;i++)
		{
			linkedlist.add(word[i]);


		}
		System.out.println(linkedlist);
		searchFromFile(linkedlist);
	}
	/**function used to search the integer value from file.
	 * @param linkedlist-object of LinkedList Class.
	 */	
	public static void searchFromFile(LinkedList<String> linkedlist) {
	
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
	/**function used to read values from file.
	 * @param file-location of file.
	 */
	public static void readFromFile(File file) {
		try {

			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String  words=bufferedReader.readLine();

			filesDataList(words);
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**function used to read data from file.
	 * @param string-user input string.
	 */
	public static void filesDataList(String string) {
		String [] word=string.split(" ");
		Arrays.sort(word);
		for(String element:word) {
			System.out.println(element);
		}
		LinkedList<String> linkedlist=new LinkedList<String>();
		for(int i=0;i<word.length;i++)
		{
			linkedlist.add(word[i]);


		}
		System.out.println(linkedlist);
		searchingFromFile(linkedlist);
	}
	/**function used to search the int from file.
	 * @param linkedlist
	 */

	public static void searchingFromFile(LinkedList<String> linkedlist) {
		
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
	 * @param linkedlist-object of LinkedList class.
	 */
	public static void writeToFile(LinkedList<String> linkedlist) {
		try {
			FileWriter fileWriter=new FileWriter("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/datastructure/int.txt");
			for(int i=0;i<linkedlist.size();i++) {
				String addWord=linkedlist.get(i)+" ";
				fileWriter.write(addWord);

				fileWriter.flush();
				fileWriter.close();

			}


		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/**function is used to check parenthesis.
	 * @param expression-user input mathematical expression.
	 * @param stack-putting open parenthesis in stack.
	 */
	public static void balanceParanthesis(String expression, Stack<Integer> stack)
	{
		int length = expression.length();

		System.out.println("\nMatches and Mismatches:\n");
		for (int i = 0; i < length; i++) 
		{
			char ch = expression.charAt(i);
			if (ch == '(')
				stack.push(i);

			else if (ch == ')') 
			{
				try {					
					System.out.println("parenthes is matched");
				} catch (Exception e) 
				{
					System.out.println("Parenthes is un mached");
				}
			}
		}
		while (!stack.isEmpty()) {
			System.out.println((stack.pop()) + " is un matched");
		}
	}
	/*
	 * This Function calls All Sorting algorithm
	 * @param string[]
	 * @param int []
	 */
	public static void callAlgos(String[] sTring, int[] iNteger) 
	{		
		
		String [] algoArray = {"binarySearchString","binarySearchInt","insertionSortString","insertionSortInt","bubbleSortString","bubbleSortInt"};
		double elapsedTime[] = new double[algoArray.length];
		double startTime,endTime,eTime=0;
		int k=0;
		startTime = System.nanoTime();
		System.out.println("Enter The String That You Want To Find");
		String stringFind = null ;
		scannerString(stringFind);
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
		int findNumber = 0;
		scannerInt(findNumber);
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
	 * @param elapsedTime[]-total time of execution of method.
	 * @param algoArray[]-array with its parameter.
	 */
	public static void sortElapsedTime(double []elapsedTime,String[]algoArray) 
	{
	
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

	/** binarySearchString function to read string and find whether the user 
	 * expected word is there in the string or not
	 * @param string-user input string value.
	 * @param key-its a word which is to be find from string.
	 * @return-returns true if found, else false. 
	 */
	public static boolean binarySearchString(String [] string,String key)
	{
		int i,j;
		int len = string.length; 
		for(i=0;i<string.length;i++)
		{
			for(j=i+1;j<string.length;j++)
			{
				if(string[i].compareTo(string[j])>0)
				{
					String str;
					str = string[i];
					string[i] = string[j];
					string[j] = str;
				}
			}
		}
		for(i=0;i<len ;i++)
		{
			System.out.print(string[i]+" ");
		}
		System.out.println();
		int mid = len/2,start = 0,end = len-1;
		for(i=0;i<len ;i++)
		{
			int num;
			num=key.compareTo(string[mid]);
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



	/**function is used to sorting numbers using Bubble Sort.
	 * @param iNteger-user input integer numbers.
	 * @return-sorted numbers in ascending order.
	 */
	public static int[] bubbleSortInt(int[] intNumber) 
	{
		for(int i = 0;i<intNumber.length;i++)
		{
			for(int j = i+1;j<intNumber.length;j++)
			{
				if(intNumber[j]<intNumber[i])
				{
					int temp = intNumber[i];
					intNumber[i] = intNumber[j] ;
					intNumber[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array Of BubbleSort:");
		for(int i = 0;i<intNumber.length;i++)
		{
			System.out.print( intNumber[i]+"   ");
		}
		System.out.println();
		return intNumber;
	}


	/**function is used to Bubble Sort for Strings
	 * @param string-user input string
	 * @return-returns sorted string in ascending order.
	 */
	public static String[] bubbleSortString(String[] string) 
	{
		for(int i = 0;i<string.length;i++)
		{
			for(int j = i+1;j<string.length;j++)
			{
				if(string[j].compareTo(string[i])<0)
				{
					String temp = string[i];
					string[i] = string[j] ;
					string[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array Of BubbleSort:");
		for(int i = 0;i<string.length;i++)
		{
			System.out.print( string[i]+"   ");
		}
		System.out.println();	
		return string;
	}

	/**function is used to Insertion Sort for Integers
	 * @param numbers-user input numbers.
	 */
	public static void insertionSortInt(int[] numbers) 	{
		int i,j;

		for(j=1;j<numbers.length;j++)
		{
			i = j-1;  
			while(i>=0)
			{
				if(numbers[j]<(numbers[i]))
				{
					int  str;
					str = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = str;
				}
				i--;
			}

		}
		System.out.println("Sorted Array Of Insertion Sort:");
		for(i = 0;i<numbers.length;i++)
		{
			System.out.print( numbers[i]+"   ");
		}
		System.out.println();
	}

	/**function is used to sorting the string using insertion sort
	 * @param string-user input string .
	 */
	public static void insertionSortString(String[] string) 
	{		
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

	/**function is used to search the binary number by given key.
	 * @param numbers-user input binary numbers.
	 * @param key-key number which is to be found.
	 * @return-if found return true,else return false.
	 */
	public static boolean binarySearchInt(int[] numbers,int key) 
	{
		int i;

		int mid = numbers.length/2,start = 0,end = numbers.length-1;
		for(i=0;i<numbers.length ;i++)
		{
			if(key==numbers[mid])
			{
				return true;

			}else if(key<numbers[mid])
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
	 * @param year in integer format
	 * @return- return true if year is leap , else return false.
	 */
	public static boolean LeapYear(int year)
	{
		if(year%400 == 0||year%4 == 0 && year%100!=0)
			return true;
		else
			return false;

	}

	/**function is defined for display the actual date of calendar.
	 * @param date-integer value date
	 * @param month-integer value month
	 * @param year-integer value year.
	 * @return date.
	 */
	public static int weekDay(int date,int month,int year)
	{
		int y1=0,x,m1,d1;
		y1 = year - (14 - month) / 12;
		x = y1 + y1/4 -y1/100 + y1/400;
		m1 = month + 12 * ((14 - month) / 12) - 2;
		d1 = (date+ x + 31*m1 / 12) % 7;
		return d1;

	}
	/**function is used to display the calendar using queue.
	 * @param month-user input month in integer.
	 * @param year-user input year in integer.
	 */
	public static void queueCalender(int month, int year)
	{
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

	/**function is used to store the queue in stack and display 
	 * the calendar..
	 * @param month-user input integer value month
	 * @param year-user input integer value year
	 */
	public static void stackCalender(int month, int year) 
	{	
		int count=0;
		int number =1;
		int indexCounter =0;
		int loopCounter =0;
		LinkedListStack<String> stack1=new LinkedListStack<>();
		LinkedListStack<String> stack2 = new LinkedListStack<String>();
		String []weekDays = {"sun","mon","tue","wed","thr","fri","sat"};	
		int []daysMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};		
		if(LeapYear(year) && month==2)
			daysMonth[2]=29;	
		int day=weekDay(number,month, year);		
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
		indexCounter =count+(number-1);

		for(int i=stack1.size()-1;i>=0;i--) 
		{
			stack2.push(stack1.pop());
		}

		System.out.println(" "+daysMonth[month]+" "+year);

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
	 * @param startOfRange-user input to get minimum value range.
	 * @param endOfRange-user input to get maximum value range.
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
	 * @param number-user input integer number.
	 * @return-return true if number is prime, else return false.
	 */
	public static boolean checkPrimeNumber(int number) {	
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
	 * @param size-size if array in integer
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
	/**function is used to check the number is prime or not
	 * @param num-user input integer number
	 * @return-return true if number is prime, else return false.
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

	/**function is used to check the entered two numbers are anagram or not.
	 * @param number1-user enter integer number.
	 * @param num1-user entered integer number.
	 * @return-return true if number is prime, else return false.
	 */
	public static boolean anagramNum(int number1, int number2) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(number1);
		str2 = String.valueOf(number2);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}
	/**function is used to check the the number
	 * inside the queue is anagram or not
	 * @param size-size of queue.
	 */
	public static void twoDAnagramQueue(int size) {
		Queue queue = new Queue();
		int number = size;
		boolean status2, status, status1;		
		for (int i = 11; i < size; i++)
		{
			for (int j = i + 1; j < number - 1; j++)
			{
				status2 = anagramNum(i, j);
				status1 = primeNum(i);
				status = primeNum(j);

				if (status2 && status && status1) 
				{
					queue.enqueue(i);

					queue.enqueue(j);

				}

			}
		}
		queue.print();

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
			message = matcher.replaceAll(Matcher.quoteReplacement(replceStr));
		}
		return message;
	}


}



