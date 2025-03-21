/**
 * 
 */
package saveOurPlanet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class GameBoard {

	public static final String CHEQUERED_FLAG = "U+1F3C1";
	public static final String WIND_EMOJI = "U+1F32C";
	public static final String WATER_EMOJI = "U+1F4A7";
	public static final String FIRE_EMOJI = "U+1F525";
	public static final String SOIL_EMOJI = "U+1F331";
	public static final String VOLCANO_EMOJI = "U+1F30B";
	public static final String TORNADO_EMOJI = "U+1F32A";
	public static final String EARTHQUAKE_EMOJI = "U+1F3DA";
	public static final String SLIDE_EMOJI = "U+1F6DD";
	public static final String SUN_EMOJI = "U+2600";
	public static final String WAVE_EMOJI = "U+1F30A";
	public static final String G8_EMOJI = "U+1F310";
	public static final String BATTERY_EMOJI = "U+1F50B";
	public static final String NUCLEAR_EMOJI = "U+2622";
	public static final String RECYCLING_EMOJI = "U+267B";
	public static final String SLEEPING_EMOJI = "U+1F4A4";
	public static final String CELEBRATE_EMOJI = "U+1F37E";

	private int squareNumber;
	private int boardSize;
	private static Map<String, Integer> nameToNumberMap;
	private static Map<Integer, String> numberToNameMap;

	public List<Square> squares;
	public Map<FieldName, List<Square>> fieldSquares;

	public GameBoard() {

		// creating maps to find square number from name, and name from square number.
		nameToNumberMap = new HashMap<String, Integer>();
		numberToNameMap = new HashMap<Integer, String>();
		initializeBoard();

		// creating map to store FieldNames
		fieldSquares = new HashMap<FieldName, List<Square>>();

	}

//	public Square(int squareNumber, String squareName, String emoji, boolean isOwned, Player owner, int squareCost,
//			int landingTariff, int devLevel, int devCost, int devTariff, int majorDevCosts, int majorDevTariff,
//			FieldName fieldName, Scanner scanner)
//    CONSTRUCTOR JUST FOR REFERENCE

	/**
	 * Initialises a new game board, populating the board with squares and square
	 * details.
	 */
	public void initializeBoard() {
		squares = new ArrayList<>();

		squares.add(new Square(1, "Start Point " + CHEQUERED_FLAG, false, null, 0, 200, 0, 0, 0, 0, 0,
				FieldName.RECYCLING_CENTRE, null));
		squares.add(new Square(2, "Wind " + WIND_EMOJI, false, null, 140, 5, 0, 0, 0, 0, 0, FieldName.ELEMENTS, null));
		squares.add(new Square(3, "Water " + WATER_EMOJI, false, null, 140, 5, 0, 30, 70, 30, 20, FieldName.ELEMENTS,
				null));
		squares.add(
				new Square(4, "Fire " + FIRE_EMOJI, false, null, 140, 5, 0, 30, 20, 70, 20, FieldName.ELEMENTS, null));
		squares.add(
				new Square(5, "Earth " + SOIL_EMOJI, false, null, 140, 5, 0, 30, 70, 70, 20, FieldName.ELEMENTS, null));
		squares.add(new Square(6, "Battery Storage Plant " + BATTERY_EMOJI, false, null, 400, 200, 0, 100, 200, 200,
				800, FieldName.RENEWABLE_ENERGY, null));
		squares.add(new Square(7, "Nuclear Power Plant " + NUCLEAR_EMOJI, false, null, 400, 200, 0, 100, 200, 200, 800,
				FieldName.CONTROVERSIAL_ENERGY, null));
		squares.add(new Square(8, "Solar Farm " + SUN_EMOJI, false, null, 400, 200, 0, 100, 200, 200, 800,
				FieldName.RENEWABLE_ENERGY, null));
		squares.add(new Square(9, "Hydroelectric Power Plant " + WAVE_EMOJI, false, null, 400, 200, 0, 100, 200, 200,
				800, FieldName.RENEWABLE_ENERGY, null));
		squares.add(
				new Square(10, "G8 Summit " + G8_EMOJI, false, null, 0, 0, 0, 0, 0, 0, 0, FieldName.G8_SUMMIT, null));
		squares.add(new Square(11, "Mudslide " + SLIDE_EMOJI, false, null, 0, 140, 0, 0, 0, 0, 0,
				FieldName.NATURAL_DISASTER, null));
		squares.add(new Square(12, "Volcano " + VOLCANO_EMOJI, false, null, 0, 140, 0, 0, 0, 0, 0,
				FieldName.NATURAL_DISASTER, null));
		squares.add(new Square(13, "Tornado " + TORNADO_EMOJI, false, null, 140, 5, 0, 30, 70, 70, 20,
				FieldName.NATURAL_DISASTER, null));
		squares.add(new Square(14, "Earthquake " + EARTHQUAKE_EMOJI, false, null, 140, 5, 0, 30, 70, 70, 20,
				FieldName.NATURAL_DISASTER, null));

		// populating the Name to Number HashMap
		nameToNumberMap.put("Start Point" + CHEQUERED_FLAG, 1);
		nameToNumberMap.put("Wind" + WIND_EMOJI, 2);
		nameToNumberMap.put("Water" + WATER_EMOJI, 3);
		nameToNumberMap.put("Fire" + FIRE_EMOJI, 4);
		nameToNumberMap.put("Earth" + SOIL_EMOJI, 5);
		nameToNumberMap.put("Volcano" + VOLCANO_EMOJI, 6);
		nameToNumberMap.put("Tornado" + TORNADO_EMOJI, 7);
		nameToNumberMap.put("Earthquake" + EARTHQUAKE_EMOJI, 8);
		nameToNumberMap.put("Mudslide" + SLIDE_EMOJI, 9);
		nameToNumberMap.put("Solar Farm" + SUN_EMOJI, 10);
		nameToNumberMap.put("Hydroelectric Power Plant" + WAVE_EMOJI, 11);
		nameToNumberMap.put("G8 Summit" + G8_EMOJI, 12);
		nameToNumberMap.put("Battery Storage Plant" + BATTERY_EMOJI, 13);
		nameToNumberMap.put("Nuclear Power Plant" + NUCLEAR_EMOJI, 14);

		// populating the Number to Name HashMap
		numberToNameMap.put(1, "Start Point" + CHEQUERED_FLAG);
		numberToNameMap.put(2, "Wind" + WIND_EMOJI);
		numberToNameMap.put(3, "Water" + WATER_EMOJI);
		numberToNameMap.put(4, "Fire" + FIRE_EMOJI);
		numberToNameMap.put(5, "Earth" + SOIL_EMOJI);
		numberToNameMap.put(6, "Volcano" + VOLCANO_EMOJI);
		numberToNameMap.put(7, "Tornado" + TORNADO_EMOJI);
		numberToNameMap.put(8, "Earthquake" + EARTHQUAKE_EMOJI);
		numberToNameMap.put(9, "Mudslide" + SLIDE_EMOJI);
		numberToNameMap.put(10, "Solar Farm" + SUN_EMOJI);
		numberToNameMap.put(11, "Hydroelectric Power Plant" + WAVE_EMOJI);
		numberToNameMap.put(12, "G8 Summit" + G8_EMOJI);
		numberToNameMap.put(13, "Battery Storage Plant" + BATTERY_EMOJI);
		numberToNameMap.put(14, "Nuclear Power Plant" + NUCLEAR_EMOJI);

	}

	public List<Square> getSquares() {
		return squares;
	}

	/**
	 * Method to retrieve the square name from the numbered position on the board
	 * 
	 * @param squareNumber
	 * @return
	 */
	public Square getSquareByNumber(int squareNumber) {
		for (Square square : squares) {
			if (square.getSquareNumber() == squareNumber) {
				return square;
			}
			square.getSquareName();
		}
		return null;
	}

	/**
	 * Method to retrieve the square number from the square name, for the purpose of
	 * changing position on the board.
	 * 
	 * @param squareName
	 * @return squareNumber
	 */
	public int getNumberbyName(String squareName) {
		for (Square square : squares) {
			if (square.getSquareName().equalsIgnoreCase(squareName)) {
				return squareNumber;
			}
		}
		return 0;

	}

	/**
	 * @return the boardSize
	 */
	public int getBoardSize() {
		return boardSize;
	}

	/**
	 * @param boardSize the boardSize to set
	 */
	public void setBoardSize(int boardSize) {
		this.boardSize = squares.size();
	}

	/**
	 * Method to simulate the game board by displaying details for each square.
	 */
	public void displayBoard() {
		for (Square square : squares) {
			System.out.println("Square " + square.getSquareNumber() + ": " + square.getSquareName());
		}
	}

	/**
	 * method to calculate a player's movement on the game board according to their
	 * {@link Dice} result
	 * 
	 * @param diceRoll
	 * @return
	 */
	public int calculateMove(int diceRoll) {

		Dice dice = new Dice();
		diceRoll = dice.getDiceResult();

		return squareNumber; // should this be an int or a String, worked out from an int?
	}

	public List<Square> getSquaresByField(FieldName field) {
		return fieldSquares.getOrDefault(field, new ArrayList<>());
	}

	/**
	 * Method to determine if a player owns a whole field and can therefore develop
	 * properties.
	 * 
	 * @param player
	 * @param field
	 * @return
	 */
	public boolean ownsFullField(Player player, FieldName field) {
		List<Square> fieldSquares = getSquaresByField(field);
		for (Square square : fieldSquares) {
			if (square.getOwner() != player) {
				return false;
			}
		}
		return true;

	}

	/**
	 * Method to determine what fields are fully owned by the current player.
	 * 
	 * @param player
	 * @return list of fields fully owned by current player
	 */
	public List<FieldName> getFullFieldsOwnedBy(Player player) {
		List<FieldName> ownedFields = new ArrayList<>();

		for (FieldName field : FieldName.values()) {
			if (ownsFullField(player, field)) {
				ownedFields.add(field);
			}
		}

		return ownedFields;
	}

}
