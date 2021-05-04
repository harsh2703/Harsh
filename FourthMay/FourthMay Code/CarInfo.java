package com.c2.training;

import java.util.Scanner;

public class CarInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Information");
        System.out.println("Name:");
        String Name = sc.nextLine();
        System.out.println("Model:");
        String model = sc.nextLine();
        System.out.println("Year of Purchase:");
        int year = sc.nextInt();
        System.out.println("Price:");
        int Price = sc.nextInt();
        int base_price = (int)(0.2 * Price);
        System.out.println( "Car purchased in " + year + " for " + Price);
        
        while(true){
            System.out.println("Enter Year number or else -1 to quit");
            int year1= sc.nextInt();
            if(year1==-1)
                break;
                
            int diff= year1-year;
            if(diff<=0)
                {
                    System.out.println("Enter Valid Year");
                    continue;
                }
            int new_price= Price;
            
            for(int i=0;i<diff;i++)
            {
                int dep = (int)(new_price *.1);
                new_price-=dep;
            }
            
            System.out.println("Resale price of car in " + year1 + " is " + Math.max(new_price,base_price));
            
        }
        
     }
}