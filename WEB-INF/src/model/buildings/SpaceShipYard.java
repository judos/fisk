package model.buildings;

import model.GameParameters;
import model.Ressources;

public class SpaceShipYard extends BuildingType {

	public SpaceShipYard(Ressources cost) {
		super(GameParameters.SPACE_SHIPYARD_NAME, cost,
				GameParameters.COST_FACTOR);
	}

}
