package com.bridgelabz.designpatternprogram;
/*
 * object is created at the time of class loading.
 * It can be used when there is a chance of exceptions 
 * in creating object with eager initialization.
 * */
public class StaticBlockInitialization {

	private static StaticBlockInitialization instance;

	private StaticBlockInitialization(){
		System.out.println("Static Block Initialization success");

	}


	static{
		try{
			instance = new StaticBlockInitialization();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockInitialization getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		getInstance();
	}
}