package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	public long power(int n, int p) throws Exception
	{
		if(n==0&&p==0)
		{
			throw new Exception ("n and p should not be zero.");
			//number AND the power cannot be 0 at the same time.
		}
		else if(n<0||p<0)
		{
			throw new Exception ("n or p should not be negative.");
			//number OR the power cannot be negative numbers. 
		}
		long res = (long) Math.pow(n, p);
		//the power calculation, since the result could be big, use long type.
		return res;
	}
}
