//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{						
		int[] test = new int[] {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(test)); 
		
		int[] newer = new int[] {255, 255};
		System.out.println(RaySumLast.go(newer)); 
	}
}