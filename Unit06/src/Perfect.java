//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() 
	{
		number = 0; 
	}
	public Perfect(int x)
	{
		number = x;
	}
	public void setNum(int x)
	{
		number = x;
	}

	public boolean isPerfect()
	{
		int sum = 0; 
		for (int i=1; i<number; i++)
		{
			if (number%i ==0) {
				sum= sum+i; 
			}
		}
		if (number ==sum) {
			return true;
		}
		else {
		return false;
		}
	}

	public String toString()
	{
		if (isPerfect())
		{
			return number + " is perfect";
		}
		else {
			return number + " is not perfect";
		}
	}
	
}