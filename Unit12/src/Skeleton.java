//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{

	private String name; 
	private int size; 
	//add a constructor
	public Skeleton() { 
	}
	//add code to implement the Monster interface
	public Skeleton( String nm, int sz) {
		name = nm; 
		size = sz; 
	}
	
	private String toString() {
		return getName() + " " + getHowBig()+ " "; 
	} 
	
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBigger(Monster other) {
		if (other.getHowBig() > getHowBig()) {
			return true; 
		}
		return false;
	}

	@Override
	public boolean isSmaller(Monster other) {
		if (other.getHowBig() < getHowBig()) {
			return true; 
		}
		return false;
	}

	@Override
	public boolean namesTheSame(Monster other) {
		if (other.getName()==getName()) {
			return true; 
		}
		return false;
	}
	//add instance variables	
	
	//add a toString
}