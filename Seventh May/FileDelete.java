package com.c2.training;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("harsh.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			if(file.delete()) {
				System.out.println("Delete file " + file.getName());
			}
			else {
				System.out.println("Failed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
