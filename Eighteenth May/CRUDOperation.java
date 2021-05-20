package com.c2.training;

import java.sql.*;
import java.util.*;

public class CRUDOperation {
	CreateTable cd = new CreateTable();
	
	public void insert()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			String insert = "INSERT INTO EMPLOYEE(Name, Role) VALUES ('Harsh', 'Junior Developer'),('Shubham', 'Senior Developer')";
			Statement st = con.createStatement();
			int i = st.executeUpdate(insert);
			if(i>0)
			{
				System.out.println(i+" Rows Added");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void update(int id, String name, String role)
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			String update = "UPDATE EMPLOYEE SET Name=?, Role=? WHERE id=?";
			PreparedStatement pt = con.prepareStatement(update);
			pt.setString(1, name);
			pt.setString(2, role);
			pt.setInt(3, id);
			int i = pt.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Updated Successfully");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void delete(int id1)
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			String delete = "DELETE FROM EMPLOYEE Where id=?";
			PreparedStatement ps = con.prepareStatement(delete);
			ps.setInt(1, id1);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Row Deleted Successfully");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void select()
	{
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1-For Insert");
			System.out.println("2-For Update");
			System.out.println("3-For Delete");
			System.out.println("4-For View Records");
			System.out.print("Please Enter The Choice From Above: ");
			int ch = sc.nextInt();
			CRUDOperation i = new CRUDOperation();
			
			switch(ch) {
			case 1:
				i.insert();
				break;
				
			case 2:
				i.select();
				System.out.print("Please Enter id of the record which you want to update: ");
				int id = sc.nextInt();
				System.out.print("Please Enter New Name: ");
				String name = sc.next();
				System.out.print("Please Enter New Role: ");
				String role = sc.next();
				i.update(id, name, role);;
				break;
				
			case 3:
				i.select();
				System.out.print("Please Enter id of the record which you want to delete: ");
				int id1 = sc.nextInt();
				i.delete(id1);
				break;
				
			case 4:
				i.select();
				break;
				
				default:
					System.out.print("Please Enter Valid Choice");
					break;
			}
			sc.close();
		}
	}

}
