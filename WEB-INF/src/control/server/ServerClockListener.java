package control.server;

/**
 * This interface is provided for classes, who want to subscribe to the
 * ServerClock class.
 * 
 * @see Server
 * @author tobias
 * 
 */
public interface ServerClockListener {

	/**
	 * Accepts the newest server time in seconds.
	 * 
	 * @param serverTime
	 *            integer current server time
	 */
	void onNewSecond(int serverTime);

}
