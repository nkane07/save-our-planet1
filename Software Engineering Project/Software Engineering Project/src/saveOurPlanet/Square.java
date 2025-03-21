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

	public static final String champagneBottle = "U+1F37E";
	public static final String snoring = "U+1F4A4";
	public static final String RENT_EMOJI = "U+1F4B8";

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
	public void purchase(Player player) {
		if (!isOwned) {
			System.out.println("No one's in charge of that square.");
			System.out.println("Would you like to invest in this property?");
			String purchaseDecision = scanner.next();
			if (purchaseDecision.equalsIgnoreCase(Game.DECISION_YES) && player.getResourceBalance() >= squareCost) {
				setOwner(player);
				isOwned = true;
				System.out.println("Congratulations!  " + player.getUsername() + " has purchased " + squareName
						+ " for " + squareCost + " resources!");
				System.out.println("They can now charge " + landingTariff + " if someone lands on " + squareName);
			} else if (player.getResourceBalance() < squareCost) {
				System.out.println(
						player.getUsername() + ", you don't have enough resources to purchase " + squareName + ".");
				System.out.println("It's still up for grabs.");
			} else if (purchaseDecision.equalsIgnoreCase(Game.DECISION_NO)) {
				System.out.println(
						player.getUsername() + " has decided not to invest. So it's still not owned by anyone.");
			}
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
				"Uh oh " + player.getUsername() + ", this property is owned by " + landedSquare.getOwner() + ". ");
		System.out.println("You now owe them " + landedSquare.getLandingTariff());
			if (player.getResourceBalance() >= landingTariff) {
				player.chargeTariff(landingTariff);
				owner.gainResources(landingTariff);
				System.out.println(
						player.getUsername() + " paid " + landingTariff + " resources to " + owner.getUsername() + ".");
			} else {
				System.out.println(player.getUsername() + " does not have enough resources to pay rent!\n"
						+ "They are now bankrupt ");
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
	public void upgrade(Player player, GameBoard board) {

		if (owner.getResourceBalance() >= devCost && board.ownsFullField(owner, fieldName)) {
			System.out.println(
					"You have enough resources to upgrade this property! Would you like to invest resources and develop?");
			String devDecision = scanner.next();
			if (devDecision != null && devDecision.equalsIgnoreCase(Game.DECISION_YES)) {
				owner.chargeDevCost(devCost);
				devLevel++;
				devTariff += landingTariff / 2;
				System.out.println(owner.getUsername() + " has upgraded " + squareName + "to level " + devLevel
						+ ". It will now cost " + devTariff + " resources to land on this property.");
			} else if (devDecision != null && devDecision.equalsIgnoreCase(Game.DECISION_YES) && devLevel == 3) {
				System.out.println(
						"Your property is eligible for upgrade to a major development. Would you like to upgrade?");
				String majorDevDecision = scanner.next();
				if (majorDevDecision.equalsIgnoreCase(Game.DECISION_YES)) {
					devLevel = 4;
					owner.chargeDevCost(majorDevCosts);

				} else if (majorDevDecision.equalsIgnoreCase(Game.DECISION_NO)) {
					System.out.println("Ok, you're properties will remain at Development Level 3 for now!");
				}
			} else {
				System.out.println("Ok, keep it in mind for next time!");
			}
		} else if (owner.getResourceBalance() >= devCost && !board.ownsFullField(owner, fieldName)) {
			System.out.println(
					"You're unable to upgrade these properties yet, Keep buying property so you can start developing!");
		}

	}
	
	public void handleNaturalDisaster(Player player, Square landedSquare, Game game, Questions questions) {
		System.out.println("Oh no! You landed right in the middle of the " + landedSquare.getSquareName() + "!");
		System.out.println("Pay for disaster relief to help restore the area.");
		System.out.println("And maybe your environmental expertise can help?");
		System.out.println("Would you like to answer a question to reduce the cost? (Y / N)");
		String decision = game.getScanner().next();
		if (decision.equalsIgnoreCase(Game.DECISION_YES)) {
			questions.askQuestion();
			if (questions.askQuestion()) {
				int originalTariff = landedSquare.getLandingTariff();
				landedSquare.reduceTariff();
				System.out.println("Correct! Instead of losing " + originalTariff + "resources,");
				System.out.println(" you only lose " + landedSquare.getLandingTariff() + " resources!");
				player.chargeTariff(landedSquare.getLandingTariff());
			} else {
				System.out.println("I'm sorry, that was incorrect. You must pay the full cost of disaster relief.");
				player.chargeTariff(landedSquare.getLandingTariff());
			}
			
		} else if (decision.equalsIgnoreCase(Game.DECISION_NO)) {
			System.out.println("Ok, you have paid " + landedSquare.getLandingTariff() + " in disaster relief.");
			player.chargeTariff(landedSquare.getLandingTariff());
		}
	}
	
	public void rewardRecycling(Player player, Square landedSquare) {
		System.out.println("You've arrived at the " + landedSquare.getSquareName() + " here's a little incentive...");
		player.recyclingCentre(player);
	}

	/**
	 * Method to reduce the tariff player must pay when landing on a natural
	 * disaster square "Reduces the impact of natural disaster".
	 */
	public int reduceTariff() {
		int originalTariff = this.devTariff;
		this.devTariff = (int) (this.devTariff * 0.5); // Reduce tariff by 50%
		return originalTariff;
	}

	public void manageSquare(Player player, Square landedSquare, GameBoard board, Questions questions, Game game) {

		if (!landedSquare.isOwned()) {
			landedSquare.purchase(player);
			
		} else if (landedSquare.isOwned() && landedSquare.getOwner() != player) {
			chargeRent(player, landedSquare);
			
		} else if (landedSquare.getOwner() == player) {
			System.out.println("Phew, you own this square, you're safe for now.");
			
		} else if (landedSquare.getOwner() == null && landedSquare.getFieldName().equals(FieldName.NATURAL_DISASTER)) {
			handleNaturalDisaster(player, landedSquare, game, questions);
			
		} else if (landedSquare.getOwner() == null && landedSquare.getFieldName().equals(FieldName.G8_SUMMIT)) {
			System.out.println("You've just landed at the " + landedSquare.getSquareName() + " , nothing productive happens here, take a rest! ");
			
		} else if (landedSquare.getOwner() == null && landedSquare.getFieldName().equals(FieldName.RECYCLING_CENTRE)) {
			rewardRecycling(player, landedSquare);
		}

	}

	public void upgradePropertyInField(Player player, FieldName field, GameBoard board, Scanner scanner) {
		List<Square> squaresInField = board.getSquaresByField(field); // ✅ Get squares in this field

		System.out.println("Here are the properties you can upgrade in the " + field + " field:\n");
		for (int i = 0; i < squaresInField.size(); i++) {
			Square square = squaresInField.get(i);
			System.out.println("( " + (i + 1) + ") " + square.getSquareName() + " (Level " + square.getDevLevel() + ")");
			
			// Developing Wind Farm will cost 30 resources and will increase the tariff to 20 resources.
		}

		System.out.println("Enter the number of the property you want to upgrade, or enter 0 to skip.");
		int choice = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		if (choice > 0 && choice <= squaresInField.size()) {
			Square selectedSquare = squaresInField.get(choice - 1);
			System.out.println("Developing " + selectedSquare.getSquareName() + " will cost " + selectedSquare.getDevCosts() + " and will increase the tariff to " + selectedSquare.getDevTariff());
			System.out.println("Would you like to proceed? (Y / N)");
			String devDecision = scanner.nextLine();
			if (devDecision.equalsIgnoreCase(Game.DECISION_YES)) {
				selectedSquare.upgrade(player, board);
				System.out.println("Your " + selectedSquare.getSquareName() + " has been successfully upgraded!");
				System.out.println("Your updated resource balance: " + player.getResourceBalance() + " resources.");
			} else {
				System.out.println("No problem! Moving on...");
			}
		} else if (choice == 0){
			System.out.println("Skipping upgrades for this field for now...");
		} else {
			System.out.println("Sorry, please enter a valid number between 1 and " + squaresInField.size());
		}
	}

}
