package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{
	private String k;
	public MyException()
	{
		super(); //Inherits from Exception class. 
	}
	public MyException(String a)
	{
		super(a); //Inherits strings from Exception class.
		a=k;
	}
	public MyException(Throwable cause)
	{
		super(cause); //Inherits Informations from Exception class.
	}
	//It controls information in Stack. 
	//It indicates where does the exception happened, where was it called.
	public String toString()
	{
		return k; //returns its message.
	}
}
