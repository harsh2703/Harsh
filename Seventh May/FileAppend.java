package com.c2.training;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str="Output followed by Appended Code.";
			File file = new File("file2.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getName(),true);
			BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(str);
	        bw.close();
	        System.out.println("Append Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
