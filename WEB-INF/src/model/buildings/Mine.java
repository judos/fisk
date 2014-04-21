package model.buildings;

import model.Ressources;

public class Mine extends BuildingType {

	protected double defaultProduction;
	protected double productionFacor;

	public Mine(String name, Ressources cost, double costFactor,
			double production, double productionFactor, double energy) {
		super(name, cost, costFactor, energy);
		this.defaultProduction = production;
		this.productionFacor = productionFactor;
	}

	public double getDefaultProduction() {
		return this.defaultProduction;
	}

	public double getProductionFactor() {
		return this.productionFacor;
	}

}
