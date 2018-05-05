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
			x=sc.nextInt();
			System.out.println();
			System.out.print("y: ");
			y=sc.nextInt();
			System.out.println();
			int res = x/y;
			System.out.println(res);
		}
		catch(InputMismatchException e)
		{
			System.out.println("java.util.InputMismatchException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("java.lang.ArithmeticException: "+ e.getMessage());
		}
	}
}
