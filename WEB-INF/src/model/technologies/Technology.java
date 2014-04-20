package model.technologies;

import model.Ressources;

public class Technology {

	protected TechnologyType type;
	protected int level;

	public Technology(TechnologyType type) {
		this.type = type;
		this.level = 0;
	}

	public Ressources getCostsForNextLevel() {
		Ressources cost = this.type.getDefaultCost();
		cost.multiply(this.level);
		return cost;
	}

	public int getLevel() {
		return this.level;
	}

	public TechnologyType getTechnologyType() {
		return this.type;
	}

	public boolean isUpgradeable() {
		return this.level < this.type.getMaxLevel();
	}

	public void increaseLevel() {
		this.level++;
	}
}
