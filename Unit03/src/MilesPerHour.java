//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph; 

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph = 0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance =dist;
		hours = hrs;
		minutes= mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance =dist;
		hours = hrs;
		minutes= mins;
	}

	public void calcMPH() 
	{
		float hours2=minutes/60f;
		mph = (double) distance/(hours+hours2);
	}
	
	public double getMPH()
	{
		return mph;
	}
	

	public void print()
	{
		System.out.println("the rate is "+ String.format("%.3f", mph)); 
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}