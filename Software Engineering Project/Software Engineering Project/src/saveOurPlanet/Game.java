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
	static final String DECISION_EXIT = "Exit";

	private boolean isStarted;
	private int noOfPlayers;
	private String playerDecision;
	private Scanner scanner;
	private Player currentPlayer;

	// might not need this
	List<Player> turnOrder = new ArrayList<Player>();

	// player line-up
	List<Player> players = new ArrayList<Player>();

	// also applies for turn order

//	static final int GAME_ID;	Do we need this?

	// created game constructor to always include scanner
	public Game(Scanner scanner) {
		this.scanner = new Scanner(System.in); // calling one general scanner, created in main class for all inputs
		this.players = new ArrayList<Player>();
	}

	/**
	 * Constructor with args for Game Class.
	 * 
	 * @param isStarted
	 * @param playerName
	 * @param noOfPlayers
	 * @param playerDecision
	 * @param scanner
	 * @param playerNumber
	 * @param currentPlayer
	 * @param turnOrder
	 * @param players
	 */
	public Game(boolean isStarted, String playerName, int noOfPlayers, String playerDecision, Scanner scanner,
			int playerNumber, Player currentPlayer, List<Player> turnOrder, List<Player> players) {
		super();
		this.isStarted = isStarted;
		this.noOfPlayers = noOfPlayers;
		this.playerDecision = playerDecision;
		this.scanner = scanner;
		this.currentPlayer = currentPlayer;
		this.turnOrder = turnOrder;
		this.players = players;
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

	/**
	 * @return the currentPlayer
	 */
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * @param currentPlayer the currentPlayer to set
	 */
	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	/**
	 * Method to initiate the player line-up and assign player number and names.
	 */
	public void setUp() {

		// setting number of players
		System.out.println("Welcome to Save Our Planet!\n"); // insert a little slogan or game instructions here??
		System.out.println("Please enter the number of players (1 - " + MAX_PLAYERS + ") : ");
		noOfPlayers = scanner.nextInt();
		scanner.nextLine(); // consumes new line

		players = new ArrayList<Player>();

		if (noOfPlayers >= 2 && noOfPlayers < MAX_PLAYERS) {
			for (int i = 1; i <= noOfPlayers; i++) {
				System.out.println("What is Player " + i + "'s name? ");
				Player player = new Player();
				String playerName = scanner.nextLine();
				player.setUsername(playerName); //
				players.add(player);
			}

		} else {
			System.out.println(
					"Sorry, invalid number of players, please enter a number between 1 & " + MAX_PLAYERS + ".");
			noOfPlayers = scanner.nextInt();
			scanner.nextLine();
		}

		System.out.println("Number of players: " + noOfPlayers + "\n");
		for (Player player : players) {
			System.out.println("Player name: " + player.getUsername() + "\n");
		}

	}

	/**
	 * Method to initiate the game and distribute starting resources.
	 * 
	 * @throws InterruptedException
	 */
	public void startGame() {

		this.isStarted = true;
		for (Player player : players) {
			currentPlayer = player;
			System.out.println(player.getUsername() + ", you have been given 1500 resources to start.\n"
					+ "Ready to roll the dice?");
			player.setResourceBalance(1500);
			playerDecision = scanner.nextLine();
			if (playerDecision != null && playerDecision.equalsIgnoreCase(Game.DECISION_YES)) {
				System.out.println("Rolling the dice for " + player.getUsername());
			} else {
				if (playerDecision != null && playerDecision.equalsIgnoreCase(Game.DECISION_NO)) {
					System.out.println(player.getUsername() + " chose not to roll.");
					continue;
				}
			}
		}
	}

	/**
	 * Method to announce the rolling of the die and the result
	 */
	public void rollDice() {

		Player currentPlayer = getCurrentPlayer();
		String playerName = currentPlayer.getUsername();

		Dice dice = new Dice();
		System.out.println("Rolling the dice for " + playerName);
		dice.calculateDiceResult();
		System.out.println(playerName + ", you have rolled a " + dice.getValue1() + " and a " + dice.getValue2()
				+ " - that gives you " + dice.getDiceResult() + ".\n");
	}

	public void endGame() {

	}

	public void nextTurn() {

	}

}
