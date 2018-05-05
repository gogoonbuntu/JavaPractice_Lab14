package edu.handong.csee.java.lab14.prob3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Powercalc my_calculator = new Powercalc();
		Scanner sc = new Scanner(System.in);
		int n, p;
		while(true)
		{
			try 
			{
				n=sc.nextInt();p=sc.nextInt();
				System.out.println(my_calculator.power(n,p));
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}