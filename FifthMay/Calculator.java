package com.c2.training;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
	    Double num1, num2, result;

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter first number: ");
	    num1 = sc.nextDouble();

	    System.out.println("Enter second number: ");
	    num2 = sc.nextDouble();

	    System.out.println("Choose an operator: +, -, *, / or %");
	    operator = sc.next().charAt(0);

	    switch (operator) {

	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;
	        
	      case '%':
		        result = num1 / num2;
		        System.out.println(num1 + " % " + num2 + " = " + result);
		        break;

	      default:
	        System.out.println("Please enter valid operator!");
	        break;
	    }

	    sc.close();
	}

}
