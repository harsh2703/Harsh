package com.c2.training;

import java.util.Scanner;

public class DeciToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter double value: ");
		double a = sc.nextDouble();
		int value = (int)a;
		System.out.println("Integer value: "+value);
	}

}
