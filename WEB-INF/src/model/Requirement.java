package model;

import java.util.HashMap;

import model.buildings.BuildingType;
import model.technologies.TechnologyType;

public class Requirement {

	HashMap<BuildingType, Integer> buildingRequirements;
	HashMap<TechnologyType, Integer> technologyRequirements;

	public Requirement() {
		this.buildingRequirements = new HashMap<BuildingType, Integer>();
		this.technologyRequirements = new HashMap<TechnologyType, Integer>();
	}

	public void addRequirement(Object type, int neededLevel) {
		if (type instanceof BuildingType) {
			this.buildingRequirements.put((BuildingType) type, neededLevel);
		} else if (type instanceof TechnologyType) {
			this.technologyRequirements.put((TechnologyType) type, neededLevel);
		}
	}

}
