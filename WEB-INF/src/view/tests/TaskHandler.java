package view.tests;

import java.util.PriorityQueue;

public class TaskHandler implements Runnable {
	
	private PriorityQueue<Task> taskQueue;
	
	public TaskHandler() {
		taskQueue = new PriorityQueue<>();
	}
	
	public void addTask(Task task) {
		taskQueue.add(task);
	}
	
	public void removeTask(Task task) {
		taskQueue.remove(task);
	}

	@Override
	public void run() {
		while (true) {
			Task task = taskQueue.poll();
			task.getOwner().onTaskReady(task);
		}
	}

}
