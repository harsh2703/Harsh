package com.c2.training;

import java.sql.*;

public class ExecuteSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			String select = "SELECT * FROM EMPLOYEE";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("Name")+" And Role: "+rs.getString("Role"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
