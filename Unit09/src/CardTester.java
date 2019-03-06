/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card example = new Card("Two", "Hearts", 2); 
		System.out.println(example);
		Card test = new Card("Three", "Diamonds", 3); 
		System.out.println(test);;
	}
}
