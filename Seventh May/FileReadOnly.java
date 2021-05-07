package com.c2.training;

import java.io.File;

public class FileReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("fileFOS.txt");
		
		boolean set = file.setReadOnly();
		
		if(set == true) {
			System.out.println("Read File only");
		}
		else {
			System.out.println("Failed");
		}
	}

}
