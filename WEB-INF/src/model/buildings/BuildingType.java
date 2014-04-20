package model.buildings;

import model.Ressources;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class BuildingType {

	protected Ressources defaultCost;

	public BuildingType(Ressources cost) {
		this.defaultCost = cost;
	}

	public Ressources getDefaultCost() {
		return this.defaultCost;
	}

}
