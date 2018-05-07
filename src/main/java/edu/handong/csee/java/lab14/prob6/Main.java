package edu.handong.csee.java.lab14.prob6;
import java.util.*;
public class Main {
	private static String n;
	private static String r;
	private static int a;
	private static int infolv=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try
			{
				if(infolv==1)
				{
					System.out.print("Enter Name: ");
					n = sc.nextLine();
					if(!nameCheck(n)) throw new NameShortException("name must be longer than 5!");
					else {System.out.println("Name is valid.\nName : "+n);infolv=2;}
				}
				else if(infolv==2)
				{	
					System.out.print("Enter Age: ");
					a = sc.nextInt();
					if(!ageCheck(a)) throw new AgeException("You Should be older than 18!");
					else {System.out.println("Age is valid\nAge : "+a);infolv=3;}
				}
				else 
				{
					System.out.print("Enter Race(Vulcan, Romulan, Klingtons): ");
					r = sc.nextLine();
					if(!raceCheck(r)) throw new RaceException("race should be chosen within given options!");
					else {System.out.println("Race is valid\nRace : "+r);infolv=4;}
				}
				
			}
			catch (NameShortException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
			catch (AgeException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
			catch (RaceException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
			if(infolv==4) 
			{
				CustomID c1 = new CustomID(n, a, r);
				infolv=1;
			}
		}
	}
	public static boolean nameCheck(String n)
	{
		if(n.length()<5) return false;
		else return true;
	}
	public static boolean ageCheck(int a)
	{
		if(a<18) return false;
		else return true;
	}
	public static boolean raceCheck(String r)
	{
		if(r.equals("Vulcan")||r.equals("Romulan")||r.equals("Klingtons"))
			return true;
		else return false;
	}
}
