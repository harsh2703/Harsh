package com.c2.training;

public class Student implements Comparable<Student> {
    String name;
    int rollno;   
    int age;  
Student(String name, int rollno,int age){
    this.name = name;
    this.rollno = rollno;  
    this.age = age;  
  }

 	  
public int compareTo(Student st)
{  

 if(rollno == st.rollno)  
  return 0;  
	else if(rollno > st.rollno)  
	return 1;  
	else  
	return -1;  
   }  
}