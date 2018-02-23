package com.bridgelabz.datastructure;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) throws Exception {
		File file = new File(
				"/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/datastructure/hashing.txt");
		@SuppressWarnings("resource")
		BufferedReader buffer = new BufferedReader(new FileReader(file));

		String str = buffer.readLine();
		String[] strArray = str.split(" ");

		Integer[] intArray = new Integer[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i].trim());

		}
		HashMap<Integer, LinkedList<Integer>> hs = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist3 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist4 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist5 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist6 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist7 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist8 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist9 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist10 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist11 = new LinkedList<Integer>();

		for (Integer ele : intArray) {
			int rem = ele % 11;
			switch (rem) {
			case 0:
				linkedlist1.add(ele);
				hs.put(rem, linkedlist1);
				break;

			case 1:
				linkedlist2.add(ele);
				hs.put(rem, linkedlist2);
				break;
			case 2:
				linkedlist3.add(ele);
				hs.put(rem, linkedlist3);
				break;
			case 3:
				linkedlist4.add(ele);
				hs.put(rem, linkedlist4);
				break;
			case 4:
				linkedlist5.add(ele);
				hs.put(rem, linkedlist5);
				break;
			case 5:
				linkedlist6.add(ele);
				hs.put(rem, linkedlist6);
				break;
			case 6:
				linkedlist7.add(ele);
				hs.put(rem, linkedlist7);
				break;
			case 7:
				linkedlist8.add(ele);
				hs.put(rem, linkedlist8);
				break;
			case 8:
				linkedlist9.add(ele);
				hs.put(rem, linkedlist9);
				break;
			case 9:
				linkedlist10.add(ele);
				hs.put(rem, linkedlist10);
				break;
			case 10:
				linkedlist11.add(ele);
				hs.put(rem, linkedlist11);
				break;
			}
		}
		System.out.println(hs);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to search....");
		int search = scanner.nextInt();
		int remainder = search % 11;
		;
		String strNum = "";
		switch (remainder) {

		case 0:
			linkedlist1 = serachMethod(linkedlist1, search, 0);
			hs.put(remainder, linkedlist1);

			break;

		case 1:
			linkedlist2 = serachMethod(linkedlist2, search, 0);
			hs.put(remainder, linkedlist2);

			break;
		case 2:
			linkedlist3 = serachMethod(linkedlist3, search, 0);
			hs.put(remainder, linkedlist3);

			break;
		case 3:
			linkedlist4 = serachMethod(linkedlist4, search, 0);
			hs.put(remainder, linkedlist4);
			break;
		case 4:
			linkedlist5 = serachMethod(linkedlist5, search, 0);
			hs.put(remainder, linkedlist5);

			break;
		case 5:
			linkedlist6 = serachMethod(linkedlist6, search, 0);
			hs.put(remainder, linkedlist6);
			break;
		case 6:
			linkedlist7 = serachMethod(linkedlist7, search, 0);
			hs.put(remainder, linkedlist7);
			break;
		case 7:
			linkedlist8 = serachMethod(linkedlist8, search, 0);
			hs.put(remainder, linkedlist8);
			break;
		case 8:
			linkedlist9 = serachMethod(linkedlist9, search, 0);
			hs.put(remainder, linkedlist9);
			break;
		case 9:
			linkedlist10 = serachMethod(linkedlist10, search, 0);
			hs.put(remainder, linkedlist10);
			break;
		case 10:
			linkedlist11 = serachMethod(linkedlist11, search, 0);
			hs.put(remainder, linkedlist11);
			break;
		}
		strNum = linkedlist1 + " " + linkedlist2 + " " + linkedlist3 + " " + linkedlist4 + " " + linkedlist5 + " "
				+ linkedlist6 + " " + linkedlist7 + " " + linkedlist8 + " " + linkedlist9 + " " + linkedlist10 + " "
				+ linkedlist11;

		strNum = strNum.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", "").replaceAll("( )+", " ");
		;
		FileWriter fileWriter = new FileWriter(
				"/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/datastructure/hashing.txt");
		fileWriter.write(strNum);
		fileWriter.flush();
		fileWriter.close();
		System.out.println(hs);
		scanner.close();
	}

	public static LinkedList<Integer> serachMethod(LinkedList<Integer> linkedList, int search, int k) {
		Iterator<Integer> iterator = linkedList.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			if (iterator.next().equals(search)) {
				linkedList.remove(k);
				found = true;
			}
			k++;
		}
		if (found == false)
			linkedList.add(search);
		return linkedList;

	}

}
