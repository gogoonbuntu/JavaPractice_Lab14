package edu.handong.csee.java.lab14.prob5;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			String a=sc.nextLine();
			myTest(a);
		}
		catch(MyException e)
		{
			System.out.println("Inside catch block: "+e.getMessage());
		}
	}
	public static void myTest(String a) throws MyException
	{
		if(a.equals("null"))
		{
			throw new MyException("String val is null");
		}
		else
		{
			System.out.println("String val is "+a);
		}
	}
}
