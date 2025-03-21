/**
 * 
 */
package saveOurPlanet;

/**
 * 
 */
public class Player {

	// instance vars
	private boolean hasResources;
	private int positionOnBoard;
	private boolean hasQuit;
	private int balance;
//	private String playerId;
	private String username;
	private boolean ownsFullField;
	

	public Player() {
//		this.playerId = playerId;
		this.positionOnBoard = 1; // starting position the same for everybody
	}

	// getters and setters

//	/**
//	 * @return the playerId
//	 */
//	public String getPlayerId() {
//		return playerId;
//	}
//	/**
//	 * @param playerId the playerId to set
//	 */
//	public void setPlayerId(String playerId) {
//		this.playerId = playerId;
//	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the hasResources
	 */
	public boolean isHasResources() {
		return hasResources;
	}

	/**
	 * @param hasResources the hasResources to set
	 */
	public void setHasResources(boolean hasResources) {
		this.hasResources = hasResources;
	}

	/**
	 * @return the positionOnBoard
	 */
	public int getPositionOnBoard() {
		return positionOnBoard;
	}

	/**
	 * @param positionOnBoard the positionOnBoard to set
	 */
	public void setPositionOnBoard(int positionOnBoard) {
		this.positionOnBoard = positionOnBoard;
	}

	/**
	 * @return the hasQuit
	 */
	public boolean isHasQuit() {
		return hasQuit;
	}

	/**
	 * @param hasQuit the hasQuit to set
	 */
	public void setHasQuit(boolean hasQuit) {
		this.hasQuit = hasQuit;
	}

	/**
	 * @return the resourceBalance
	 */
	public int getResourceBalance() {
		return balance;
	}

	/**
	 * @param resourceBalance the resourceBalance to set
	 */
	public void setResourceBalance(int resourceBalance) {
		this.balance = resourceBalance;
	}

	/**
	 * @return the ownsFullField
	 */
	public boolean isOwnsFullField() {
		return ownsFullField;
	}

	/**
	 * @param ownsFullField the ownsFullField to set
	 */
	public void setOwnsFullField(boolean ownsFullField) {
		this.ownsFullField = ownsFullField;
	}

	/**
	 * Method to change the position of a player on the board, adding their dice
	 * result to their current position, within the limits of the gameboard.
	 * 
	 * @param diceResult
	 * @param boardSize
	 */
	public void move(int diceResult, int boardSize) {
		positionOnBoard += diceResult;
		if (positionOnBoard > boardSize) {
			positionOnBoard = positionOnBoard % boardSize; // means that new position is the remainder
			if (positionOnBoard == 0) {
				positionOnBoard = boardSize;
			}
		}
		System.out.println(username + " moves to position " + " : " + positionOnBoard);

	}

	/**
	 * Method charges landing tariff ot a player, subtracting and reassigning the
	 * player's balance.
	 * 
	 * @param landingTariff
	 */
	public void chargeTariff(int landingTariff) {
		this.balance -= landingTariff;
	}

	/**
	 * Method to add the value of a squares landing tariff to the owner's balance.
	 * 
	 * @param landingTariff
	 */
	public void gainResources(int landingTariff) {
		this.balance += landingTariff;
	}

	/**
	 * Method to charge a player for upgrades to their property, subtracting the
	 * development cost and reassigning the balance value.
	 * 
	 * @param devCost
	 */
	public void chargeDevCost(int devCost) {
		this.balance -= devCost;
	}

	public void bankruptPlayer(Player player) {
		if (player.getResourceBalance() == 0)
			;
		System.out.println(player.getUsername() + " has no resources left, and is therefore bankrupt.");
	}

	public void recyclingCentre(Player player) {
		this.balance += 200;
	}


}
