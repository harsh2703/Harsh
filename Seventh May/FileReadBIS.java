package com.c2.training;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadBIS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("harsh.txt");
		BufferedInputStream bis = null;
	    FileInputStream  fis = null;
	    
	    try {
	    	fis = new FileInputStream(file);
	    	bis = new BufferedInputStream(fis);
	    	
	    	while(bis.available()>0) {
	    		System.out.println((char)bis.read());
	    	}
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    bis.close();
	    fis.close();
	}

}
