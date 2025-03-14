/**
 * 
 */
package saveOurPlanet;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class Player {

	// instance vars

	private ResourceType resourceType;
	private boolean hasResources;
	private int positionOnBoard;
	private boolean hasQuit;
	private int balance;
//	private String playerId;
	private String username;

	private Map<ResourceType, Integer> resourceBalance = new HashMap<ResourceType, Integer>();

	Player(String username) {
//		this.playerId = playerId;
		this.username = username;
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

	// methods

	public void move(int diceResult, int boardSize) {
		positionOnBoard += diceResult;
		if (positionOnBoard > boardSize) {
			positionOnBoard = positionOnBoard % boardSize; // means that new position is the remainder
			if (positionOnBoard == 0) {
				positionOnBoard = boardSize;
			}
		}
		System.out.println(username + " moves to position " + positionOnBoard + " : ");

	}

}
