package com.bridgelabz.oop;

import com.bridgelabz.utility.oopUtility;

public class DeckOfCards
{
	public static void main(String[] args) 
	{
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};

		oopUtility.deckOfCards(suits,ranks);

	}



	
}