package com.c2.training;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeFinder {
	public int calcAge(LocalDate dob)
    {
        LocalDate todayDate = LocalDate.now();
        int age = Period.between(dob,todayDate).getYears();
        return age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your birth date (yyyy-mm-dd): ");
        String dt = sc.nextLine();
        
        LocalDate dob;
        dob = LocalDate.parse(dt);    
        AgeFinder obj = new AgeFinder();
        int age = obj.calcAge(dob);
        System.out.println("Your Age is :- "+age);
        sc.close();
	}

}
