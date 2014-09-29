package LibrarySystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DatabaseConnect {
	private String driverLocation = "sun.jdbc.odbc.JdbcOdbcDriver";
	private String connectionAddress = "Library_System_DSN";
	
	public void connect(String insertStatementString) {
		
		
		try {
			// init driver to access the database @driverLocation
			// creates object 'connectDriver' which will generate session with database, and allows for 
			//			commands to be given to database, and responses recieved
			// Library_System_DSN is data source connecting to the database, created in setup ODBC data sources
			
			Class.forName(this.driverLocation);
			Connection connectDriver = DriverManager.getConnection("jdbc:odbc:" + this.connectionAddress);
			Statement insertStatement = connectDriver.createStatement();
			System.out.println("Connection Established!");	
			
			insertStatement.executeUpdate(insertStatementString);
			connectDriver.commit();
			System.out.println("Executed successfully");
			
			connectDriver.close();
			System.out.println("Connection successfully closed!");
			
		} catch (SQLException s){
			System.err.println(s);
		} catch (LinkageError l){
			System.out.println("Could not create link with: "+ connectionAddress);
			System.err.println(l);
		} catch (ClassNotFoundException i){
			System.out.println("Class not found: \n");
			System.err.println(i);
		}

	}
}
