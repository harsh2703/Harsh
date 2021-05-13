package com.c2.training;

import java.io.*;

class Employee implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	public String name="emp";
	   public String address="rajkot";
	   public int eid=5;
	  
	}
public class SerializeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		File file = new File("EmpSerialize.txt"); 
		 try {
			FileOutputStream fos =new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(emp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
