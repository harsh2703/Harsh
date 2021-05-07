package com.c2.training;

import java.io.File;

public class FileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("harsh.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File is already existed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
