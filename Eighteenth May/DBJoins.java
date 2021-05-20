package com.c2.training;

import java.sql.*;


public class DBJoins {

	public void innerJoin()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
            String select = "SELECT emp.dp_id, emp.emp_name, dpmt.dp_name from emp inner join dpmt on emp.dp_id=dpmt.dp_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dp_id")+" Name: "+rs.getString("emp_name")+" And Department: "+rs.getString("dp_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
	
	public void leftJoin()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
            String select = "SELECT emp.dp_id, emp.emp_name, dpmt.dp_name from emp left join dpmt on emp.dp_id=dpmt.dp_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dp_id")+" Name: "+rs.getString("emp_name")+" And Department: "+rs.getString("dp_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void rightJoin()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
            String select = "SELECT emp.dp_id, emp.emp_name, dpmt.dp_name from emp right join dpmt on emp.dp_id=dpmt.dp_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dp_id")+" Name: "+rs.getString("emp_name")+" And Department: "+rs.getString("dp_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void fullJoin()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
            String select = "SELECT dpmt.dp_id, emp_name, dp_name from emp join dpmt on emp.dp_id=dpmt.dp_id"; // full join not working
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dp_id")+" Name: "+rs.getString("emp_name")+" And Department: "+rs.getString("dp_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBJoins j = new DBJoins();
        System.out.println("Inner Join");
        j.innerJoin();
        System.out.println();
        System.out.println("Left Join");
        j.leftJoin();
        System.out.println();
        System.out.println("Right Join");
        j.rightJoin();
        System.out.println();
        System.out.println("Full Outer Join");
        j.fullJoin();
	}

}
