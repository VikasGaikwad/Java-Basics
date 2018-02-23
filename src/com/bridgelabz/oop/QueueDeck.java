package com.bridgelabz.oop;

public class QueueDeck
{
	//variable to check size 
	private int size;

	//linked list Node contains data and next
	private class Node
	{
	} 
	
	//constructor of queue
	public QueueDeck()
	{
		size = 0;
	}
	
	//check for empty condition
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	//inserting data to queue
	public void push(String data)
	{
		new Node();
		if (isEmpty()) 
		{
		}
		else 
		{
		}
		size++;
		System.out.println(data);
	}

}