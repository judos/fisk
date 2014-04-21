package model.technologies;

import model.Requirements;
import model.Ressources;

public abstract class TechnologyType {

	protected Ressources defaultCost;
	protected int maxLevel;
	protected Requirements requirements;
	protected String name;

	public TechnologyType(String name, Ressources cost, int maxLevel) {
		this.defaultCost = cost;
		this.requirements = new Requirements();
	}

	public TechnologyType(String name, Ressources cost) {
		this(name, cost, Integer.MAX_VALUE);
	}

	public Ressources getDefaultCost() {
		return this.defaultCost;
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
}
