package view.tests;

import java.util.ArrayList;

/**
 * This class provides a system wide server time in seconds. ServerClock listeners are informed roughly every second
 * about the new server time.
 * 
 * @see ServerClockListener
 * @author tobias
 *
 */
public class ServerClock implements Runnable {
	
	private int serverTime;
	private static ServerClock instance;
	private ArrayList<ServerClockListener> listenerList;
	
	private ServerClock() {
		listenerList = new ArrayList<>();
	}
	
	/**
	 * Returns the instance of this singleton object.
	 * @return ServerClock instance. 
	 */
	public static ServerClock getInstance() {
		if (instance == null) {
			instance = new ServerClock();
			new Thread(instance).start();
		}
		return instance;
	}
	
	/**
	 * Subscribes a listener to this clock.
	 * @param listener ServerClockListener object.
	 */
	public void addListener(ServerClockListener listener) {
		listenerList.add(listener);
	}
	
	/**
	 * Removes a listener from this clock.
	 * @param listener
	 */
	public void removeListener(ServerClockListener listener) {
		listenerList.remove(listener);
	}
	
	/**
	 * Returns the current server time in seconds.
	 * @return integer of the current server time in seconds.
	 */
	public int getServerTime() {
		return serverTime;
	}

	@Override
	public void run() {
		serverTime = 0;
		while (true) {
			serverTime++;
			for (ServerClockListener listener : listenerList)
				listener.onNewSecond(serverTime);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
