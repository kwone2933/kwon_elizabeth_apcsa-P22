//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			do {
			out.print("type in your prompt [R,P,S] :: ");
			player=keyboard.next(); 
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
			game.setPlayers(player);
			System.out.println(game);
			
			out.println("Do you want to play again? (Y/N) ");
			Scanner playagain = new Scanner(System.in);
			response = playagain.next().charAt(0); 
			
			}while (response != 'N' && response!='n');
			
			
	}
}



