package view.tests;

import java.util.PriorityQueue;

public class TaskHandler implements ServerClockListener{
	
	private PriorityQueue<Task> taskQueue;
	
	public TaskHandler() {
		taskQueue = new PriorityQueue<>();
	}
	
	public synchronized void addTask(Task task) {
		taskQueue.add(task);
	}
	
	public synchronized void removeTask(Task task) {
		taskQueue.remove(task);
	}

	@Override
	public synchronized void onNewSecond(int serverTime) {
		Task task = taskQueue.peek();
		if (task != null && task.getEndTime() == serverTime) {
			task.getOwner().onTaskReady(task);
			taskQueue.remove(task);
		}
	}

}
