package com.bridgelabz.designpatternprogram;
/*
 * In this, object of class is created when it is loaded to the memory by JVM.
 *  It is done by assigning the reference an instance directly.
 * */
public class EagerInitialization {

	private static final EagerInitialization instance = new EagerInitialization();


	private EagerInitialization(){
		System.out.println("Eager initialization");
	}

	public static EagerInitialization getInstance(){

		return instance;
	}
	public static void main(String[] args) {
		getInstance();
	}
}
