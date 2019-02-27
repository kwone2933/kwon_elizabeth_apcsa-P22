//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddspace = -1;
		int evenspace = -1;
		for (int i=0; i< ray.length; i++) {
			if (ray[i]%2==1) {
				oddspace = ray[i]; 
				break; 
			}
		}
		for (int i=oddspace; i< ray.length; i++) {
			if (ray[i]%2==0) {
				evenspace = i; 
				break; 
			}
		}
		if (evenspace > oddspace) {
			return evenspace - oddspace;
		}
		else return -1; 
	}
}