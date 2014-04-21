package model.buildings;

import model.Ressources;

public class EnergyBuilding extends BuildingType {

	public EnergyBuilding(String name, Ressources cost, double costFactor,
			double energy) {
		super(name, cost, costFactor, energy);
	}

}
