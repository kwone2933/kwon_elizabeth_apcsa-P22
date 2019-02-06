//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elizabeth Kwon
//Date - 02/06/2019
//Class - AP CSA
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		System.out.println("2000 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("2000 is even :: " + NumberVerify.isEven(2000));
		
		System.out.println("-11 is odd :: " + NumberVerify.isOdd(-11));
		System.out.println("-11 is even :: " + NumberVerify.isEven(-11));
	}
}