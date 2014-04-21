package model.buildings;

import model.GameParameters;

public class SpaceShipYard extends BuildingType {

	public SpaceShipYard() {
		super(GameParameters.SPACE_SHIPYARD_NAME,
				GameParameters.SPACE_SHIPYARD_COSTS,
				GameParameters.COST_FACTOR,
				GameParameters.SPACE_SHIPYARD_ENERGY);
	}

}
