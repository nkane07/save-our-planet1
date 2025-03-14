/**
 * 
 */
package saveOurPlanet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class GameBoard {

	private int squareNumber;
	private String squareName;
	private static Map<String, Integer> nameToNumberMap;
	private static Map<Integer, String> numberToNameMap;

	private List<Square> squares;

	public GameBoard() {

		// creating maps to find square number from name, and name from square number.
		nameToNumberMap = new HashMap<String, Integer>();
		numberToNameMap = new HashMap<Integer, String>();
		initializeBoard();

	}

//    public Square(int squareNumber, String squareName, boolean isOwned, Player owner, SquareType type, int squareCost,
//			int landingTariff, int devCosts, int majorDevCosts, int majorDevTariff)
//    CONSTRUCTOR JUST FOR REFERENCE

	private void initializeBoard() {
		squares.add(new Square(1, "Start Point", false, null, null, 0, 0, 0, 0, 0));
		squares.add(new Square(2, "Wind", false, null, null, 140, 5, 30, 70, 20));
		squares.add(new Square(3, "Water", false, null, null, 140, 5, 30, 70, 20));
		squares.add(new Square(4, "Fire", false, null, null, 140, 5, 0, 0, 20));
		squares.add(new Square(5, "Earth", false, null, null, 140, 5, 0, 0, 20));
		squares.add(new Square(6, "Volcano", false, null, null, 140, 5, 0, 0, 20));
		squares.add(new Square(7, "Tornado", false, null, null, 140, 5, 0, 0, 20));
		squares.add(new Square(8, "Earthquake", false, null, null, 140, 5, 0, 0, 20));
		squares.add(new Square(9, "Mudslide", false, null, null, 140, 5, 0, 0, 20));
		squares.add(new Square(10, "Solar Farm", false, null, null, 400, 200, 100, 200, 800));
		squares.add(new Square(11, "Hydroelectric Power Plant", false, null, null, 400, 200, 0, 0, 800));
		squares.add(new Square(12, "G8 Summit", false, null, null, 0, 0, 0, 0, 0)); // Not acquirable
		squares.add(new Square(13, "Battery Storage Plant", false, null, null, 400, 200, 100, 200, 800));
		squares.add(new Square(14, "Nuclear Power Plant", false, null, null, 400, 200, 100, 200, 800));

		// populating the Name to Number HashMap
		nameToNumberMap.put("Start Point", 1);
		nameToNumberMap.put("Wind", 2);
		nameToNumberMap.put("Water", 3);
		nameToNumberMap.put("Fire", 4);
		nameToNumberMap.put("Earth", 5);
		nameToNumberMap.put("Volcano", 6);
		nameToNumberMap.put("Tornado", 7);
		nameToNumberMap.put("Earthquake", 8);
		nameToNumberMap.put("Mudslide", 9);
		nameToNumberMap.put("Solar Farm", 10);
		nameToNumberMap.put("Hydroelectric Power Plant", 11);
		nameToNumberMap.put("G8 Summit", 12);
		nameToNumberMap.put("Battery Storage Plant", 13);
		nameToNumberMap.put("Nuclear Power Plant", 14);

		// populating the Number to Name HashMap
		numberToNameMap.put(1, "Start Point");
		numberToNameMap.put(2, "Wind");
		numberToNameMap.put(3, "Water");
		numberToNameMap.put(4, "Fire");
		numberToNameMap.put(5, "Earth");
		numberToNameMap.put(6, "Volcano");
		numberToNameMap.put(7, "Tornado");
		numberToNameMap.put(8, "Earthquake");
		numberToNameMap.put(9, "Mudslide");
		numberToNameMap.put(10, "Solar Farm");
		numberToNameMap.put(11, "Hydroelectric Power Plant");
		numberToNameMap.put(12, "G8 Summit");
		numberToNameMap.put(13, "Battery Storage Plant");
		numberToNameMap.put(14, "Nuclear Power Plant");

	}

	public List<Square> getSquares() {
		return squares;
	}

	public String getSquareByNumber(int squareNumber) { // NUMBER WILL BE ASSIGNED BY THE DICE ROLL
		for (Square square : squares) {
			if (square.getSquareNumber() == squareNumber) {
				return squareName;
			}
		}
		return null; // Return null if no match is found
	}

	public int getNumberbyName(String squareName) {
		for (Square square : squares) {
			if (square.getSquareName().equalsIgnoreCase(squareName)) {
				return squareNumber;
			}
		}
		return 0;

	}

	public void displayBoard() {
		for (Square square : squares) {
			System.out.println("Square " + square.getSquareNumber() + ": " + square.getSquareName());
		}
	}

	public int landOnSquare() {

		return squareNumber;
	}

	public int calculateMove(int diceRoll) {

		Dice dice = new Dice();
		diceRoll = dice.getDiceResult();

		return squareNumber; // should this be an int or a String, worked out from an int?
	}

}
