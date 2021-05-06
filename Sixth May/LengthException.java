package com.c2.training;

import java.util.Scanner;

public class LengthException {
	void lengthcheck(int length,String s) throws LengthMatchException
	{
		if(s.length()!=length)
		{
			throw new LengthMatchException("string length not same as given length");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthException ln=new LengthException();
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		String str=sc.next();
		 try
	     {
	        ln.lengthcheck(length,str);
	     }
	     catch (LengthMatchException ex)
	     {
	         System.out.println("Caught the exception");
	         System.out.println(ex.getMessage());
	     }
	}

}
class LengthMatchException extends Exception
{
    public LengthMatchException(String s)
    {
       
        super(s);
    }
}
