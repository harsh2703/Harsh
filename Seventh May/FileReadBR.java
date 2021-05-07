package com.c2.training;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadBR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("harsh.txt"));
			
			int num=0;
			char ch;
			while((num=br.read()) != -1){	
		               ch=(char)num;
			       System.out.print(ch);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
