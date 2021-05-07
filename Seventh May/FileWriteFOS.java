package com.c2.training;

import java.io.File;
import java.io.FileOutputStream;

public class FileWriteFOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("fileFOS.txt");
		FileOutputStream fos = null;
		String str = "Program to write to a file using FileOutputStream";
		
		try {
			fos = new FileOutputStream(file);
			
			byte[] ar = str.getBytes();
			fos.write(ar);
			System.out.println("Write Successfull");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
