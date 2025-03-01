/**
 * 
 */
package saveOurPlanet;


/**
 * 
 */
public class Square {

	private int squareNumber;
	private String squareName;
	private boolean isOwned;
	private Player owner;
	private SquareType type; // 
	private int squareCost; // cost to purchase
	private int landingTariff; // when only owned, not developed
	private int devCosts; // cost to develop
	private int majorDevCosts; // large-scale development
	private int majorDevTariff; // landing when developed

	/**
	 * default constructor
	 */
	public Square() {

	}

	/**
	 * constructor with args for Square class
	 * 
	 * @param squareNumber
	 * @param squareName
	 * @param isOwned
	 * @param owner
	 * @param type
	 * @param squareCost
	 * @param landingTariff
	 * @param devCosts
	 * @param majorDevCosts
	 * @param majorDevTariff
	 */
	public Square(int squareNumber, String squareName, boolean isOwned, Player owner, SquareType type, int squareCost,
			int landingTariff, int devCosts, int majorDevCosts, int majorDevTariff) {
		this.squareNumber = squareNumber;
		this.squareName = squareName;
		this.isOwned = isOwned;
		this.owner = owner;
		this.type = type;
		this.squareCost = squareCost;
		this.landingTariff = landingTariff;
		this.devCosts = devCosts;
		this.majorDevCosts = majorDevCosts;
		this.majorDevTariff = majorDevTariff;
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
	 * @return the type
	 */
	public SquareType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(SquareType type) {
		this.type = type;
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
	 * @return the devCosts
	 */
	public int getDevCosts() {
		return devCosts;
	}

	/**
	 * @param devCosts the devCosts to set
	 */
	public void setDevCosts(int devCosts) {
		this.devCosts = devCosts;
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

}
