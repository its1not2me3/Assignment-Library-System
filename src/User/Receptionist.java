/**
 * Receptionist
 * version 1
 * Josh Prow
 * 25.9.2014
 */
package User;

import java.util.Date;
import java.sql.*;

import LibrarySystem.SQLCommands;



public class Receptionist extends User {
	
	/**
	 * @param uPassword 
	 * @param uUsername 
	 * @param uDOB 
	 * @param uAddress 
	 * @param uEmail 
	 * @param uPhone 
	 * @param uTitle 
	 * @param uLastName 
	 * @param uFirstName 
	 * @param uID 
	 * @return 
	 * 
	 */
	
	 
	public Receptionist(int uID, String uFirstName, String uLastName, String uTitle, String uPhone, String uEmail, String uAddress, Date uDOB, String uUsername, String uPassword) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param first_Name
	 * @param last_Name
	 * @param email
	 * @param phoneNo
	 */
	public Receptionist(String first_Name, String last_Name, String email,
			String phoneNo) {
		super(first_Name, last_Name, email, phoneNo);
		// TODO Auto-generated constructor stub
	}
	
	public void searchCustomer(String input){
		SQLCommands.select("customers","CID, (Name_F + ' ' + name_L) AS Name, Email","(Fname like " + input + " or Lname like" + input);
	}
	
	public void checkCustomerRecords(int CID){
		/* SELECT (Name_F + ' ' + name_L) AS Name, Email, Address, Phone, DOB, Balance FROM customers WHERE CID like input */
	}
	
	public void addACustomer(String input_FirstName,String input_LastName,String input_Address,String input_Email,Date input_DOB,String input_Phone,Double input_Balance){
		SQLCommands.update("customers","USE [Programming Assignment]"
					+ "insert into customers"
					+ "values("
					+ "--------------Automatic ID------------------"
					+ "case"
					+	"when (select Max(CID) from customers)>0"
					+	"then (select Max(CID) from customers)+1"
					+	"else 1000001"
					+ "end,"
					+ "--------------------------------------------"
					+ input_FirstName + ","
					+ input_LastName + ","
					+ input_Address + ","
					+ input_Email + ","
					+ input_DOB + ","
					+ input_Phone + ","
					+ input_Balance );
	}
	
	public void updateCustomerInfo(){
		
		
	}
	
	public void updateBookStatus(){
		
	}
	
	public void deleteCustomer(int cID){
		
	}
	
	public void takeFine(int cID){
		
	}
	
	public void printReciept(){
		
	}

}
