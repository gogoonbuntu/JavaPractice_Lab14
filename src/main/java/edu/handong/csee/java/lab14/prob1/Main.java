package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int speed = (int)(Math.random()*100); //randomly make speed.
		System.out.print("Set the speed limit, officer: ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt(); //receive int for limit
		SpeedLimit sl =  new SpeedLimit(speed, limit); //create SpeedLimit with limit created.
		sl.warnSpeedLimit(); //run warnSpeedLimit method.
		System.out.println("Your current speed: "+speed); //show the current speed
	}

}
