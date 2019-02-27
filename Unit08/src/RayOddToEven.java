//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static boolean go(int[] ray)
	{
		int oddspace = 0;
		int firstodd = 0; 
		int evenspace = 0;
		int difference = 0; 
		for (int i=0; i< ray.length; i++) {
			if (i%2==1) {
				oddspace = i; 
				break; 
			}
		}
		for (int j=oddspace; i< ray.length; i++) {
			if (j%2==0) {
				evenspace = j; 
				break; 
			}
		}
		difference = evenspace - oddspace; 
		if (oddspace == 0) {
			
		}
		return false;
	}
}