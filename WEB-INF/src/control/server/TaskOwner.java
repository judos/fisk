package control.server;

/**
 * This interface provides a method for owners of Task to be informed on when their Task is done.
 * 
 * @see Task
 * @see TaskHandler
 * @author tobias
 *
 */
public interface TaskOwner {
	
	/**
	 * Accepts Task objects which are done according to the server time in seconds. 
	 * 
	 * @see Server
	 * @param task Task object that is done.
	 */
	public void onTaskReady(Task task);

}
