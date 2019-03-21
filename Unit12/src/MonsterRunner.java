//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Monster 1 name: ");
		String name1 = keyboard.next();
		System.out.println("Monster 1 size: ");
		int size1 = keyboard.nextInt();
		Skeleton monsterone = new Skeleton(name1, size1);
		
		System.out.println("Monster 2 name: ");
		String name2 = keyboard.next();
		System.out.println("Monster 2 size: ");
		int size2 = keyboard.nextInt();
		Skeleton monstertwo = new Skeleton(name2, size2);
		
		//ask for name and size
		if (monsterone.isBigger(monstertwo))
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if (monsterone.isSmaller(monstertwo))
		{
			System.out.println("Monster one is smaller than Monster two.");
		}
		
		if(monsterone.namesTheSame(monstertwo))
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
		else
		{
			System.out.println("Monster one does not have the same name as Monster two.");
		}
		//instantiate monster two
	}
}