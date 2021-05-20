package com.c2.training;

import java.sql.*;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from new_table");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
	}

}
