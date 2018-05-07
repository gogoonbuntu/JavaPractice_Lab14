package edu.handong.csee.java.lab14.prob6;

public class RaceException extends Exception{
	private String k;
	public RaceException()
	{
		super(); //Inherits from Exception class. 
	}
	public RaceException(String a)
	{
		super(a); //Inherits strings from Exception class.
		a=k;
	}
	public RaceException(Throwable cause)
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
