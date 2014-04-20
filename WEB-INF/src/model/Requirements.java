package model;

import java.util.HashMap;

public class Requirements {

	protected HashMap<String, Integer> buildingRequirements;
	protected HashMap<String, Integer> technologyRequirements;

	public Requirements() {
		this.buildingRequirements = new HashMap<String, Integer>();
		this.technologyRequirements = new HashMap<String, Integer>();
	}

	public void addBuildingRequirement(String name, int neededLevel) {
		this.buildingRequirements.put(name, neededLevel);
	}

	public void addTechnologyRequirement(String name, int neededLevel) {
		this.technologyRequirements.put(name, neededLevel);
	}

	public HashMap<String, Integer> getBuildingRequirements() {
		return this.buildingRequirements;
	}

	public HashMap<String, Integer> getTechnologyRequirements() {
		return this.technologyRequirements;
	}

}
