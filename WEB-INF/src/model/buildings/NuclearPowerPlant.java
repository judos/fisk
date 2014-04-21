package model.buildings;

import model.GameParameters;

public class NuclearPowerPlant extends Mine {

	public NuclearPowerPlant() {
		super(GameParameters.NUCLEAR_POWER_PLANT_NAME,
				GameParameters.NUCLEAR_POWER_PLANT_COSTS,
				GameParameters.NUCLEAR_POWER_PLANT_COST_FACTOR,
				GameParameters.NUCLEAR_POWER_PLANT_PRODUCTION,
				GameParameters.NUCLEAR_POWER_PLANT_PRODUCTION_FACTOR,
				GameParameters.NUCLEAR_POWER_PLANT_ENERGY);
	}

}
