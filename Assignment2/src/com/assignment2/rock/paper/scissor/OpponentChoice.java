package com.assignment2.rock.paper.scissor;

import java.util.Random;

public class OpponentChoice {
	public String opponentChoice()
	{
	Random random = new Random();
	String opponentChoice;
	int opponentNumber = random.nextInt(3);
	if (opponentNumber==0)
	{
		opponentChoice = "Rock";
	}
	else if (opponentNumber==1)
	{
		opponentChoice = "Paper";
	}
	else
	{
		opponentChoice = "Scissor";
	}
	return opponentChoice;
}
}