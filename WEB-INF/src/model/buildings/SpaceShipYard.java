package model.buildings;

import model.GameParameters;

public class SpaceShipYard extends BuildingType {

	public SpaceShipYard() {
		super(GameParameters.SPACE_SHIPYARD_NAME,
				GameParameters.SPACE_SHIP_YARD_COSTS,
				GameParameters.COST_FACTOR);
	}

}
