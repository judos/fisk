package view.tests;

import java.util.ArrayList;

public class ServerClock implements Runnable {
	
	public int serverTime;
	
	private ArrayList<ServerClockListener> listenerList;
	
	public ServerClock() {
		listenerList = new ArrayList<>();
	}
	
	public void addListener(ServerClockListener listener) {
		listenerList.add(listener);
	}
	
	public void removeListener(ServerClockListener listener) {
		listenerList.remove(listener);
	}
	
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
