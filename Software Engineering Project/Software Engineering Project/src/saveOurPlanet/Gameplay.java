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
public class Gameplay {

	private Game game;
	private Dice dice;
	private GameBoard board;
	private Player currentPlayer;
	private Questions questions;
	private List<Player> players;

	public Gameplay(Game game) {
		this.game = game;
		this.dice = new Dice();
		this.board = new GameBoard();
		this.currentPlayer = game.getCurrentPlayer();
		this.questions = new Questions();
		this.players = new ArrayList<Player>();

	}

	/**
	 * method for main game loop in order to implement turn-based system
	 */
	public void runGameLoop() {

		while (game.isStarted()) {
			
			for (Player player : players) {
	            currentPlayer = player;
	            game.setCurrentPlayer(currentPlayer);
	            
	            System.out.println("\n " + Dice.DICE_EMOJI + "It's " + currentPlayer.getUsername() + "'s turn!");
	            System.out.println(Dice.DICE_EMOJI +" Would you like to roll? "+ Dice.DICE_EMOJI);
			
			if (game.getPlayerDecision().equalsIgnoreCase(Game.DECISION_YES)) {
				
				game.rollDice();
				int rollResult = dice.getDiceResult();

				currentPlayer.move(rollResult, board.getBoardSize());

				Square landedSquare = board.getSquareByNumber(game.getCurrentPlayer().getPositionOnBoard());
				System.out.println("You have now landed on " + landedSquare);

				landedSquare.manageSquare(currentPlayer, landedSquare, board, questions, game);

				offerUpgrades(currentPlayer, board, game.getScanner());

				landedSquare.purchase(currentPlayer);
			} else {
				System.out.println("...");
			}
			}
		}
			
		

	}

	public void offerUpgrades(Player player, GameBoard board, Scanner scanner) {
		List<FieldName> fullFields = board.getFullFieldsOwnedBy(player);

		if (fullFields.isEmpty()) {
			System.out.println("You don't own any full fields yet. Let's keep going.");
			return;
		}

		for (FieldName field : fullFields) {
			System.out.println("You own all properties in the " + field + " field.");
			System.out.println("Would you like to upgrade a property in this field? (Y / N)");

			String upgradeDecision = scanner.nextLine();
			if (upgradeDecision.equalsIgnoreCase(Game.DECISION_YES)) {
				upgradePropertyInField(player, field, board, scanner);
			}
		}

		System.out.println("No more upgrades available. Moving to next player...");
	}

	private void upgradePropertyInField(Player player, FieldName field, GameBoard board, Scanner scanner) {
		List<Square> squaresInField = board.getSquaresByField(field);

		System.out.println("Here are the properties you can upgrade in the " + field + " field:");
		for (int i = 0; i < squaresInField.size(); i++) {
			Square square = squaresInField.get(i);
			System.out.println((i + 1) + ") " + square.getSquareName() + " (Level " + square.getDevLevel() + ")");
		}

		System.out.println("Enter the number of the property you want to upgrade, or enter 0 to skip.");
		int propertyDecision = scanner.nextInt();
		scanner.nextLine();

		if (propertyDecision > 0 && propertyDecision <= squaresInField.size()) {
			Square selectedSquare = squaresInField.get(propertyDecision - 1);
			selectedSquare.upgrade(player, board);
			System.out.println(selectedSquare.getSquareName() + " has been upgraded!");
		} else {
			System.out.println("Skipping upgrades for this field.");
		}
	}

}
