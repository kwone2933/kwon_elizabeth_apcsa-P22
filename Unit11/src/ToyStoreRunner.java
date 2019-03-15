//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		System.out.println(new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball"));
		ToyStore toys = new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball"); 
		toys.sortToysByCount(); 
		System.out.println(toys); 
		
		ToyStore toysRus = new ToyStore("barbie barbie barbie GIJoe GIJoe LEGOs LEGOs helicopter"); 
		toysRus.sortToysByCount(); 
		System.out.println(toysRus); 
		System.out.println(toysRus.getMostFrequentToy());
	}
}