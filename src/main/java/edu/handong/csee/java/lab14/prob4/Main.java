package edu.handong.csee.java.lab14.prob4;

public class Main {

	public static void main(String[] args) 
	{
		Boundary abc = new Boundary(); //initiate a new object.
		try 
		{
			abc.Rcv(); //receive numbers to array.
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid array index access!");
			//prints out the error message.
		}
	}
}
