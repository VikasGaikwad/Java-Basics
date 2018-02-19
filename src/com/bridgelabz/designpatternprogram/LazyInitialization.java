package com.bridgelabz.designpatternprogram;

public class LazyInitialization {

    private static LazyInitialization instance;
    
    private LazyInitialization(){
    	System.out.println("lazy");
    }
    
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
    public static void main(String[] args) {
    	getInstance();
	}
}
