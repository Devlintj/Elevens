/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card jack = new Card("jack","hearts", 11);
		Card jack2 = new Card("jack", "hearts", 11);
		Card queen = new Card("queen", "spades", 12);
		System.out.println(jack.suit());
		System.out.println(jack.rank());
		System.out.println(jack.pointValue());
		System.out.println(jack2.suit());
		System.out.println(jack2.rank());
		System.out.println(jack2.pointValue());
		System.out.println(queen.suit());
		System.out.println(queen.rank());
		System.out.println(queen.pointValue());
		System.out.println(jack.matches(jack2));
		System.out.println(jack2.matches(jack));
		System.out.println(queen.matches(jack));
		System.out.println(jack.toString());
		System.out.println(jack2.toString());
		System.out.println(queen.toString());
	}
}
