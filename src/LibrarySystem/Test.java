package LibrarySystem;
/*
 * @Author: Josiah
 * @Date: 	30/09/2014
 * @Purpose:Test the databaseConnect class, check that insert and pull of data is working 
 * 
 */

public class Test extends SQLCommands {
	static String database = "Test";
	static String values = "'1', Name";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SQLCommands.insert(database, values);
			System.out.println("Insert Successful");
			
			SQLCommands.select(database,"*", "ID = 1");
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
