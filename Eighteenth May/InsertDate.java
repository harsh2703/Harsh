package com.c2.training;

import java.sql.*;

public class InsertDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			PreparedStatement st = con.prepareStatement("INSERT INTO new_table(id, name, date) VALUES (?, ?, ?)");
			java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
			st.setInt(1, 3);
			st.setString(2, "Harsh");
			st.setDate(3, sqlDate);
			st.executeUpdate();
			System.out.print("Date inserted Successfully.");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
