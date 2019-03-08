//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0; 
		boolean sum_there = false; 
		for (int i=0; i<ray.size(); i++ ) {
			if (ray.get(i)>ray.get(0)) {
				sum+= ray.get(i); 
				sum_there = true;
			}
		}
		if (!sum_there) {
			return -1; 
		}
		return sum; 
	}
}