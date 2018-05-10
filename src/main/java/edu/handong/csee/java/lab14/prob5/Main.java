package edu.handong.csee.java.lab14.prob5;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			String a=sc.nextLine(); //get input for String a.
			myTest(a); //myTest executes, it probably bring exception.
		}
		catch(MyException e)
		{
			System.out.println("Inside catch block: "+e.getMessage());
			//if any error, prints out this message
		}
	}
	public static void myTest(String a) throws MyException
	{
		if(a.equals("null")) //if the string equals to null
		{
			throw new MyException("String val is null");
			//indicates that String is null
		}
		else
		{
			System.out.println("String val is "+a);
		}
		//if else statement is needed or the error message and println message is printed out at the same time.
	}
}
