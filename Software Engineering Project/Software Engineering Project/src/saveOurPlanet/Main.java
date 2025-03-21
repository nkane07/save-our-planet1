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
		Gameplay gameplay = new Gameplay(game);

		while (true) {

			game.setUp();

			System.out.println("Are you ready to start the game? Please enter 'Y' or 'N' \n");
			String decision = scanner.nextLine();
			game.setPlayerDecision(decision);

			if (game.getPlayerDecision().equalsIgnoreCase(Game.DECISION_YES)) {
				System.out.println("Starting game...");
				game.startGame();
				gameplay.runGameLoop();
			} else {
				System.out.println("Game failed to start start. Press Enter to restart or type 'exit' to quit.");
				String restart = scanner.nextLine();
				if (restart.equalsIgnoreCase(Game.DECISION_EXIT)) {
					System.out.println("Goodbye!");
					break;
				}
			}
		}
		scanner.close();
	}
}
