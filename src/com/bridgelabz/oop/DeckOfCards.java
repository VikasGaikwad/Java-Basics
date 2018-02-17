package com.bridgelabz.oop;

import com.bridgelabz.utility.oopUtility;

/**purpose: class is used to Shuffle the cards using Random method and 
 * then distribute 9 Cards to 4 Players and Print the Cards.
 * @author bridgeit
 *
 */
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