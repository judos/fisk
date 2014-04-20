package control.server;

import java.util.PriorityQueue;

/**
 * This class handles tasks. It subscribes to the ServerClock and checks the task queue every second
 * if the task is done. Informs the TaskOwner object of each Task object if the task is done.
 * 
 * @see ServerClock
 * @see Task
 * @see TaskOwner
 * @author tobias
 *
 */
public class TaskHandler implements ServerClockListener{
	
	private PriorityQueue<Task> taskQueue;
	private ServerClock clock;
	
	/**
	 * Instantiates a new TaskHandler object. It also sets the local ServerClock reference and registers this
	 * object at the ServerClock object.
	 */
	public TaskHandler() {
		clock = ServerClock.getInstance();
		clock.addListener(this);
		taskQueue = new PriorityQueue<>();
	}
	
	/**
	 * Adds a new Task object to this handler.
	 * @param task Task object to add.
	 */
	public synchronized void addTask(Task task) {
		taskQueue.add(task);
	}
	
	/**
	 * Removes a task from this handler.
	 * @param task Task object to remove.
	 */
	public synchronized void removeTask(Task task) {
		taskQueue.remove(task);
	}

	@Override
	public synchronized void onNewSecond(int serverTime) {
		Task task = taskQueue.peek();
		if (task != null && task.getEndTime() == serverTime) {
			task.getOwner().onTaskReady(task);
			taskQueue.poll();
		}
	}

}
