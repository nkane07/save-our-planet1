/**
 * 
 */
package saveOurPlanet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */
public class Gameplay {
	
	private Dice dice;
	private GameBoard board;
	private Game game;
	List<Player> players;
	
	
	
	public Gameplay() {
		this.dice = new Dice();
		this.board = new GameBoard();
		this.game = new Game();
		players = new ArrayList<Player>();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creating new game system
		Game game = new Game();
		Scanner scanner = game.getScanner();
		GameBoard board = new GameBoard();

		// calling setUp method - asking for player names etc.
		game.setUp();

		// confirming players are ready to start
		 System.out.println("Are you ready to start the game? Please enter 'Y' or 'N'");
	        String decision = scanner.nextLine();
	        game.setPlayerDecision(decision);
		
		if (game.getPlayerDecision() != null && game.getPlayerDecision().equalsIgnoreCase(Game.DECISION_YES)) {
			System.out.println("Starting game...");
			game.setStarted(true);

			// running start method
			try {
				game.startGame();
			} catch (InterruptedException e) {
				System.out.println("Sorry, the game was interrupted.");
				e.printStackTrace();
			}
			

//			 testing the map in order to check that names and numbers sync up
//			System.out.println("Solar Farm is at position: " + board.getNumberbyName("Solar Farm"));
//	        System.out.println("Square 10 is called: " + board.getSquareByNumber(10));
			
			
			
			//creating instance of the game board and populating
			
			  
//		        board.displayBoard(); ONLY USING THIS TO TEST THAT IT CONNECTS TO THE BOARD PROPERLY

			
			

			} else if (game.getPlayerDecision() != null && game.getPlayerDecision().equalsIgnoreCase(Game.DECISION_NO)) {
			System.out.println("Game failed to start...");
			game.setStarted(false);// what should happen here when the game fails to start?
			// ... Will we loop it back to the very start i.e. Welcome...

		}

		scanner.close();
	}

}
