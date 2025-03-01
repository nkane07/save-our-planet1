/**
 * 
 */
package saveOurPlanet;

import java.util.Scanner;

/**
 * 
 */
public class Gameplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creating new game system
		Scanner scanner = new Scanner(System.in);
		Game game = new Game(scanner);

		// calling setUp method - asking for player names etc.
		game.setUp();

		// confirming players are ready to start
		 System.out.println("Are you ready to start the game? Please enter 'Y' or 'N'");
	        String decision = scanner.nextLine();
	        game.setPlayerDecision(decision);
		
		if (game.getPlayerDecision() != null && game.getPlayerDecision().equalsIgnoreCase(Game.DECISION_YES)) {
			System.out.println("Starting game...");

			// running start method
			game.startGame();
			
			
			//populating hashmap with landing squares / numbers.
			
			
			
			//creating instance of the game board and populating
			  GameBoard board = new GameBoard();
			  
//		        board.displayBoard(); ONLY USING THIS TO TEST THAT IT CONNECTS TO THE BOARD PROPERLY

			
			

			} else if (game.getPlayerDecision() != null && game.getPlayerDecision().equalsIgnoreCase(Game.DECISION_NO)) {
			System.out.println("Game failed to start..."); // what should happen here when the game fails to start?
			// ... Will we loop it back to the very start i.e. Welcome...

		}

		scanner.close();
	}

}
