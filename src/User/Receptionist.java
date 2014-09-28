/**
 * Receptionist
 * version 1
 * Josh Prow
 * 25.9.2014
 */
package User;

import java.util.Date;


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
		/* SELECT CID, (Name_F + ' ' + name_L) AS Name, Email FROM customers WHERE Fname like input */
		/* SELECT CID, (Name_F + ' ' + name_L) AS Name, Email FROM customers WHERE Lname like input */
		/*test*/
	}
	
	public void checkCustomerRecords(int CID){
		/* SELECT (Name_F + ' ' + name_L) AS Name, Email, Address, Phone, DOB, Balance FROM customers WHERE CID like input */
	}
	
	public void addACustomer(String input_FirstName,String input_LastName,String input_Address,String input_Email,Date input_DOB,String input_Phone,Double input_Balance){
		/* use [Programming Assignment]
		insert into customers
		values(
		--------------Automatic ID------------------
		case
			when (select Max(CID) from customers)>0
			then (select Max(CID) from customers)+1
			else 1000001
		end,
		--------------------------------------------
		input_FirstName,
		input_LastName,
		input_Address,
		input_Email,
		input_DOB,
		input_Phone,
		input_Balance */
		
		
		try{
			//init driver to access the database:
			//creates new statement object that is run as an SQL query:
			//creates object Statement 'connectDriver' which will generate session with database, and allows for commands to be given to database, and responses recieved
			//login_DSN is data source connecting to the database, created in setup ODBC data sources  
			//insert statement. Can use normal SQL queries withing quotes in executeUpdate("SQL statment");
			//the false true for staff, admin or true = 1, receptionist is false = 0
			//commit runs all previous lines as one block, not runs one line then the next
			
			//Sets up connection with database
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection connectDriver = DriverManager.getConnection("jdbc:odbc:Archive_DSN");
			Statement insertStatement = connectDriver.createStatement();
			
			//SQL querys:
			
			
				
			
			insertStatement.executeUpdate("INSERT INTO Customer ('" + inputID + "', '" 
					+ input_FirstName + "', '"
					+ input_LastName + "', '"
					+ input_Address + "', '"
					+ input_Email + "', '"
					+ input_DOB + "', '"
					+ input_Phone + "', '"
					+ input_Balance + "', '"
					+ input_Password + "');");
			
			
			connectDriver.commit();
			
		}catch(Exception e){
			System.err.println(e);
		}
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
