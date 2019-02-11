//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elizabeth Kwon
//Date - 02/11/2019


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowel = "aeiouAEIOU";
	   int index = (vowel.indexOf(a.substring(0, 1)));
	   index += vowel.indexOf(a.substring(a.length()-1, a.length()));
	   if (index != -2) {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}