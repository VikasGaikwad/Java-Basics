package com.bridgelabz.utility;

import java.util.Scanner;

public class StockUtility {

static Scanner scanner;
public StockUtility() {
scanner = new Scanner(System.in);
}
public static String getString(){
return scanner.next();
}
public static int getInt(){
return scanner.nextInt();
}
public static double getDouble(){
return scanner.nextDouble();
}
public static boolean getBoolean(){
return scanner.nextBoolean();
}

}
