/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = new String[] {"pepe", "kek", "reeee"};
		String[] suit = new String[] {"troll", "edgelord", "normie"};
		int[] value = new int[] {1, 2, 3, 4, 5 ,6};
		Deck deck1 = new Deck(rank, suit, value);
		Deck deck2 = new Deck(suit, rank, value);
		Deck deck3 = new Deck(rank, rank, value);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		System.out.println(deck2.size());
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		System.out.println(deck3.deal());
		System.out.println(deck3.size());
	}
}
