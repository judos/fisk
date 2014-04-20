package view.tests;

/**
 * This interface provides stub methods for Task, such as upgrading buildings, etc. Every task must have an owner.
 * 
 * @see TaskOwner
 * @author tobias
 *
 */
public interface Task {
	
	/**
	 * Returns the start time of this task. The start time must be provided by
	 *  the server when the task is initialised.
	 * @return integer time of task initialisation in server time.
	 */
	public int getStartTime();
	
	/**
	 * Returns the end time of this task. The end time must be calculated by
	 *  adding the current server time and the building time together.
	 * @return integer time of task end time in server time.
	 */
	public int getEndTime();
	
	/**
	 * Returns the duration of the task in seconds.
	 * @return integer task duration in seconds.
	 */
	public int getDuration();
	
	/**
	 * Returns the owner of this task.
	 * @return TaskOwner object of this task.
	 */
	public TaskOwner getOwner();

}
