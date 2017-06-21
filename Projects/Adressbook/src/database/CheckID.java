package database;

import java.sql.*;
import java.io.*;

public class CheckID {

	static String queryString;

    	public static void main (String[] args) throws ClassNotFoundException {
    		System.out.println();
    		queryString = "select * from projects ";
//    		 queryString = "select ub_number from projects where supervisor = '" + args[0] + "'";
	String url = 
	    "jdbc:postgresql://pgdbs8.inf.brad.ac.uk/sd2?user=sd2user&password=sd2user";
	try {
	    Class.forName("org.postgresql.Driver");
	
	    Connection con = DriverManager.getConnection(url); 
	    Statement stmt = con.createStatement();   
	    ResultSet rs = stmt.executeQuery(queryString);
	    while (rs.next()) {
		 for (int c = 1; c <= rs.getMetaData().getColumnCount(); c++) {
			System.out.print(rs.getString(c)+" ");
		 }
		 System.out.println();
            }    
	    rs.close(); 
	    stmt.close(); 
	    con.close();
	}
	catch (Exception e) {
	    System.out.println("Error: " + e.getMessage() + "\n" + e.toString());
	}
    }
}