package com.c2.training;

import java.sql.*;

public class RollbackCommit {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
		con.setAutoCommit(false);
		try
		{
		     Statement stmt=con.createStatement();
		     String query1="INSERT INTO student(std_id,std_name) VALUES(220,'anmol')";
		     stmt.executeUpdate(query1);
		     String query2="INSERT INTO emp(emp_name,emp_id,dp_id) VALUES('sunil',4,3)";
		     stmt.executeUpdate(query2);
		     con.commit();
		     System.out.println("Row Inserted");
		     
		 } 
		 catch (SQLException e) 
		 {
		     con.rollback();
		     e.printStackTrace();
		     con.close();
		 }
	}

}
