/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		int pos = sample.indexOf("slow");
		if (pos != -1) {
			System.out.println("slow is found at position " + pos);
		}
		else {
			System.out.println("slow is not found"); 
		}
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int count = 0;
		int i = 0;
		sample = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		while (i<sample.length()-3) {
			if (sample.substring(i+1).indexOf("the")>=0) {
				count ++;
				i=sample.substring(i+1).indexOf("the") + i +1;
			}
			else {
				i=sample.length();
			}
			System.out.println("The string has " + count + "occurrences.");
		}
	}

}
