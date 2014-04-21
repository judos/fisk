package model.buildings;

import model.Ressources;

public class Mine extends BuildingType {

	protected double defaultProduction;

	public Mine(String name, Ressources cost, double costFactor,
			double production) {
		super(name, cost, costFactor);
		this.defaultProduction = production;
	}

	public double getDefaultProduction() {
		return this.defaultProduction;
	}

}
