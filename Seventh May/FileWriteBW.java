package com.c2.training;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriteBW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("file2.txt");
		BufferedWriter bw = null;
		String str = "Program to write to file using BufferedWriter";
		
		try {
			
			if (!file.exists()) {
			     file.createNewFile();
			  }
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(str);
			System.out.println("Write successful");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
