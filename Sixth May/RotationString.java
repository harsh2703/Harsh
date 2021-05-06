package com.c2.training;

import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String s1=sc.nextLine();
        
        System.out.println("Enter the string 1: ");
        String s2=sc.nextLine();
        sc.close();
		String s3 = s1 + s1;
		
		if(s3.contains(s2)) {
			System.out.println("s1 is rotation of s2");
		}
		else {
			System.out.println("s1 is not rotation of s2");
		}
	}

}
