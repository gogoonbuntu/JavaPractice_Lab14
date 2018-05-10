package edu.handong.csee.java.lab14.prob6;
import java.util.*;
public class Main {
	private static String n; //stands for name
	private static String r; //stands for race
	private static int a; //stands for age
	private static int infolv=1; //need for the level of information
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try
			{
				if(infolv==1) //Naming stage
				{
					System.out.print("Enter Name: ");
					n = sc.nextLine();
					if(!nameCheck(n)) throw new NameShortException("name must be longer than 5!");
					//nameCheck is not true, error happens
					else {System.out.println("Name is valid.\nName : "+n);infolv=2;}
					//else pass to next level.
				}
				else if(infolv==2) //Aging stage
				{	
					System.out.print("Enter Age: ");
					a = sc.nextInt();
					if(!ageCheck(a)) throw new AgeException("You Should be older than 18!");
					//ageCheck is not true, error happens
					else {System.out.println("Age is valid\nAge : "+a);infolv=3;}
					//else pass to next level.
				}
				else 
				{
					System.out.print("Enter Race(Vulcan, Romulan, Klingtons): ");
					r = sc.nextLine();
					if(!raceCheck(r)) throw new RaceException("race should be chosen within given options!");
					//raceCheck is not true, error happens
					else {System.out.println("Race is valid\nRace : "+r);infolv=4;}
					//else pass to creating level
				}
				
			}
			catch (NameShortException e)
			{
				System.out.println(e.getMessage());
				//gets message from Exception and print them out.
				continue;
				//continue is needed to rerun the loop, to go to top.
			}
			catch (AgeException e)
			{
				System.out.println(e.getMessage());
				//gets message from Exception and print them out.
				continue;
				//continue is needed to rerun the loop, to go to top.
			}
			catch (RaceException e)
			{
				System.out.println(e.getMessage());
				//gets message from Exception and print them out.
				continue;
				//continue is needed to rerun the loop, to go to top.
			}
			if(infolv==4) //creating level
			{
				CustomID c1 = new CustomID(n, a, r);
				//CustomID c1 is created.
				infolv=1;
				//go back to first level - naming level.
			}
		}
	}
	public static boolean nameCheck(String n)
	{
		if(n.length()<5) return false; //if name is less than 5 letters, return false.
		else return true;
	}
	public static boolean ageCheck(int a)
	{
		if(a<18) return false; //if age is under 18, return false.
		else return true;
	}
	public static boolean raceCheck(String r)
	{
		if(r.equals("Vulcan")||r.equals("Romulan")||r.equals("Klingtons"))
			//if race is not included in these three options, return false.
			return true;
		else return false;
	}
}
