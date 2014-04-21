package control.server;

import java.util.ArrayList;

import model.World;

/**
 * This class provides a system wide server time in seconds. ServerClock
 * listeners are informed roughly every second about the new server time.
 * 
 * @see ServerClockListener
 * @author tobias
 * 
 */
public class Server implements Runnable {

	private int serverTime;
	private static Server instance;
	private ArrayList<ServerClockListener> listenerList;
	private World world;

	/**
	 * @return the world
	 */
	public World getWorld() {
		return world;
	}

	private Server(World world) {
		this.world = world;
		listenerList = new ArrayList<>();
	}

	/**
	 * Returns the instance of this singleton object.
	 * 
	 * @param world
	 * 
	 * @return ServerClock instance.
	 */
	public static Server getInstance(World world) {
		if (instance == null) {
			instance = new Server(world);
			new Thread(instance).start();
		}
		return instance;
	}

	/**
	 * Subscribes a listener to this clock.
	 * 
	 * @param listener
	 *            ServerClockListener object.
	 */
	public void addListener(ServerClockListener listener) {
		listenerList.add(listener);
	}

	/**
	 * Removes a listener from this clock.
	 * 
	 * @param listener
	 */
	public void removeListener(ServerClockListener listener) {
		listenerList.remove(listener);
	}

	/**
	 * Returns the current server time in seconds.
	 * 
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
