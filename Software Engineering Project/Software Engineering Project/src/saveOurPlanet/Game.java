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
	private boolean triggerBankruptcy = false;
	private int finalTurnCounter = 0;
	private Player bankruptcyPlayer;

	// player line-up
	List<Player> players = new ArrayList<Player>();

	// also applies for turn order

//	static final int GAME_ID;	Do we need this?

	// created game constructor to always include scanner
	public Game(Scanner scanner) {
		this.scanner = scanner; // calling one general scanner, created in main class for all inputs
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
	 * @return the bankruptcyPlayer
	 */
	public Player getBankruptcyPlayer() {
		return bankruptcyPlayer;
	}

	/**
	 * @param bankruptcyPlayer the bankruptcyPlayer to set
	 */
	public void setBankruptcyPlayer(Player bankruptcyPlayer) {
		this.bankruptcyPlayer = bankruptcyPlayer;
	}

	/**
	 * @return the triggerBankruptcy
	 */
	public boolean isBankruptcyTriggered() {
		return triggerBankruptcy;
	}

	/**
	 * @param triggerBankruptcy the triggerBankruptcy to set
	 */
	public void triggerBankruptcy(boolean triggerBankruptcy) {
		this.triggerBankruptcy = triggerBankruptcy;
	}

	/**
	 * @return the finalTurnCounter
	 */
	public int getFinalTurnCounter() {
		return finalTurnCounter;
	}


	public void incrementFinalTurnCounter() {
		this.finalTurnCounter++;
	}

	/**
	 * Method to initiate the player line-up and assign player number and names.
	 */
	public void setUp() {

		// setting number of players
		System.out.println("Welcome to Save Our Planet!\n"); // insert a little slogan or game instructions here??
		System.out.println("Please enter the number of players (1 - " + MAX_PLAYERS + ") : ");
		System.out.print(" > ");
		noOfPlayers = scanner.nextInt();
		scanner.nextLine().trim(); // consumes new line

		players = new ArrayList<Player>();

		if (noOfPlayers >= 2 && noOfPlayers < MAX_PLAYERS) {
			for (int i = 1; i <= noOfPlayers; i++) {
				System.out.println("What is Player " + i + "'s name?");
				System.out.print(" > ");
				String playerName = scanner.nextLine().trim();
				Player player = new Player();
				player.setUsername(playerName); //
				players.add(player);
			}

		} else {
			System.out.println(
					"Sorry, invalid number of players, please enter a number between 1 & " + MAX_PLAYERS + ". ");
			System.out.print(" > ");
			noOfPlayers = scanner.nextInt();
			scanner.nextLine().trim();
		}

		System.out.println("Number of players: " + noOfPlayers + "\n");
		for (Player player : players) {
			System.out.println("Player name: " + player.getUsername() + "\n");
		}

	}

	/**
	 * Method to initiate the game and trigger the runGameLoop
	 */
	public void startGame() {

		this.isStarted = true;
		
	}


	public void endGame() {

	}

	public void nextTurn() {

	}

}
