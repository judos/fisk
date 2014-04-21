package model.buildings;

import model.GameParameters;

public class Biosphere extends BuildingType {

	public Biosphere() {
		super(GameParameters.BIOSPHERE_NAME, GameParameters.BIOSPHERE_COSTS,
				GameParameters.COST_FACTOR, GameParameters.BIOSPHERE_ENERGY);
	}
}
