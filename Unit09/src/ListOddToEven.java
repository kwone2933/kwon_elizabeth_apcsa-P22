//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddspace = 0; 
		boolean odd_there = false; 
		int evenspace = 0; 
		int difference = 0; 
		for (int i = 0; i< ray.size(); i++) {
			if (ray.get(i)%2==1 && !odd_there) {
				oddspace = i;
				odd_there = true; 
			}
			else if (ray.get(i)%2 == 0 && odd_there) {
				evenspace = i; 
			}
		}
		if (!odd_there ||evenspace == 0) {
			return -1;
		}
		else {
			difference = evenspace - oddspace; 
			return difference; 
		}
	}
}