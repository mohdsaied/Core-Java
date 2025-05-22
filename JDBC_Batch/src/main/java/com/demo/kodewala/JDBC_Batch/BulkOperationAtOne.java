package com.demo.kodewala.JDBC_Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BulkOperationAtOne {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  
	  
	  //Load the driver class
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  
	 //Create Connection
	  String url = "jdbc:mysql://localhost:3306/kodewala";
		String userName = "root";
		String password = "facebook";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		
		//Create Prepared statement Object
		
		String inserSql= "insert into userinfo(username, password, hint_question, hint_answer) value(?,?,?,?)";
		
		PreparedStatement prepareStatement = con.prepareStatement(inserSql);// Call Once 
		
		//Perform Bulk Operation at a time (Perform Many Record) Here we can perform file Or CSV file
		for(int i=0; i<10; i++) {
			prepareStatement.setString(1, "Mo Saied-"+i);
			prepareStatement.setString(2, "mosaied@123-"+i);
			prepareStatement.setString(3, "JDBC_Batch-"+i);
			prepareStatement.setString(4, "Batches_process-"+i);
			prepareStatement.addBatch();
		}
		
		int[] batch = prepareStatement.executeBatch();// Execute Batch After the making Batchs
		System.out.println(batch);
  }
}
