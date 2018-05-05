package edu.handong.csee.java.lab14.prob4;

public class Main {

	public static void main(String[] args) {
		Boundary abc = new Boundary();
		try
		{
			abc.Rcv();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid array index access!");
		}
	}

}
