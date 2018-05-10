package edu.handong.csee.java.lab14.prob4;
import java.util.*;
public class Boundary {
	private int a[] = new int[5];
	/* Rcv stands for receive, it may bring Array Index Out of Boundary Exception*/
	public void Rcv() throws ArrayIndexOutOfBoundsException
	{
		int i=0; //for index of array
		Scanner sc = new Scanner(System.in);
		while(true) //a loop that infinitely receive input until no error
		{
			System.out.print("Enter an integer: "); //get an integer and
			a[i] = sc.nextInt(); //add to the array
			System.out.println("arr["+i+"] <- "+a[i]); //indicate the addition is complete.
			i++; //get to next index.
		}
	}
}
