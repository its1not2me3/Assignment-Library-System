/**
 * 
 */
package LibrarySystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Josh
 *
 */
public class SQLCommands {
	public static String[][] SQL(String sql, String[] columns){
		try{
			Connection newConn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Programming Assignment;integratedSecurity=true");
			Statement newStmt = newConn.createStatement();
		//SQL queries:
			if (newStmt.execute(sql)){
				ResultSet newRs = newStmt.executeQuery(sql);
				int resultNum = 0;
				String[][] results = new String[columns.length][];
				while(newRs.next()){
					List<String> columnList = new ArrayList<String>();
					for(String name : columns){
						columnList.add(newRs.getString(name));
					}
					String[] columnArray = new String[columnList.size()];
					columnList.toArray(columnArray);
					results[resultNum] = columnArray;
					}
				return results;
			}else{
				System.out.println("success");
				return null;
			}
		}catch(Exception e){
		System.err.println(e);
		return null;
	}
}

	public static void insert(String table, String values){
		SQL("USE [Programming Assignment]"
					+ "insert into " + table
					+ "values(" + values + ")",
					null);
	}
	
	public static void Delete(String table, String values){
		SQL("USE [Programming Assignment]"
					+ "insert into " + table
					+ "values(" + values + ")",
					null);
	}
	
//<<<<<<< HEAD
//	public static String[] select(String table, String columns, String where){
//=======
	public static String[][] select (String table, String[] columns, String where){
		String SQLcolumns = null;
		for(String name : columns){
			if(SQLcolumns.length()>0){
				SQLcolumns = SQLcolumns + ", " + name;
			}else{
				SQLcolumns = name;
			}
        }
//>>>>>>> origin/master
		return SQL("USE [Programming Assignment]"
				+ "SELECT " + SQLcolumns
				+ "FROM " + table
				+ "WHERE " + where,
				columns);
		
	}

		
}
