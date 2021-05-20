package com.c2.training;

import java.sql.*;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			String delete = "DELETE FROM emp";
			Statement st = con.createStatement();
			int i = st.executeUpdate(delete);
			if(i>0)
			{
				System.out.println("Rows Deleted Successfully");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


