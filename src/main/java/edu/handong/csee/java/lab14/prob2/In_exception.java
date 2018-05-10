package edu.handong.csee.java.lab14.prob2;

import java.util.*;

public class In_exception {
	private int x, y;
	public void divider()
	{
		try
		{
			System.out.print("x: ");
			Scanner sc = new Scanner(System.in);
			x=sc.nextInt(); //receive int for x.
			System.out.print("y: ");
			y=sc.nextInt(); //receive int for y.
			int res = x/y; //does division!
			System.out.println(res); //print out the result
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
			//print out its error message when x or y is not integer.
		}
		catch(ArithmeticException e)
		{
			System.out.println("java.lang.ArithmeticException: "+ e.getMessage());
			//print out its error message when divider is 0.
		}
	}
}
