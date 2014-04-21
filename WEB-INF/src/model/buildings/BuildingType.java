package model.buildings;

import model.Requirements;
import model.Ressources;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class BuildingType {

	protected Ressources defaultCost;
	protected int maxLevel;
	protected Requirements requirements;
	protected String name;
	protected double costFactor;
	protected double defaultEnergy;

	public BuildingType(String name, Ressources cost, double costFactor, int maxLevel,
		double defaultEnergy) {
		this.name = name;
		this.defaultCost = cost;
		this.costFactor = costFactor;
		this.requirements = new Requirements();
		this.maxLevel = maxLevel;
		this.defaultEnergy = defaultEnergy;
	}

	public BuildingType(String name, Ressources cost, double costFactor,
		double defaultEnergy) {
		this(name, cost, costFactor, Integer.MAX_VALUE, defaultEnergy);
	}

	public Ressources getDefaultCost() {
		return this.defaultCost.clone();
	}

	public int getMaxLevel() {
		return this.maxLevel;
	}

	public Requirements getRequirements() {
		return this.requirements;
	}

	public String getName() {
		return this.name;
	}

	public double getCostFactor() {
		return this.costFactor;
	}

	public double getDefaultEnergy() {
		return this.defaultEnergy;
	}

}
