/**
 * 
 */
package saveOurPlanet;

import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Square {

	public static final String CHAMPAGNE_BOTTLE = "\uD83C\uDF7E";
	public static final String SNORING = "\uD83D\uDCA4";
	public static final String RENT_EMOJI = "\uD83D\uDCB8";
	public static final String THINKING_EMOJI = "\uD83E\uDD14";
	public static final String CRANE_EMOJI = "\uD83C\uDFD7\uFE0F";


	private int squareNumber;
	private String squareName;
	private String emoji;
	private boolean isOwned;
	private Player owner;
	private int squareCost; // cost to purchase
	private int landingTariff; // when only owned, not developed
	private int devLevel;
	private int devCost; // cost to develop
	private int devTariff; // cost to land when developed
	private int majorDevCosts; // large-scale development
	private int majorDevTariff; // landing when developed
	private FieldName fieldName;
	private Scanner scanner;

	/**
	 * default constructor
	 */
	public Square() {
		this.scanner = new Scanner(System.in);
	}

	/**
	 * Constructor with args for the Square class
	 * 
	 * @param squareNumber
	 * @param squareName
	 * @param emoji
	 * @param isOwned
	 * @param owner
	 * @param squareCost
	 * @param landingTariff
	 * @param devLevel
	 * @param devCost
	 * @param devTariff
	 * @param majorDevCosts
	 * @param majorDevTariff
	 * @param fieldName
	 * @param scanner
	 */
	public Square(int squareNumber, String squareName, boolean isOwned, Player owner, int squareCost, int landingTariff,
			int devLevel, int devCost, int devTariff, int majorDevCosts, int majorDevTariff, FieldName fieldName,
			Scanner scanner) {
		super();
		this.squareNumber = squareNumber;
		this.squareName = squareName;
		this.isOwned = isOwned;
		this.owner = owner;
		this.squareCost = squareCost;
		this.landingTariff = landingTariff;
		this.devLevel = 0; // initially undeveloped.
		this.devCost = devCost;
		this.devTariff = devTariff;
		this.majorDevCosts = majorDevCosts;
		this.majorDevTariff = majorDevTariff;
		this.fieldName = fieldName;
		this.scanner = scanner;
	}

	/**
	 * @return the squareNumber
	 */
	public int getSquareNumber() {
		return squareNumber;
	}

	/**
	 * @param squareNumber the squareNumber to set
	 */
	public void setSquareNumber(int squareNumber) {
		this.squareNumber = squareNumber;
	}

	/**
	 * @return the squareName
	 */
	public String getSquareName() {
		return squareName;
	}

	/**
	 * @param squareName the squareName to set
	 */
	public void setSquareName(String squareName) {
		this.squareName = squareName;
	}

	/**
	 * @return the emoji
	 */
	public String getEmoji() {
		return emoji;
	}

	/**
	 * @param emoji the emoji to set
	 */
	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	/**
	 * @return the isOwned
	 */
	public boolean isOwned() {
		return isOwned;
	}

	/**
	 * @param isOwned the isOwned to set
	 */
	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	/**
	 * @return the owner
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	/**
	 * @return the squareCost
	 */
	public int getSquareCost() {
		return squareCost;
	}

	/**
	 * @param squareCost the squareCost to set
	 */
	public void setSquareCost(int squareCost) {
		this.squareCost = squareCost;
	}

	/**
	 * @return the landingTariff
	 */
	public int getLandingTariff() {
		return landingTariff;
	}

	/**
	 * @param landingTariff the landingTariff to set
	 */
	public void setLandingTariff(int landingTariff) {
		this.landingTariff = landingTariff;
	}

	/**
	 * @return the devCost
	 */
	public int getDevCosts() {
		return devCost;
	}

	/**
	 * @param devCost the devCost to set
	 */
	public void setDevCosts(int devCosts) {
		this.devCost = devCosts;
	}

	/**
	 * @return the majorDevCosts
	 */
	public int getMajorDevCosts() {
		return majorDevCosts;
	}

	/**
	 * @param majorDevCosts the majorDevCosts to set
	 */
	public void setMajorDevCosts(int majorDevCosts) {
		this.majorDevCosts = majorDevCosts;
	}

	/**
	 * @return the majorDevTariff
	 */
	public int getMajorDevTariff() {
		return majorDevTariff;
	}

	/**
	 * @param majorDevTariff the majorDevTariff to set
	 */
	public void setMajorDevTariff(int majorDevTariff) {
		this.majorDevTariff = majorDevTariff;
	}

	/**
	 * @return the devLevel
	 */
	public int getDevLevel() {
		return devLevel;
	}

	/**
	 * @param devLevel the devLevel to set
	 */
	public void setDevLevel(int devLevel) {
		this.devLevel = devLevel;
	}

	/**
	 * @return the devCost
	 */
	public int getDevCost() {
		return devCost;
	}

	/**
	 * @param devCost the devCost to set
	 */
	public void setDevCost(int devCost) {
		this.devCost = devCost;
	}

	/**
	 * @return the devTariff
	 */
	public int getDevTariff() {
		return devTariff;
	}

	/**
	 * @param devTariff the devTariff to set
	 */
	public void setDevTariff(int devTariff) {
		this.devTariff = devTariff;
	}

	/**
	 * @return the fieldName
	 */
	public FieldName getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(FieldName fieldName) {
		this.fieldName = fieldName;
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
	 * Allows a player to purchase a square, setting that player name as the owner.
	 * 
	 * @param player
	 */
	public void purchase(Player player, Questions questions) {
			System.out.println("No one's in charge of this square.\n");
			System.out.println("Investing in " + squareName + " will cost " + getSquareCost() + " resources.\n"
					+ "If you answer a sustainability question correctly, you can proceed with the purchase.");
			System.out.println("Would you like to invest in this property? (Y / N)");
			System.out.print(" > ");
			String purchaseDecision = scanner.nextLine().trim();
			if (purchaseDecision.equalsIgnoreCase(Game.DECISION_YES) && player.getResourceBalance() >= squareCost) {
				boolean isCorrect = questions.askQuestion();
				if (isCorrect) {
				setOwner(player);
				isOwned = true;
				player.setResourceBalance(player.getResourceBalance() - squareCost);
				System.out.println("Congratulations!  " + CHAMPAGNE_BOTTLE + " " + player.getUsername() + " has harnassed the power of the " + squareName
						+ " for " + squareCost + " resources!");
				System.out.println("\nThey can now charge " + landingTariff + " if someone lands on " + squareName);
				} else {
					System.out.println(" You can't purchase this square this time. Try again later!\n"
							+ "Moving on...\n");
				}
			} else if (player.getResourceBalance() < squareCost) {
				System.out.println(
						player.getUsername() + ", you don't have enough resources to purchase " + squareName + ".");
				System.out.println("It's still up for grabs.");
			} else if (purchaseDecision.equalsIgnoreCase(Game.DECISION_NO)) {
				System.out.println(
						player.getUsername() + " has decided not to invest. So it's still not owned by anyone.");
			}
		}

	/**
	 * Method to charge a landing tariff to a player who lands on a square owned by
	 * another player.
	 * 
	 * @param player
	 */
	public void chargeRent(Player player, Square landedSquare) {

		System.out.println(
				"Uh oh " + player.getUsername() + ", this property is owned by " + landedSquare.getOwner().getUsername() + ". ");
		System.out.println("You now owe them " + landedSquare.getLandingTariff());
		if (player.getResourceBalance() >= landingTariff) {
			player.chargeTariff(landingTariff);
			owner.gainResources(landingTariff);
			System.out.println(
					player.getUsername() + " paid " + landingTariff + " resources to " + owner.getUsername() + RENT_EMOJI + ".");
			System.out.println(owner.getUsername() + " now has " + owner.getResourceBalance());
			System.out.println(player.getUsername() + " you now have " + player.getResourceBalance());
		} else {
			System.out.println(
					player.getUsername() + " does not have enough resources to pay rent!\n" + "They are now bankrupt ");
			player.setResourceBalance(0);

		}
	}

	/**
	 * upgrades an owned square, increasing the landing tariff paid by other players
	 * who land on their squares.
	 * 
	 * @param player
	 * @param board
	 */
	public void develop(Player player, GameBoard board, Questions questions) {
		if (owner.getResourceBalance() >= devCost && board.ownsFullField(owner, fieldName)) {

			if (devLevel < 3) {
				System.out.println(
						"You have enough resources to develop this property! Would you like to invest resources and develop?");
				System.out.print(" > ");
				String devDecision = scanner.next().trim();

				if (devDecision != null && devDecision.equalsIgnoreCase(Game.DECISION_YES)) {
					System.out.println("You must answer a sustainability question first!\n");
					System.out.println("________________________________________________________________");
					boolean isCorrect = questions.askQuestion();
					if (isCorrect) {
					owner.chargeDevCost(devCost);
					devLevel++;
					devTariff += landingTariff / 2;
					System.out.println(owner.getUsername() + " has deveoped " + squareName + " to level " + devLevel
							+ ". It will now cost " + devTariff + " resources to land on this property.");
					} else {
						System.out.println("Sorry, you were incorrect! You can't upgrade this time.\n"
								+ "Moving on...");
					}
				} else {
					System.out.println("Ok, maybe next time!");
				}

			} else if (devLevel == 3) {
				System.out.println("Your property is eligible for a **major** development.\n"
						+ "It will cost you " + majorDevCosts + " resources. Then you can charge " + majorDevTariff + " resources "
								+ "to anyone who lands there!\n"
								+ "Proceed? (Y / N)");
				System.out.print(" > ");
				String majorDevDecision = scanner.next().trim();

				if (majorDevDecision.equalsIgnoreCase(Game.DECISION_YES)) {
					System.out.println("The Enviornmental Protection Agency has held an inquiry to decide to approve your planning permission...\n"
							+ "They have a tough question for you...");
					System.out.println("________________________________________________________________");
					boolean isCorrect = questions.askEthicsQuestion();
					if (isCorrect) {
					devLevel = 4;
					owner.chargeDevCost(majorDevCosts);
					devTariff = majorDevTariff;
					System.out.println("Congratulations! Your " + squareName + " is now a **major development**! " + CRANE_EMOJI + "\n"
							+ "You can now charge " + majorDevTariff + "each time someone lands there!");
					} else {
						System.out.println("Sorry, your request for planning permission was denied, you can reapply later.");
					}
				} else {
					System.out.println("No worries — your property stays at Level 3 for now.");
				}
			} else {
				System.out.println("This property is already at the maximum development level.");
			}

		} else if (owner.getResourceBalance() >= devCost && !board.ownsFullField(owner, fieldName)) {
			System.out.println("You can't develop this yet — you don't own the full field.");
		} else {
			System.out.println("You don't have enough resources to develop this property.");
		}
	}

	public void handleNaturalDisaster(Player player, Square landedSquare, Game game, Questions questions) {
		System.out.println("Oh no! You landed right in the middle of the " + landedSquare.getSquareName() + "!\n");
		System.out.println("You could pay for disaster relief to help restore the area.");
		System.out.println("And maybe your environmental 'know-how' can help..." + THINKING_EMOJI + "\n");
		System.out.println("Would you like to answer a question to reduce the cost? (Y / N)");
		System.out.print(" > ");
		String decision = game.getScanner().next().trim();
		if (decision.equalsIgnoreCase(Game.DECISION_YES)) {
			System.out.println("________________________________________________________________");
			boolean isCorrect = questions.askQuestion();
			if (isCorrect) {
				int originalTariff = landedSquare.getLandingTariff();
				int reducedTariff = landedSquare.reduceTariff();
				System.out.println("\nInstead of losing " + originalTariff + "resources,");
				System.out.println(" you only lose " + reducedTariff + " resources!");
				player.chargeTariff(reducedTariff);
			} else {
				System.out.println("\nYou must pay the full cost of disaster relief.");
				player.chargeTariff(landedSquare.getLandingTariff());
			}

		} else if (decision.equalsIgnoreCase(Game.DECISION_NO)) {
			System.out.println("Ok, you have paid " + landedSquare.getLandingTariff() + " in disaster relief.");
			player.chargeTariff(landedSquare.getLandingTariff());
		}
	}

	public void rewardRecycling(Player player, Square landedSquare) {

		System.out.println("You've arrived at the " + landedSquare.getSquareName() + " here's a little incentive...");
		player.recyclingCentre();
	}

	/**
	 * Method to reduce the tariff player must pay when landing on a natural
	 * disaster square "Reduces the impact of natural disaster".
	 */
	public int reduceTariff() {
		return (int) (this.getLandingTariff() * 0.5);
	}

	public void manageSquare(Player player, Square landedSquare, GameBoard board, Questions questions, Game game) {

		if (!landedSquare.isOwned() && landedSquare.getFieldName().equals(FieldName.G8_SUMMIT)) {
			System.out.println("\nYou've just landed at the " + landedSquare.getSquareName()
					+ " , nothing productive happens here, take a rest! ");
			return;
		} else if (!landedSquare.isOwned() && landedSquare.getFieldName().equals(FieldName.NATURAL_DISASTER)) {
			handleNaturalDisaster(player, landedSquare, game, questions);
			return;
		} else if (this.getFieldName().equals(FieldName.RECYCLING_CENTRE)) {
		    System.out.println("You can't purchase the Recycling Centre! It's a public service for everyone." + GameBoard.RECYCLING_EMOJI + "️\n");
		    return;
		} else if (!landedSquare.isOwned() && !landedSquare.getFieldName().equals(FieldName.G8_SUMMIT) && !landedSquare.getFieldName().equals(FieldName.NATURAL_DISASTER) && !landedSquare.getFieldName().equals(FieldName.RECYCLING_CENTRE)) {
			landedSquare.purchase(player, questions);
			return;
		} else if (landedSquare.isOwned() && landedSquare.getOwner() != player) {
			chargeRent(player, landedSquare);

		} else if (landedSquare.getOwner() == player) {
			System.out.println("\nPhew, you own this square, you're safe for now.");
		}

	}

	public void upgradePropertyInField(Player player, FieldName field, GameBoard board, Scanner scanner, Questions questions) {
		List<Square> squaresInField = board.getSquaresByField(field);

		System.out.println("\nHere are the properties you can develop in the " + field + " field:\n");
		for (int i = 0; i < squaresInField.size(); i++) {
			Square square = squaresInField.get(i);
			System.out.println("( " + (i + 1) + ") " + square.getSquareName() + " (Level " + square.getDevLevel() + ")");

		}

		System.out.println("\nEnter the number of the property you want to develop, or enter 0 to skip.");
		System.out.print(" > ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		if (choice > 0 && choice <= squaresInField.size()) {
			Square selectedSquare = squaresInField.get(choice - 1);
			System.out.println(
					"Developing " + selectedSquare.getSquareName() + " will cost " + selectedSquare.getDevCosts()
							+ " and will increase the tariff to " + selectedSquare.getDevTariff());
			System.out.println("Would you like to proceed? (Y / N)");
			System.out.print(" > ");
			String devDecision = scanner.nextLine();
			if (devDecision.equalsIgnoreCase(Game.DECISION_YES)) {
				selectedSquare.develop(player, board, questions);
				System.out.println("Your " + selectedSquare.getSquareName() + " has been successfully developed!");
				System.out.println("Your updated resource balance: " + player.getResourceBalance() + " resources.");
			} else {
				System.out.println("No problem! Moving on...");
			}
		} else if (choice == 0) {
			System.out.println("Skipping development opportunities in this field for now...");
		} else {
			System.out.println("Sorry, please enter a valid number between 1 and " + squaresInField.size());
		}
	}

}
