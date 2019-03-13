 //(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size]; 
		
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age,name); 
	}

	public String getNameOfOldest()
	{
		Dog  oldest = pups[0]; 
		for (Dog dog: pups) {
			if (dog.getAge() > oldest.getAge()) {
				oldest = dog; 
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
		Dog youngest = pups[0]; 
		for (Dog dog: pups) {
			if (dog.getAge()<youngest.getAge()) {
				youngest = dog; 
			}
		}
		return youngest.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}