package com.c2.training;
import java.util.*;

public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Jay", 20, 15);
		   Student st2 = new Student("Raj", 15, 16);
		   Student st3 = new Student("Sneh", 25, 15);
		   
		   ArrayList<Student> al = new ArrayList<>();
		  
		   al.add(st1);
		   al.add(st2);
		   al.add(st3);
		 
		  System.out.println("Displaying student's name sorted by rollnos:");
		  Collections.sort(al); 
		  for(Student st:al){  
		       System.out.println(st.name+" "+st.rollno+" "+st.age);  
		   }
	}

}
