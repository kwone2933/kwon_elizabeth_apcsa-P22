//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elizabeth Kwon
//Date - 02/06/2019
//Class - AP CSA
//Lab  - Odd or Even

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num ) //checking odd
	{
		if (num%2==1 || num%2==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isEven( int num ) //checking even
	{ 
		if (num%2==0) {
		return true;
		}
		else {
			return false;
		}
	}	
	
}
	
	