package edu.handong.csee.java.lab14.prob1;

public class SpeedLimit {
	private int spd, lmt;
	public SpeedLimit(int spd, int lmt)
	{
		this.spd = spd;
		this.lmt = lmt;
	}
	public void warnSpeedLimit()
	{
		try 
		{
			if(spd>lmt)
			{
				throw new Exception("Speed Limit "+lmt+"km exceeded!\nYou are being fined.");
			}
			System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
