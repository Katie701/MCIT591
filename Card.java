/**create a card class
author: katie wang
*/
public class Card {

	String name;
	int cardValue;
	static String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	static String[] suits = { "H", "S", "D", "C" };

	/**
	 * construct a card object
	 */

	Card(String name) {
		this.name = name;

	}

	/**
	 * 
	 * @return get the name of the card
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @return get the value of the card
	 */
	public int getValue() {
		if (this.name.charAt(0) == 'J' || this.name.charAt(0) == 'Q' || this.name.charAt(0) == 'K') {
			this.cardValue = 10;
		}
		if (this.name.charAt(0) == '2') {
			this.cardValue = 2;
		}
		if (this.name.charAt(0) == '3') {
			this.cardValue = 3;
		}
		if (this.name.charAt(0) == '4') {
			this.cardValue = 4;
		}
		if (this.name.charAt(0) == '5') {
			this.cardValue = 5;
		}
		if (this.name.charAt(0) == '6') {
			this.cardValue = 6;
		}
		if (this.name.charAt(0) == '7') {
			this.cardValue = 7;
		}
		if (this.name.charAt(0) == '8') {
			this.cardValue = 8;
		}
		if (this.name.charAt(0) == '9') {
			this.cardValue = 9;
		}
		if (this.name.charAt(0) == '1') {
			this.cardValue = 10;
		}
		if (this.name.charAt(0) == 'A') {
			this.cardValue = 1; // by default
		}

		return this.cardValue;
	}

}
