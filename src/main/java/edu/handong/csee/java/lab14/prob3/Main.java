package edu.handong.csee.java.lab14.prob3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Powercalc my_calculator = new Powercalc();//initiate a new object.
		Scanner sc = new Scanner(System.in);
		int n, p; //stands for number, power
		while(true)
		{
			try 
			{
				n=sc.nextInt();p=sc.nextInt();//receive integers.
				System.out.println(my_calculator.power(n,p));
				//print out the result!
			}
			catch (Exception e)
			{
				System.out.println(e);
				//print out the error message.
			}
		}
	}
}