//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", ' ');
	}

	public LetterRemover(String s, char rem)
	{
		setRemover(s,rem); 
		removeLetters(); 
	}

	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc = sentence.indexOf(lookFor);
		while(loc >=0) {
			cleaned=cleaned.substring(0,loc) + cleaned.substring(loc+1,cleaned.length());
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() ;
	}
}