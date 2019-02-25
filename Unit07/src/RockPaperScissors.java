//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers(""); 
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player); 
	}

	public void setPlayers(String player)
	{
		playChoice = player; 
		int num = (int) Math.floor(Math.random()*3); 
		if (num == 0) {
			compChoice = "R";
		}
		else if (num ==1) {
			compChoice = "S";
		}
		else {
			compChoice = "P";
		}
	}

	public String determineWinner()
	{
		String winner="";
		playChoice.toUpperCase().trim(); 
		
		if (playChoice == "R") 
		{
			if (compChoice == "R") {
				winner = "!Draw Game!";
			}
			else if (compChoice == "S") {
				winner = "!Player wins <<Rock Breaks Scissors>>!";
			}
			else {
				winner = "!Computer wins <<Paper covers rock>>!";
			}
		}
		if (playChoice == "S") 
		{
			if (compChoice == "S") {
				winner = "!Draw Game!";
			}
			else if (compChoice == "P") {
				winner = "!Player wins <<Scissors Cuts Paper>>!";
			}
			else {
				winner = "!Computer wins <<Rock Breaks Scissors>>!";
			}
		}
		if (playChoice == "P") 
		{
			if (compChoice == "P") {
				winner = "!Draw Game!";
			}
			else if (compChoice == "R") {
				winner = "!Player wins <<Paper Covers Rock>>!";
			}
			else {
				winner = "!Computer wins <<Scissors Cuts Paper>>!";
			}
		}
		return winner;
	}

	public String toString()
	{
		return "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + determineWinner();
	}
}