package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int speed = (int)(Math.random()*100);
		System.out.print("Set the speed limit, officer: ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		SpeedLimit sl =  new SpeedLimit(speed, limit);
		sl.warnSpeedLimit();
		System.out.println("Your current speed: "+speed);
	}

}
