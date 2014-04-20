package model;

import java.util.HashMap;

public class Requirements {

	HashMap<String, Integer> requirements;

	public Requirements() {
		this.requirements = new HashMap<String, Integer>();
	}

	public void addRequirement(String name, int neededLevel) {
		this.requirements.put(name, neededLevel);
	}

}
