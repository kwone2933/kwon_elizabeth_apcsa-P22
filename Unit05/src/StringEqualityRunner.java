//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality hello = new StringEquality("hello", "goodbye"); 
		hello.checkEquality(); 
		hello.toString(); 
		System.out.println(hello);
		
		StringEquality bye = new StringEquality("one", "two"); 
		bye.checkEquality(); 
		bye.toString(); 
		System.out.println(bye);
		
		StringEquality same = new StringEquality("ABC", "ABC"); 
		same.checkEquality(); 
		same.toString(); 
		System.out.println(same);
		
	}
}