package edu.handong.csee.java.lab14.prob1;

public class SpeedLimit {
	private int spd, lmt;
	/* constructor that receive its variables through parameters.*/
	public SpeedLimit(int spd, int lmt)
	{
		this.spd = spd;
		this.lmt = lmt;
	}
	public void warnSpeedLimit() //method that print out error when speed exceeded limitation.
	{
		try 
		{
			if(spd>lmt)
			{
				throw new Exception("Speed Limit "+lmt+"km exceeded!\nYou are being fined.");
				//if speed is higher than limit, print out error message.
			}
			System.out.println("You are a law abiding citizen!");
			//if not, give a praise.
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//catches exception and print out the message.
		}
	}
}
