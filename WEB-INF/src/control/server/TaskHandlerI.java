package control.server;

/**
 * minimal interface for external access on the taskHandler
 * 
 * @since 21.04.2014
 * @author Julian Schelker
 */
public interface TaskHandlerI {
	public void addTask(Task task);

	/**
	 * Removes a task from this handler.
	 * 
	 * @param task
	 *            Task object to remove.
	 */
	public void removeTask(Task task);
}
