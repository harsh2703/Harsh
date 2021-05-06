package com.c2.training;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        sc.close();
	    int vowels = 0, consonants = 0;
	    
	    str=str.toLowerCase();
	    for (int i = 0; i < str.length(); i++) {
	    	char ch = str.charAt(i);
	    	
	    	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            vowels++;
	        }
	    	
	    	else if ((ch >= 'a' && ch <= 'z')) {
	            consonants++;
	        }
	    }
	    
	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);	
	}

}
