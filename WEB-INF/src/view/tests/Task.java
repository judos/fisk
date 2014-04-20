package view.tests;

import java.util.Date;

public interface Task {
	
	public Date getStartTime();
	public Date getEndTime();
	public int getDuration();
	public TaskOwner getOwner();

}
