package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class OrderedList {
	public static void orderedList(ArrayList<Integer> list, File file) throws IOException {

		Scanner scanner = new Scanner (System.in);
		Iterator iterator = list.iterator(); 
		System.out.println("Enter the element to find");
		int search = scanner.nextInt();
		while(iterator.hasNext())
		{
			if(list.contains(search))
			{
				list.remove(list.indexOf(search));
				break;
			}
			else
			{
				list.add(search);
				list.sort(null);
			
				break;
			}
		}
		String str ="";
		Iterator iterator2 = list.iterator();
		while(iterator2.hasNext())
		{
			str+= iterator2.next()+" ";
		}
		FileWriter fw = new FileWriter(file);
		fw.write(str);
		fw.flush(); 
		System.out.println(str);


}

	public static void main(String[] args) throws IOException {
		
		//Utility utility=new Utility();
		File file = new File("/home/bridgeit/Documents/Programs/Java Basics/src/com/bridgelabz/datastructure/int.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String s;
		String arr[]=null;
		while((s=bufferedReader.readLine())!=null)
		{
			arr  = s.split(" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			list.add(Integer.parseInt(arr[i]));
		}
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		orderedList(list,file);
		bufferedReader.close();
	}
}