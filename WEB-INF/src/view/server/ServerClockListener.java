package view.server;

/**
 * This interface is provided for classes, who want to subscribe to the ServerClock class.
 * 
 * @see ServerClock
 * @author tobias
 *
 */
public interface ServerClockListener {
	
	/**
	 * Accepts the newest server time in seconds.
	 * @param serverTime integer current server time
	 */
	public void onNewSecond(int serverTime);

}
