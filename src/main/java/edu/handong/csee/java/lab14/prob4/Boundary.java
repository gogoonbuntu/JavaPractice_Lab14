package edu.handong.csee.java.lab14.prob4;
import java.util.*;
public class Boundary {
	private int a[] = new int[5];
	public void Rcv() throws ArrayIndexOutOfBoundsException
	{
		int i=0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter an integer: ");
			a[i] = sc.nextInt();
			System.out.println("arr["+i+"] <- "+a[i]);
			i++;
		}
	}
}
