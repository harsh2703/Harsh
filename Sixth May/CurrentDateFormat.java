package com.c2.training;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");  
		LocalDateTime dt = LocalDateTime.now();  
		System.out.println("Current date and time in DD:MM:YYYY hh:mm:ss format is "+date.format(dt));
	}

}
