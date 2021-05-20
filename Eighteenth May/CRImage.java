package com.c2.training;

import java.io.*;
import java.sql.*;

public class CRImage {
	public void insertImg()
	{
		Connection con = null;
		 FileInputStream fs=null;
		 PreparedStatement ps=null;
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
			File f=new File("D:\\Training2021\\Eighteenth May\\download.jpg");
		     fs=new FileInputStream(f);
		     
		     ps= con.prepareStatement("INSERT INTO image(img,image) VALUES(?,?)");
		     ps.setString(1, "Sample");
		     ps.setBinaryStream(2,fs,(int)f.length());
		     ps.executeUpdate();
		     System.out.println("Image Stored Successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readImg()throws Exception, IOException, SQLException
	{
		Connection con = null;
		 FileOutputStream fs=null;
		 PreparedStatement ps=null;
		 
		 try 
		 {
		     //Step 1 : Connecting to server and database
		     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","harsh");
		     ps= con.prepareStatement("SELECT * FROM image WHERE image IS NOT NULL");
		     ResultSet rset=ps.executeQuery();
		     	    
		     byte b[];
		     Blob blob;
		     int i=1;
		     while(rset.next())
		     {
		      i++;
		      System.out.print(" img : "+rset.getString(1));
		      
		      File f=new File("D:\\Training2021\\Eighteenth May\\download" + i + ".jpg");
		     fs=new FileOutputStream(f);
		      blob=rset.getBlob("image");
		      b=blob.getBytes(1, (int)blob.length());
		      fs.write(b);
		     }
		 } 
		 
		 catch (SQLException e) 
		 {
		     System.err.println("Cannot connect ! ");
		     e.printStackTrace();
		 }
		 
		 finally {
		     System.out.println("\nClosing the connection.");
		     ps.close();
		     fs.close();
		     if (con != null) try { con.close(); } catch (SQLException ignore) {}
		 }
	}

	public static void main(String[] args) throws Exception, IOException, SQLException {
		// TODO Auto-generated method stub
		CRImage ci = new CRImage();
		ci.insertImg();
		ci.readImg();
	}

}
