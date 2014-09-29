/**
 * 
 */
package LibrarySystem;

import java.sql.*;

/**
 * @author Josh
 *
 */
public class SQLCommands {
	public static String[] SQL(String statement){
		try{
		//init driver to access the database:
		//creates new statement object that is run as an SQL query:
		//creates object Statement 'connectDriver' which will generate session with database, and allows for commands to be given to database, and responses recieved
		//Library_System_DSN is data source connecting to the database, created in setup ODBC data sources  
		//insert statement. Can use normal SQL queries withing quotes in executeUpdate("SQL statment");
		//the false true for staff, admin or true = 1, receptionist is false = 0
		//commit runs all previous lines as one block, not runs one line then the next
		
		//Sets up connection with database
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection connectDriver = DriverManager.getConnection("jdbc:odbc:Library_System_DSN");
		Statement insertStatement = connectDriver.createStatement();
		//SQL querys:
		insertStatement.executeUpdate(statement);
		connectDriver.commit();
	}catch(Exception e){
		System.err.println(e);
	}
		return null/*NEED TO UNDERSTAND JDBC*/;
}

	public static void update(String table, String values){
		SQL("USE [Programming Assignment]"
					+ "insert into " + table
					+ "values(" + values);
	}
	
	public static String[] select (String table, String columns, String where){
		return SQL("USE [Programming Assignment]"
				+ "SELECT " + columns
				+ "FROM " + table
				+ "WHERE " + where);
	}
	
}