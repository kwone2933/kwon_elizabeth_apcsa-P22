import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{								
		
		System.out.println(ListDown.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		System.out.println(ListDown.go(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		System.out.println(ListDown.go(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455)));
	}
}