/**
 * 
 */
package saveOurPlanet;

import java.util.Comparator;

/**
 * 
 */
public class Leaderboard implements Comparator<Player>{

	public static final String GOLD_MEDAL = "\uD83E\uDD47";
	public static final String SILVER_MEDAL = "\uD83E\uDD48";
	public static final String BRONZE_MEDAL = "\uD83E\uDD49";

	@Override
	public int compare(Player p1, Player p2) {
		return Integer.compare(p2.getResourceBalance(), p1.getResourceBalance());
	}
	
}
