package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.utility.Utility;

/**
 * Purpose: this program for reading in 2D arrays of 
 * integers, doubles, or booleans from standard input
 * and printing them out
 * to standard output.
 * @author bridgeit
 * @since 24 jan 2018
 */
public class Array2D {
	public static void main(String[] args) {
		Utility utility=new Utility();

		int rows = 0, columns = 0, choice;

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice.....");
			System.out.println("1.Integer");
			System.out.println("2.Double");
			System.out.println("3.Boolean");
			choice = scanner.nextInt();

			if (choice >= 1 && choice <= 3) {
				System.out.println("Enter the Rows....");
				rows = scanner.nextInt();
				System.out.println("Enter the Columns....");

				columns = scanner.nextInt();
			}

			Integer[][] integer = new Integer[rows][columns];
			Double[][] doubles = new Double[rows][columns];
			Boolean[][] booleans = new Boolean[rows][columns];

			switch (choice) {
			case 1:
				System.out.println("Enter The Integer Elements.....");
				for (int i = 0; i < rows; i++)
					for (int j = 0; j < columns; j++)
						integer[i][j] = scanner.nextInt();
				utility.print2DArray(integer, rows, columns);
				break;

			case 2:
				System.out.println("Enter The Double Elements.....");
				for (int i = 0; i < rows; i++)
					for (int j = 0; j < columns; j++)
						doubles[i][j] = scanner.nextDouble();
				utility.print2DArray(doubles, rows, columns);
				break;

			case 3:
				System.out.println("Enter The Double Elements.....");
				for (int i = 0; i < rows; i++)
					for (int j = 0; j < columns; j++)
						booleans[i][j] = scanner.nextBoolean();
				utility.print2DArray(booleans, rows, columns);
				break;
			}

		} while (choice != 0);
		scanner.close();
	}

	

	/*public static <T> void print2DArray(T[][] arrayElements, int rows, int columns) {
		PrintWriter writer = new PrintWriter(System.out);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				writer.print(arrayElements[i][j] + " ");
				writer.flush();
			}
			System.out.println();
		}

	}*/
}
