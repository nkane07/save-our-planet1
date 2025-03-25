/**
 * 
 */
package saveOurPlanet;

import java.util.Scanner;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Game game = new Game(scanner);

		game.setUp();

		Gameplay gameplay = new Gameplay(game);

		System.out.println("Are you ready to start the game? Please enter (Y / N)");
		System.out.print(" > ");
		String decision = scanner.nextLine().trim();
		game.setPlayerDecision(decision);

		if (game.getPlayerDecision().equalsIgnoreCase(Game.DECISION_YES)) {
			System.out.println("Starting game...\n");
			game.startGame();
			gameplay.runGameLoop();
		} else {
			System.out.println("Game failed to start start. Press Enter to restart or type 'exit' to quit.");
			System.out.print(" > ");
			String restart = scanner.nextLine().trim();
			if (restart.equalsIgnoreCase(Game.DECISION_EXIT)) {
				System.out.println("Goodbye!");
			}
		}
		scanner.close();
	}

}
