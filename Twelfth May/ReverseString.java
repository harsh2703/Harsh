package com.c2.training;

import java.util.Scanner;
import java.util.Stack;
public class ReverseString {
	public static String Reverse(String str)
    {
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
  
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
  
        int i = 0;
        while (!stack.isEmpty()) { 
            reverseString[i++] = stack.pop();
        }
        
        return new String(reverseString);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		System.out.println("Reverse String: "+ Reverse(str));
		sc.close();
	}
}
