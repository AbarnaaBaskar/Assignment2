package com.assignment2.rock.paper.scissor;

public class UserInputValidation {
	boolean validInput;
	public boolean userInputValidation(String userChoice )
	{
		if (userChoice.equals("Rock")|| userChoice.equals("Paper") || userChoice.equals("Scissor")|| userChoice.equals("Exit"))
		{
			validInput = true;
		}
		else
		{
			validInput = false;
		}
		return validInput;
	}
	
}
