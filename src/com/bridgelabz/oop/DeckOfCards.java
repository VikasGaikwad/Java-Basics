package com.bridgelabz.oop;



public class DeckOfCards {
	@SuppressWarnings("rawtypes")
	public static GenericQueue queue = new GenericQueue(35);

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//generateCards();
		int total_players=4;
		int number_of_cards=13;
		String [] deck_of_cards=assignCards();
		String [] deck_of_shuffle_cards=shuffle(deck_of_cards);
		String[][] player_cards=distributeCards(deck_of_shuffle_cards,number_of_cards,total_players);
		
		System.out.println("cards after sorting : ");
		printSortedCards(player_cards,number_of_cards,total_players);

	}
	public static String[] assignCards() {
		String[] card = { "Club", "Diamond", "Heart", "Spade" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String [] deck_Of_cards=new String[52];
		int index = 0;
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck_Of_cards[index++] = card[i] + " " + rank[j];
			}
		}
		
		/*System.out.println("Before shuffle :");
		for(int i=0;i<deck_Of_cards.length;i++) {
			System.out.println(deck_Of_cards[i]);
		}
		*/
		
		return deck_Of_cards;

	}
	public static String[] shuffle(String [] deck_of_cards) {
		for(int i=0;i<deck_of_cards.length;i++) {
			int random=(int)(Math.random()*52);
			String temp=deck_of_cards[i];
			deck_of_cards[i]=deck_of_cards[random];
			deck_of_cards[random]=temp;
		}
		System.out.println("after shuffle : ");
		for(int i=0;i<deck_of_cards.length;i++) {
			System.out.println(deck_of_cards[i]);
		}
		return deck_of_cards;
		
	}
	@SuppressWarnings("unused")
	public static String[][] distributeCards(String [] deck_of_shuffle_cards,int number_of_cards,int total_players) {
		
		int index=0;
		//stored inside the 2 d array..
		String [][] two_D_Array=new String[number_of_cards][total_players];
		for(int i=0;i<total_players;i++) {
			for(int j=0;j<number_of_cards;j++) {
				two_D_Array[i][j]=deck_of_shuffle_cards[index++];
				
			}
		}
		System.out.println("after distribution...");
		int count=1;
		for(int i=0;i<total_players;i++) {
			System.out.println(" "+count++ +"player cards : ");
			for(int j=0;j<number_of_cards;j++) {
				System.out.println(two_D_Array[i][j]);
			}
			System.out.println(" ");
		}
			
		return two_D_Array;
		
		
	}
	@SuppressWarnings("unchecked")
	public static void printSortedCards(String[][] player_cards, int total_players, int number_of_cards) {
		String[] cards = new String[number_of_cards];
		for (int i = 0; i < total_players; i++) {
			for (int j = 0; j < number_of_cards; j++) {
				cards[j] = player_cards[i][j];
			}
			queue.Enqueue("Cards Of Player " + (i + 1) + " are as follows..");
			sortCards(cards);
		}
	
	}
	@SuppressWarnings("unchecked")
	private static void sortCards(String[] cards) {
		char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				String card = cards[j];
				char cardRank = card.charAt(card.length() - 1);
				if (cardRank == rank[i])
					queue.Enqueue(card);
			}
		}
	}
	public static void printCardsQueue() {
		for(int i=0;i<60;i++) {
			System.out.println(queue.frontEle());
			queue.Dequeue();
		}
	}
}

