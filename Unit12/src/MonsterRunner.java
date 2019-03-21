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
		
		System.out.println("Enter 1st monster's name : ");
		String name1 = keyboard.next(); 
		System.out.println("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt(); 
		Monster monster1  = new Skeleton(name1,size1); 

		
		
		System.out.println("Enter 2nd monster's name : ");
		String name2 = keyboard.next(); 
		System.out.println("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		Monster monster2= new Skeleton(name2, size2);
		
		//ask for name and size
		if (monster1.isBigger(monster2)) {
			System.out.println("Monster Two is bigger than Monster One");
		}
		else if (monster1.isSmaller(monster2)) {
			System.out.println("Monster One is smaller than Monster Two");
		}
		else (monster1.getHowBig()==monster2.getHowBig()) {
			System.out.println("Monster Two is the same size as Monster One");
		}
		
		if 
		//instantiate monster two
	}
}