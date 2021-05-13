package com.c2.training;

import java.io.*;

class Employee implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	public String name;
	   public String address;
	   public int eid;
	  
	}
public class DeserializeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{   
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("EmpSerialize.txt"));  
			Employee  e=(Employee)in.readObject();  
			System.out.println(e.eid+" "+e.name+" "+e.address);    
			in.close();  
		  	}catch(Exception e){
		  		System.out.println(e);
		}  
	}

}
