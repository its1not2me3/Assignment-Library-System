package LibrarySystem;
/*
 * @Author: Josiah
 * @Date: 	30/09/2014
 * @Purpose:Test the databaseConnect class, check that insert and pull of data is working 
 * 
 */

public class Test extends DatabaseConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sqlComand = "CREATE TABLE Test(ID int PRIMARY KEY NOT NULL, Name varchar(24) DEFAULT	'')";
		DatabaseConnect connection = new DatabaseConnect();
		connection.command(sqlComand);
		connection.command("INSERT INTO Test(1, 'Josiah')");
		connection.resultSet("SELECT * FROM Test", 24);
	}

}
