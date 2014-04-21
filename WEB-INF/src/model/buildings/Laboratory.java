package model.buildings;

import model.GameParameters;

public class Laboratory extends BuildingType {

	public Laboratory() {
		super(GameParameters.LABORATORY_NAME, GameParameters.LABORATORY_COSTS,
				GameParameters.COST_FACTOR, GameParameters.LABORATORY_ENERGY);
		// TODO: adapt it, only an example
		this.requirements.addBuildingRequirement(
				GameParameters.METAL_MINE_NAME, 2);
	}
}
