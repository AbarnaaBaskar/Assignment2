package com.assignment2.rock.paper.scissor;

import java.util.Scanner;

public class MainRockPaperScissor {

	public static void main(String[] args) {
		String userInput;
		String opponentInput;
		System.out.println("Enter Rock, Paper or Scissor to play and Exit to quit ");
		Scanner input = new Scanner(System.in);
		userInput = input.nextLine();
		UserInputValidation userInputObject = new UserInputValidation();
		boolean check = userInputObject.userInputValidation(userInput);
		OpponentChoice opponentChoiceObject = new OpponentChoice();
		opponentInput = opponentChoiceObject.opponentChoice();
		if(!userInput.equals("Exit"))
		{
		if(check == true)
		{
		if (userInput.equals(opponentInput))
			{
			System.out.println("It is a tie");
			}
		else if((userInput.equals("Rock") && opponentInput.equals("Scissor"))||(userInput.equals("Scissor") && opponentInput.equals("Paper"))||(userInput.equals("Paper") && opponentInput.equals("Rock")))
		    {
			
				System.out.println("You Won");
		    }			
		else
			
			{
				System.out.println("You lose");
			}
			
		}
		else
		{
			System.out.println("Enter Valid Input");
		}
	}
	else
	{
		System.out.println("Game Terminated");
	}
	}
}


