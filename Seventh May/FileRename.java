package com.c2.training;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("harsh.txt");
		File file2 = new File("file1.txt");
		
		boolean status = file1.renameTo(file2);
		
		if(status == true) {
			System.out.println("rename successfully");
		}
		else {
			System.out.println("failed");
		}
	}

}
