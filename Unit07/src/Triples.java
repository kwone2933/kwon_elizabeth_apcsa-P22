//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num); 

	}

	public void setNum(int num)
	{
		number = num; 

	}
	private boolean pythagorean(int a, int b, int c)
	{
		if (a*a + b*b == c*c)
		{
			return true;
		}
		else 
		{
			return false; 
		}
	}
	private boolean oddorEven(int a, int b, int c) 
	{
		if (a%2==1 && b%2==0 && c%2==1|| a%2==0 && b%2 ==1 && c%2==1) {
			return true;
		}
		else {
			return false;
		}
	}
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max =0;
		int min =Math.min(a, Math.min(b, c)); 
		for (int i = 0; i<=min; i++) 
		{
			if(a%1==0 && b%1==0 && c%1==0) {
				max = i;
			}
		}


		return max;
	}
	private String tripletcheck() 
	{
		String triples= ""; 
		for (int a = 1; a < number; a++) 
		{
			for (int b = a+1; b< number; b++)
			{
				for (int c = b+1; c< number; c++)
				{
					if (pythagorean(a,b,c) && oddorEven(a,b,c) && greatestCommonFactor(a,b,c) ==1) {
						triples = triples + "\n" + a+ " " + b + " "+c ; 
					}
				}
			}
		}
		return triples;
	}
	public String toString()
	{
		String output="";
		output = tripletcheck(); 
		return output+"\n";
	}
}