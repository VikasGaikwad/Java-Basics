package com.bridgelabz.functionalprograms;

/**class for  measuring the time that elapses between the start and end clicks.
 * @author bridgeit
 * @since 20 jan 2018
 *
 */
public class StopWatch {
	public static void main(String []args) 
	{
		
					
		long Starttime = System.nanoTime();
		
		for(int i=0;i<1000000;i++) 
		{			
			Object obj = new Object();
		}
		
		long Endtime = System.nanoTime();
		long elapsedTime = Endtime - Starttime; 	
		System.out.println("Time require to create All obj in millis: "+elapsedTime);
		System.out.println("Time require to create each obj in millis: "+elapsedTime/1000000);		  
	    
	}
}


