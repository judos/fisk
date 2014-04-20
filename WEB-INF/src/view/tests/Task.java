package view.tests;

import java.util.Date;

public interface Task {
	
	public int getStartTime();
	public int getEndTime();
	public int getDuration();
	public TaskOwner getOwner();

}
