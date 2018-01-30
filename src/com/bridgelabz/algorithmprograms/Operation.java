package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Operation {
	public static int binarySearch(int arr[], int key) {
		Scanner sc = new Scanner(System.in);

		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] < key) {

				first = middle + 1;
				// System.out.println(first);
			}

			else if (arr[middle] == key) {
				return middle;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last)
			return -1;
		return middle;

	}
	public static void binarySearchString(String []str,String key) {
		int low=0;
		int high=str.length-1;
		int mid=0;

		while(low<=high) {	
			mid=(low+high)/2;
			if(key.compareTo(str[mid])==0) {
				System.out.println(mid);
				System.out.println();
			}
			else if(key.compareTo(str[mid])<0) {
				high=mid;
				System.out.println(mid);
				System.out.println();
			}
			else if(key.compareTo(str[mid])>0)
			{
				low=mid+1;
				System.out.println(mid);
				System.out.println();
			}
			break;
		}



	}
	public static void insertionSortInteger(int[] arr) {
		int n = arr.length;
		for (int j = 1; j < n; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i > -1 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
			// System.out.print(arr[i]);
			for (int d : arr) {
				System.out.print(d + " , ");
			}
			System.out.println();

		}
	}
	public static void insertionSortString(char[] arr, String str) {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			arr[i] = str.charAt(i);
		}
		for (int j = 1; j < length; j++) {
			char key = arr[j];
			int i = j - 1;

			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}

			arr[i + 1] = key;
		}
		System.out.println();
		System.out.println("\nafter sorting string : ");
		for (int k = 0; k < length; k++) {
			System.out.print(" " + arr[k]);
			System.out.println();
		}
	}
	public static void bubbleSortInteger(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		System.out.println();
		System.out.println("\n\nafter sorting the array : ");
		for (int c : arr) {
			System.out.println();
			System.out.print(c + "  ");
			System.out.println();
		}

	}
	public static void bubbleSortString(String[] arr, int size) {

		// int size=arr.length;
		String temp;

		for (int x = 1; x < size; x++) {
			for (int y = 0; y < size - x; y++) {
				if (arr[y].compareTo(arr[y + 1]) > 0) {
					temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;

				}
			}
		}
		System.out.println("The sorted strings are ");
		for (int i = 0; i < size; i++) {
			System.out.println();
			System.out.print(arr[i] + "  ");
		}
	}


}
