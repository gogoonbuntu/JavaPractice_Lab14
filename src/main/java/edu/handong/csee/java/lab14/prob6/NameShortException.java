package edu.handong.csee.java.lab14.prob6;

public class NameShortException extends Exception{
	private String k;
	public NameShortException()
	{
		super(); //Inherits from Exception class. 
	}
	public NameShortException(String a)
	{
		super(a); //Inherits strings from Exception class.
		a=k;
	}
	public NameShortException(Throwable cause)
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
