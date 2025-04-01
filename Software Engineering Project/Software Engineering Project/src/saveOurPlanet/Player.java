/**
 * 
 */
package saveOurPlanet;

/**
 * 
 */
public class Player {

	private boolean hasResources;
	private int positionOnBoard;
	private boolean hasQuit;
	private int balance;
	private String username;
	private boolean ownsFullField;
	private boolean hasStarted;
	private boolean isBankrupt;

	public Player() {
		this.positionOnBoard = 1; 
	}


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
	public boolean hasQuit() {
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
	public boolean ownsFullField() {
		return ownsFullField;
	}

	/**
	 * @param ownsFullField the ownsFullField to set
	 */
	public void setOwnsFullField(boolean ownsFullField) {
		this.ownsFullField = ownsFullField;
	}

	/**
	 * @return the hasStarted
	 */
	public boolean hasStarted() {
		return hasStarted;
	}

	/**
	 * @param hasStarted the hasStarted to set
	 */
	public void setHasStarted(boolean hasStarted) {
		this.hasStarted = hasStarted;
	}

	/**
	 * @return the isBankrupt
	 */
	public boolean isBankrupt() {
		return isBankrupt;
	}

	/**
	 * @param isBankrupt the isBankrupt to set
	 */
	public void setBankrupt(boolean isBankrupt) {
		this.isBankrupt = isBankrupt;
	}

	/**
	 * Method to change the position of a player on the board, adding their dice
	 * result to their current position, within the limits of the gameboard.
	 * 
	 * @param diceResult
	 * @param boardSize
	 */
	public void move(int diceResult, int boardSize, GameBoard board) {
		if (boardSize <= 0) {
			System.out.println("Invalid board size.");
			return;
		}

		System.out.println("\nBefore moving, your position on the board is " + positionOnBoard + ": "
				+ board.getSquareByNumber(positionOnBoard).getSquareName() + "\n");

		positionOnBoard = ((positionOnBoard - 1 + diceResult) % boardSize) + 1;
		System.out.println(username + ", you have now moved to position " + " : " + positionOnBoard + " - " + board.getSquareByNumber(positionOnBoard).getSquareName() + "\n");

	}

	/**
	 * Method charges landing tariff to a player, subtracting and reassigning the
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

	public void bankruptPlayer(Player player, Game game) {
		if (player.getResourceBalance() == 0 && !game.isBankruptcyTriggered()) {
			player.setBankrupt(true);
			game.triggerBankruptcy(true);
		}
		System.out.println(player.getUsername() + " has no resources left, and is therefore bankrupt.");
	}

	public void recyclingCentre() {
		this.balance += 200;
	}

}
