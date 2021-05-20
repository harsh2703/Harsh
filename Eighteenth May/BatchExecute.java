package com.c2.training;

import java.sql.*;

public class BatchExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.addBatch("insert into emp(emp_id,dp_id,emp_name) value (1,1,'Harsh')");
			st.addBatch("insert into emp(emp_id,dp_id,emp_name) value (2,1,'HBS')");
			st.addBatch("insert into emp(emp_id,dp_id,emp_name) value (3,2,'shah')");
			st.executeBatch();
			con.commit();  
			System.out.print("Batch insert Successful.");
			con.close();  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}