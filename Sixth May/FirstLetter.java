package com.c2.training;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetter {
	static void printFirst(String s)
    {
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(s);
  
        while (m.find())
            System.out.print(m.group());
  
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s1 = sc.nextLine();
		sc.close();
        printFirst(s1);
	}

}
