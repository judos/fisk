package model.buildings;

import java.util.HashMap;

import model.Ressources;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class BuildingType {

	protected Ressources defaultCost;
	protected int maxLevel;
	protected HashMap<String, Integer> requirements;
	protected String name;

	public BuildingType(String name, Ressources cost, int maxLevel) {
		this.defaultCost = cost;
		this.requirements = new HashMap<String, Integer>();
	}

	public BuildingType(String name, Ressources cost) {
		new BuildingType(name, cost, Integer.MAX_VALUE);
	}

	public Ressources getDefaultCost() {
		return this.defaultCost;
	}

	public int getMaxLevel() {
		return this.maxLevel;
	}

	public HashMap<String, Integer> getRequirements() {
		return this.requirements;
	}

	public void addRequirement(String name, int neededLevel) {
		this.requirements.put(name, neededLevel);
	}

	public String getName() {
		return this.name;
	}
}
