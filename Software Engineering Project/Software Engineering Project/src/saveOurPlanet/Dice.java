/**
 * 
 */
package saveOurPlanet;

/**
 * 
 */
public class Dice {

	public static final String DICE_EMOJI = "\uD83C\uDFB2";

	private int value1;
	private int value2;
	private int diceResult; // added instead of creating type diceResult

	/**
	 * @return the value1
	 */
	public int getValue1() {
		return value1;
	}

	/**
	 * @param value1 the value1 to set
	 */
	public void setValue1(int value1) {
		this.value1 = value1;
	}

	/**
	 * @return the value2
	 */
	public int getValue2() {
		return value2;
	}

	/**
	 * @param value2 the value2 to set
	 */
	public void setValue2(int value2) {
		this.value2 = value2;
	}

	/**
	 * @return the diceResult
	 */
	public int getDiceResult() {
		return diceResult;
	}

	/**
	 * @param diceResult the diceResult to set
	 */
	public void setDiceResult(int diceResult) {
		this.diceResult = diceResult;
	}

	/**
	 * Simulates rolling of two die combining {@value 1 + 2} to calculate result
	 * 
	 * @return value1+value2
	 */
	public int calculateDiceResult() {

		// put random number generator in here and return
		value1 = (int) (Math.random() * 6) + 1;
		value2 = (int) (Math.random() * 6) + 1;
		diceResult = value1 + value2;

		return diceResult;
	}

}
