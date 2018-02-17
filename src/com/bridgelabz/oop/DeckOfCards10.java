package com.bridgelabz.oop;

import com.bridgelabz.utility.oopUtility;

/**purpose- create a Player Object having Deck of Cards, and having
 *  ability to Sort by Rank and maintain the cards in a Queue implemented
 *   using Linked List. 
 * @author bridgeit
 *@since: 14-feb-2018
 */
public class DeckOfCards10
{
	public static void main(String[] args) 
	{
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};

		oopUtility.deckOfCardsQueue(suits,ranks);

	}


	
		
	}