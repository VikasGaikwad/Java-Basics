package com.bridgelabz.oop;

/**purpose:Regular Expression Demonstration program.
 * @since: 14-feb-2018

 * @author bridgeit
 *
 */
public class Expression {
	private String fullName;
	private String name;
	private String phoneNumber;

	/**method is used to define full name
	 * @param fullName
	 */
	
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	
	/**method is used to define full name
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**function is used to set the phone number.
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	/**function is used to get the phone number.
	 * @return
	 */
	public String getfullName(){
		return this.fullName;
	}
	
	/**
	 * @return
	 */
	public String getName(){
		return this.name;
	}
	
	/**function is used to get the phone number.
	 * @return
	 */
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
}
