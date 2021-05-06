package com.c2.training;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DeciToRoundString {
	private static void round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    double x = bd.doubleValue();
	    System.out.print(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter double value: ");
		double a = sc.nextDouble();
		System.out.print("Enter decimal places: ");
		int b= sc.nextInt();
		sc.close();
		round(a,b);		
	}
}
