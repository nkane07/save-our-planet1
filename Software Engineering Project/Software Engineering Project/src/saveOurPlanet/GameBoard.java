/**
 * 
 */
package saveOurPlanet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class GameBoard {
	
	private int squareNumber;
	
	
	private List<Square> squares;

    public GameBoard() {
        List<Square> squares = new ArrayList<>();
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
    }

    public List<Square> getSquares() {
        return squares;
    }

    public Square getSquareByNumber(int number) { // NUMBER WILL BE ASSIGNED TO THE DICE ROLL
        for (Square square : squares) {
            if (square.getSquareNumber() == number) {
                return square;
            }
        }
        return null; // Return null if no match is found
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
