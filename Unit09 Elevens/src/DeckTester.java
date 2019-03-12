/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck newDeck = new Deck(new String[] {"1", "3", "5"}, new String[] {"spades", "hearts"}, new int[] {1,6,7});
		System.out.println(newDeck);
		newDeck.shuffle(); 
		System.out.println(newDeck); 
		
		Deck another = new Deck(new String[] {"Jack", "Queen", "King"}, new String[] {"diamonds", "spades", "clubs"}, new int[] {11,12,13});
		System.out.println(another); 
		another.deal(); 
		System.out.println(another); 
		
		int variable = newDeck.size(); 
		for (int i = 0; i < variable; i++) {
			newDeck.deal(); 
		}
		System.out.println(newDeck); 
	}
}
