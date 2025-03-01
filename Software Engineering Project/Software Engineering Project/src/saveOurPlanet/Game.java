/**
 * 
 */
package saveOurPlanet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Game {

	static final String GAME_NAME = "Save Our Planet";
	static final int MIN_PLAYERS = 2;
	static final int MAX_PLAYERS = 4;
	static final String DECISION_YES = "Y";
	static final String DECISION_NO = "N";

	private boolean isStarted;
	private String playerName;
	private int noOfPlayers;
	private String playerDecision;
	private Scanner scanner;

	// might not need this
	List<Player> turnOrder = new ArrayList<Player>();

	// player line-up
	List<String> players = new ArrayList<String>();

	// also applies for turn order

//	static final int GAME_ID;	Do we need this?

	// created game constructor to always include scanner
	public Game(Scanner scanner) {
		this.scanner = scanner; // calling one general scanner, created in main class for all inputs
	}

	/**
	 * @return the playerDecision
	 */
	public String getPlayerDecision() {
		return playerDecision;
	}

	/**
	 * @param playerDecision the playerDecision to set
	 */
	public void setPlayerDecision(String playerDecision) {
		this.playerDecision = playerDecision;
	}

	/**
	 * @return the noOfPlayers
	 */
	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	/**
	 * @param noOfPlayers the noOfPlayers to set
	 */
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	/**
	 * @return the isStarted
	 */
	public boolean isStarted() {
		return isStarted;
	}

	public void setUp() {

		// setting number of players
		System.out.println("Welcome to Save Our Planet!\n"); // insert a little slogan or game instructions here??
		System.out.println("Please enter the number of players (1 - " + MAX_PLAYERS + ") : ");
		noOfPlayers = scanner.nextInt();
		scanner.nextLine(); // consumes new line

		while (noOfPlayers < 2 || noOfPlayers > MAX_PLAYERS) {
			System.out.println(
					"Sorry, invalid number of players, please enter a number between 1 & " + MAX_PLAYERS + ".");
			noOfPlayers = scanner.nextInt();
			scanner.nextLine();
		}

		// setting player usernames
		for (int playerNo = 1; playerNo <= noOfPlayers; playerNo++) {
			System.out.println("Please enter name for Player No." + playerNo);
			playerName = scanner.nextLine();
			players.add(playerName);
		}

	}

	public void startGame() {

		Dice dice = new Dice();
		for (String playerName : players) {
			System.out.println("You have been given ... to start.\n" + "Ready to roll the dice?");
			playerDecision = scanner.nextLine();
			if (playerDecision != null && playerDecision.equalsIgnoreCase(Game.DECISION_YES)) {
				System.out.println("Rolling the dice for " + playerName);
				dice.roll();
				System.out.println(playerName + ", you have rolled " + dice.getDiceResult() + ".\n");
			} else {
				if (playerDecision != null && playerDecision.equalsIgnoreCase(Game.DECISION_NO)) {
					System.out.println("...");
				}
			}
		}
	}

	public void endGame() {

	}

	public void nextTurn() {

	}

}
