package com.demo.kodewala.JDBC_Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create_Batches {

	public static void main(String[] args) throws Exception {
		
		
		//Step 1 Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 create connection
		String url = "jdbc:mysql://localhost:3306/kodewala";
		String userName = "root";
		String password = "facebook";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		//Step 3 create statement
		
		String insetSqlQuery = "insert into employe(id, name, salary) value(?, ?, ?)";
		
		
		//Step 4 Prepared statement
		PreparedStatement pstmt = con.prepareStatement(insetSqlQuery);
		
		
		for(int i=0; i<=100; i++) {
			pstmt.setInt(1, 2+i);
			pstmt.setString(2, "mosaied"+i);
			pstmt.setString(3, "5000"+i);
			pstmt.addBatch();
			if(i % 100 ==0) {
				System.out.println("Executing Btches of 100.....");
				pstmt.executeBatch();
			}
		}
		System.out.println(" Executing remaining records...");
		pstmt.executeBatch();
		
	}
}
