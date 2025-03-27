/**
 * 
 */
package saveOurPlanet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Gameplay {
	
	public static final String STATS_EMOJI = "\uD83D\uDCCA";
	public static final String WORLD_EMOJI = "\uD83C\uDF0D";
	public static final String CELEBRATE_EMOJI = "\uD83C\uDF89";
	public static final String UPGRADE_EMOJI = "\uD83D\uDCC8";

	private Game game;
	private Dice dice;
	private GameBoard board;
	private Player currentPlayer;
	private Questions questions;
	private List<Player> players;

	public Gameplay(Game game) {
		this.game = game;
		this.dice = new Dice();
		this.board = new GameBoard(game.getScanner());
		this.currentPlayer = game.getCurrentPlayer();
		this.questions = new Questions();
		this.players = game.getPlayers();

	}

	/**
	 * method for main game loop in order to implement turn-based system
	 */
	public void runGameLoop() {
		Scanner scanner = game.getScanner();

		System.out.println("Player count in game loop: " + players.size() + "\n");

		do {
			for (Player player : players) {
				if (player.hasQuit()) {
					continue;
				}
				currentPlayer = player;
				game.setCurrentPlayer(currentPlayer);

				if (!currentPlayer.hasStarted()) {
					currentPlayer.setResourceBalance(1500);
					System.out
							.println("\n" + player.getUsername() + ", you have been given 1500 resources to start.\n");
					currentPlayer.setHasStarted(true);
				}
				System.out.println(currentPlayer.getUsername()
						+ ", ready to roll the dice? (Y / N), or enter 'Exit' to leave the game.");
				System.out.print(" > ");
				String startDecision = scanner.nextLine().trim();

				if (startDecision != null && startDecision.equalsIgnoreCase(Game.DECISION_EXIT)) {
					System.out.println("Sorry to see you go " + currentPlayer.getUsername() + ". Come back soon!");
					currentPlayer.setHasQuit(true);

					int activePlayers = 0;
					for (Player p : players) {
						if (!p.hasQuit()) {
							activePlayers++;
						}
					}
					if (activePlayers < 2) {
						System.out.println("Oh no, there aren't enough players left to continue the game!\n");
						game.setStarted(false);
						displayLeaderboard();
						return;
					} else {
						System.out.println("There are now " + activePlayers + "left playing the game.");
					}
					continue;
				} else if (startDecision != null && startDecision.equalsIgnoreCase(Game.DECISION_NO)) {
					System.out.println(player.getUsername() + " chose not to roll on this turn.\n");
					continue;
				} else {
					System.out.println("Rolling the dice for " + currentPlayer.getUsername() + "... " + Dice.DICE_EMOJI + "\n");
					int rollResult = dice.calculateDiceResult();
					System.out.println(currentPlayer.getUsername() + ", you have rolled a " + dice.getValue1()
							+ " and a " + dice.getValue2() + "\n - that gives you " + rollResult + ".\n");

					int previousPosition = currentPlayer.getPositionOnBoard();
					currentPlayer.move(rollResult, board.getBoardSize(), board);
					int newPosition = currentPlayer.getPositionOnBoard();

					Square landedSquare = board.getSquareByNumber(newPosition);

					if (currentPlayer.getPositionOnBoard() == 1 && !currentPlayer.hasStarted()) {
						System.out.println("You’re at the Start Point! " + GameBoard.CHEQUERED_FLAG + "\n");
						player.setHasStarted(true);
						continue;
					} else if (currentPlayer.hasStarted() && newPosition < previousPosition) {
						System.out.println(GameBoard.RECYCLING_EMOJI + currentPlayer.getUsername()
								+ ", you've passed the Recycling Centre! You earn 200 resources.");
						currentPlayer.recyclingCentre();
						System.out.println("\nYour new resource balance: " + currentPlayer.getResourceBalance());
					} else if (currentPlayer.getPositionOnBoard() == 1) {
						System.out.println("\nYou've landed on the Recycling Centre! " + GameBoard.RECYCLING_EMOJI);
						currentPlayer.recyclingCentre();
						System.out.println("\nYour new resource balance: " + currentPlayer.getResourceBalance());
						continue;
					}

					landedSquare.manageSquare(currentPlayer, landedSquare, board, questions, game);

					offerUpgrades(currentPlayer, board, game.getScanner());

					if (player.getResourceBalance() <= 0 && !player.isBankrupt()) {
						player.bankruptPlayer(player, game);
					}

					if (game.isBankruptcyTriggered()) {
						game.incrementFinalTurnCounter();
						int activePlayers = 0;
						for (Player p : players) {
							if (!p.hasQuit() && !p.isBankrupt()) {
								activePlayers++;
							}
						}
						if (game.getFinalTurnCounter() >= activePlayers - 1) {
							System.out.println("\n The final round is over! Thanks for playing Save Our Planet! " + WORLD_EMOJI);
							game.setStarted(false);
							break;
						}
				
					}
				}	    System.out.println("\n" + STATS_EMOJI + " Updated Resource Balances:");
			    for (Player p : players) {
			        if (!p.hasQuit()) {
			            System.out.println(p.getUsername() + ": " + p.getResourceBalance() + " resources");
			        }
			    }
			    System.out.println();
			    if (!game.isStarted()) {
			        displayLeaderboard();
			    }
			}
			
		} while (game.isStarted() == true);
	}

	public void offerUpgrades(Player player, GameBoard board, Scanner scanner) {
		List<FieldName> fullFields = board.getFullFieldsOwnedBy(player);

		if (fullFields.isEmpty()) {
			System.out.println("\nYou don't own any full fields, so you can't upgrade yet. Let's keep going.");
			return;
		}

		for (FieldName field : fullFields) {
			System.out.println("\nYou own all properties in the " + field + " field.");
			System.out.println("\nWould you like to upgrade a property in this field? (Y / N)");
			System.out.print(" > ");
			String developDecision = scanner.nextLine();
			
			if (developDecision.equalsIgnoreCase(Game.DECISION_YES)) {
				developPropertyInField(player, field, board, scanner);
			}
		}

		System.out.println("No more development opportunities available. Moving to next player...");
	}

	private void developPropertyInField(Player player, FieldName field, GameBoard board, Scanner scanner) {
		List<Square> squaresInField = board.getSquaresByField(field);

		System.out.println("Here are the properties you can develop in the " + field + " field:");
		for (int i = 0; i < squaresInField.size(); i++) {
			Square square = squaresInField.get(i);
			System.out.println((i + 1) + ") " + square.getSquareName() + " (Level " + square.getDevLevel() + ")");
		}

		System.out.println("Enter the number of the property you want to develop, or enter 0 to skip.");
		System.out.print(" > ");
		int propertyDecision = scanner.nextInt();
		scanner.nextLine();

		if (propertyDecision > 0 && propertyDecision <= squaresInField.size()) {
			Square selectedSquare = squaresInField.get(propertyDecision - 1);
			selectedSquare.develop(player, board, questions);
			System.out.println(selectedSquare.getSquareName() + " has been upgraded! " + UPGRADE_EMOJI);
		} else {
			System.out.println("Skipping development opportunities for this field.");
		}
	}

	public void displayLeaderboard() {
		System.out.println(
				"\n" + GameBoard.CHEQUERED_FLAG + "Here's the Final Leaderboard! " + GameBoard.CHEQUERED_FLAG + "\n");

		List<Player> rankedPlayers = new ArrayList<>();
		for (Player player : players) {
			if (!player.hasQuit()) {
				rankedPlayers.add(player);
			}
		}
		Collections.sort(rankedPlayers, new Leaderboard());

		int ranking = 1;
		for (Player player : rankedPlayers) {
			    switch (ranking) {
			        case 1:
			            System.out.print(Leaderboard.GOLD_MEDAL + " ");
			            break;
			        case 2:
			            System.out.print(Leaderboard.SILVER_MEDAL + " ");
			            break;
			        case 3:
			            System.out.print(Leaderboard.BRONZE_MEDAL + " ");
			            break;
			        default:
			            System.out.print("   ");
			    }
			System.out.println(
					ranking + ". " + player.getUsername() + " : " + player.getResourceBalance() + " resources");
			ranking++;	
			}
		if (!rankedPlayers.isEmpty()) {
			Player winner = rankedPlayers.get(0);
			System.out.println("\n" + CELEBRATE_EMOJI + "Congratulations " + winner.getUsername() + "! You Saved Our Planet!" + WORLD_EMOJI + "\n");
		}
	}

}
