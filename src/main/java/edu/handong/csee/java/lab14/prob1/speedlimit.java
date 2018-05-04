package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;

public class speedlimit {
	public static void main(String[] args) 
	{
		int speed = (int)(Math.random()*100);
		try 
		{
			System.out.print("Set the speed limit, officer: ");
			Scanner sc = new Scanner(System.in);
			int limit = sc.nextInt();
			if(speed>limit)
			{
				throw new Exception("Speed Limit "+speed+"km exceeded!\nYou are being fined.");
			}
		System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Your current speed: "+speed);
	}
}
