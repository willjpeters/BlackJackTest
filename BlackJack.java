package com.qa.blackjack;

public class BlackJack
{
	
	public static void main(String[] args)
	{
	}

public int play(int player, int dealer)
	{
	
	if(player < 0 || player > 31 || dealer < 0 || dealer > 31)
	{
		return 0;
	}
	else if(dealer >= 22 && player <= 21)
	{
		return player;
	}
	else if(player >= 22 && dealer <= 21)
	{
		return dealer;
	}
	else if(player <= 21 && player > dealer)
	{
	return player;
	}
	else if(dealer <= 21 && player < dealer)
	{
		return dealer;
	}
	return 0;
}}