package com.bridgelabz.designpatternprogram;
/*
 * A thread safe singleton in created so that singleton property is maintained
 *  even in multithreaded environment. 
 * */

public class ThreadSafeSingleton 
{
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() 
	{

	}

	synchronized public static ThreadSafeSingleton getInstance() 
	{
		if (instance == null) 
		{

			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}