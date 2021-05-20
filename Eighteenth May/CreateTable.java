package com.c2.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");  
			Statement stmt=con.createStatement();  
			String sql = "CREATE TABLE EMPLOYEE(id INTEGER PRIMARY KEY AUTO_INCREMENT, Name Varchar(50) NOT NULL, Role Varchar(25) Not Null)";
			stmt.executeUpdate(sql);  
			System.out.println("Table Created.");  
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}

}
