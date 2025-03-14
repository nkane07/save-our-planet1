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
	private int playerNumber;

	// might not need this
	List<Player> turnOrder = new ArrayList<Player>();

	// player line-up
	List<Player> players = new ArrayList<Player>();

	// also applies for turn order

//	static final int GAME_ID;	Do we need this?

	// created game constructor to always include scanner
	public Game() {
		this.scanner = new Scanner(System.in); // calling one general scanner, created in main class for all inputs
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

	/**
	 * @param isStarted the isStarted to set
	 */
	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the scanner
	 */
	public Scanner getScanner() {
		return scanner;
	}

	/**
	 * @param scanner the scanner to set
	 */
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	/**
	 * @return the turnOrder
	 */
	public List<Player> getTurnOrder() {
		return turnOrder;
	}

	/**
	 * @param turnOrder the turnOrder to set
	 */
	public void setTurnOrder(List<Player> turnOrder) {
		this.turnOrder = turnOrder;
	}

	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(List<Player> players) {
		this.players = players;
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
		int index = 1;
		for (Player player : players) {
			playerNumber = index;
			System.out.println("Please enter name for Player No." + playerNumber);
			player.setUsername(scanner.nextLine());
		} index++;

	}

	public void startGame() throws InterruptedException {
		
		Game game = new Game();

		while (!game.isStarted) {
			for (Player player : players) {
				System.out.println("You have been given ... to start.\n" + "Ready to roll the dice?"); // how many
																										// resources?
				playerDecision = scanner.nextLine();
				if (playerDecision != null && playerDecision.equalsIgnoreCase(Game.DECISION_YES)) {
					

				} else {
					if (playerDecision != null && playerDecision.equalsIgnoreCase(Game.DECISION_NO)) {
						System.out.println("...");
						Thread.sleep(2000);
						continue;
					}
				}
			}
		}
	}
	
	public void rollDice() {
		
		Dice dice = new Dice();
		System.out.println("Rolling the dice for " + playerName);
		dice.calculateDiceResult();
		System.out.println(playerName + ", you have rolled " + dice.getDiceResult() + ".\n");
	}


	public void endGame() {

	}

	public void nextTurn() {

	}

}
